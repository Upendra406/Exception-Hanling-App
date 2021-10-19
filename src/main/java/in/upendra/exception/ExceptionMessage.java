package in.upendra.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionMessage {

	private String code;
	private String msg;
	private LocalDateTime dateTime;

}
