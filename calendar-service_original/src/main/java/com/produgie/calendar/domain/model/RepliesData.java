package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RepliesData {
    private String email;
    private String status;
}
