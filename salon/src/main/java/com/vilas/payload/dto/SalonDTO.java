package com.vilas.payload.dto;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class SalonDTO {

        private Long id;
        private String name;
        private String address;
        private String phoneNumber;
        private String email;
        private String city;
        private boolean isOpen;
        private boolean homeService;
        private boolean active;
        private Long ownerId;
        private UserDTO owner;
        private LocalTime openTime;
        private LocalTime closeTime;
        private List<String> images;

}
