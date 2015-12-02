package ss.week1;

public class Password {
	public static final String INITIAL = "initial123";
	private String code;
	
	public Password() {
		code = INITIAL;
		
		
	}
	
	public boolean acceptable(String suggestion){
		return suggestion.length() >= 6 && !suggestion.contains(" ");
	}
	
	public boolean setWord(String oldPass, String newPass){
		if (this.testWord(oldPass) && acceptable(newPass)) {
			this.code = newPass;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean testWord(String test){
		return this.code.contentEquals(test);
		
	}
}
 