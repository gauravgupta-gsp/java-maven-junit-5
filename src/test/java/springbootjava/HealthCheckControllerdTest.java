package springbootjava;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import springbootjava.healthcheck.HealthCheckController;

@SpringBootTest
public class HealthCheckControllerdTest {	
	@Test
	public void healthCheckAPIShallReturnSuccess() {
		HealthCheckController controller = new HealthCheckController();
		
		ResponseEntity<String> response =  controller.health();
		
		Assertions.assertNotNull(response);
		Assertions.assertEquals("success",response.getBody());			
	}
}
