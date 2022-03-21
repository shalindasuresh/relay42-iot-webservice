package com.relay42.iot.device_analyser.request;


import javax.validation.constraints.NotBlank;

public class DeviceReadingRequest {


    @NotBlank(message = "Device Type cannot be empty")
    private String type;

    @NotBlank(message = "Time from cannot be empty")
    private String timeFrom;

    @NotBlank(message = "Time to cannot be empty")
    private String timeTo;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }
}
