package com.relay42.iot.device_analyser.repository;

import com.relay42.iot.device_analyser.model.DeviceRead;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface DeviceReadRepository extends CrudRepository<DeviceRead, UUID> {

    DeviceRead findByType(String type);

    @AllowFiltering
    @Query(value = "SELECT AVG(value),MIN(value),MAX(value),name  FROM device_read WHERE type='HUMIDITY' ")
    List<DeviceRead> findBasicStatsByDeviceType(String type);

    @AllowFiltering
    @Query(value = "SELECT AVG(value),MIN(value),MAX(value),name  FROM device_read WHERE name='HUMIDITY' ")
    List<DeviceRead> findBasicStatsByDeviceName(String name);


}