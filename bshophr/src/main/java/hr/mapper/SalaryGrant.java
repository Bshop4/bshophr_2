package hr.mapper;

import java.sql.Timestamp;

/**
 * SalaryGrantId entity. @author MyEclipse Persistence Tools
 */

public class SalaryGrant implements java.io.Serializable {

	// Fields

	private Short sgrId;
	private String salaryGrantId;
	private String salaryStandardId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String thirdKindId;
	private String thirdKindName;
	private Short humanAmount;
	private Double salaryStandardSum;
	private Double salaryPaidSum;
	private String register;
	private Timestamp registTime;
	private String checker;
	private Timestamp checkTime;
	private Short checkStatus;

	// Constructors

	/** default constructor */
	public SalaryGrant() {
	}

	/** minimal constructor */
	public SalaryGrant(Timestamp registTime, Timestamp checkTime) {
		this.registTime = registTime;
		this.checkTime = checkTime;
	}

	/** full constructor */
	public SalaryGrant(Short sgrId, String salaryGrantId, String salaryStandardId, String firstKindId,
			String firstKindName, String secondKindId, String secondKindName, String thirdKindId, String thirdKindName,
			Short humanAmount, Double salaryStandardSum, Double salaryPaidSum, String register, Timestamp registTime,
			String checker, Timestamp checkTime, Short checkStatus) {
		this.sgrId = sgrId;
		this.salaryGrantId = salaryGrantId;
		this.salaryStandardId = salaryStandardId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.humanAmount = humanAmount;
		this.salaryStandardSum = salaryStandardSum;
		this.salaryPaidSum = salaryPaidSum;
		this.register = register;
		this.registTime = registTime;
		this.checker = checker;
		this.checkTime = checkTime;
		this.checkStatus = checkStatus;
	}

	// Property accessors

	public Short getSgrId() {
		return this.sgrId;
	}

	public void setSgrId(Short sgrId) {
		this.sgrId = sgrId;
	}

	public String getSalaryGrantId() {
		return this.salaryGrantId;
	}

	public void setSalaryGrantId(String salaryGrantId) {
		this.salaryGrantId = salaryGrantId;
	}

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
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

	public Short getHumanAmount() {
		return this.humanAmount;
	}

	public void setHumanAmount(Short humanAmount) {
		this.humanAmount = humanAmount;
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

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public Short getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalaryGrant))
			return false;
		SalaryGrant castOther = (SalaryGrant) other;

		return ((this.getSgrId() == castOther.getSgrId()) || (this.getSgrId() != null && castOther.getSgrId() != null
				&& this.getSgrId().equals(castOther.getSgrId())))
				&& ((this.getSalaryGrantId() == castOther.getSalaryGrantId())
						|| (this.getSalaryGrantId() != null && castOther.getSalaryGrantId() != null
								&& this.getSalaryGrantId().equals(castOther.getSalaryGrantId())))
				&& ((this.getSalaryStandardId() == castOther.getSalaryStandardId())
						|| (this.getSalaryStandardId() != null && castOther.getSalaryStandardId() != null
								&& this.getSalaryStandardId().equals(castOther.getSalaryStandardId())))
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
				&& ((this.getHumanAmount() == castOther.getHumanAmount())
						|| (this.getHumanAmount() != null && castOther.getHumanAmount() != null
								&& this.getHumanAmount().equals(castOther.getHumanAmount())))
				&& ((this.getSalaryStandardSum() == castOther.getSalaryStandardSum())
						|| (this.getSalaryStandardSum() != null && castOther.getSalaryStandardSum() != null
								&& this.getSalaryStandardSum().equals(castOther.getSalaryStandardSum())))
				&& ((this.getSalaryPaidSum() == castOther.getSalaryPaidSum())
						|| (this.getSalaryPaidSum() != null && castOther.getSalaryPaidSum() != null
								&& this.getSalaryPaidSum().equals(castOther.getSalaryPaidSum())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getCheckStatus() == castOther.getCheckStatus())
						|| (this.getCheckStatus() != null && castOther.getCheckStatus() != null
								&& this.getCheckStatus().equals(castOther.getCheckStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSgrId() == null ? 0 : this.getSgrId().hashCode());
		result = 37 * result + (getSalaryGrantId() == null ? 0 : this.getSalaryGrantId().hashCode());
		result = 37 * result + (getSalaryStandardId() == null ? 0 : this.getSalaryStandardId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getThirdKindId() == null ? 0 : this.getThirdKindId().hashCode());
		result = 37 * result + (getThirdKindName() == null ? 0 : this.getThirdKindName().hashCode());
		result = 37 * result + (getHumanAmount() == null ? 0 : this.getHumanAmount().hashCode());
		result = 37 * result + (getSalaryStandardSum() == null ? 0 : this.getSalaryStandardSum().hashCode());
		result = 37 * result + (getSalaryPaidSum() == null ? 0 : this.getSalaryPaidSum().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		return result;
	}

}