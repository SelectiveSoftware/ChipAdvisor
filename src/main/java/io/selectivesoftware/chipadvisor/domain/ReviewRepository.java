package io.selectivesoftware.chipadvisor.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<testClass, String> {
  testClass findByName(String id);
}
