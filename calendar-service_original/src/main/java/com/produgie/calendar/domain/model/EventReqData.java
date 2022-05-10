package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class EventReqData {
    private String summary;
    private String description;
    private Date start;
    private Date end;
    private String tzid;
    private LocationData location;
    private RecurrenceData recurrence;
}
