package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import java.net.InetAddress;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@Data
public class User {
    private UUID id;
    private InetAddress ip;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
}
