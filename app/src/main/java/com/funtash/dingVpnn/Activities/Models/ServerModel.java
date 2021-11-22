package com.funtash.dingVpnn.Activities.Models;

public class ServerModel {
    String countryImage,countryName,progress;

    public ServerModel(String countryImage, String countryName, String progress) {
        this.countryImage = countryImage;
        this.countryName = countryName;
        this.progress = progress;
    }

    public ServerModel() {
    }

    public String getCountryImage() {
        return countryImage;
    }
    public void setCountryImage(String countryImage) {
        this.countryImage = countryImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
