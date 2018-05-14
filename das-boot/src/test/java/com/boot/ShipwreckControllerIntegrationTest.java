package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.boot.model.Shipwreck;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class}, webEnvironment=WebEnvironment.DEFINED_PORT)
public class ShipwreckControllerIntegrationTest {

	/* more on WebTestClient
	 * https://www.callicoder.com/spring-5-reactive-webclient-webtestclient-examples/
	 */
	@Autowired
	private WebTestClient webClient;
	
	private TestRestTemplate restTemplate = new TestRestTemplate();
	
	@Test
	public void testRootEndpoint() {
		this.webClient.get().uri("/").exchange()
			.expectStatus().isOk()
			.expectBody(String.class).isEqualTo("Das Boot, reporting for duty!");
	}
	
	@Test
	public void testGetAll() {
		ResponseEntity<List<Shipwreck>> entity = this.restTemplate.exchange("http://localhost:8090/api/v1/shipwrecks", HttpMethod.GET, null, new ParameterizedTypeReference<List<Shipwreck>>() {});
		assertThat(entity.getBody().size(), is(greaterThan(0)));
	}
	
}
