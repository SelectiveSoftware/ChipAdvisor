package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@Data
public class Location {
    private UUID id;
    private String name;
    private double lat;
    private double lng;
    private String description;
    private String url;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
}
