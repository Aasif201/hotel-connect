package com.project.HotelConnect.service.interfac;

import com.project.HotelConnect.dto.LoginRequest;
import com.project.HotelConnect.dto.Response;
import com.project.HotelConnect.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}