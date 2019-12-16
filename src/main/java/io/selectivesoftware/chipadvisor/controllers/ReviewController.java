package io.selectivesoftware.chipadvisor.controllers;

import io.selectivesoftware.chipadvisor.domain.Review;
import io.selectivesoftware.chipadvisor.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

  private final ReviewRepository reviewRepository;

  public ReviewController(final ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping(path = "/review/{reviewId}")
  public Review getReview(@PathVariable(name = "reviewId") final String reviewId) {
    return this.reviewRepository.findByReviewId(reviewId);
  }
}
