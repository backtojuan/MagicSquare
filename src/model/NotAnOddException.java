package model;

public class NotAnOddException extends Exception{

	public NotAnOddException() {
		super("the number is not an odd");
	}
	
	@Override
	public String getMessage() {
		return "THE ORDER MUST BE AN ODD";
	}

}
