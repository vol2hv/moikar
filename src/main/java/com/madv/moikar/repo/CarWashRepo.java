package com.madv.moikar.repo;

import com.madv.moikar.domain.CarWash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarWashRepo extends JpaRepository<CarWash, Long> {
    CarWash findByName(String name);
}
