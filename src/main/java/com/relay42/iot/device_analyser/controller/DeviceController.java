package com.relay42.iot.device_analyser.controller;

import com.relay42.iot.device_analyser.model.DeviceRead;
import com.relay42.iot.device_analyser.repository.DeviceReadRepository;
import com.relay42.iot.device_analyser.request.DeviceReadingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
class DeviceController {

    @Autowired
    DeviceReadRepository deviceReadRepository;

    @PostMapping("/devices/query/type")
    public void queryDeviceReadingByType(@Valid @RequestBody DeviceReadingRequest request){

        try {
           List<DeviceRead> deviceRead=deviceReadRepository.findBasicStatsByDeviceType(request.getType());

            System.out.println("************************************");
            System.out.println(deviceRead.get(0).getName());
            System.out.println(deviceRead.get(0).getValue());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}
