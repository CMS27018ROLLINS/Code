import static org.junit.Assert.*;

import org.junit.Test;

public class PharmacistsTest {

	@Test
	public void testPharmacists() {
		Pharmacists p = new Pharmacists ("Julie Anderson","453 Nw9th","407.777.5566","10/18/2010","56746755");
		assertTrue(p instanceof Pharmacists);
	}

	@Test
	public void testGetCertdate() {
		Pharmacists p = new Pharmacists ("Julie Anderson","453 Nw9th","407.777.5566","10/18/2010","56746755");
		assertTrue(p.getCertdate().equals("10/18/2010"));
	}

	@Test
	public void testSetCertdate() {
		Pharmacists p = new Pharmacists ("Julie Anderson","453 Nw9th","407.777.5566","10/18/2010","56746755");
		p.setCertdate("05/05/2018");
		assertTrue(p.getCertdate().equals("05/05/2018"));
	}

	@Test
	public void testGetSsn_Number() {
		Pharmacists p = new Pharmacists ("Julie Anderson","453 Nw9th","407.777.5566","10/18/2010","56746755");
		assertTrue(p.getSsn_Number().equals("56746755"));
	}

	@Test
	public void testSetSsn_Number() {
		Pharmacists p = new Pharmacists ("Julie Anderson","453 Nw9th","407.777.5566","10/18/2010","56746755");
		p.setSsn_Number("64646463");;
		assertTrue(p.getSsn_Number().equals("64646463"));
	}

}
