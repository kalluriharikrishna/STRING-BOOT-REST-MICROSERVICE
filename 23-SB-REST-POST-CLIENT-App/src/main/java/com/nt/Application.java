package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.nt.request.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String endpointUrl = "http://localhost:9090/addbook";

		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Spring");
		book.setBookPrice(450.00);
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> postForEntity = 
					rt.postForEntity(endpointUrl, book, String.class);
		
		int statusCodeValue = postForEntity.getStatusCodeValue();
		
		if(statusCodeValue==201) {
			String body = postForEntity.getBody();
			System.out.println(body);
		}
	}

}
