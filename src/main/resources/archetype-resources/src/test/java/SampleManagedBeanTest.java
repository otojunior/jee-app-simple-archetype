package ${package};

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * SampleManagedBean test class.
 * @author <Author name>
 */
public class SampleManagedBeanTest {
	/**
	 * Instance to be tested.
	 */
	private SampleManagedBean bean;
	
	/**
	 * Test setup.
	 * @throws Exception Generic Exception.
	 */
	@Before
	public void setUp() throws Exception {
		bean = new SampleManagedBean();
	}

	/**
	 * Test tear down.
	 * @throws Exception Generic Exception.
	 */
	@After
	public void tearDown() throws Exception {
		bean = null;
	}

	/**
	 * sampleAction method test.
	 */
	@Test
	public void testSampleAction() {
		assertNull(bean.sampleAction());
	}
}
