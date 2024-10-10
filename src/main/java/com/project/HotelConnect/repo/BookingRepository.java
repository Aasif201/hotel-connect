package com.project.HotelConnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HotelConnect.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}