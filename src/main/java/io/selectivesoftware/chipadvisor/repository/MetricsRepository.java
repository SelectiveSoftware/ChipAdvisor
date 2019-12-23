package io.selectivesoftware.chipadvisor.repository;

import io.selectivesoftware.chipadvisor.domain.Metrics;
import org.springframework.data.repository.CrudRepository;

public interface MetricsRepository extends CrudRepository<Metrics, String> {
  Metrics findByCountry(String country);
}
