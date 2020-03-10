package hr.pojo;

import java.sql.Timestamp;

/**
 * EngageMajorReleaseId entity. @author MyEclipse Persistence Tools
 */

public class EngageMajorRelease implements java.io.Serializable {

	// Fields

	private Short mreId;
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
	private Short humanAmount;
	private String engageType;
	private Timestamp deadline;
	private String register;
	private String changer;
	private Timestamp registTime;
	private Timestamp changeTime;
	private String majorDescribe;
	private String engageRequired;

	// Constructors

	/** default constructor */
	public EngageMajorRelease() {
	}

	/** minimal constructor */
	public EngageMajorRelease(Timestamp deadline, Timestamp registTime, Timestamp changeTime) {
		this.deadline = deadline;
		this.registTime = registTime;
		this.changeTime = changeTime;
	}

	/** full constructor */
	public EngageMajorRelease(Short mreId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String thirdKindId, String thirdKindName, String majorKindId, String majorKindName,
			String majorId, String majorName, Short humanAmount, String engageType, Timestamp deadline, String register,
			String changer, Timestamp registTime, Timestamp changeTime, String majorDescribe, String engageRequired) {
		this.mreId = mreId;
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
		this.humanAmount = humanAmount;
		this.engageType = engageType;
		this.deadline = deadline;
		this.register = register;
		this.changer = changer;
		this.registTime = registTime;
		this.changeTime = changeTime;
		this.majorDescribe = majorDescribe;
		this.engageRequired = engageRequired;
	}

	// Property accessors

	public Short getMreId() {
		return this.mreId;
	}

	public void setMreId(Short mreId) {
		this.mreId = mreId;
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

	public Short getHumanAmount() {
		return this.humanAmount;
	}

	public void setHumanAmount(Short humanAmount) {
		this.humanAmount = humanAmount;
	}

	public String getEngageType() {
		return this.engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
	}

	public Timestamp getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public String getMajorDescribe() {
		return this.majorDescribe;
	}

	public void setMajorDescribe(String majorDescribe) {
		this.majorDescribe = majorDescribe;
	}

	public String getEngageRequired() {
		return this.engageRequired;
	}

	public void setEngageRequired(String engageRequired) {
		this.engageRequired = engageRequired;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageMajorRelease))
			return false;
		EngageMajorRelease castOther = (EngageMajorRelease) other;

		return ((this.getMreId() == castOther.getMreId()) || (this.getMreId() != null && castOther.getMreId() != null
				&& this.getMreId().equals(castOther.getMreId())))
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
				&& ((this.getHumanAmount() == castOther.getHumanAmount())
						|| (this.getHumanAmount() != null && castOther.getHumanAmount() != null
								&& this.getHumanAmount().equals(castOther.getHumanAmount())))
				&& ((this.getEngageType() == castOther.getEngageType()) || (this.getEngageType() != null
						&& castOther.getEngageType() != null && this.getEngageType().equals(castOther.getEngageType())))
				&& ((this.getDeadline() == castOther.getDeadline()) || (this.getDeadline() != null
						&& castOther.getDeadline() != null && this.getDeadline().equals(castOther.getDeadline())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getChanger() == castOther.getChanger()) || (this.getChanger() != null
						&& castOther.getChanger() != null && this.getChanger().equals(castOther.getChanger())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getChangeTime() == castOther.getChangeTime()) || (this.getChangeTime() != null
						&& castOther.getChangeTime() != null && this.getChangeTime().equals(castOther.getChangeTime())))
				&& ((this.getMajorDescribe() == castOther.getMajorDescribe())
						|| (this.getMajorDescribe() != null && castOther.getMajorDescribe() != null
								&& this.getMajorDescribe().equals(castOther.getMajorDescribe())))
				&& ((this.getEngageRequired() == castOther.getEngageRequired())
						|| (this.getEngageRequired() != null && castOther.getEngageRequired() != null
								&& this.getEngageRequired().equals(castOther.getEngageRequired())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMreId() == null ? 0 : this.getMreId().hashCode());
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
		result = 37 * result + (getHumanAmount() == null ? 0 : this.getHumanAmount().hashCode());
		result = 37 * result + (getEngageType() == null ? 0 : this.getEngageType().hashCode());
		result = 37 * result + (getDeadline() == null ? 0 : this.getDeadline().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChanger() == null ? 0 : this.getChanger().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getChangeTime() == null ? 0 : this.getChangeTime().hashCode());
		result = 37 * result + (getMajorDescribe() == null ? 0 : this.getMajorDescribe().hashCode());
		result = 37 * result + (getEngageRequired() == null ? 0 : this.getEngageRequired().hashCode());
		return result;
	}

}