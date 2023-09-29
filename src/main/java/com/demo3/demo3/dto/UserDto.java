package com.demo3.demo3.dto;

import com.demo3.demo3.entity.SexEnum;
import com.demo3.demo3.model.User;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotEmpty
    @Size(min = 3, message = "Incorrect user name")
    private String userName;

    @NotNull
    private SexEnum sex;

    @NotEmpty
    private String birthdayDate;

    public User toUser() {

        return new User(this.userName, this.sex, new Date(this.birthdayDate));
    }

}
