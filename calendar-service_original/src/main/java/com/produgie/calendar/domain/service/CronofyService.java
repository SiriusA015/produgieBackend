package com.produgie.calendar.domain.service;
import com.produgie.calendar.domain.model.InviteInfoData;
import com.produgie.calendar.domain.model.SmartInviteResponse;

public interface CronofyService {
    SmartInviteResponse smartInviteCreate(InviteInfoData inviteInfoData);
}