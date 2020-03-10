package hr.mapper;

import java.sql.Timestamp;

/**
 * MajorChangeId entity. @author MyEclipse Persistence Tools
 */

public class MajorChange implements java.io.Serializable {

	// Fields

	private Short mchId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String thirdKindId;
	private String thirdKindName;
	private String majorKindId;
	private String majorKindName;
	private String majorId;
	private String majorName;
	private String newFirstKindId;
	private String newFirstKindName;
	private String newSecondKindId;
	private String newSecondKindName;
	private String newThirdKindId;
	private String newThirdKindName;
	private String newMajorKindId;
	private String newMajorKindName;
	private String newMajorId;
	private String newMajorName;
	private String humanId;
	private String humanName;
	private String salaryStandardId;
	private String salaryStandardName;
	private Double salarySum;
	private String newSalaryStandardId;
	private String newSalaryStandardName;
	private Double newSalarySum;
	private String changeReason;
	private String checkReason;
	private Short checkStatus;
	private String register;
	private String checker;
	private Timestamp registTime;
	private Timestamp checkTime;

	// Constructors

	/** default constructor */
	public MajorChange() {
	}

	/** minimal constructor */
	public MajorChange(Timestamp registTime, Timestamp checkTime) {
		this.registTime = registTime;
		this.checkTime = checkTime;
	}

	/** full constructor */
	public MajorChange(Short mchId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String thirdKindId, String thirdKindName, String majorKindId, String majorKindName,
			String majorId, String majorName, String newFirstKindId, String newFirstKindName, String newSecondKindId,
			String newSecondKindName, String newThirdKindId, String newThirdKindName, String newMajorKindId,
			String newMajorKindName, String newMajorId, String newMajorName, String humanId, String humanName,
			String salaryStandardId, String salaryStandardName, Double salarySum, String newSalaryStandardId,
			String newSalaryStandardName, Double newSalarySum, String changeReason, String checkReason,
			Short checkStatus, String register, String checker, Timestamp registTime, Timestamp checkTime) {
		this.mchId = mchId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.newFirstKindId = newFirstKindId;
		this.newFirstKindName = newFirstKindName;
		this.newSecondKindId = newSecondKindId;
		this.newSecondKindName = newSecondKindName;
		this.newThirdKindId = newThirdKindId;
		this.newThirdKindName = newThirdKindName;
		this.newMajorKindId = newMajorKindId;
		this.newMajorKindName = newMajorKindName;
		this.newMajorId = newMajorId;
		this.newMajorName = newMajorName;
		this.humanId = humanId;
		this.humanName = humanName;
		this.salaryStandardId = salaryStandardId;
		this.salaryStandardName = salaryStandardName;
		this.salarySum = salarySum;
		this.newSalaryStandardId = newSalaryStandardId;
		this.newSalaryStandardName = newSalaryStandardName;
		this.newSalarySum = newSalarySum;
		this.changeReason = changeReason;
		this.checkReason = checkReason;
		this.checkStatus = checkStatus;
		this.register = register;
		this.checker = checker;
		this.registTime = registTime;
		this.checkTime = checkTime;
	}

	// Property accessors

	public Short getMchId() {
		return this.mchId;
	}

	public void setMchId(Short mchId) {
		this.mchId = mchId;
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

	public String getNewFirstKindId() {
		return this.newFirstKindId;
	}

	public void setNewFirstKindId(String newFirstKindId) {
		this.newFirstKindId = newFirstKindId;
	}

	public String getNewFirstKindName() {
		return this.newFirstKindName;
	}

	public void setNewFirstKindName(String newFirstKindName) {
		this.newFirstKindName = newFirstKindName;
	}

	public String getNewSecondKindId() {
		return this.newSecondKindId;
	}

	public void setNewSecondKindId(String newSecondKindId) {
		this.newSecondKindId = newSecondKindId;
	}

	public String getNewSecondKindName() {
		return this.newSecondKindName;
	}

	public void setNewSecondKindName(String newSecondKindName) {
		this.newSecondKindName = newSecondKindName;
	}

	public String getNewThirdKindId() {
		return this.newThirdKindId;
	}

	public void setNewThirdKindId(String newThirdKindId) {
		this.newThirdKindId = newThirdKindId;
	}

	public String getNewThirdKindName() {
		return this.newThirdKindName;
	}

	public void setNewThirdKindName(String newThirdKindName) {
		this.newThirdKindName = newThirdKindName;
	}

	public String getNewMajorKindId() {
		return this.newMajorKindId;
	}

	public void setNewMajorKindId(String newMajorKindId) {
		this.newMajorKindId = newMajorKindId;
	}

	public String getNewMajorKindName() {
		return this.newMajorKindName;
	}

	public void setNewMajorKindName(String newMajorKindName) {
		this.newMajorKindName = newMajorKindName;
	}

	public String getNewMajorId() {
		return this.newMajorId;
	}

	public void setNewMajorId(String newMajorId) {
		this.newMajorId = newMajorId;
	}

	public String getNewMajorName() {
		return this.newMajorName;
	}

	public void setNewMajorName(String newMajorName) {
		this.newMajorName = newMajorName;
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

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}

	public String getSalaryStandardName() {
		return this.salaryStandardName;
	}

	public void setSalaryStandardName(String salaryStandardName) {
		this.salaryStandardName = salaryStandardName;
	}

	public Double getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(Double salarySum) {
		this.salarySum = salarySum;
	}

	public String getNewSalaryStandardId() {
		return this.newSalaryStandardId;
	}

	public void setNewSalaryStandardId(String newSalaryStandardId) {
		this.newSalaryStandardId = newSalaryStandardId;
	}

	public String getNewSalaryStandardName() {
		return this.newSalaryStandardName;
	}

	public void setNewSalaryStandardName(String newSalaryStandardName) {
		this.newSalaryStandardName = newSalaryStandardName;
	}

	public Double getNewSalarySum() {
		return this.newSalarySum;
	}

	public void setNewSalarySum(Double newSalarySum) {
		this.newSalarySum = newSalarySum;
	}

	public String getChangeReason() {
		return this.changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getCheckReason() {
		return this.checkReason;
	}

	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
	}

	public Short getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MajorChange))
			return false;
		MajorChange castOther = (MajorChange) other;

		return ((this.getMchId() == castOther.getMchId()) || (this.getMchId() != null && castOther.getMchId() != null
				&& this.getMchId().equals(castOther.getMchId())))
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
				&& ((this.getNewFirstKindId() == castOther.getNewFirstKindId())
						|| (this.getNewFirstKindId() != null && castOther.getNewFirstKindId() != null
								&& this.getNewFirstKindId().equals(castOther.getNewFirstKindId())))
				&& ((this.getNewFirstKindName() == castOther.getNewFirstKindName())
						|| (this.getNewFirstKindName() != null && castOther.getNewFirstKindName() != null
								&& this.getNewFirstKindName().equals(castOther.getNewFirstKindName())))
				&& ((this.getNewSecondKindId() == castOther.getNewSecondKindId())
						|| (this.getNewSecondKindId() != null && castOther.getNewSecondKindId() != null
								&& this.getNewSecondKindId().equals(castOther.getNewSecondKindId())))
				&& ((this.getNewSecondKindName() == castOther.getNewSecondKindName())
						|| (this.getNewSecondKindName() != null && castOther.getNewSecondKindName() != null
								&& this.getNewSecondKindName().equals(castOther.getNewSecondKindName())))
				&& ((this.getNewThirdKindId() == castOther.getNewThirdKindId())
						|| (this.getNewThirdKindId() != null && castOther.getNewThirdKindId() != null
								&& this.getNewThirdKindId().equals(castOther.getNewThirdKindId())))
				&& ((this.getNewThirdKindName() == castOther.getNewThirdKindName())
						|| (this.getNewThirdKindName() != null && castOther.getNewThirdKindName() != null
								&& this.getNewThirdKindName().equals(castOther.getNewThirdKindName())))
				&& ((this.getNewMajorKindId() == castOther.getNewMajorKindId())
						|| (this.getNewMajorKindId() != null && castOther.getNewMajorKindId() != null
								&& this.getNewMajorKindId().equals(castOther.getNewMajorKindId())))
				&& ((this.getNewMajorKindName() == castOther.getNewMajorKindName())
						|| (this.getNewMajorKindName() != null && castOther.getNewMajorKindName() != null
								&& this.getNewMajorKindName().equals(castOther.getNewMajorKindName())))
				&& ((this.getNewMajorId() == castOther.getNewMajorId()) || (this.getNewMajorId() != null
						&& castOther.getNewMajorId() != null && this.getNewMajorId().equals(castOther.getNewMajorId())))
				&& ((this.getNewMajorName() == castOther.getNewMajorName())
						|| (this.getNewMajorName() != null && castOther.getNewMajorName() != null
								&& this.getNewMajorName().equals(castOther.getNewMajorName())))
				&& ((this.getHumanId() == castOther.getHumanId()) || (this.getHumanId() != null
						&& castOther.getHumanId() != null && this.getHumanId().equals(castOther.getHumanId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getSalaryStandardId() == castOther.getSalaryStandardId())
						|| (this.getSalaryStandardId() != null && castOther.getSalaryStandardId() != null
								&& this.getSalaryStandardId().equals(castOther.getSalaryStandardId())))
				&& ((this.getSalaryStandardName() == castOther.getSalaryStandardName())
						|| (this.getSalaryStandardName() != null && castOther.getSalaryStandardName() != null
								&& this.getSalaryStandardName().equals(castOther.getSalaryStandardName())))
				&& ((this.getSalarySum() == castOther.getSalarySum()) || (this.getSalarySum() != null
						&& castOther.getSalarySum() != null && this.getSalarySum().equals(castOther.getSalarySum())))
				&& ((this.getNewSalaryStandardId() == castOther.getNewSalaryStandardId())
						|| (this.getNewSalaryStandardId() != null && castOther.getNewSalaryStandardId() != null
								&& this.getNewSalaryStandardId().equals(castOther.getNewSalaryStandardId())))
				&& ((this.getNewSalaryStandardName() == castOther.getNewSalaryStandardName())
						|| (this.getNewSalaryStandardName() != null && castOther.getNewSalaryStandardName() != null
								&& this.getNewSalaryStandardName().equals(castOther.getNewSalaryStandardName())))
				&& ((this.getNewSalarySum() == castOther.getNewSalarySum())
						|| (this.getNewSalarySum() != null && castOther.getNewSalarySum() != null
								&& this.getNewSalarySum().equals(castOther.getNewSalarySum())))
				&& ((this.getChangeReason() == castOther.getChangeReason())
						|| (this.getChangeReason() != null && castOther.getChangeReason() != null
								&& this.getChangeReason().equals(castOther.getChangeReason())))
				&& ((this.getCheckReason() == castOther.getCheckReason())
						|| (this.getCheckReason() != null && castOther.getCheckReason() != null
								&& this.getCheckReason().equals(castOther.getCheckReason())))
				&& ((this.getCheckStatus() == castOther.getCheckStatus())
						|| (this.getCheckStatus() != null && castOther.getCheckStatus() != null
								&& this.getCheckStatus().equals(castOther.getCheckStatus())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMchId() == null ? 0 : this.getMchId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getThirdKindId() == null ? 0 : this.getThirdKindId().hashCode());
		result = 37 * result + (getThirdKindName() == null ? 0 : this.getThirdKindName().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		result = 37 * result + (getMajorId() == null ? 0 : this.getMajorId().hashCode());
		result = 37 * result + (getMajorName() == null ? 0 : this.getMajorName().hashCode());
		result = 37 * result + (getNewFirstKindId() == null ? 0 : this.getNewFirstKindId().hashCode());
		result = 37 * result + (getNewFirstKindName() == null ? 0 : this.getNewFirstKindName().hashCode());
		result = 37 * result + (getNewSecondKindId() == null ? 0 : this.getNewSecondKindId().hashCode());
		result = 37 * result + (getNewSecondKindName() == null ? 0 : this.getNewSecondKindName().hashCode());
		result = 37 * result + (getNewThirdKindId() == null ? 0 : this.getNewThirdKindId().hashCode());
		result = 37 * result + (getNewThirdKindName() == null ? 0 : this.getNewThirdKindName().hashCode());
		result = 37 * result + (getNewMajorKindId() == null ? 0 : this.getNewMajorKindId().hashCode());
		result = 37 * result + (getNewMajorKindName() == null ? 0 : this.getNewMajorKindName().hashCode());
		result = 37 * result + (getNewMajorId() == null ? 0 : this.getNewMajorId().hashCode());
		result = 37 * result + (getNewMajorName() == null ? 0 : this.getNewMajorName().hashCode());
		result = 37 * result + (getHumanId() == null ? 0 : this.getHumanId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getSalaryStandardId() == null ? 0 : this.getSalaryStandardId().hashCode());
		result = 37 * result + (getSalaryStandardName() == null ? 0 : this.getSalaryStandardName().hashCode());
		result = 37 * result + (getSalarySum() == null ? 0 : this.getSalarySum().hashCode());
		result = 37 * result + (getNewSalaryStandardId() == null ? 0 : this.getNewSalaryStandardId().hashCode());
		result = 37 * result + (getNewSalaryStandardName() == null ? 0 : this.getNewSalaryStandardName().hashCode());
		result = 37 * result + (getNewSalarySum() == null ? 0 : this.getNewSalarySum().hashCode());
		result = 37 * result + (getChangeReason() == null ? 0 : this.getChangeReason().hashCode());
		result = 37 * result + (getCheckReason() == null ? 0 : this.getCheckReason().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		return result;
	}

}