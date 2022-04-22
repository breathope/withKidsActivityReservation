package com.mixx.withkids.domain;

// import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
    Optional<Reservation> findByProviderId(Long providerId);
    Optional<Reservation> findByReserverId(Long reserverId);
    Optional<Reservation> findByisCanceledTrue();
    Optional<Reservation> findByProviderIdAndisCanceledTrue(Long providerId);
}
