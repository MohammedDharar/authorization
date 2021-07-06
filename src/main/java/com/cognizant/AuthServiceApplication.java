package com.cognizant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.model.MyUser;
import com.cognizant.repository.UserRepo;

/**
 * This is the main class for Authorisation class
 * 
 * @authorPOD 4
 *
 */

/**
 * This is the main class for Authorisation class
 * 
 * @authorPOD 4
 *
 */
@SpringBootApplication
public class AuthServiceApplication implements CommandLineRunner {

 

    private UserRepo userRepo;

 

    public AuthServiceApplication(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

 

    /**
     * Main class
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {
        userRepo.save(new MyUser("mohammed", "abc1"));
        userRepo.save(new MyUser("gayatri", "abc2"));
        userRepo.save(new MyUser("fathima", "abc3"));
        userRepo.save(new MyUser("subhiksha", "abc4"));
    }

 

}







