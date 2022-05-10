package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class SmartInviteBody {
    private RecipientReqData recipient;
    private String smart_invite_id;
    private EventReqData event;
    private String callback_url;

    public SmartInviteBody() {

    }

//    public static SmartInviteBody of(String summary, String description, Date start, Date end, String tzid, LocationData location, RecurrenceData recurrence, String callback_url) {
//        return new SmartInviteBody(summary, description, start, end, tzid, location, recurrence, callback_url);
//    }

}
