import static org.junit.Assert.*;

import org.junit.Test;

public class PatientsTest {

	@Test
	public void testPatients() {
		Patients p = new Patients ("John Green","412 Summerset","4088387474","UnitedHealthCare","3423432");
		assertTrue( p instanceof Patients);
	}


	@Test
	public void testGetInsProvider() {
		Patients p = new Patients ("John Green","412 Summerset","4088387474","UnitedHealthCare","3423432");
		assertTrue(p.getInsProvider().equals("UnitedHealthCare"));
				
	}
	

	@Test
	public void testSetInsProvider() {
		Patients p = new Patients ("John Green","412 Summerset","4088387474","UnitedHealthCare","3423432");
		p.setInsProvider("Ambetter");
		assertTrue(p.getInsProvider().equals("Ambetter"));
	}

	@Test
	public void testGetssn_Number() {
		Patients p = new Patients ("John Green","412 Summerset","4088387474","UnitedHealthCare","3423432");
		assertTrue(p.getssn_Number().equals("3423432"));
	}

	@Test
	public void testSetSSN() {
		Patients p = new Patients ("John Green","412 Summerset","4088387474","UnitedHealthCare","3423432");
		p.setSSN("87593753");
		assertTrue(p.getssn_Number().equals("87593753"));
	}
}
