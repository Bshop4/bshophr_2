package hr.pojo;

/**
 * ConfigFileThirdKindId entity. @author MyEclipse Persistence Tools
 */

public class ConfigFileThirdKind implements java.io.Serializable {

	// Fields

	private Short ftkId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String thirdKindId;
	private String thirdKindName;
	private String thirdKindSaleId;
	private String thirdKindIsRetail;

	// Constructors

	/** default constructor */
	public ConfigFileThirdKind() {
	}

	/** full constructor */
	public ConfigFileThirdKind(Short ftkId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String thirdKindId, String thirdKindName, String thirdKindSaleId,
			String thirdKindIsRetail) {
		this.ftkId = ftkId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.thirdKindSaleId = thirdKindSaleId;
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

	// Property accessors

	public Short getFtkId() {
		return this.ftkId;
	}

	public void setFtkId(Short ftkId) {
		this.ftkId = ftkId;
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

	public String getThirdKindId() {
		return this.thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

	public String getThirdKindSaleId() {
		return this.thirdKindSaleId;
	}

	public void setThirdKindSaleId(String thirdKindSaleId) {
		this.thirdKindSaleId = thirdKindSaleId;
	}

	public String getThirdKindIsRetail() {
		return this.thirdKindIsRetail;
	}

	public void setThirdKindIsRetail(String thirdKindIsRetail) {
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigFileThirdKind))
			return false;
		ConfigFileThirdKind castOther = (ConfigFileThirdKind) other;

		return ((this.getFtkId() == castOther.getFtkId()) || (this.getFtkId() != null && castOther.getFtkId() != null
				&& this.getFtkId().equals(castOther.getFtkId())))
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
				&& ((this.getThirdKindId() == castOther.getThirdKindId())
						|| (this.getThirdKindId() != null && castOther.getThirdKindId() != null
								&& this.getThirdKindId().equals(castOther.getThirdKindId())))
				&& ((this.getThirdKindName() == castOther.getThirdKindName())
						|| (this.getThirdKindName() != null && castOther.getThirdKindName() != null
								&& this.getThirdKindName().equals(castOther.getThirdKindName())))
				&& ((this.getThirdKindSaleId() == castOther.getThirdKindSaleId())
						|| (this.getThirdKindSaleId() != null && castOther.getThirdKindSaleId() != null
								&& this.getThirdKindSaleId().equals(castOther.getThirdKindSaleId())))
				&& ((this.getThirdKindIsRetail() == castOther.getThirdKindIsRetail())
						|| (this.getThirdKindIsRetail() != null && castOther.getThirdKindIsRetail() != null
								&& this.getThirdKindIsRetail().equals(castOther.getThirdKindIsRetail())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFtkId() == null ? 0 : this.getFtkId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getThirdKindId() == null ? 0 : this.getThirdKindId().hashCode());
		result = 37 * result + (getThirdKindName() == null ? 0 : this.getThirdKindName().hashCode());
		result = 37 * result + (getThirdKindSaleId() == null ? 0 : this.getThirdKindSaleId().hashCode());
		result = 37 * result + (getThirdKindIsRetail() == null ? 0 : this.getThirdKindIsRetail().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ConfigFileThirdKind [ftkId=" + ftkId + ", firstKindId=" + firstKindId + ", firstKindName="
				+ firstKindName + ", secondKindId=" + secondKindId + ", secondKindName=" + secondKindName
				+ ", thirdKindId=" + thirdKindId + ", thirdKindName=" + thirdKindName + ", thirdKindSaleId="
				+ thirdKindSaleId + ", thirdKindIsRetail=" + thirdKindIsRetail + "]";
	}
	

}