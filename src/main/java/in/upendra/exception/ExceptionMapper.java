package in.upendra.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionMapper {
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionMessage> handleArithematicException(ArithmeticException ae){
		
		ExceptionMessage msg = new ExceptionMessage();
		msg.setCode("EXP001");
		msg.setMsg(ae.getMessage());
		msg.setDateTime(LocalDateTime.now());
		return new ResponseEntity<ExceptionMessage>(msg, HttpStatus.INTERNAL_SERVER_ERROR) ;
		
	}

	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionMessage> handleNoDataFoundException(NoDataFoundException ndfe){
		
		ExceptionMessage msg = new ExceptionMessage();
		msg.setCode("EXP002");
		msg.setMsg(ndfe.getMessage());
		msg.setDateTime(LocalDateTime.now());
		return new ResponseEntity<ExceptionMessage>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<ExceptionMessage> handleNullPointerException(NullPointerException nlpe){
		
		ExceptionMessage msg = new ExceptionMessage();
		msg.setCode("EXP003");
		msg.setMsg(nlpe.getMessage());
		msg.setDateTime(LocalDateTime.now());
		return new ResponseEntity<ExceptionMessage>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
