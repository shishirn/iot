package com.shri.iot.repository;

import com.shri.iot.model.TempAndHumidity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempAndHumidityRepository extends JpaRepository<TempAndHumidity, Long> {
}
