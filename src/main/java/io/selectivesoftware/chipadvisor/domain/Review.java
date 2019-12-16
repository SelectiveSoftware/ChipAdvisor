package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Builder
@Data
@Entity
public class Review {
  @Id private String reviewId;
  private Location location;
  private User user;
  private String name;
  private String image_url;
  private int overall_rating;
  private String description;
  private boolean enabled;
  private OffsetDateTime created_at;
  private OffsetDateTime updated_at;
}
