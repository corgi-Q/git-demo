package corgi.demo.util;

import java.util.Objects;

import corgi.demo.model.ToDo;

public final class PayloadValidator {
	
	public static boolean validateCreatePayload(ToDo payload) {
		
		if(Objects.isNull(payload) || payload.getId() != 0) {
			return false;
		}
		
		return true;
	}
}
