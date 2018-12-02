import static org.junit.Assert.*;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void testDoctorObject() {
		Doctor d = new Doctor ("James Green","433 Rixet st", "23463453", "Petriadician");
		assertTrue(d instanceof Doctor);
	}

	@Test
	public void testGetSpec() {
		Doctor d = new Doctor ("James Green","433 Rixet st", "23463453", "Petriadician");
		assertTrue(d.getSpec().equals("Petriadician")); 
	}

	@Test
	public void testSetSpec() {
		Doctor d = new Doctor ("James Green","433 Rixet st", "23463453", "Petriadician");
		d.setSpec("Family Doctor");
		assertTrue(d.getSpec().equals("Family Doctor"));
	}

}
