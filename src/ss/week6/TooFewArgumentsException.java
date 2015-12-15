package ss.week6;

public class TooFewArgumentsException extends WrongArgumentException {
	
	public TooFewArgumentsException() {
	}
	
	
	public String getMessage(){
		return "error: must pass two command line arguments";
	}



}
