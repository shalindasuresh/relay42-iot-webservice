package com.relay42.iot.device_analyser.service;

import com.relay42.iot.device_analyser.model.DeviceRead;
import com.relay42.iot.device_analyser.repository.DeviceReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceReadService {

    @Autowired
    DeviceReadRepository deviceReadRepository;

    public DeviceRead queryDeviceReadingByType(String type, String timeFrom, String timeTo) {
        try {

            DeviceRead deviceRead = deviceReadRepository.findAverageByDeviceType(type,timeFrom,timeTo);

            return deviceRead;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    }

