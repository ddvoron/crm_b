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
@EqualsAndHashCode(exclude = "userAccesses")
@ToString(exclude = "userAccesses")
@Entity
@Table(name = "access")
public class Access {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "level", insertable = true, updatable = true)
    private int level;

    @Column(name = "description", insertable = true, updatable = true)
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "access", cascade = CascadeType.ALL)
    private List<UserAccess> userAccesses = new ArrayList<>();

    public Access(int id, int level, String description) {
        this.id = id;
        this.level = level;
        this.description = description;
    }
}
