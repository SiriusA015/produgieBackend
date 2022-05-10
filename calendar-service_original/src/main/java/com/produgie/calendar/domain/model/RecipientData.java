package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class RecipientData {
    private String email;
    private String status;
}
