package com.midtermmad3125.Modal;

public class Weather {

    private  String city;
    private String longitude;
    private String latitide;
    private String poplulation;

    public Weather(String city, String longitude, String latitide, String poplulation) {
        this.city = city;
        this.longitude = longitude;
        this.latitide = latitide;
        this.poplulation = poplulation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitide() {
        return latitide;
    }

    public void setLatitide(String latitide) {
        this.latitide = latitide;
    }

    public String getPoplulation() {
        return poplulation;
    }

    public void setPoplulation(String poplulation) {
        this.poplulation = poplulation;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitide='" + latitide + '\'' +
                ", poplulation='" + poplulation + '\'' +
                '}';
    }
}
