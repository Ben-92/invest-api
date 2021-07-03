package co.simplon.invest.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {

    @Id
    @SequenceGenerator(name="account_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq_id")
    private Long id;

    private String name;

    private String currency;

    private BigDecimal tradingCapital;

    private BigDecimal tradingCapitalAfterLastTrade;

    @OneToMany(mappedBy = "account", cascade = CascadeType.REMOVE) /*cascadeType.REMOVE all trades when deleting an account */
    private List<Trade> trades = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getTradingCapital() {
        return tradingCapital;
    }

    public void setTradingCapital(BigDecimal tradingCapital) {
        this.tradingCapital = tradingCapital;
    }

    public BigDecimal getTradingCapitalAfterLastTrade() {
        return tradingCapitalAfterLastTrade;
    }

    public void setTradingCapitalAfterLastTrade(BigDecimal tradingCapitalAfterLastTrade) {
        this.tradingCapitalAfterLastTrade = tradingCapitalAfterLastTrade;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }
}
