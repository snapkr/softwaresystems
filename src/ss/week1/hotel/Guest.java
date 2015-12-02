package ss.week1.hotel;

/**
 * Guest of a Hotel who has a name and can checkin, checkout and reside consequently in an room.
 * @author Sean
 * @version	0.1
 */
public class Guest {
    // ------------------ Instance variables ----------------
	String name;
	Room room;;
	
    // ------------------ Constructor ------------------------
	/**
	 * Creates an Guest instance of the Guest class and holds a guest name.
	 * @param name name of the guest.
	 */
	public Guest(String name){
		this.name = name;
	}
	
    // ------------------ Queries --------------------------
	/**
	 * Returns the name of the Guest.
	 * @return name of the Guest;
	 * <code>null</code> if the Guest has no name.
	 */
	public String getName () {
		return this.name;
	}
	/**
	 * Returns the current room in which the Guests resides.
	 * @return room of the Guest;
	 * <code>null</code> if the Guest has no room.
	 */
	public Room getRoom () {
		return room;
	}
	
	/**
	 * A String representation of this object.
	 */
	public String toString () {
		return "Guest: " + name + " in Room: " +room;
	}
	
    // ------------------ Commands --------------------------
	/**
	 * Assigns a <code>Room</code> to this <code>Guest</code>.
	 * @param room the next <code>room</code> of this <code>Guest</code>.
	 * @return true if successful, otherwise false.
	 */
	public boolean checkin (Room room) {
		if ( room.getGuest() == null){
			this.room = room;
			this.room.setGuest(this);
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Checks out <code>Guest</code>.
	 * @return true if successful, otherwise false.
	 */
	public boolean checkout () {
		if(this.room != null){
			this.room.setGuest(null);
			this.room = null;
			return true;
		}else {
			return false;
		}
	}
}
