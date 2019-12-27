package com.madv.moikar;

import com.madv.moikar.domain.Role;
import com.madv.moikar.domain.User;
import com.madv.moikar.repo.UserDetailsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Slf4j
//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class MoikarApplication {
	private UserDetailsRepo userRepo;
	private PasswordEncoder passwordEncoder;

	public MoikarApplication(UserDetailsRepo userRepo) {
		this.userRepo = userRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(MoikarApplication.class, args);
	}

//    @PostConstruct
//    void createUsersAndRoles() {
//	    User user = userRepo.findByName("user");
//	    if ( user == null){
//
//            user = new User("1","user");
//            userRepo.save(user);
//        }
//    }

}
