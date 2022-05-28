package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen",sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "matricula", columnDefinition = "varchar(20)", nullable = false)
    private String matricula;
    @Column(name = "first_name", columnDefinition = "varchar(60)",nullable = false)
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar(60)",nullable = false)
    private String lastname;

    public UserEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
