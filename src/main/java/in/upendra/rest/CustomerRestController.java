package in.upendra.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.upendra.exception.NoDataFoundException;

@RestController
public class CustomerRestController {
	
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<String> getCustomerPhno(@PathVariable Integer customerId){
		String phno = null;
		
		//logic to fetch customer record from db
		
		if(customerId >=100) {
			phno = "+919550658207";
			return new ResponseEntity<String>(phno, HttpStatus.OK);
		}else {
			throw new NoDataFoundException("No Customer Found with Given Id ::"+ customerId);
		}
	}

}
