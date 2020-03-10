package hr.pojo;

/**
 * ConfigMajorKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigMajorKind implements java.io.Serializable {

	// Fields

	private Short mfkId;
	private String majorKindId;
	private String majorKindName;

	// Constructors

	/** default constructor */
	public ConfigMajorKind() {
	}

	/** full constructor */
	public ConfigMajorKind(Short mfkId, String majorKindId, String majorKindName) {
		this.mfkId = mfkId;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
	}

	// Property accessors

	public Short getMfkId() {
		return this.mfkId;
	}

	public void setMfkId(Short mfkId) {
		this.mfkId = mfkId;
	}

	public String getMajorKindId() {
		return this.majorKindId;
	}

	public void setMajorKindId(String majorKindId) {
		this.majorKindId = majorKindId;
	}

	public String getMajorKindName() {
		return this.majorKindName;
	}

	public void setMajorKindName(String majorKindName) {
		this.majorKindName = majorKindName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigMajorKind))
			return false;
		ConfigMajorKind castOther = (ConfigMajorKind) other;

		return ((this.getMfkId() == castOther.getMfkId()) || (this.getMfkId() != null && castOther.getMfkId() != null
				&& this.getMfkId().equals(castOther.getMfkId())))
				&& ((this.getMajorKindId() == castOther.getMajorKindId())
						|| (this.getMajorKindId() != null && castOther.getMajorKindId() != null
								&& this.getMajorKindId().equals(castOther.getMajorKindId())))
				&& ((this.getMajorKindName() == castOther.getMajorKindName())
						|| (this.getMajorKindName() != null && castOther.getMajorKindName() != null
								&& this.getMajorKindName().equals(castOther.getMajorKindName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMfkId() == null ? 0 : this.getMfkId().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		return result;
	}

}