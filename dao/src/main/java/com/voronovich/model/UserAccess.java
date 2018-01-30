package com.voronovich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Model user-access model
 *
 * @author Dmitry V
 * @version 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "user_access")
public class UserAccess {

    @Id
    @Column(name = "id")
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "access")
    private Access access;

    public UserAccess(int id, User user, Access access) {
        this.id = id;
        this.user = user;
        this.access = access;
    }
}
