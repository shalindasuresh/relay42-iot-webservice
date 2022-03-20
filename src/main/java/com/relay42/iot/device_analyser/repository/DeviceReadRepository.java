package com.relay42.iot.device_analyser.repository;

import java.util.UUID;


import com.relay42.iot.device_analyser.model.DeviceRead;
import org.springframework.data.repository.CrudRepository;

public interface DeviceReadRepository extends CrudRepository<DeviceRead, UUID> {

    DeviceRead findByType(String name);

}