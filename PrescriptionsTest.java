import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrescriptionsTest {

	@Test
	void testPrescriptions() {
		Prescriptions test = new Prescriptions();
		assertNotNull(test);
	}

	@Test
	void testPrescriptionsIntStringStringStringString() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getPre_ID() == 345552);
	}

	@Test
	void testGetPre_ID() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getPre_ID() == 345552);
	}

	@Test
	void testSetPre_ID() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		test.setPre_ID(44598876);
		assertTrue(test.getPre_ID() == 44598876);
	}

	@Test
	void testGetDate() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getDate().equals("11/12/18"));
	}

	@Test
	void testSetDate() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		test.setDate("12/30/19");
		assertTrue(test.getDate().equals("12/30/19"));
	}

	@Test
	void testGetPatient() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getPatient().equals("Mickey Mouse"));
	}

	@Test
	void testSetPatient() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		test.setPatient("Donald Duck");
		assertTrue(test.getPatient().equals("Donald Duck"));
	}

	@Test
	void testGetDoctor() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getDoctor().equals("Minnie Mouse"));
	}

	@Test
	void testSetDoctor() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		test.setDoctor("Queen of Hearts");
		assertTrue(test.getDoctor().equals("Queen of Hearts"));
	}

	@Test
	void testGetPharmacist() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		assertTrue(test.getPharmacist().equals("Goofy"));
	}

	@Test
	void testSetPharmacist() {
		Prescriptions test = new Prescriptions(345552, "11/12/18", "Mickey Mouse", "Minnie Mouse", "Goofy");
		test.setPharmacist("Winnie the Pooh");
		assertTrue(test.getPharmacist().equals("Winnie the Pooh"));
	}

}
