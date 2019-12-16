package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
@Data
public class Review {
    private UUID id;
    private Location location_id;
    private User user_id;
    private String name;
    private String image_url;
    private int overall_rating;
    private String description;
    private boolean enabled;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;
}
