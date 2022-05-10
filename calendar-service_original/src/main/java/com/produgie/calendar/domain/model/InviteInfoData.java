package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class InviteInfoData {
    private String id;
    private String email;
    private Date startDate;
    private Date endDate;
}
