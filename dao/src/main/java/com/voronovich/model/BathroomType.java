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
@EqualsAndHashCode(exclude = "options")
@ToString(exclude = "options")
@Entity
@Table(name = "bathroom_type")
public class BathroomType {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "bathroomType", cascade = CascadeType.ALL)
    private List<Options> options = new ArrayList<>();

    public BathroomType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
