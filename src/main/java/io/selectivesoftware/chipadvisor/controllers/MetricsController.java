package io.selectivesoftware.chipadvisor.controllers;

import io.selectivesoftware.chipadvisor.domain.Metrics;
import io.selectivesoftware.chipadvisor.repository.MetricsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    private final MetricsRepository metricsRepository;

    public MetricsController(final MetricsRepository metricsRepository) {
        this.metricsRepository = metricsRepository;
    }

    @GetMapping("/metrics")
    public Metrics getMetrics() {
        return this.metricsRepository.getAll();
    }

    @GetMapping(path = "/metrics/{countryCode}")
    public Metrics getCountryMetrics(@PathVariable(name = "countryCode") final String countryCode) {
        return this.metricsRepository.findByCountry(countryCode);
    }
}
