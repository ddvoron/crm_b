package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"currency", "ownType", "salesConditions", "noncomSales"})
@ToString(exclude = {"currency", "ownType", "salesConditions", "noncomSales"})
@Entity
@Table(name = "deal_conditions")
public class DealConditions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price", insertable = true, updatable = true)
    private double price;

    @ManyToOne
    @JoinColumn(name ="currency")
    private Currency currency;

    @Column(name = "chaffer", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean chaffer;

    @ManyToOne
    @JoinColumn(name ="own_type")
    private OwnType ownType;

    @ManyToOne
    @JoinColumn(name ="sales_conditions")
    private SalesConditions salesConditions;

    @Column(name = "exchange_option", insertable = true, updatable = true)
    private String exchangeOption;

    @Column(name = "with_credit", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean withCredit;

    @Column(name = "with_registration", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean withRegistration;

    @Column(name = "quickly", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean quickly;

    @Column(name = "contract", insertable = true, updatable = true)
    private String contract;

    @Column(name = "since", insertable = true, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date from;

    @Column(name = "till", insertable = true, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date till;

    @OneToOne(mappedBy = "dealConditions")
    private NoncomSales noncomSales;

    public DealConditions(int id, double price, Currency currency, boolean chaffer, OwnType ownType,
                          SalesConditions salesConditions, String exchangeOption, boolean withCredit,
                          boolean withRegistration, boolean quickly, String contract, Date from, Date till) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.chaffer = chaffer;
        this.ownType = ownType;
        this.salesConditions = salesConditions;
        this.exchangeOption = exchangeOption;
        this.withCredit = withCredit;
        this.withRegistration = withRegistration;
        this.quickly = quickly;
        this.contract = contract;
        this.from = from;
        this.till = till;
    }
}
