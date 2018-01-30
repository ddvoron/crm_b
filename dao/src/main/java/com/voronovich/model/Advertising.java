package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"noncomSales"})
@ToString(exclude = {"noncomSales"})
@Entity
@Table(name = "advertising")
public class Advertising {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_published", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean published;

    @Column(name = "heading", columnDefinition = "TEXT(1000)", insertable = true, updatable = true)
    private String heading;

    @Column(name = "content", columnDefinition = "TEXT(1000)", insertable = true, updatable = true)
    private String content;

    @Column(name = "phone1", insertable = true, updatable = true)
    private String phone1;

    @Column(name = "phone2", insertable = true, updatable = true)
    private String phone2;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @Column(name = "company", insertable = true, updatable = true)
    private String company;

    @OneToOne(mappedBy = "advertising")
    private NoncomSales noncomSales;

    public Advertising(int id, boolean published, String heading, String content,
                       String phone1, String phone2, String name, String company) {
        this.id = id;
        this.published = published;
        this.heading = heading;
        this.content = content;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.name = name;
        this.company = company;
    }
}
