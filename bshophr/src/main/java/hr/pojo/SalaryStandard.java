package hr.pojo;

import java.sql.Timestamp;

/**
 * SalaryStandardId entity. @author MyEclipse Persistence Tools
 */

public class SalaryStandard implements java.io.Serializable {

	// Fields

	private Short ssdId;
	private String standardId;
	private String standardName;
	private String designer;
	private String register;
	private String checker;
	private String changer;
	private Timestamp registTime;
	private String checkTime;
	private String changeTime;
	private Double salarySum;
	private String checkStatus;
	private String changeStatus;
	private String checkComment;
	private String remark;

	// Constructors

	/** default constructor */
	public SalaryStandard() {
	}

	/** minimal constructor */
	public SalaryStandard(Timestamp registTime, String checkTime, String changeTime) {
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
	}

	/** full constructor */
	public SalaryStandard(Short ssdId, String standardId, String standardName, String designer, String register,
			String checker, String changer, Timestamp registTime, String checkTime, String changeTime, Double salarySum,
			String checkStatus, String changeStatus, String checkComment, String remark) {
		this.ssdId = ssdId;
		this.standardId = standardId;
		this.standardName = standardName;
		this.designer = designer;
		this.register = register;
		this.checker = checker;
		this.changer = changer;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
		this.salarySum = salarySum;
		this.checkStatus = checkStatus;
		this.changeStatus = changeStatus;
		this.checkComment = checkComment;
		this.remark = remark;
	}

	// Property accessors

	public Short getSsdId() {
		return this.ssdId;
	}

	public void setSsdId(Short ssdId) {
		this.ssdId = ssdId;
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

	public String getDesigner() {
		return this.designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
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

	public String getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

	public Double getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(Double salarySum) {
		this.salarySum = salarySum;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getChangeStatus() {
		return this.changeStatus;
	}

	public void setChangeStatus(String changeStatus) {
		this.changeStatus = changeStatus;
	}

	public String getCheckComment() {
		return this.checkComment;
	}

	public void setCheckComment(String checkComment) {
		this.checkComment = checkComment;
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
		if (!(other instanceof SalaryStandard))
			return false;
		SalaryStandard castOther = (SalaryStandard) other;

		return ((this.getSsdId() == castOther.getSsdId()) || (this.getSsdId() != null && castOther.getSsdId() != null
				&& this.getSsdId().equals(castOther.getSsdId())))
				&& ((this.getStandardId() == castOther.getStandardId()) || (this.getStandardId() != null
						&& castOther.getStandardId() != null && this.getStandardId().equals(castOther.getStandardId())))
				&& ((this.getStandardName() == castOther.getStandardName())
						|| (this.getStandardName() != null && castOther.getStandardName() != null
								&& this.getStandardName().equals(castOther.getStandardName())))
				&& ((this.getDesigner() == castOther.getDesigner()) || (this.getDesigner() != null
						&& castOther.getDesigner() != null && this.getDesigner().equals(castOther.getDesigner())))
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getChanger() == castOther.getChanger()) || (this.getChanger() != null
						&& castOther.getChanger() != null && this.getChanger().equals(castOther.getChanger())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getChangeTime() == castOther.getChangeTime()) || (this.getChangeTime() != null
						&& castOther.getChangeTime() != null && this.getChangeTime().equals(castOther.getChangeTime())))
				&& ((this.getSalarySum() == castOther.getSalarySum()) || (this.getSalarySum() != null
						&& castOther.getSalarySum() != null && this.getSalarySum().equals(castOther.getSalarySum())))
				&& ((this.getCheckStatus() == castOther.getCheckStatus())
						|| (this.getCheckStatus() != null && castOther.getCheckStatus() != null
								&& this.getCheckStatus().equals(castOther.getCheckStatus())))
				&& ((this.getChangeStatus() == castOther.getChangeStatus())
						|| (this.getChangeStatus() != null && castOther.getChangeStatus() != null
								&& this.getChangeStatus().equals(castOther.getChangeStatus())))
				&& ((this.getCheckComment() == castOther.getCheckComment())
						|| (this.getCheckComment() != null && castOther.getCheckComment() != null
								&& this.getCheckComment().equals(castOther.getCheckComment())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSsdId() == null ? 0 : this.getSsdId().hashCode());
		result = 37 * result + (getStandardId() == null ? 0 : this.getStandardId().hashCode());
		result = 37 * result + (getStandardName() == null ? 0 : this.getStandardName().hashCode());
		result = 37 * result + (getDesigner() == null ? 0 : this.getDesigner().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getChanger() == null ? 0 : this.getChanger().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getChangeTime() == null ? 0 : this.getChangeTime().hashCode());
		result = 37 * result + (getSalarySum() == null ? 0 : this.getSalarySum().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		result = 37 * result + (getChangeStatus() == null ? 0 : this.getChangeStatus().hashCode());
		result = 37 * result + (getCheckComment() == null ? 0 : this.getCheckComment().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "SalaryStandard [ssdId=" + ssdId + ", standardId=" + standardId + ", standardName=" + standardName
				+ ", designer=" + designer + ", register=" + register + ", checker=" + checker + ", changer=" + changer
				+ ", registTime=" + registTime + ", checkTime=" + checkTime + ", changeTime=" + changeTime
				+ ", salarySum=" + salarySum + ", checkStatus=" + checkStatus + ", changeStatus=" + changeStatus
				+ ", checkComment=" + checkComment + ", remark=" + remark + "]";
	}
	

}