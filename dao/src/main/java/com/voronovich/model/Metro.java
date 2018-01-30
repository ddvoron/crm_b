package com.voronovich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "locations")
@ToString(exclude = "locations")
@Entity
@Table(name = "metro")
public class Metro {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @Column(name = "code", insertable = true, updatable = true)
    private String code;

    @JsonIgnore
    @OneToMany(mappedBy = "metro", cascade = CascadeType.ALL)
    private List<Location> locations = new ArrayList<>();

    public Metro(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
