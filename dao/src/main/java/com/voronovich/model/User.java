package com.voronovich.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Model user model
 *
 * @author Dmitry V
 * @version 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"position", "userAccesses"})
@ToString(exclude = {"position", "userAccesses"})
@Entity
@Table(name = "user")
@NamedQueries({
        @NamedQuery(name = "getUsersByLoginAndPassword", query = User.QUERY_GET_USERS_BY_LOGIN_AND_PASSWORD),
        @NamedQuery(name = "getUsersByLogin", query = User.QUERY_GET_USERS_BY_LOGIN),
        @NamedQuery(name = "getUsersByEmail", query = User.QUERY_GET_USERS_BY_EMAIL),
        @NamedQuery(name = "getAllUsers", query = User.QUERY_GET_ALL_USERS),
})
public class User implements Serializable {

    static final String QUERY_GET_USERS_BY_LOGIN_AND_PASSWORD = "FROM User u WHERE u.login = :login and u.password = :password";
    static final String QUERY_GET_USERS_BY_LOGIN = "FROM User u WHERE u.login = :login";
    static final String QUERY_GET_USERS_BY_EMAIL = "FROM User u WHERE u.email = :email";
    static final String QUERY_GET_ALL_USERS = "FROM User";

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", insertable = true, updatable = true)
    private String name;

    @Column(name = "patronymic", insertable = true, updatable = true)
    private String patronymic;

    @Column(name = "surname", insertable = true, updatable = true)
    private String surname;

    @Column(name = "email", insertable = true, updatable = true)
    private String email;

    @Column(name = "phone", insertable = true, updatable = true)
    private String phone;

    @Column(name = "login", insertable = true, updatable = true)
    private String login;

    @Column(name = "password", insertable = true, updatable = true)
    private String password;

    @Column(name = "salt", insertable = true, updatable = true)
    private String salt;

    @Column(name = "registration_date", insertable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "is_active", columnDefinition = "TINYINT(1)", insertable = true, updatable = true)
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "position")
    private Position position;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserAccess> userAccesses = new ArrayList<>();

    public User(int id, String name, String patronymic, String surname,
                String email, String phone, String login, String password,
                String salt, Date registrationDate, boolean active, Position position) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.salt = salt;
        this.registrationDate = registrationDate;
        this.active = active;
        this.position = position;
    }
}
