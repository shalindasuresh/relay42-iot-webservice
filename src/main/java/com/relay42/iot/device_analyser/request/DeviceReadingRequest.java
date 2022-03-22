package com.relay42.iot.device_analyser.request;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class DeviceReadingRequest {


//    @NotEmpty(message = "Device Type cannot be empty")
    private String type;

//    @NotEmpty(message = "Device Name cannot be empty")
    private String name;


    @NotEmpty(message = "Function cannot be empty")
    private String function;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
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
