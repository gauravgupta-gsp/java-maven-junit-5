package springbootjava.healthcheck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

class HealthCheckControllerTest {

	@Test
	public void healthCheckAPIShouldReturnSuccess() {
		
		HealthCheckController controller = new HealthCheckController();
		
		ResponseEntity<String> response =  controller.health();
		
		Assertions.assertNotNull(response);
		Assertions.assertEquals("success",response.getBody());		
	
	}

}
