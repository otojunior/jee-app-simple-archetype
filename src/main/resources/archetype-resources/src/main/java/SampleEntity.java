package ${package};

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * A Sample Entity.
 * @author <Author name>
 */
@Entity
public class SampleEntity {
	private static final int COL_LENGTH_SAMPLEPROPERTY = 20;
	
	/**
	 * The entity ID (PK).
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * The Entity Version (Instance/Tuple Version).
	 */
	@Version
	private Long version;
	
	/**
	 * A Sample property.
	 */
	@Column(length=COL_LENGTH_SAMPLEPROPERTY)
	private String sampleProperty;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		boolean isEquals = true;
		
		if (this == obj) {
			isEquals = true;
		} else if (obj == null) {
			isEquals = false;
		} else if (getClass() != obj.getClass()) {
			isEquals = false;
		} else {
			SampleEntity other = (SampleEntity) obj;
			if (id == null) {
				if (other.id != null) {
					isEquals = false;
				}
			} else if (!id.equals(other.id)) {
				isEquals = false;
			}
		}
		return isEquals;
	}

	/**
	 * Gets sampleProperty value 
	 * @return the property value.
	 */
	public String getSampleProperty() {
		return sampleProperty;
	}

	/**
	 * Gets the version value. 
	 * @return version value.
	 */
	public Long getVersion() {
		return version;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	/**
	 * Sets the sample Property.
	 * @param sampleProperty a sampleProperty value.
	 */
	public void setSampleProperty(String sampleProperty) {
		this.sampleProperty = sampleProperty;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
