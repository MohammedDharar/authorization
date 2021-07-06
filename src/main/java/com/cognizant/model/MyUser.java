package com.cognizant.model;



/**
 * Model class for storing user data in database
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 

/**
 * Model class for storing user data in database
 *
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity(name = "user")
public class MyUser {

 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int userId;

 

    @Column(name = "name")
    @NotBlank(message = "User name cannot be empty")
    private String userName;

 

    @NotBlank(message = "Password cannot be blank")
    @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String password;

 

    public MyUser(@NotBlank(message = "User name cannot be empty") String userName,
            @NotBlank(message = "Password cannot be blank") @Pattern(regexp = "^[A-Za-z0-9]+$") String password) {
        super();
        this.userName = userName;
        this.password = password;
    }

 

}