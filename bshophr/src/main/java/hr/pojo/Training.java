package hr.pojo;

import java.sql.Timestamp;

/**
 * TrainingId entity. @author MyEclipse Persistence Tools
 */

public class Training implements java.io.Serializable {

	// Fields

	private Short traId;
	private String majorKindId;
	private String majorKindName;
	private String majorId;
	private String majorName;
	private String humanId;
	private String humanName;
	private String trainingItem;
	private Timestamp trainingTime;
	private Integer trainingHour;
	private String trainingDegree;
	private String register;
	private String checker;
	private Timestamp registTime;
	private Timestamp checkTime;
	private Short checkstatus;
	private String remark;

	// Constructors

	/** default constructor */
	public Training() {
	}

	/** minimal constructor */
	public Training(Timestamp trainingTime, Timestamp registTime, Timestamp checkTime) {
		this.trainingTime = trainingTime;
		this.registTime = registTime;
		this.checkTime = checkTime;
	}

	/** full constructor */
	public Training(Short traId, String majorKindId, String majorKindName, String majorId, String majorName,
			String humanId, String humanName, String trainingItem, Timestamp trainingTime, Integer trainingHour,
			String trainingDegree, String register, String checker, Timestamp registTime, Timestamp checkTime,
			Short checkstatus, String remark) {
		this.traId = traId;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.humanId = humanId;
		this.humanName = humanName;
		this.trainingItem = trainingItem;
		this.trainingTime = trainingTime;
		this.trainingHour = trainingHour;
		this.trainingDegree = trainingDegree;
		this.register = register;
		this.checker = checker;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.checkstatus = checkstatus;
		this.remark = remark;
	}

	// Property accessors

	public Short getTraId() {
		return this.traId;
	}

	public void setTraId(Short traId) {
		this.traId = traId;
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

	public String getTrainingItem() {
		return this.trainingItem;
	}

	public void setTrainingItem(String trainingItem) {
		this.trainingItem = trainingItem;
	}

	public Timestamp getTrainingTime() {
		return this.trainingTime;
	}

	public void setTrainingTime(Timestamp trainingTime) {
		this.trainingTime = trainingTime;
	}

	public Integer getTrainingHour() {
		return this.trainingHour;
	}

	public void setTrainingHour(Integer trainingHour) {
		this.trainingHour = trainingHour;
	}

	public String getTrainingDegree() {
		return this.trainingDegree;
	}

	public void setTrainingDegree(String trainingDegree) {
		this.trainingDegree = trainingDegree;
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

	public Short getCheckstatus() {
		return this.checkstatus;
	}

	public void setCheckstatus(Short checkstatus) {
		this.checkstatus = checkstatus;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Training))
			return false;
		Training castOther = (Training) other;

		return ((this.getTraId() == castOther.getTraId()) || (this.getTraId() != null && castOther.getTraId() != null
				&& this.getTraId().equals(castOther.getTraId())))
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
				&& ((this.getHumanId() == castOther.getHumanId()) || (this.getHumanId() != null
						&& castOther.getHumanId() != null && this.getHumanId().equals(castOther.getHumanId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getTrainingItem() == castOther.getTrainingItem())
						|| (this.getTrainingItem() != null && castOther.getTrainingItem() != null
								&& this.getTrainingItem().equals(castOther.getTrainingItem())))
				&& ((this.getTrainingTime() == castOther.getTrainingTime())
						|| (this.getTrainingTime() != null && castOther.getTrainingTime() != null
								&& this.getTrainingTime().equals(castOther.getTrainingTime())))
				&& ((this.getTrainingHour() == castOther.getTrainingHour())
						|| (this.getTrainingHour() != null && castOther.getTrainingHour() != null
								&& this.getTrainingHour().equals(castOther.getTrainingHour())))
				&& ((this.getTrainingDegree() == castOther.getTrainingDegree())
						|| (this.getTrainingDegree() != null && castOther.getTrainingDegree() != null
								&& this.getTrainingDegree().equals(castOther.getTrainingDegree())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getCheckstatus() == castOther.getCheckstatus())
						|| (this.getCheckstatus() != null && castOther.getCheckstatus() != null
								&& this.getCheckstatus().equals(castOther.getCheckstatus())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTraId() == null ? 0 : this.getTraId().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		result = 37 * result + (getMajorId() == null ? 0 : this.getMajorId().hashCode());
		result = 37 * result + (getMajorName() == null ? 0 : this.getMajorName().hashCode());
		result = 37 * result + (getHumanId() == null ? 0 : this.getHumanId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getTrainingItem() == null ? 0 : this.getTrainingItem().hashCode());
		result = 37 * result + (getTrainingTime() == null ? 0 : this.getTrainingTime().hashCode());
		result = 37 * result + (getTrainingHour() == null ? 0 : this.getTrainingHour().hashCode());
		result = 37 * result + (getTrainingDegree() == null ? 0 : this.getTrainingDegree().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getCheckstatus() == null ? 0 : this.getCheckstatus().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}