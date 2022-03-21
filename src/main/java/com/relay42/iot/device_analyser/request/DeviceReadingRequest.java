package com.relay42.iot.device_analyser.request;


import javax.validation.constraints.NotBlank;

public class DeviceReadingRequest {


    @NotBlank(message = "Device Type cannot be empty")
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
