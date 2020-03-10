package hr.mapper;

/**
 * ConfigQuestionSecondKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigQuestionSecondKind implements java.io.Serializable {

	// Fields

	private Short qskId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;

	// Constructors

	/** default constructor */
	public ConfigQuestionSecondKind() {
	}

	/** full constructor */
	public ConfigQuestionSecondKind(Short qskId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName) {
		this.qskId = qskId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
	}

	// Property accessors

	public Short getQskId() {
		return this.qskId;
	}

	public void setQskId(Short qskId) {
		this.qskId = qskId;
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

	public String getSecondKindId() {
		return this.secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return this.secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigQuestionSecondKind))
			return false;
		ConfigQuestionSecondKind castOther = (ConfigQuestionSecondKind) other;

		return ((this.getQskId() == castOther.getQskId()) || (this.getQskId() != null && castOther.getQskId() != null
				&& this.getQskId().equals(castOther.getQskId())))
				&& ((this.getFirstKindId() == castOther.getFirstKindId())
						|| (this.getFirstKindId() != null && castOther.getFirstKindId() != null
								&& this.getFirstKindId().equals(castOther.getFirstKindId())))
				&& ((this.getFirstKindName() == castOther.getFirstKindName())
						|| (this.getFirstKindName() != null && castOther.getFirstKindName() != null
								&& this.getFirstKindName().equals(castOther.getFirstKindName())))
				&& ((this.getSecondKindId() == castOther.getSecondKindId())
						|| (this.getSecondKindId() != null && castOther.getSecondKindId() != null
								&& this.getSecondKindId().equals(castOther.getSecondKindId())))
				&& ((this.getSecondKindName() == castOther.getSecondKindName())
						|| (this.getSecondKindName() != null && castOther.getSecondKindName() != null
								&& this.getSecondKindName().equals(castOther.getSecondKindName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getQskId() == null ? 0 : this.getQskId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		return result;
	}

}