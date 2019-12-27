package com.madv.moikar.repo;

import com.madv.moikar.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamleRepo extends JpaRepository<Sample, Long> {
    Sample findByName(String name);
}
