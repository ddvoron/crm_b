package com.voronovich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"interiorFinish", "interiorFinishCondition", "interiorFinishOption",
        "flooring", "furniture", "windowMaterial", "noncomSales"})
@ToString(exclude = {"interiorFinish", "interiorFinishCondition", "interiorFinishOption",
        "flooring", "furniture", "windowMaterial", "noncomSales"})
@Entity
@Table(name = "additional_info")
public class AdditionalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "interior_finish")
    InteriorFinish interiorFinish;

    @ManyToOne
    @JoinColumn(name = "interior_finish_condition")
    InteriorFinishCondition interiorFinishCondition;

    @ManyToOne
    @JoinColumn(name = "interior_finish_option")
    InteriorFinishOption interiorFinishOption;

    @ManyToOne
    @JoinColumn(name = "flooring")
    Flooring flooring;

    @ManyToOne
    @JoinColumn(name = "furniture")
    Furniture furniture;

    @ManyToOne
    @JoinColumn(name = "window_material")
    WindowMaterial windowMaterial;

    @Column(name = "phone", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean phone;

    @Column(name = "internet", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean internet;

    @Column(name = "satellite_tv", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean satelliteTv;

    @Column(name = "intercom", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean intercom;

    @Column(name = "intercom_v", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean intercomV;

    @Column(name = "cctv", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean cctv;

    @Column(name = "security_alarm", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean securityAlarm;

    @Column(name = "concierge", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean concierge;

    @Column(name = "steel_door", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean steelDoor;

    @Column(name = "elevator", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean elevator;

    @Column(name = "garbage_chute", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean garbageChute;

    @Column(name = "separate_entrance", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean separateEntrance;

    @Column(name = "garage", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean garage;

    @Column(name = "parking_lot", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean parkingLot;

    @Column(name = "guarded_parking", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean guardedParking;

    @Column(name = "playground", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean playground;

    @Column(name = "tennis_court", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean tennisCourt;

    @Column(name = "recreation_complex", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean recreationComplex;

    @Column(name = "built_in_cupboard", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean builtInCupboard;

    @Column(name = "appliances", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean appliances;

    @Column(name = "dishwasher", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean dishwasher;

    @Column(name = "washer", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean washer;

    @Column(name = "fridge", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean fridge;

    @Column(name = "air_conditioning", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean airConditioning;

    @Column(name = "fireplace", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean fireplace;

    @Column(name = "storeroom", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean storeroom;

    @Column(name = "pool", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean pool;

    @Column(name = "jacuzzi", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean jacuzzi;

    @Column(name = "water_meters", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean waterMeters;

    @Column(name = "sanitary_engineering", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean sanitaryEngineering;

    @Column(name = "bicycle_path", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean bicyclePath;

    @Column(name = "house_animals", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean houseAnimals;

    @Column(name = "engineering_communications", insertable = true, updatable = true)
    private String engineeringCommunications;

    @Column(name = "note", columnDefinition = "TEXT(1000)", insertable = true, updatable = true)
    private String note;

    @OneToOne(mappedBy = "additionalInfo")
    private NoncomSales noncomSales;

    public AdditionalInfo(int id, InteriorFinish interiorFinish, InteriorFinishCondition interiorFinishCondition,
                          InteriorFinishOption interiorFinishOption, Flooring flooring, Furniture furniture,
                          WindowMaterial windowMaterial, boolean phone, boolean internet, boolean satelliteTv,
                          boolean intercom, boolean intercomV, boolean cctv, boolean securityAlarm,
                          boolean concierge, boolean steelDoor, boolean elevator, boolean garbageChute,
                          boolean separateEntrance, boolean garage, boolean parkingLot, boolean guardedParking,
                          boolean playground, boolean tennisCourt, boolean recreationComplex, boolean builtInCupboard,
                          boolean appliances, boolean dishwasher, boolean washer, boolean fridge,
                          boolean airConditioning, boolean fireplace, boolean storeroom, boolean pool,
                          boolean jacuzzi, boolean waterMeters, boolean sanitaryEngineering, boolean bicyclePath,
                          boolean houseAnimals, String engineeringCommunications, String note) {
        this.id = id;
        this.interiorFinish = interiorFinish;
        this.interiorFinishCondition = interiorFinishCondition;
        this.interiorFinishOption = interiorFinishOption;
        this.flooring = flooring;
        this.furniture = furniture;
        this.windowMaterial = windowMaterial;
        this.phone = phone;
        this.internet = internet;
        this.satelliteTv = satelliteTv;
        this.intercom = intercom;
        this.intercomV = intercomV;
        this.cctv = cctv;
        this.securityAlarm = securityAlarm;
        this.concierge = concierge;
        this.steelDoor = steelDoor;
        this.elevator = elevator;
        this.garbageChute = garbageChute;
        this.separateEntrance = separateEntrance;
        this.garage = garage;
        this.parkingLot = parkingLot;
        this.guardedParking = guardedParking;
        this.playground = playground;
        this.tennisCourt = tennisCourt;
        this.recreationComplex = recreationComplex;
        this.builtInCupboard = builtInCupboard;
        this.appliances = appliances;
        this.dishwasher = dishwasher;
        this.washer = washer;
        this.fridge = fridge;
        this.airConditioning = airConditioning;
        this.fireplace = fireplace;
        this.storeroom = storeroom;
        this.pool = pool;
        this.jacuzzi = jacuzzi;
        this.waterMeters = waterMeters;
        this.sanitaryEngineering = sanitaryEngineering;
        this.bicyclePath = bicyclePath;
        this.houseAnimals = houseAnimals;
        this.engineeringCommunications = engineeringCommunications;
        this.note = note;
    }
}
