package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Access;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"county", "metro", "noncomSales"})
@ToString(exclude = {"county", "metro", "noncomSales"})
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "county")
    private County county;

    @Column(name = "city", insertable = true, updatable = true)
    private String city;

    @Column(name = "street", insertable = true, updatable = true)
    private String street;

    @Column(name = "house", insertable = true, updatable = true)
    private int house;

    @Column(name = "housing", insertable = true, updatable = true)
    private String housing;

    @Column(name = "district", insertable = true, updatable = true)
    private String district;

    @Column(name = "microdistrict", insertable = true, updatable = true)
    private String microdistrict;

    @Column(name = "flat", insertable = true, updatable = true)
    private String flat;

    @ManyToOne
    @JoinColumn(name = "metro")
    private Metro metro;

    @OneToOne(mappedBy = "location")
    private NoncomSales noncomSales;



    public Location(int id, County county, String city, String street, int house, String housing,
                    String district, String microdistrict, String flat, Metro metro) {
        this.id = id;
        this.county = county;
        this.city = city;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.district = district;
        this.microdistrict = microdistrict;
        this.flat = flat;
        this.metro = metro;
    }
}
