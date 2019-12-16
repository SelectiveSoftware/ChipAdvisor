package io.selectivesoftware.chipadvisor;

import io.selectivesoftware.chipadvisor.domain.ReviewRepository;
import io.selectivesoftware.chipadvisor.domain.testClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  private final ReviewRepository reviewRepository;

  public Controller(final ReviewRepository reviewRepository) {
    this.reviewRepository = reviewRepository;
  }

  @GetMapping
  public String helloWorld() {
    final testClass test = this.reviewRepository.findByName("123");
    this.reviewRepository.save(test);

    return "Hello World";
  }
}
