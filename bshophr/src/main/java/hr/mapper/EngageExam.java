package hr.mapper;

import java.sql.Timestamp;

/**
 * EngageExamId entity. @author MyEclipse Persistence Tools
 */

public class EngageExam implements java.io.Serializable {

	// Fields

	private Short exaId;
	private String examNumber;
	private String majorKindId;
	private String majorKindName;
	private String majorId;
	private String majorName;
	private String register;
	private Timestamp registTime;
	private Short limiteTime;

	// Constructors

	/** default constructor */
	public EngageExam() {
	}

	/** minimal constructor */
	public EngageExam(Timestamp registTime) {
		this.registTime = registTime;
	}

	/** full constructor */
	public EngageExam(Short exaId, String examNumber, String majorKindId, String majorKindName, String majorId,
			String majorName, String register, Timestamp registTime, Short limiteTime) {
		this.exaId = exaId;
		this.examNumber = examNumber;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.register = register;
		this.registTime = registTime;
		this.limiteTime = limiteTime;
	}

	// Property accessors

	public Short getExaId() {
		return this.exaId;
	}

	public void setExaId(Short exaId) {
		this.exaId = exaId;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
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

	public Short getLimiteTime() {
		return this.limiteTime;
	}

	public void setLimiteTime(Short limiteTime) {
		this.limiteTime = limiteTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageExam))
			return false;
		EngageExam castOther = (EngageExam) other;

		return ((this.getExaId() == castOther.getExaId()) || (this.getExaId() != null && castOther.getExaId() != null
				&& this.getExaId().equals(castOther.getExaId())))
				&& ((this.getExamNumber() == castOther.getExamNumber()) || (this.getExamNumber() != null
						&& castOther.getExamNumber() != null && this.getExamNumber().equals(castOther.getExamNumber())))
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
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getLimiteTime() == castOther.getLimiteTime())
						|| (this.getLimiteTime() != null && castOther.getLimiteTime() != null
								&& this.getLimiteTime().equals(castOther.getLimiteTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getExaId() == null ? 0 : this.getExaId().hashCode());
		result = 37 * result + (getExamNumber() == null ? 0 : this.getExamNumber().hashCode());
		result = 37 * result + (getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode());
		result = 37 * result + (getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode());
		result = 37 * result + (getMajorId() == null ? 0 : this.getMajorId().hashCode());
		result = 37 * result + (getMajorName() == null ? 0 : this.getMajorName().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getLimiteTime() == null ? 0 : this.getLimiteTime().hashCode());
		return result;
	}

}