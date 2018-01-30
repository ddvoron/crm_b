package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"bathroomType", "wallMaterial", "houseType",
        "windowType", "balconyType", "terrace", "level", "noncomSales"})
@ToString(exclude = {"bathroomType", "wallMaterial", "houseType",
        "windowType", "balconyType", "terrace", "level", "noncomSales"})
@Entity
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "room_number", insertable = true, updatable = true)
    private int roomNumber;

    @Column(name = "room_separated", insertable = true, updatable = true)
    private int roomSeparated;

    @Column(name = "area_common", insertable = true, updatable = true)
    private double areaCommon;

    @Column(name = "area_living", insertable = true, updatable = true)
    private double areaLiving;

    @Column(name = "area_kitchen", insertable = true, updatable = true)
    private double areaKitchen;

    @ManyToOne
    @JoinColumn(name = "bathroom_type")
    BathroomType bathroomType;

    @ManyToOne
    @JoinColumn(name = "wall_material")
    WallMaterial wallMaterial;

    @ManyToOne
    @JoinColumn(name = "house_type")
    HouseType houseType;

    @Column(name = "built", insertable = true, updatable = true)
    private int built;

    @Column(name = "repared", insertable = true, updatable = true)
    private int repared;

    @ManyToOne
    @JoinColumn(name = "window_type")
    WindowType windowType;

    @Column(name = "ceiling", insertable = true, updatable = true)
    private double ceiling;

    @ManyToOne
    @JoinColumn(name = "balcony_type")
    BalconyType balconyType;

    @ManyToOne
    @JoinColumn(name = "terrace")
    Terrace terrace;

    @ManyToOne
    @JoinColumn(name = "level")
    Level level;

    @Column(name = "floor", insertable = true, updatable = true)
    private int floor;

    @Column(name = "floors", insertable = true, updatable = true)
    private int floors;

    @Column(name = "elite", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean elite;

    @Column(name = "new", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean builtRecently;

    @OneToOne(mappedBy = "options")
    private NoncomSales noncomSales;

    public Options(int id, int roomNumber, int roomSeparated, double areaCommon, double areaLiving, double areaKitchen,
                   BathroomType bathroomType, WallMaterial wallMaterial, HouseType houseType, int built,
                   int repared, WindowType windowType, double ceiling, BalconyType balconyType,
                   Terrace terrace, Level level, int floor, int floors, boolean elite,
                   boolean builtRecently) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomSeparated = roomSeparated;
        this.areaCommon = areaCommon;
        this.areaLiving = areaLiving;
        this.areaKitchen = areaKitchen;
        this.bathroomType = bathroomType;
        this.wallMaterial = wallMaterial;
        this.houseType = houseType;
        this.built = built;
        this.repared = repared;
        this.windowType = windowType;
        this.ceiling = ceiling;
        this.balconyType = balconyType;
        this.terrace = terrace;
        this.level = level;
        this.floor = floor;
        this.floors = floors;
        this.elite = elite;
        this.builtRecently = builtRecently;
    }
}
