package com.procesos.concesionario.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "USER")
public class User {
    @Id
    private long id;
    @Column(name = "firs_name")
    private String firsName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String password;
    private String address;
    private LocalDate birthday;
}
