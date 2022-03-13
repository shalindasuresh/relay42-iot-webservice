package com.relay42.iot.device_analyser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.relay42.iot.device_analyser.iot.DeviceRead;
import com.relay42.iot.device_analyser.iot.DeviceReadRepository;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;




@SpringBootApplication
public class DeviceAnalyzerApplication {

	public static void main(String [] args) {
		SpringApplication.run(DeviceAnalyzerApplication.class, args);
	}

	@Autowired
	DeviceReadRepository deviceReadRepository;
	@KafkaListener(id="relay42",topics = "iot-data")
	public void listen(String in) {

		ObjectMapper objectMapper = new ObjectMapper();

		byte[] valueDecoded = Base64.decodeBase64(in);

		try {
			DeviceRead deviceRead=objectMapper.readValue(new String(valueDecoded), DeviceRead.class);
			System.out.println(deviceRead.getName());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}


	}


}
