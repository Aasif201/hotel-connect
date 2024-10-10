package com.project.HotelConnect.service.interfac;

import com.project.HotelConnect.dto.Response;
import com.project.HotelConnect.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}