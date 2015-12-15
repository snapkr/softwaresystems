package ss.week6;

public class ArgumentLengthsDifferException extends TooFewArgumentsException {
	int s1;
	int s2;

	public ArgumentLengthsDifferException(int s1, int s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public String getMessage(){
		return "error: length of command line arguments differs (" + s1 + ", " + s2 + ")";
	}
}
