package hr.pojo;

/**
 * ConfigPublicCharId entity. @author MyEclipse Persistence Tools
 */

public class ConfigPublicChar implements java.io.Serializable {

	// Fields

	private Short pbcId;
	private String attributeKind;
	private String attributeName;

	// Constructors

	/** default constructor */
	public ConfigPublicChar() {
	}

	/** full constructor */
	public ConfigPublicChar(Short pbcId, String attributeKind, String attributeName) {
		this.pbcId = pbcId;
		this.attributeKind = attributeKind;
		this.attributeName = attributeName;
	}

	// Property accessors

	public Short getPbcId() {
		return this.pbcId;
	}

	public void setPbcId(Short pbcId) {
		this.pbcId = pbcId;
	}

	public String getAttributeKind() {
		return this.attributeKind;
	}

	public void setAttributeKind(String attributeKind) {
		this.attributeKind = attributeKind;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigPublicChar))
			return false;
		ConfigPublicChar castOther = (ConfigPublicChar) other;

		return ((this.getPbcId() == castOther.getPbcId()) || (this.getPbcId() != null && castOther.getPbcId() != null
				&& this.getPbcId().equals(castOther.getPbcId())))
				&& ((this.getAttributeKind() == castOther.getAttributeKind())
						|| (this.getAttributeKind() != null && castOther.getAttributeKind() != null
								&& this.getAttributeKind().equals(castOther.getAttributeKind())))
				&& ((this.getAttributeName() == castOther.getAttributeName())
						|| (this.getAttributeName() != null && castOther.getAttributeName() != null
								&& this.getAttributeName().equals(castOther.getAttributeName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPbcId() == null ? 0 : this.getPbcId().hashCode());
		result = 37 * result + (getAttributeKind() == null ? 0 : this.getAttributeKind().hashCode());
		result = 37 * result + (getAttributeName() == null ? 0 : this.getAttributeName().hashCode());
		return result;
	}

}