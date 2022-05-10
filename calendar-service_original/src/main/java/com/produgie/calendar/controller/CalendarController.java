package com.produgie.calendar.controller;

import com.produgie.calendar.domain.model.CalendarResponse;
import com.produgie.calendar.domain.model.InviteInfoData;
import com.produgie.calendar.domain.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @SuppressWarnings("deprecation")
        @RequestMapping(method = RequestMethod.POST, value = "/invite")
    public ResponseEntity<?> calendarInvite(@RequestBody InviteInfoData inviteInfoData) {
        calendarService.calendarInvite(inviteInfoData);
        return ResponseEntity.ok().build();
    }


}

