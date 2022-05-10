    package com.produgie.calendar.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.lang.reflect.Array;

@Data
@AllArgsConstructor
@Builder
public class RulesData {
    private String frequency;
}
