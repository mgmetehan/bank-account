package com.mgmetehan.bankaccount.shared.util;

import lombok.experimental.UtilityClass;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

@UtilityClass
public class DateUtil {
    private final Clock clock = null;

    public LocalDateTime getCurrentLocalDateTime() {
        Instant instant = clock.instant();
        return LocalDateTime.ofInstant(
                instant,
                Clock.systemDefaultZone().getZone());
    }
}
