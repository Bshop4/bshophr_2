package hr.pojo;

import java.sql.Timestamp;

/**
 * EngageInterviewId entity. @author MyEclipse Persistence Tools
 */

public class EngageInterview implements java.io.Serializable {

	// Fields

	private Short einId;
	private String humanName;
	private Short interviewAmount;
	private String humanMajorKindId;
	private String humanMajorKindName;
	private String humanMajorId;
	private String humanMajorName;
	private String imageDegree;
	private String nativeLanguageDegree;
	private String foreignLanguageDegree;
	private String responseSpeedDegree;
	private String eqDegree;
	private String iqDegree;
	private String multiQualityDegree;
	private String register;
	private String checker;
	private Timestamp registeTime;
	private Timestamp checkTime;
	private Short resumeId;
	private String result;
	private String interviewComment;
	private String checkComment;
	private Short interviewStatus;
	private Short checkStatus;

	// Constructors

	/** default constructor */
	public EngageInterview() {
	}

	/** minimal constructor */
	public EngageInterview(Timestamp registeTime, Timestamp checkTime) {
		this.registeTime = registeTime;
		this.checkTime = checkTime;
	}

	/** full constructor */
	public EngageInterview(Short einId, String humanName, Short interviewAmount, String humanMajorKindId,
			String humanMajorKindName, String humanMajorId, String humanMajorName, String imageDegree,
			String nativeLanguageDegree, String foreignLanguageDegree, String responseSpeedDegree, String eqDegree,
			String iqDegree, String multiQualityDegree, String register, String checker, Timestamp registeTime,
			Timestamp checkTime, Short resumeId, String result, String interviewComment, String checkComment,
			Short interviewStatus, Short checkStatus) {
		this.einId = einId;
		this.humanName = humanName;
		this.interviewAmount = interviewAmount;
		this.humanMajorKindId = humanMajorKindId;
		this.humanMajorKindName = humanMajorKindName;
		this.humanMajorId = humanMajorId;
		this.humanMajorName = humanMajorName;
		this.imageDegree = imageDegree;
		this.nativeLanguageDegree = nativeLanguageDegree;
		this.foreignLanguageDegree = foreignLanguageDegree;
		this.responseSpeedDegree = responseSpeedDegree;
		this.eqDegree = eqDegree;
		this.iqDegree = iqDegree;
		this.multiQualityDegree = multiQualityDegree;
		this.register = register;
		this.checker = checker;
		this.registeTime = registeTime;
		this.checkTime = checkTime;
		this.resumeId = resumeId;
		this.result = result;
		this.interviewComment = interviewComment;
		this.checkComment = checkComment;
		this.interviewStatus = interviewStatus;
		this.checkStatus = checkStatus;
	}

	// Property accessors

	public Short getEinId() {
		return this.einId;
	}

	public void setEinId(Short einId) {
		this.einId = einId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public Short getInterviewAmount() {
		return this.interviewAmount;
	}

	public void setInterviewAmount(Short interviewAmount) {
		this.interviewAmount = interviewAmount;
	}

	public String getHumanMajorKindId() {
		return this.humanMajorKindId;
	}

	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}

	public String getHumanMajorKindName() {
		return this.humanMajorKindName;
	}

	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}

	public String getHumanMajorId() {
		return this.humanMajorId;
	}

	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getHumanMajorName() {
		return this.humanMajorName;
	}

	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}

	public String getImageDegree() {
		return this.imageDegree;
	}

	public void setImageDegree(String imageDegree) {
		this.imageDegree = imageDegree;
	}

	public String getNativeLanguageDegree() {
		return this.nativeLanguageDegree;
	}

	public void setNativeLanguageDegree(String nativeLanguageDegree) {
		this.nativeLanguageDegree = nativeLanguageDegree;
	}

	public String getForeignLanguageDegree() {
		return this.foreignLanguageDegree;
	}

	public void setForeignLanguageDegree(String foreignLanguageDegree) {
		this.foreignLanguageDegree = foreignLanguageDegree;
	}

	public String getResponseSpeedDegree() {
		return this.responseSpeedDegree;
	}

	public void setResponseSpeedDegree(String responseSpeedDegree) {
		this.responseSpeedDegree = responseSpeedDegree;
	}

	public String getEqDegree() {
		return this.eqDegree;
	}

	public void setEqDegree(String eqDegree) {
		this.eqDegree = eqDegree;
	}

	public String getIqDegree() {
		return this.iqDegree;
	}

	public void setIqDegree(String iqDegree) {
		this.iqDegree = iqDegree;
	}

	public String getMultiQualityDegree() {
		return this.multiQualityDegree;
	}

	public void setMultiQualityDegree(String multiQualityDegree) {
		this.multiQualityDegree = multiQualityDegree;
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

	public Timestamp getRegisteTime() {
		return this.registeTime;
	}

	public void setRegisteTime(Timestamp registeTime) {
		this.registeTime = registeTime;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public Short getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(Short resumeId) {
		this.resumeId = resumeId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getInterviewComment() {
		return this.interviewComment;
	}

	public void setInterviewComment(String interviewComment) {
		this.interviewComment = interviewComment;
	}

	public String getCheckComment() {
		return this.checkComment;
	}

	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
	}

	public Short getInterviewStatus() {
		return this.interviewStatus;
	}

	public void setInterviewStatus(Short interviewStatus) {
		this.interviewStatus = interviewStatus;
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
		if (!(other instanceof EngageInterview))
			return false;
		EngageInterview castOther = (EngageInterview) other;

		return ((this.getEinId() == castOther.getEinId()) || (this.getEinId() != null && castOther.getEinId() != null
				&& this.getEinId().equals(castOther.getEinId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getInterviewAmount() == castOther.getInterviewAmount())
						|| (this.getInterviewAmount() != null && castOther.getInterviewAmount() != null
								&& this.getInterviewAmount().equals(castOther.getInterviewAmount())))
				&& ((this.getHumanMajorKindId() == castOther.getHumanMajorKindId())
						|| (this.getHumanMajorKindId() != null && castOther.getHumanMajorKindId() != null
								&& this.getHumanMajorKindId().equals(castOther.getHumanMajorKindId())))
				&& ((this.getHumanMajorKindName() == castOther.getHumanMajorKindName())
						|| (this.getHumanMajorKindName() != null && castOther.getHumanMajorKindName() != null
								&& this.getHumanMajorKindName().equals(castOther.getHumanMajorKindName())))
				&& ((this.getHumanMajorId() == castOther.getHumanMajorId())
						|| (this.getHumanMajorId() != null && castOther.getHumanMajorId() != null
								&& this.getHumanMajorId().equals(castOther.getHumanMajorId())))
				&& ((this.getHumanMajorName() == castOther.getHumanMajorName())
						|| (this.getHumanMajorName() != null && castOther.getHumanMajorName() != null
								&& this.getHumanMajorName().equals(castOther.getHumanMajorName())))
				&& ((this.getImageDegree() == castOther.getImageDegree())
						|| (this.getImageDegree() != null && castOther.getImageDegree() != null
								&& this.getImageDegree().equals(castOther.getImageDegree())))
				&& ((this.getNativeLanguageDegree() == castOther.getNativeLanguageDegree())
						|| (this.getNativeLanguageDegree() != null && castOther.getNativeLanguageDegree() != null
								&& this.getNativeLanguageDegree().equals(castOther.getNativeLanguageDegree())))
				&& ((this.getForeignLanguageDegree() == castOther.getForeignLanguageDegree())
						|| (this.getForeignLanguageDegree() != null && castOther.getForeignLanguageDegree() != null
								&& this.getForeignLanguageDegree().equals(castOther.getForeignLanguageDegree())))
				&& ((this.getResponseSpeedDegree() == castOther.getResponseSpeedDegree())
						|| (this.getResponseSpeedDegree() != null && castOther.getResponseSpeedDegree() != null
								&& this.getResponseSpeedDegree().equals(castOther.getResponseSpeedDegree())))
				&& ((this.getEqDegree() == castOther.getEqDegree()) || (this.getEqDegree() != null
						&& castOther.getEqDegree() != null && this.getEqDegree().equals(castOther.getEqDegree())))
				&& ((this.getIqDegree() == castOther.getIqDegree()) || (this.getIqDegree() != null
						&& castOther.getIqDegree() != null && this.getIqDegree().equals(castOther.getIqDegree())))
				&& ((this.getMultiQualityDegree() == castOther.getMultiQualityDegree())
						|| (this.getMultiQualityDegree() != null && castOther.getMultiQualityDegree() != null
								&& this.getMultiQualityDegree().equals(castOther.getMultiQualityDegree())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getRegisteTime() == castOther.getRegisteTime())
						|| (this.getRegisteTime() != null && castOther.getRegisteTime() != null
								&& this.getRegisteTime().equals(castOther.getRegisteTime())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getResumeId() == castOther.getResumeId()) || (this.getResumeId() != null
						&& castOther.getResumeId() != null && this.getResumeId().equals(castOther.getResumeId())))
				&& ((this.getResult() == castOther.getResult()) || (this.getResult() != null
						&& castOther.getResult() != null && this.getResult().equals(castOther.getResult())))
				&& ((this.getInterviewComment() == castOther.getInterviewComment())
						|| (this.getInterviewComment() != null && castOther.getInterviewComment() != null
								&& this.getInterviewComment().equals(castOther.getInterviewComment())))
				&& ((this.getCheckComment() == castOther.getCheckComment())
						|| (this.getCheckComment() != null && castOther.getCheckComment() != null
								&& this.getCheckComment().equals(castOther.getCheckComment())))
				&& ((this.getInterviewStatus() == castOther.getInterviewStatus())
						|| (this.getInterviewStatus() != null && castOther.getInterviewStatus() != null
								&& this.getInterviewStatus().equals(castOther.getInterviewStatus())))
				&& ((this.getCheckStatus() == castOther.getCheckStatus())
						|| (this.getCheckStatus() != null && castOther.getCheckStatus() != null
								&& this.getCheckStatus().equals(castOther.getCheckStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEinId() == null ? 0 : this.getEinId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getInterviewAmount() == null ? 0 : this.getInterviewAmount().hashCode());
		result = 37 * result + (getHumanMajorKindId() == null ? 0 : this.getHumanMajorKindId().hashCode());
		result = 37 * result + (getHumanMajorKindName() == null ? 0 : this.getHumanMajorKindName().hashCode());
		result = 37 * result + (getHumanMajorId() == null ? 0 : this.getHumanMajorId().hashCode());
		result = 37 * result + (getHumanMajorName() == null ? 0 : this.getHumanMajorName().hashCode());
		result = 37 * result + (getImageDegree() == null ? 0 : this.getImageDegree().hashCode());
		result = 37 * result + (getNativeLanguageDegree() == null ? 0 : this.getNativeLanguageDegree().hashCode());
		result = 37 * result + (getForeignLanguageDegree() == null ? 0 : this.getForeignLanguageDegree().hashCode());
		result = 37 * result + (getResponseSpeedDegree() == null ? 0 : this.getResponseSpeedDegree().hashCode());
		result = 37 * result + (getEqDegree() == null ? 0 : this.getEqDegree().hashCode());
		result = 37 * result + (getIqDegree() == null ? 0 : this.getIqDegree().hashCode());
		result = 37 * result + (getMultiQualityDegree() == null ? 0 : this.getMultiQualityDegree().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getRegisteTime() == null ? 0 : this.getRegisteTime().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getResumeId() == null ? 0 : this.getResumeId().hashCode());
		result = 37 * result + (getResult() == null ? 0 : this.getResult().hashCode());
		result = 37 * result + (getInterviewComment() == null ? 0 : this.getInterviewComment().hashCode());
		result = 37 * result + (getCheckComment() == null ? 0 : this.getCheckComment().hashCode());
		result = 37 * result + (getInterviewStatus() == null ? 0 : this.getInterviewStatus().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		return result;
	}

}