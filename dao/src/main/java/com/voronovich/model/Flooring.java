package com.voronovich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Model role model
 *
 * @author Dmitry V
 * @version 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "additionalInfos")
@ToString(exclude = "additionalInfos")
@Entity
@Table(name = "flooring")
public class Flooring {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "flooring", cascade = CascadeType.ALL)
    private List<AdditionalInfo> additionalInfos = new ArrayList<>();

    public Flooring(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
