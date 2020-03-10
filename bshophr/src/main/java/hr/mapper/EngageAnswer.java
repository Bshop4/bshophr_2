package hr.mapper;

import java.sql.Timestamp;

/**
 * EngageAnswerId entity. @author MyEclipse Persistence Tools
 */

public class EngageAnswer implements java.io.Serializable {

	// Fields

	private Short ansId;
	private String answerNumber;
	private String examNumber;
	private Short resumeId;
	private Short interviewId;
	private String humanName;
	private String humanIdcard;
	private String majorKindId;
	private String majorKindName;
	private String majorId;
	private String majorName;
	private Timestamp testTime;
	private String useTime;
	private Double totalPoint;

	// Constructors

	/** default constructor */
	public EngageAnswer() {
	}

	/** minimal constructor */
	public EngageAnswer(Timestamp testTime) {
		this.testTime = testTime;
	}

	/** full constructor */
	public EngageAnswer(Short ansId, String answerNumber, String examNumber, Short resumeId, Short interviewId,
			String humanName, String humanIdcard, String majorKindId, String majorKindName, String majorId,
			String majorName, Timestamp testTime, String useTime, Double totalPoint) {
		this.ansId = ansId;
		this.answerNumber = answerNumber;
		this.examNumber = examNumber;
		this.resumeId = resumeId;
		this.interviewId = interviewId;
		this.humanName = humanName;
		this.humanIdcard = humanIdcard;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.testTime = testTime;
		this.useTime = useTime;
		this.totalPoint = totalPoint;
	}

	// Property accessors

	public Short getAnsId() {
		return this.ansId;
	}

	public void setAnsId(Short ansId) {
		this.ansId = ansId;
	}

	public String getAnswerNumber() {
		return this.answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public Short getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(Short resumeId) {
		this.resumeId = resumeId;
	}

	public Short getInterviewId() {
		return this.interviewId;
	}

	public void setInterviewId(Short interviewId) {
		this.interviewId = interviewId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanIdcard() {
		return this.humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
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

	public Timestamp getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Timestamp testTime) {
		this.testTime = testTime;
	}

	public String getUseTime() {
		return this.useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public Double getTotalPoint() {
		return this.totalPoint;
	}

	public void setTotalPoint(Double totalPoint) {
		this.totalPoint = totalPoint;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageAnswer))
			return false;
		EngageAnswer castOther = (EngageAnswer) other;

		return ((this.getAnsId() == castOther.getAnsId()) || (this.getAnsId() != null && castOther.getAnsId() != null
				&& this.getAnsId().equals(castOther.getAnsId())))
				&& ((this.getAnswerNumber() == castOther.getAnswerNumber())
						|| (this.getAnswerNumber() != null && castOther.getAnswerNumber() != null
								&& this.getAnswerNumber().equals(castOther.getAnswerNumber())))
				&& ((this.getExamNumber() == castOther.getExamNumber()) || (this.getExamNumber() != null
						&& castOther.getExamNumber() != null && this.getExamNumber().equals(castOther.getExamNumber())))
				&& ((this.getResumeId() == castOther.getResumeId()) || (this.getResumeId() != null
						&& castOther.getResumeId() != null && this.getResumeId().equals(castOther.getResumeId())))
				&& ((this.getInterviewId() == castOther.getInterviewId())
						|| (this.getInterviewId() != null && castOther.getInterviewId() != null
								&& this.getInterviewId().equals(castOther.getInterviewId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getHumanIdcard() == castOther.getHumanIdcard())
						|| (this.getHumanIdcard() != null && castOther.getHumanIdcard() != null
								&& this.getHumanIdcard().equals(castOther.getHumanIdcard())))
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
				&& ((this.getTestTime() == castOther.getTestTime()) || (this.getTestTime() != null
						&& castOther.getTestTime() != null && this.getTestTime().equals(castOther.getTestTime())))
				&& ((this.getUseTime() == castOther.getUseTime()) || (this.getUseTime() != null
						&& castOther.getUseTime() != null && this.getUseTime().equals(castOther.getUseTime())))
				&& ((this.getTotalPoint() == castOther.getTotalPoint())
						|| (this.getTotalPoint() != null && castOther.getTotalPoint() != null
								&& this.getTotalPoint().equals(castOther.getTotalPoint())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAnsId() == null ? 0 : this.getAnsId().hashCode());
		result = 37 * result + (getAnswerNumber() == null ? 0 : this.getAnswerNumber().hashCode());
		result = 37 * result + (getExamNumber() == null ? 0 : this.getExamNumber().hashCode());
		result = 37 * result + (getResumeId() == null ? 0 : this.getResumeId().hashCode());
		result = 37 * result + (getInterviewId() == null ? 0 : this.getInterviewId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getHumanIdcard() == null ? 0 : this.getHumanIdcard().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		result = 37 * result + (getMajorId() == null ? 0 : this.getMajorId().hashCode());
		result = 37 * result + (getMajorName() == null ? 0 : this.getMajorName().hashCode());
		result = 37 * result + (getTestTime() == null ? 0 : this.getTestTime().hashCode());
		result = 37 * result + (getUseTime() == null ? 0 : this.getUseTime().hashCode());
		result = 37 * result + (getTotalPoint() == null ? 0 : this.getTotalPoint().hashCode());
		return result;
	}

}