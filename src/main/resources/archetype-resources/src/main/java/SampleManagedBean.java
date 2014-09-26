package ${package};

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sample managed bean.
 * @author <Author name>
 */
@Model
public class SampleManagedBean {
	/**
	 * SLF4J Logger.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(SampleManagedBean.class);
	
	/**
	 * Injected Entity Manager.
	 */
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Executes a sample action.
	 * @return The forward for the next page. In this case, null value to stay in same page.
	 */
	public String sampleAction() {
		LOG.info("Managed Bean Action Performed!");
		return null;
	}
}
