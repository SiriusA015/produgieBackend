package com.produgie.calendar.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalendarResponse {
    private String mediaUrl;
    private String status;
}
