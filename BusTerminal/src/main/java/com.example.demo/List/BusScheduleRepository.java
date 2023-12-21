package com.example.demo.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusScheduleRepository extends JpaRepository<Bus, Long> {
}
