package hr.mapper;

/**
 * SalaryGrantDetailsId entity. @author MyEclipse Persistence Tools
 */

public class SalaryGrantDetails implements java.io.Serializable {

	// Fields

	private Short grdId;
	private String salaryGrantId;
	private String humanId;
	private String humanName;
	private Double bounsSum;
	private Double saleSum;
	private Double deductSum;
	private Double salaryStandardSum;
	private Double salaryPaidSum;

	// Constructors

	/** default constructor */
	public SalaryGrantDetails() {
	}

	/** full constructor */
	public SalaryGrantDetails(Short grdId, String salaryGrantId, String humanId, String humanName, Double bounsSum,
			Double saleSum, Double deductSum, Double salaryStandardSum, Double salaryPaidSum) {
		this.grdId = grdId;
		this.salaryGrantId = salaryGrantId;
		this.humanId = humanId;
		this.humanName = humanName;
		this.bounsSum = bounsSum;
		this.saleSum = saleSum;
		this.deductSum = deductSum;
		this.salaryStandardSum = salaryStandardSum;
		this.salaryPaidSum = salaryPaidSum;
	}

	// Property accessors

	public Short getGrdId() {
		return this.grdId;
	}

	public void setGrdId(Short grdId) {
		this.grdId = grdId;
	}

	public String getSalaryGrantId() {
		return this.salaryGrantId;
	}

	public void setSalaryGrantId(String salaryGrantId) {
		this.salaryGrantId = salaryGrantId;
	}

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public Double getBounsSum() {
		return this.bounsSum;
	}

	public void setBounsSum(Double bounsSum) {
		this.bounsSum = bounsSum;
	}

	public Double getSaleSum() {
		return this.saleSum;
	}

	public void setSaleSum(Double saleSum) {
		this.saleSum = saleSum;
	}

	public Double getDeductSum() {
		return this.deductSum;
	}

	public void setDeductSum(Double deductSum) {
		this.deductSum = deductSum;
	}

	public Double getSalaryStandardSum() {
		return this.salaryStandardSum;
	}

	public void setSalaryStandardSum(Double salaryStandardSum) {
		this.salaryStandardSum = salaryStandardSum;
	}

	public Double getSalaryPaidSum() {
		return this.salaryPaidSum;
	}

	public void setSalaryPaidSum(Double salaryPaidSum) {
		this.salaryPaidSum = salaryPaidSum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalaryGrantDetails))
			return false;
		SalaryGrantDetails castOther = (SalaryGrantDetails) other;

		return ((this.getGrdId() == castOther.getGrdId()) || (this.getGrdId() != null && castOther.getGrdId() != null
				&& this.getGrdId().equals(castOther.getGrdId())))
				&& ((this.getSalaryGrantId() == castOther.getSalaryGrantId())
						|| (this.getSalaryGrantId() != null && castOther.getSalaryGrantId() != null
								&& this.getSalaryGrantId().equals(castOther.getSalaryGrantId())))
				&& ((this.getHumanId() == castOther.getHumanId()) || (this.getHumanId() != null
						&& castOther.getHumanId() != null && this.getHumanId().equals(castOther.getHumanId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getBounsSum() == castOther.getBounsSum()) || (this.getBounsSum() != null
						&& castOther.getBounsSum() != null && this.getBounsSum().equals(castOther.getBounsSum())))
				&& ((this.getSaleSum() == castOther.getSaleSum()) || (this.getSaleSum() != null
						&& castOther.getSaleSum() != null && this.getSaleSum().equals(castOther.getSaleSum())))
				&& ((this.getDeductSum() == castOther.getDeductSum()) || (this.getDeductSum() != null
						&& castOther.getDeductSum() != null && this.getDeductSum().equals(castOther.getDeductSum())))
				&& ((this.getSalaryStandardSum() == castOther.getSalaryStandardSum())
						|| (this.getSalaryStandardSum() != null && castOther.getSalaryStandardSum() != null
								&& this.getSalaryStandardSum().equals(castOther.getSalaryStandardSum())))
				&& ((this.getSalaryPaidSum() == castOther.getSalaryPaidSum())
						|| (this.getSalaryPaidSum() != null && castOther.getSalaryPaidSum() != null
								&& this.getSalaryPaidSum().equals(castOther.getSalaryPaidSum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGrdId() == null ? 0 : this.getGrdId().hashCode());
		result = 37 * result + (getSalaryGrantId() == null ? 0 : this.getSalaryGrantId().hashCode());
		result = 37 * result + (getHumanId() == null ? 0 : this.getHumanId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getBounsSum() == null ? 0 : this.getBounsSum().hashCode());
		result = 37 * result + (getSaleSum() == null ? 0 : this.getSaleSum().hashCode());
		result = 37 * result + (getDeductSum() == null ? 0 : this.getDeductSum().hashCode());
		result = 37 * result + (getSalaryStandardSum() == null ? 0 : this.getSalaryStandardSum().hashCode());
		result = 37 * result + (getSalaryPaidSum() == null ? 0 : this.getSalaryPaidSum().hashCode());
		return result;
	}

}