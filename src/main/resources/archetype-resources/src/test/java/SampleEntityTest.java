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
		SampleEntity other = new SampleEntity();
		Whitebox.setInternalState(entity, "id", Long.valueOf(1L));
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
		entity.setSampleProperty("aTestValue");
		assertEquals(new String("aTestValue"), entity.getSampleProperty());
	}

	@Test
	public void testGetVersion() {
		Whitebox.setInternalState(entity, "version", 123L);
		assertEquals(Long.valueOf(123L), entity.getVersion());
	}

	@Test
	public void testSetSampleProperty() {
		entity.setSampleProperty("aValue");
	}

	@Test
	public void testToString() {
		Whitebox.setInternalState(entity, "id", 1L);
		Whitebox.setInternalState(entity, "version", 2L);
		entity.setSampleProperty("aValue");
		assertEquals("SampleEntity[id=1,version=2,sampleProperty=aValue]", entity.toString());
	}
}
