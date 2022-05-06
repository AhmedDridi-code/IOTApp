package com.example.iotapp;

public class Data {
    private float temperature;
    private float humidity;
    private int led;

    public Data() {

    }

    public Data(float temperature, float humidity, int led) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.led = led;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public int getLed() {
        return led;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setLed(int led) {
        this.led = led;
    }
}
