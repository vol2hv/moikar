package com.madv.moikar.repo;

import com.madv.moikar.domain.Box;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoxRepo extends JpaRepository<Box, Long> {
    List<Box> findByName(String name);
}
