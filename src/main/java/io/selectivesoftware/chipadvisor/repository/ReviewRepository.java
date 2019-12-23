package io.selectivesoftware.chipadvisor.repository;

import io.selectivesoftware.chipadvisor.domain.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, String> {
  Review findByReviewId(String id);
  void createReview(Review review);
}