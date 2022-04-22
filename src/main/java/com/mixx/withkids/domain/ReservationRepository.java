package com.mixx.withkids.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    List<Reservation> findByProviderId(Long providerId);
    List<Reservation> findByReserverId(Long reserverId);
    List<Reservation> findByisCanceledTrue();
}
