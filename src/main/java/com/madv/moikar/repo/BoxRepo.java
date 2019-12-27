package com.madv.moikar.repo;

import com.madv.moikar.domain.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepo extends JpaRepository<Box, Long> {
    Box findByName(String name);
}
