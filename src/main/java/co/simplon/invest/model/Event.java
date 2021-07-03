//package co.simplon.invest.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class Event {
//
//    @Id
//    @SequenceGenerator(name="event_seq_id", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_seq_id")
//    private Long id;
//
//    private String description;
//
//    @JsonIgnore
//    @ManyToMany(mappedBy = "events")
//    private Set<Trade> trades = new HashSet<>();
//
//}
