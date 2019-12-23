package io.selectivesoftware.chipadvisor.controllers;

import io.selectivesoftware.chipadvisor.domain.Review;
import io.selectivesoftware.chipadvisor.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class ReviewController {

  private final ReviewRepository reviewRepository;

  public ReviewController(final ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping("/review")
  public List<Review> getReviews() {
    return this.reviewRepository.getAll();
  }

  @GetMapping(path = "/review/{reviewId}")
  public Review getReview(@PathVariable(name = "reviewId") final String reviewId) {
    return this.reviewRepository.findByReviewId(reviewId);
  }

  @PostMapping("/review")
  public void postReview(@RequestBody Review review) {
      this.reviewRepository.createReview(review);
  }
}
