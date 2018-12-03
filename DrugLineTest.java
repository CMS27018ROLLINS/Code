import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DrugLineTest {

	@Test
	void testDrugLine() {
		DrugLine f = new DrugLine();
		assertNotNull(f);
	}
	//----------------------------------------------------------------------------------
	
	@Test
	void testDrugLineIntStringIntStringIntInt() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getQty()==30);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetPrescID() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getPrescID()==1);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetPrescID() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		f.setPrescID(2);
		assertTrue(f.getPrescID()==2);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetDrug() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getDrug().equals("Motrin"));
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetDrug() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		f.setDrug("Vicodin");
		assertTrue(f.getDrug().equals("Vicodin"));
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetQty() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getQty()==30);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetQty() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		f.setQty(60);
		assertTrue(f.getQty()==60);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetDosage() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getDosage().equals("2/day"));
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetDosage() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "4/day", 2, 2);
		f.setDosage("2/day");
		assertTrue(f.getDosage().equals("2/day"));
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetRefillsLeft() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getRefillsLeft()==2);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetRefillsLeft() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		f.setRefillsLeft(1);
		assertTrue(f.getRefillsLeft()==1);
	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetTimesFilled() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertTrue(f.getTimesFilled() ==2);	
	}
	//----------------------------------------------------------------------------------

	@Test
	void testSetTimesFilled() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		f.setTimesFilled(1);
		assertTrue(f.getTimesFilled() ==1);		
	}

	//----------------------------------------------------------------------------------

	@Test
	void testGetInfo() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertNotNull(f.getInfo());	}
	//----------------------------------------------------------------------------------

	@Test
	void testGetReport() {
		DrugLine f = new DrugLine(1, "Motrin", 30, "2/day", 2, 2);
		assertNotNull(f.getReport());
	}

}
