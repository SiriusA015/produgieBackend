package com.produgie.calendar.domain.service;
import com.produgie.calendar.domain.model.CalendarResponse;
import com.produgie.calendar.domain.model.InviteInfoData;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import java.io.IOException;

public interface CalendarService {
    void calendarInvite(InviteInfoData inviteInfoData);
}
