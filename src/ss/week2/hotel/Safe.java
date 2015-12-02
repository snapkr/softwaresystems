package ss.week2.hotel;



/**
 * Class for a Safe located in a Room in a hotel.
 * @author Joep Huijts
 *@version Version 1.0
 */
public class Safe {

	//---------------------Instance Variables----------------------
	private Password pass; // Safe's password.
	private boolean isOpen;
	private boolean isActive;
	
	//-------------------------Constructor-------------------------
	/**
	 * Creates a Safe.
	 */
	public Safe(String newPass) {
		 assert newPass.length() >= 6 && !(newPass.contains(" ")) :
			 "Input password is invalid!";
		
		this.pass = new Password();
		this.pass.setWord(Password.INITIAL, newPass);
		this.isActive = true;
		this.isOpen   = true;

	}
	
	//-----------------------Queries-------------------------------
	/**
	 * Indicates whether Safe is open or not.
	 */
	/* pure */ public boolean isOpen() {
		return this.isOpen;
	}
	
	/**
	 * Indicate whether Safe is active or not.
	 */
	/* pure */ public boolean isActive() {
		return this.isActive;
	}
	
	/**
	 * Return the password object to be used.
	 */
	/* pure */ public Password getPassword() {
		return this.pass;
	}
	
	//----------------------------Commands--------------------------
	
	/**
	 * Activates the Safe, if the correct password is used.
	 */
	public void activate(String passAttempt) {
		if (pass.testWord(passAttempt)) {
			this.isActive = true;
		}
		
		assert pass.testWord(passAttempt) == true && this.isActive() == true;
	}
	
	/**
	 * Closes the Safe and deactivates it.
	 */
	public void deactivate() {
		this.isActive = false;
		this.isOpen   = false;
		
		assert this.isActive() == false && this.isOpen() == false;
	}
	
	/**
	 * Open the Safe, if the Safe is active and the password is correct.
	 */
	public void open(String passAttempt) {
		if (pass.testWord(passAttempt) && this.isActive() == true) {
			this.isOpen = true;
		}
		
		assert pass.testWord(passAttempt) == true && this.isActive() == true
				&& this.isOpen() == true;
	}
	
	/**
	 * Closes the Safe.
	 */
	public void close() {
		this.isOpen = false;
		
		assert this.isOpen() == false;
	}
	
	
}
