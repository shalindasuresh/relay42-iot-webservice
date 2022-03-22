package com.relay42.iot.device_analyser.repository;

import com.relay42.iot.device_analyser.model.DeviceRead;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface DeviceReadRepository extends CrudRepository<DeviceRead, UUID> {



    @Query("SELECT AVG(value) as value,name FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findAverageByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);


    @Query("SELECT MIN(value) as value,name FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findMinValueByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);


    @Query("SELECT MAX(value) as value FROM device_read WHERE type=:device_type AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findMaxValueByDeviceType( @Param("device_type")  String type,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);



    @Query(value = "SELECT AVG(value) as value,name,timestamp FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findAverageByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);


    @Query("SELECT MIN(value) as value,name,timestamp FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findMinValueByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);


    @Query("SELECT MAX(value) as value,name,timestamp  FROM device_read WHERE name=:device_name AND timestamp >=:time_from AND timestamp <=:time_to ALLOW FILTERING")
    DeviceRead findMaxValueByDeviceName( @Param("device_name")  String name,@Param("time_from") String timeFrom,@Param("time_to") String timeTo);



}