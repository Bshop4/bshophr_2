package hr.pojo;

/**
 * ConfigQuestionFirstKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigQuestionFirstKind implements java.io.Serializable {

	// Fields

	private Short qfkId;
	private String firstKindId;
	private String firstKindName;

	// Constructors

	/** default constructor */
	public ConfigQuestionFirstKind() {
	}

	/** full constructor */
	public ConfigQuestionFirstKind(Short qfkId, String firstKindId, String firstKindName) {
		this.qfkId = qfkId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
	}

	// Property accessors

	public Short getQfkId() {
		return this.qfkId;
	}

	public void setQfkId(Short qfkId) {
		this.qfkId = qfkId;
	}

	public String getFirstKindId() {
		return this.firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return this.firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigQuestionFirstKind))
			return false;
		ConfigQuestionFirstKind castOther = (ConfigQuestionFirstKind) other;

		return ((this.getQfkId() == castOther.getQfkId()) || (this.getQfkId() != null && castOther.getQfkId() != null
				&& this.getQfkId().equals(castOther.getQfkId())))
				&& ((this.getFirstKindId() == castOther.getFirstKindId())
						|| (this.getFirstKindId() != null && castOther.getFirstKindId() != null
								&& this.getFirstKindId().equals(castOther.getFirstKindId())))
				&& ((this.getFirstKindName() == castOther.getFirstKindName())
						|| (this.getFirstKindName() != null && castOther.getFirstKindName() != null
								&& this.getFirstKindName().equals(castOther.getFirstKindName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getQfkId() == null ? 0 : this.getQfkId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		return result;
	}

}