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
 * Model department model
 *
 * @author Dmitry V
 * @version 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = "users")
@ToString(exclude = "users")
@Entity
@Table(name = "position")
@NamedQueries({
        @NamedQuery(name = "getAllPositions", query = Position.QUERY_GET_ALL_POSITIONS),
})
public class Position {

    static final String QUERY_GET_ALL_POSITIONS = "FROM Position";

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "position", insertable = true, updatable = true)
    private String position;

    @JsonIgnore
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<>();

    public Position(int id, String position) {
        this.id = id;
        this.position = position;
    }
}
