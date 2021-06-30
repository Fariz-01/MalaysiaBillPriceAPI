package malaysia.bill.price.MalaysiaBillPrice.controller;

public class BillNotFoundException extends RuntimeException {

	public BillNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BillNotFoundException(String message) {
		super(message);
	}

	public BillNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
