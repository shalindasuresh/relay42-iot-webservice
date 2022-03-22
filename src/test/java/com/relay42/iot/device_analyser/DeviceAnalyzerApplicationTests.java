package com.relay42.iot.device_analyser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DeviceAnalyzerApplicationTests {

	@Autowired
	ObjectMapper objectMapper;


	@Test
	void readingDeviceStatsByTypeShouldReturnValidPayload() throws Exception {

		TestRestTemplate restTemplate= new TestRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBasicAuth("api_client","@23#API");

		JSONObject payload = new JSONObject();
		payload.put("type", "HUMIDITY");
		payload.put("function", "min");
		payload.put("timeFrom", "2022-03-22T03:07:41.44254Z");
		payload.put("timeTo", "2022-03-22T03:07:59.462381Z");


		HttpEntity<String> request = new HttpEntity<>(payload.toString(), headers);
		String response = restTemplate.postForObject("http://localhost:8000/devices/query/type", request, String.class);

		Assertions.assertNotNull(response);

	}



	@Test
	void readingDeviceStatsByNameShouldReturnValidPayload() throws Exception {

		TestRestTemplate restTemplate= new TestRestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBasicAuth("api_client","@23#API");

		JSONObject payload = new JSONObject();
		payload.put("name", "humidity-sensor-02");
		payload.put("function", "max");
		payload.put("timeFrom", "2022-03-22T03:07:41.44254Z");
		payload.put("timeTo", "2022-03-22T03:07:59.462381Z");


		HttpEntity<String> request = new HttpEntity<>(payload.toString(), headers);
		String response = restTemplate.postForObject("http://localhost:8000/devices/query/name", request, String.class);

		Assertions.assertNotNull(response);

	}

}
