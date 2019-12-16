package io.selectivesoftware.chipadvisor.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.net.InetAddress;
import java.time.OffsetDateTime;

@Builder
@Data
@Entity
public class User {
  private String userId;
  private InetAddress ip;
  private OffsetDateTime created_at;
  private OffsetDateTime updated_at;
}
