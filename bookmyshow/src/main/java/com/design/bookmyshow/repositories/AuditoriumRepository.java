package com.design.bookmyshow.repositories;


import com.design.bookmyshow.models.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository
extends JpaRepository<Auditorium, Long> {
}
