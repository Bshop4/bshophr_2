package hr.pojo;

/**
 * ConfigFileSecondKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigFileSecondKind implements java.io.Serializable {

	// Fields

	private Short fskId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String secondSalaryId;
	private String secondSaleId;

	// Constructors

	/** default constructor */
	public ConfigFileSecondKind() {
	}

	/** full constructor */
	public ConfigFileSecondKind(Short fskId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String secondSalaryId, String secondSaleId) {
		this.fskId = fskId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.secondSalaryId = secondSalaryId;
		this.secondSaleId = secondSaleId;
	}

	// Property accessors

	public Short getFskId() {
		return this.fskId;
	}

	public void setFskId(Short fskId) {
		this.fskId = fskId;
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

	public String getSecondSalaryId() {
		return this.secondSalaryId;
	}

	public void setSecondSalaryId(String secondSalaryId) {
		this.secondSalaryId = secondSalaryId;
	}

	public String getSecondSaleId() {
		return this.secondSaleId;
	}

	public void setSecondSaleId(String secondSaleId) {
		this.secondSaleId = secondSaleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigFileSecondKind))
			return false;
		ConfigFileSecondKind castOther = (ConfigFileSecondKind) other;

		return ((this.getFskId() == castOther.getFskId()) || (this.getFskId() != null && castOther.getFskId() != null
				&& this.getFskId().equals(castOther.getFskId())))
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
								&& this.getSecondKindName().equals(castOther.getSecondKindName())))
				&& ((this.getSecondSalaryId() == castOther.getSecondSalaryId())
						|| (this.getSecondSalaryId() != null && castOther.getSecondSalaryId() != null
								&& this.getSecondSalaryId().equals(castOther.getSecondSalaryId())))
				&& ((this.getSecondSaleId() == castOther.getSecondSaleId())
						|| (this.getSecondSaleId() != null && castOther.getSecondSaleId() != null
								&& this.getSecondSaleId().equals(castOther.getSecondSaleId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFskId() == null ? 0 : this.getFskId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getSecondSalaryId() == null ? 0 : this.getSecondSalaryId().hashCode());
		result = 37 * result + (getSecondSaleId() == null ? 0 : this.getSecondSaleId().hashCode());
		return result;
	}

}