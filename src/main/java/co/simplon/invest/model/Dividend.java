//package co.simplon.invest.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Entity
//public class Dividend {
//
//    @Id
//    @SequenceGenerator(name="dividend_seq_id", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dividend_seq_id")
//    private Long id;
//
//    private LocalDateTime distributionDate;
//
//    private BigDecimal amount;
//
//    @JsonIgnore
//    @ManyToOne
//    private Dividend dividend;
//
//}
