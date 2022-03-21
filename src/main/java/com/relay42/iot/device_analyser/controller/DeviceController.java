package com.relay42.iot.device_analyser.controller;

import com.relay42.iot.device_analyser.model.DeviceRead;
import com.relay42.iot.device_analyser.request.DeviceReadingRequest;
import com.relay42.iot.device_analyser.service.DeviceReadService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Tag(description = "Device Controller provides iot device reading service",
        name = "Device Query Controller")
class DeviceController {

    @Autowired
    DeviceReadService deviceReadService;

    @PostMapping("/devices/query/type")
    public DeviceRead queryDeviceReadingByType(@Valid @RequestBody DeviceReadingRequest request) {


        try {

            DeviceRead deviceRead = deviceReadService.queryDeviceReadingByType(request.getType(),request.getFunction(),request.getTimeFrom(),request.getTimeTo());

            return deviceRead;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }


    @PostMapping("/devices/query/name")
    public DeviceRead queryDeviceReadingByName(@Valid @RequestBody DeviceReadingRequest request) {


        try {

            DeviceRead deviceRead = deviceReadService.queryDeviceReadingByName(request.getType(),request.getFunction(),request.getTimeFrom(),request.getTimeTo());

            return deviceRead;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }



}
