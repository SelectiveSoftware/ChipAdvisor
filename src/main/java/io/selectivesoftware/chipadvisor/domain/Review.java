package io.selectivesoftware.chipadvisor.domain;

public interface Review {
    String getName();
    Location getLocation();
    String getPicture();
    int getStarRating();
    String getDescription();
}
