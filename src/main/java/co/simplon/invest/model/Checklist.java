//package co.simplon.invest.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class Checklist {
//
//    @Id
//    @SequenceGenerator(name="checklist_seq_id", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "checklist_seq_id")
//    private Long id;
//
//    private String type;
//
//    private String way;
//
//    private String description;
//
//    @JsonIgnore
//    @ManyToMany(mappedBy = "checklists")
//    private Set<Trade> trades = new HashSet<>();
//}
