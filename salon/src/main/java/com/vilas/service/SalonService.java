package com.vilas.service;

import com.vilas.modal.Salon;
import com.vilas.payload.dto.SalonDTO;
import com.vilas.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {


    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(Long salonId, Salon salon) throws Exception;

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);
}
