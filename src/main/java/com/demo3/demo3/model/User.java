package com.demo3.demo3.model;

import com.demo3.demo3.entity.SexEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user_data")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_generator")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private SexEnum sex;

    @Column(name = "birsday_date")
    private Date birsdayDate;

    public User(String userName, SexEnum sex, Date birsdayDate) {
        this.userName = userName;
        this.sex = sex;
        this.birsdayDate = birsdayDate;
    }
}
