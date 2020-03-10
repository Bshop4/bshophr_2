package hr.mapper;

/**
 * SalaryStandardDetailsId entity. @author MyEclipse Persistence Tools
 */

public class SalaryStandardDetails implements java.io.Serializable {

	// Fields

	private Short sdtId;
	private String standardId;
	private String standardName;
	private Short itemId;
	private String itemName;
	private Double salary;

	// Constructors

	/** default constructor */
	public SalaryStandardDetails() {
	}

	/** full constructor */
	public SalaryStandardDetails(Short sdtId, String standardId, String standardName, Short itemId, String itemName,
			Double salary) {
		this.sdtId = sdtId;
		this.standardId = standardId;
		this.standardName = standardName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.salary = salary;
	}

	// Property accessors

	public Short getSdtId() {
		return this.sdtId;
	}

	public void setSdtId(Short sdtId) {
		this.sdtId = sdtId;
	}

	public String getStandardId() {
		return this.standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public Short getItemId() {
		return this.itemId;
	}

	public void setItemId(Short itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalaryStandardDetails))
			return false;
		SalaryStandardDetails castOther = (SalaryStandardDetails) other;

		return ((this.getSdtId() == castOther.getSdtId()) || (this.getSdtId() != null && castOther.getSdtId() != null
				&& this.getSdtId().equals(castOther.getSdtId())))
				&& ((this.getStandardId() == castOther.getStandardId()) || (this.getStandardId() != null
						&& castOther.getStandardId() != null && this.getStandardId().equals(castOther.getStandardId())))
				&& ((this.getStandardName() == castOther.getStandardName())
						|| (this.getStandardName() != null && castOther.getStandardName() != null
								&& this.getStandardName().equals(castOther.getStandardName())))
				&& ((this.getItemId() == castOther.getItemId()) || (this.getItemId() != null
						&& castOther.getItemId() != null && this.getItemId().equals(castOther.getItemId())))
				&& ((this.getItemName() == castOther.getItemName()) || (this.getItemName() != null
						&& castOther.getItemName() != null && this.getItemName().equals(castOther.getItemName())))
				&& ((this.getSalary() == castOther.getSalary()) || (this.getSalary() != null
						&& castOther.getSalary() != null && this.getSalary().equals(castOther.getSalary())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSdtId() == null ? 0 : this.getSdtId().hashCode());
		result = 37 * result + (getStandardId() == null ? 0 : this.getStandardId().hashCode());
		result = 37 * result + (getStandardName() == null ? 0 : this.getStandardName().hashCode());
		result = 37 * result + (getItemId() == null ? 0 : this.getItemId().hashCode());
		result = 37 * result + (getItemName() == null ? 0 : this.getItemName().hashCode());
		result = 37 * result + (getSalary() == null ? 0 : this.getSalary().hashCode());
		return result;
	}

}