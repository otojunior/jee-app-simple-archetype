package ${package};

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * @author 
 */
@Entity
public class SampleEntity {
	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private Long version;
	
	@Column(length=20)
	private String sampleProperty;
}
