//May, Felipe, Lauren

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DrugsTest {

	@Test
	public void testDrugs() {
			Drugs n = new Drugs();
			assertNotNull(n);
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testDrugsStringStringStringStringIntBoolean() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getType().equals("NSAID"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetName() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getName().equals("Motrin"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetName() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.setName("Tylenol");
		assertFalse(motrin.getName().equals("Motrin"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetChem_Name() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getChem_Name().equals("Propanoic"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetChem_Name() {
		Drugs motrin = new Drugs("Motrin", "Loana", "Johnson&Johnson","NSAID", 25, false);
		motrin.setChem_Name("Propanoic");
		assertTrue(motrin.getChem_Name().equals("Propanoic"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetIngredients() {
		Drugs motrin = new Drugs("Motrin", "Loana", "Johnson&Johnson","NSAID", 25, false);
		motrin.addIngredients("carnauba wax");
		motrin.addIngredients("magnesium");
		motrin.addIngredients("lactose");
		assertTrue(motrin.getIngredients(2).equals("lactose"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetIngredients() {
		Drugs motrin = new Drugs("Motrin", "Loana", "Johnson&Johnson","NSAID", 25, false);
		motrin.addIngredients("carnauba wax");
		motrin.addIngredients("magnesium");
		motrin.addIngredients("lactose");
		assertTrue(motrin.getIngredients(1).equals("magnesium"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testAddIngredients() {
		Drugs motrin = new Drugs("Motrin", "Loana", "Johnson&Johnson","NSAID", 25, false);
		motrin.addIngredients("carnauba wax");
		motrin.addIngredients("lactose");
		motrin.setIngredients(1, "magnesium");
		assertTrue(motrin.getIngredients(1).equals("magnesium"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetManufacture() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getManufacture().equals("Johnson&Johnson"));	
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetManufacture() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Honest","NSAID", 25, false);
		motrin.setManufacture("Johnson&Johnson");
		assertTrue(motrin.getManufacture().equals("Johnson&Johnson"));	
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetType() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Honest","NSAID", 25, false);
		assertTrue(motrin.getType().equals("NSAID"));
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetType() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Honest","NSAID", 25, false);
		motrin.setType("Opiod");
		assertTrue(motrin.getType().equals("Opiod"));	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetContraInd() {
		Drugs motrin = new Drugs("Motrin", "Loana", "Johnson&Johnson","NSAID", 25, false);
		motrin.addContraInd("Aleve");
		assertTrue(motrin.getContraInd(0).equals("Aleve"));	
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetContraIndArray() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.addContraInd("Aleve");
		motrin.addContraInd("Tylenol");
		assertNotNull(motrin.getContraIndArray());	
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testSetContraInd() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.setContraInd(0,"Aleve");
		System.out.println(motrin.getContraInd(0));
		assertTrue(motrin.getContraInd(0).equals("Aleve"));	
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testAddContraInd() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.addContraInd("Aleve");
		assertTrue(motrin.getContraInd(0).equals("Aleve"));		
	}
	//----------------------------------------------------------------------------------------

	@Test
	public void testGetStipTimes() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getStipTimes() == 25);	
	}

	//----------------------------------------------------------------------------------------
	@Test
	public void testSetStipTimes() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.setStipTimes(20);
		assertTrue(motrin.getStipTimes() == 20);	
	}
	//----------------------------------------------------------------------------------------
	@Test
	public void testGetMonitored() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		assertTrue(motrin.getMonitored() == false);	
	}

	//----------------------------------------------------------------------------------------
	@Test
	public void testSetMonitored() {
		Drugs motrin = new Drugs("Motrin", "Propanoic", "Johnson&Johnson","NSAID", 25, false);
		motrin.setMonitored(true);
		assertTrue(motrin.getMonitored() == true);	
	}


}
