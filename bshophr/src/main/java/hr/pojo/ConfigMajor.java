package hr.pojo;

/**
 * ConfigMajorId entity. @author MyEclipse Persistence Tools
 */

public class ConfigMajor implements java.io.Serializable {

	// Fields

	private Short makId;
	private String majorKindId;
	private String majorKindName;
	private String majorId;
	private String majorName;
	private Short testAmount;

	// Constructors

	/** default constructor */
	public ConfigMajor() {
	}

	/** full constructor */
	public ConfigMajor(Short makId, String majorKindId, String majorKindName, String majorId, String majorName,
			Short testAmount) {
		this.makId = makId;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.testAmount = testAmount;
	}

	// Property accessors

	public Short getMakId() {
		return this.makId;
	}

	public void setMakId(Short makId) {
		this.makId = makId;
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

	public String getMajorId() {
		return this.majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public Short getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(Short testAmount) {
		this.testAmount = testAmount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigMajor))
			return false;
		ConfigMajor castOther = (ConfigMajor) other;

		return ((this.getMakId() == castOther.getMakId()) || (this.getMakId() != null && castOther.getMakId() != null
				&& this.getMakId().equals(castOther.getMakId())))
				&& ((this.getMajorKindId() == castOther.getMajorKindId())
						|| (this.getMajorKindId() != null && castOther.getMajorKindId() != null
								&& this.getMajorKindId().equals(castOther.getMajorKindId())))
				&& ((this.getMajorKindName() == castOther.getMajorKindName())
						|| (this.getMajorKindName() != null && castOther.getMajorKindName() != null
								&& this.getMajorKindName().equals(castOther.getMajorKindName())))
				&& ((this.getMajorId() == castOther.getMajorId()) || (this.getMajorId() != null
						&& castOther.getMajorId() != null && this.getMajorId().equals(castOther.getMajorId())))
				&& ((this.getMajorName() == castOther.getMajorName()) || (this.getMajorName() != null
						&& castOther.getMajorName() != null && this.getMajorName().equals(castOther.getMajorName())))
				&& ((this.getTestAmount() == castOther.getTestAmount())
						|| (this.getTestAmount() != null && castOther.getTestAmount() != null
								&& this.getTestAmount().equals(castOther.getTestAmount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMakId() == null ? 0 : this.getMakId().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		result = 37 * result + (getMajorId() == null ? 0 : this.getMajorId().hashCode());
		result = 37 * result + (getMajorName() == null ? 0 : this.getMajorName().hashCode());
		result = 37 * result + (getTestAmount() == null ? 0 : this.getTestAmount().hashCode());
		return result;
	}

}