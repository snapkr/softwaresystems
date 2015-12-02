package ss.week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ss.week2.hotel.Password;
import ss.week2.hotel.Safe;

public class SafeTest {
	private Safe testSafe;
	private Password testPassword;
	@Before
	public void setUp() throws Exception {
		testPassword = new Password();
		testSafe = new Safe(testPassword);
	}

	@Test
    public void testActivateWithValidPassword() {
		testSafe.activate(Password.INITIAL);
        assertEquals(true, testSafe.isActive());
    }

	@Test
    public void testActivateWithInvalidPassword1() {
		testSafe.activate("hans");
        assertEquals(false, testSafe.isActive());
    }
	@Test
    public void testOpenInactiveSafeWithInvalidPassword2() {
		testSafe.activate(" ");
        assertEquals(false, testSafe.isActive());
    }
	@Test
    public void testOpenInactiveSafeWithInvalidPassword3() {
		testSafe.activate("99 99");
        assertEquals(false, testSafe.isActive());
    }
	@Test
    public void testOpenInactiveSafeWithInvalidPassword4() {
		testSafe.activate("");
        assertEquals(false, testSafe.isActive());
    }

	@Test
    public void testOpenInactiveSafeWithValidPassword() {
		testSafe.open(Password.INITIAL);
        assertEquals(false,testSafe.isActive() );
        assertEquals(false,testSafe.isOpen());
    }

	@Test
    public void testOpenInactiveSafeWithInvalidPassword() {
		testSafe.open("hans");
		assertEquals(false,testSafe.isActive() );
        assertEquals(false,testSafe.isOpen());
    }

	@Test
    public void testOpenActiveSafeWithValidPassword() {
		testSafe.activate(Password.INITIAL);
		testSafe.open(Password.INITIAL);
        assertEquals(true,testSafe.isOpen());
    }
	@Test
    public void testCloseActiveSafe() {
		testSafe.activate(Password.INITIAL);
		testSafe.open(Password.INITIAL);
        assertEquals(true,testSafe.isOpen());
        testSafe.close();
        assertEquals(false,testSafe.isOpen());
    }

	@Test
    public void testOpenActiveSafeWithInvalidPassword() {
		testSafe.activate(Password.INITIAL);
		testSafe.open("hans");
        assertEquals(false,testSafe.isOpen());
    }
	@Test
	public void testGetPassword(){
		assertEquals(testPassword,testSafe.getPassword());
		
	}
	@Test
	public void testDeactivete(){
		testSafe.activate(Password.INITIAL);
		assertEquals(true,testSafe.isActive());
		testSafe.deactivate();
		assertEquals(false,testSafe.isActive());
		
	}

}
