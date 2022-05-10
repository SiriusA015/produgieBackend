package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SmartInviteResponse {
    private String smart_invite_id;
    private EventData event;
    private RecipientData recipient;
    private List<RepliesData> replies;
    private String callback_url;
    private AttachmentsData attachments;

    @Override
    public String toString() {
        return "SmartInviteResponse{" +
                "smart_invite_id=" + smart_invite_id +
                ", event='" + event + '\'' +
                ", recipient='" + recipient + '\'' +
                ", replies=" + replies +
                ", callback_url=" + callback_url +
                ", attachments=" + attachments +
                '}';
    }
}
