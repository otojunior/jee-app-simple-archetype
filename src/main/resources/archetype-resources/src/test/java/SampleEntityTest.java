package ${package};

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

/**
 * Sample Entity Test class.
 * @author <Author name>
 */
public class SampleEntityTest {
	/**
	 * Entity to be tested.
	 */
	private SampleEntity entity;
	
	/**
	 * Test setup.
	 * @throws Exception Generic Exception.
	 */
	@Before
	public void setUp() throws Exception {
		entity = new SampleEntity();
	}

	/**
	 * Test Tear down.
	 * @throws Exception Generic Exception.
	 */
	@After
	public void tearDown() throws Exception {
		entity = null;
	}

	/**
	 * Test hashcode.
	 */
	@Test
	public void testHashCode() {
		Whitebox.setInternalState(entity, "id", Long.valueOf(1L));
		assertEquals(32, entity.hashCode());
	}

	@Test
	public void testEqualsObject() {
		Whitebox.setInternalState(entity, "id", Long.valueOf(1L));
		
		SampleEntity other = new SampleEntity();
		Whitebox.setInternalState(other, "id", Long.valueOf(1L));
		
		assertTrue(entity.equals(other));
	}
	
	@Test
	public void testNotEqualsObject() {
		Whitebox.setInternalState(entity, "id", Long.valueOf(1L));
		
		SampleEntity other = new SampleEntity();
		Whitebox.setInternalState(other, "id", Long.valueOf(2L));
		
		assertFalse(entity.equals(other));
	}
	

	@Test
	public void testGetSampleProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVersion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSampleProperty() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
