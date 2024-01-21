package com.example.smartfarmapi.repository;

import com.example.smartfarmapi.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepo extends JpaRepository<SensorData, Long> {
}
