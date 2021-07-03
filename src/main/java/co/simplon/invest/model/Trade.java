package co.simplon.invest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Trade {

    @Id
    @SequenceGenerator(name="trade_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trade_seq_id")
    private Long id;

    private String currency;

    private String stockTicker;

    private String stockName;

    private String marketplace;

    /* long or short trade */
    private String type;

    /*calculated on yearly capital or on capital after each trade */
    private String riskType;

    /*screener name which has found the stock*/
    private String screener;

    private LocalDateTime openDate;

    private LocalDateTime closeDate;

    private String status;

    private BigDecimal tradingCapitalAtOpen;

    private Integer grade;

    private BigDecimal stoploss;

    private BigDecimal currencyRate;

    private BigDecimal pvMv;

    private BigDecimal rTarget;

    private BigDecimal rNet;

    private BigDecimal rGross;

    @JsonIgnore
    @ManyToOne
    private Account account;

    @OneToMany(mappedBy = "trade", cascade = CascadeType.REMOVE) /*cascadeType.REMOVE all entryOrders when deleting a trade */
    private List<EntryOrder> entryOrders = new ArrayList<>();

    @OneToMany(mappedBy = "trade", cascade = CascadeType.REMOVE) /*cascadeType.REMOVE all exitOrders when deleting a trade */
    private List<ExitOrder> exitOrders = new ArrayList<>();

//    @OneToMany(mappedBy = "trade", cascade = CascadeType.REMOVE) /*cascadeType.REMOVE when deleting a trade */
//    private List<Dividend> dividends = new ArrayList<>();

//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) /*PERSIST : when creating Trade, creates row in relationship table. When Trade deleted, Jpa delete the relation table rows without need to tell Jpa*/
//    @JoinTable(
//            name = "trades_events",
//            joinColumns = @JoinColumn(name = "trade_id"),
//            inverseJoinColumns = @JoinColumn(name = "event_id"))
//    private Set<Event> events = new HashSet<>();
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST) /*PERSIST : when creating Trade, creates row in relationship table. When Trade deleted, Jpa delete the relation table rows without need to tell Jpa*/
//    @JoinTable(
//            name = "trades_checklists",
//            joinColumns = @JoinColumn(name = "trade_id"),
//            inverseJoinColumns = @JoinColumn(name = "checklist_id"))
//    private Set<Event> checklists = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    public String getScreener() {
        return screener;
    }

    public void setScreener(String screener) {
        this.screener = screener;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public LocalDateTime getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDateTime closeDate) {
        this.closeDate = closeDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTradingCapitalAtOpen() {
        return tradingCapitalAtOpen;
    }

    public void setTradingCapitalAtOpen(BigDecimal tradingCapitalAtOpen) {
        this.tradingCapitalAtOpen = tradingCapitalAtOpen;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public BigDecimal getStoploss() {
        return stoploss;
    }

    public void setStoploss(BigDecimal stoploss) {
        this.stoploss = stoploss;
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public BigDecimal getPvMv() {
        return pvMv;
    }

    public void setPvMv(BigDecimal pvMv) {
        this.pvMv = pvMv;
    }

    public BigDecimal getrTarget() {
        return rTarget;
    }

    public void setrTarget(BigDecimal rTarget) {
        this.rTarget = rTarget;
    }

    public BigDecimal getrNet() {
        return rNet;
    }

    public void setrNet(BigDecimal rNet) {
        this.rNet = rNet;
    }

    public BigDecimal getrGross() {
        return rGross;
    }

    public void setrGross(BigDecimal rGross) {
        this.rGross = rGross;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<EntryOrder> getEntryOrders() {
        return entryOrders;
    }

    public void setEntryOrders(List<EntryOrder> entryOrders) {
        this.entryOrders = entryOrders;
    }

    public List<ExitOrder> getExitOrders() {
        return exitOrders;
    }

    public void setExitOrders(List<ExitOrder> exitOrders) {
        this.exitOrders = exitOrders;
    }
}
