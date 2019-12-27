package com.madv.moikar.repo;

import com.madv.moikar.domain.Sample;
import com.madv.moikar.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
    User findByName(String name);
}
