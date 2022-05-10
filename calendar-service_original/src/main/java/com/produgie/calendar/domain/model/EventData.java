package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class EventData {
    private String summary;
    private String description;
    private StartData start;
    private EndData end;
    private LocationData location;
    private String transparency;
}
