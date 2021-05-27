package mx.clip.api.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private String id;
    private String cardNumber;
    private String balance;
    private String expirationDate;
    private String state;

    @OneToMany(targetEntity=Transaction.class,cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "cards")
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransactions(Transaction transaction) {
        transactions.add(transaction);
        // transaction.set(this);
     }
     
     public void removeTransactions(Transaction transaction){
        transactions.remove(transaction);
        // transaction.set(null);
     }
}
