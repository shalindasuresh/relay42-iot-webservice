package com.relay42.iot.device_analyser.repository;

import com.relay42.iot.device_analyser.model.DeviceRead;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface DeviceReadRepository extends CrudRepository<DeviceRead, UUID> {


    @AllowFiltering
    @Query("SELECT AVG(value) as value,name FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findAverageByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);

    @AllowFiltering
    @Query("SELECT MIN(value) as value,name FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findMinValueByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);

    @AllowFiltering
    @Query("SELECT MAX(value) as value FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findMaxValueByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);



    @AllowFiltering
    @Query(value = "SELECT AVG(value) as value FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findAverageByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);

    @AllowFiltering
    @Query("SELECT MIN(value) as value,name FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findMinValueByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);

    @AllowFiltering
    @Query("SELECT MAX(value) as value,name FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to")
    DeviceRead findMaxValueByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);



}