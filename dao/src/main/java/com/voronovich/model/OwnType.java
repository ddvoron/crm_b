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
@EqualsAndHashCode(exclude = "dealConditions")
@ToString(exclude = "dealConditions")
@Entity
@Table(name = "own_type")
public class OwnType {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "ownType", cascade = CascadeType.ALL)
    private List<DealConditions> dealConditions = new ArrayList<>();

    public OwnType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
