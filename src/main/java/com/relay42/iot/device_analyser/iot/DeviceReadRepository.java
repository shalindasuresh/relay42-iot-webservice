package com.relay42.iot.device_analyser.iot;

import java.util.UUID;


import org.springframework.data.repository.CrudRepository;

public interface DeviceReadRepository extends CrudRepository<DeviceRead, UUID> {

    DeviceRead findByType(String name);

}