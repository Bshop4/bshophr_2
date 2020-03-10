package hr.pojo;

/**
 * ConfigFileFirstKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigFileFirstKind implements java.io.Serializable {

	// Fields

	private Short ffkId;
	private String firstKindId;
	private String firstKindName;
	private String firstKindSalaryId;
	private String firstKindSaleId;

	// Constructors

	/** default constructor */
	public ConfigFileFirstKind() {
	}

	/** full constructor */
	public ConfigFileFirstKind(Short ffkId, String firstKindId, String firstKindName, String firstKindSalaryId,
			String firstKindSaleId) {
		this.ffkId = ffkId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.firstKindSalaryId = firstKindSalaryId;
		this.firstKindSaleId = firstKindSaleId;
	}

	// Property accessors

	public Short getFfkId() {
		return this.ffkId;
	}

	public void setFfkId(Short ffkId) {
		this.ffkId = ffkId;
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

	public String getFirstKindSalaryId() {
		return this.firstKindSalaryId;
	}

	public void setFirstKindSalaryId(String firstKindSalaryId) {
		this.firstKindSalaryId = firstKindSalaryId;
	}

	public String getFirstKindSaleId() {
		return this.firstKindSaleId;
	}

	public void setFirstKindSaleId(String firstKindSaleId) {
		this.firstKindSaleId = firstKindSaleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigFileFirstKind))
			return false;
		ConfigFileFirstKind castOther = (ConfigFileFirstKind) other;

		return ((this.getFfkId() == castOther.getFfkId()) || (this.getFfkId() != null && castOther.getFfkId() != null
				&& this.getFfkId().equals(castOther.getFfkId())))
				&& ((this.getFirstKindId() == castOther.getFirstKindId())
						|| (this.getFirstKindId() != null && castOther.getFirstKindId() != null
								&& this.getFirstKindId().equals(castOther.getFirstKindId())))
				&& ((this.getFirstKindName() == castOther.getFirstKindName())
						|| (this.getFirstKindName() != null && castOther.getFirstKindName() != null
								&& this.getFirstKindName().equals(castOther.getFirstKindName())))
				&& ((this.getFirstKindSalaryId() == castOther.getFirstKindSalaryId())
						|| (this.getFirstKindSalaryId() != null && castOther.getFirstKindSalaryId() != null
								&& this.getFirstKindSalaryId().equals(castOther.getFirstKindSalaryId())))
				&& ((this.getFirstKindSaleId() == castOther.getFirstKindSaleId())
						|| (this.getFirstKindSaleId() != null && castOther.getFirstKindSaleId() != null
								&& this.getFirstKindSaleId().equals(castOther.getFirstKindSaleId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFfkId() == null ? 0 : this.getFfkId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getFirstKindSalaryId() == null ? 0 : this.getFirstKindSalaryId().hashCode());
		result = 37 * result + (getFirstKindSaleId() == null ? 0 : this.getFirstKindSaleId().hashCode());
		return result;
	}

}