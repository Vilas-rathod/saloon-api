package com.vilas.payload.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookedSlotsDTO {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
