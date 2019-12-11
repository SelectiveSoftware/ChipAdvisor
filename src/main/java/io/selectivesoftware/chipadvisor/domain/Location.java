package io.selectivesoftware.chipadvisor.domain;

public interface Location {
    double getLat();
    double getLon();
    void setLat(double lat);
    void setLon(double lon);
}
