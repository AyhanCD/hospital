package com.hospital.hispitalapp.repository;

import com.hospital.hispitalapp.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
}
