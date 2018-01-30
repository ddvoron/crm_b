package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "noncom_sales")
public class NoncomSales {

    @Id
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location")
    private Location location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "options")
    private Options options;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "additional_info")
    private AdditionalInfo additionalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deal_conditions")
    private DealConditions dealConditions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "advertising")
    private Advertising advertising;

    public NoncomSales(int id, Location location, Options options, AdditionalInfo additionalInfo,
                       DealConditions dealConditions, Advertising advertising) {
        this.id = id;
        this.location = location;
        this.options = options;
        this.additionalInfo = additionalInfo;
        this.dealConditions = dealConditions;
        this.advertising = advertising;
    }
}
