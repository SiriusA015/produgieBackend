package com.produgie.calendar.application;

import com.produgie.calendar.domain.model.*;
import com.produgie.calendar.domain.service.CronofyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class CronofyServiceImpl implements CronofyService {

    RestTemplate restTemplate;

    @Value("${cronofy.clientSecret}")
    private String clientSecret;

    @Value("${cronofy.apiHost}")
    private String apiHost;

    @Value("${callBackURL}")
    private String callBackURL;

    @Override
    public SmartInviteResponse smartInviteCreate(InviteInfoData inviteInfoData) {

        String Url = apiHost;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", "Bearer " + clientSecret);

        RecipientReqData recipient = RecipientReqData.builder()
                .email(inviteInfoData.getEmail())
                .build();

        LocationData location = LocationData.builder()
                .description("this is test location")
                .build();

        RulesData rules = RulesData.builder()
                .frequency("week")
                .build();

        RecurrenceData recurrence = RecurrenceData.builder()
                .recurrence(Arrays.asList(rules))
                .build();

        EventReqData event = EventReqData.builder()
                .summary("this is test event")
                .description("this is test event description")
                .start(inviteInfoData.getStartDate())
                .end(inviteInfoData.getEndDate())
                .tzid(null)
                .location(location)
                .recurrence(recurrence)
                .build();

        SmartInviteBody requestBody = SmartInviteBody.builder()
                .recipient(recipient)
                .smart_invite_id(inviteInfoData.getId())
                .event(event)
                .callback_url(callBackURL)
                .build();

        HttpEntity<String> request = new HttpEntity<String>(requestBody.toString(), headers);

        ResponseEntity<SmartInviteResponse> license = restTemplate.postForEntity(Url, request, SmartInviteResponse.class);

        SmartInviteResponse licenseResponse = license.getBody();

        return licenseResponse;
    }
}
