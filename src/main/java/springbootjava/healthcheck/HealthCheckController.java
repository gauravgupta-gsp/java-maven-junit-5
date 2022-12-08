package springbootjava.healthcheck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	@RequestMapping("/healthcheck")
	public String healthCheck() {
		return "success";
	}
	
	@RequestMapping("/api/health")
	public ResponseEntity health() {
		return ResponseEntity.ok("success");
	}

}
