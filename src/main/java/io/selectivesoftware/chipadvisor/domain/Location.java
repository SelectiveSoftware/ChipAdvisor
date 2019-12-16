package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Builder
@Data
@Entity
public class Location {
  @Id private String locationId;
  private String name;
  private double lat;
  private double lng;
  private String description;
  private String url;
  private OffsetDateTime created_at;
  private OffsetDateTime updated_at;
}
