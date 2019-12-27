package com.madv.moikar.repo;

import com.madv.moikar.domain.Parententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentEntityRepo extends JpaRepository<Parententity, Long> {
    Parententity findByName(String name);
}
