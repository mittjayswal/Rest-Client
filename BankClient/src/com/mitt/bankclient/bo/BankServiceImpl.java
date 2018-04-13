package com.mitt.bankclient.bo;

import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mitt.bankclient.vo.BankVO;

@Service
public class BankServiceImpl implements BankService {

	@Override
	public void addBankInfo(com.mitt.bankclient.vo.BankVO bvo) throws Exception {
		final String uri = "http://localhost:8080/com.mitt.rest-three-pages/api/rest";

		// set your headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// set your entity to send
		HttpEntity entity = new HttpEntity(bvo, headers);

		RestTemplate restTemplate = new RestTemplate();

		// send it!
		ResponseEntity<String> out = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);

	}

	@Override
	public BankVO[] getAllBankInfo() {
		final String uri = "http://localhost:8080/com.mitt.rest-three-pages/api/rest/get";

		RestTemplate restTemplate = new RestTemplate();
		//String result = restTemplate.getForObject(uri, String.class);

		ResponseEntity<BankVO[]> responseEntity = restTemplate.getForEntity(uri, BankVO[].class);
		BankVO[] objects = responseEntity.getBody();
		for (BankVO o : objects) {
			System.out.println(o.getFirstName());
		}

		return objects;
	}
}
