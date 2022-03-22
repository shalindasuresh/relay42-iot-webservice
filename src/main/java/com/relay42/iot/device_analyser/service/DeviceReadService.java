package com.relay42.iot.device_analyser.service;

import com.relay42.iot.device_analyser.model.DeviceRead;
import com.relay42.iot.device_analyser.repository.DeviceReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceReadService {

    @Autowired
    DeviceReadRepository deviceReadRepository;

    public DeviceRead queryDeviceReadingByType(String type,String function, String timeFrom, String timeTo) {
        try {
            DeviceRead deviceRead = null;

            switch (function) {
                case "average":
                     deviceRead = deviceReadRepository.findAverageByDeviceType(type,timeFrom,timeTo);
                     break;
                case "min":
                    deviceRead = deviceReadRepository.findMinValueByDeviceType(type,timeFrom,timeTo);
                    break;

                case "max":
                    deviceRead = deviceReadRepository.findMaxValueByDeviceType(type,timeFrom,timeTo);
                    break;

            }

            return deviceRead;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public DeviceRead queryDeviceReadingByName(String name,String function, String timeFrom, String timeTo) {
        try {
            DeviceRead deviceRead = null;

            switch (function) {
                case "average":
                    deviceRead = deviceReadRepository.findAverageByDeviceName(name,timeFrom,timeTo);
                    break;
                case "min":
                    deviceRead = deviceReadRepository.findMinValueByDeviceName(name,timeFrom,timeTo);
                    break;

                case "max":
                    deviceRead = deviceReadRepository.findMaxValueByDeviceName(name,timeFrom,timeTo);
                    break;

            }

            return deviceRead;
        } catch (Exception e) {
        }

        return null;
    }

    }

