package hr.pojo;

import java.sql.Date;


/**
 * HumanFileDigId entity. @author MyEclipse Persistence Tools
 */

public class HumanFile implements java.io.Serializable {

	// Fields

	private int hufId;
	public void setHufId(int hufId) {
		this.hufId = hufId;
	}
	private String humanId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String thirdKindId;
	private String thirdKindName;
	private String humanName;
	private String humanAddress;
	private String humanPostcode;
	private String humanProDesignation;
	private String humanMajorKindId;
	private String humanMajorKindName;
	private String humanMajorId;
	private String hunmaMajorName;
	private String humanTelephone;
	private String humanMobilephone;
	private String humanBank;
	private String humanAccount;
	private String humanQq;
	private String humanEmail;
	private String humanHobby;
	private String humanSpeciality;
	private String humanSex;
	private String humanReligion;
	private String humanParty;
	private String humanNationality;
	private String humanRace;
	private String humanBirthday;
	private String humanBirthplace;
	private Short humanAge;
	private String humanEducatedDegree;
	private Short humanEducatedYears;
	private String humanEducatedMajor;
	private String humanSocietySecurityId;
	private String humanIdCard;
	private String remark;
	private String salaryStandardId;
	private String salaryStandardName;
	private Double salarySum;
	private Double demandSalaraySum;
	private Double paidSalarySum;
	private Short majorChangeAmount;
	private Short bonusAmount;
	private Short trainingAmount;
	private Short fileChangAmount;
	private String humanHistroyRecords;
	private String humanFamilyMembership;
	private String humanPicture;
	private String attachmentName;
	private Short checkStatus;
	private String register;
	private String checker;
	private String changer;
	private Date registTime;
	private Date checkTime;
	private Date changeTime;
	private Date lastlyChangeTime;
	private Date deleteTime;
	private Date recoveryTime;
	private Short humanFileStatus;

	public int getHufId() {
		return hufId;
	}
	public String getHumanId() {
		return humanId;
	}
	public String getFirstKindId() {
		return firstKindId;
	}
	public String getFirstKindName() {
		return firstKindName;
	}
	public String getSecondKindId() {
		return secondKindId;
	}
	public String getSecondKindName() {
		return secondKindName;
	}
	public String getThirdKindId() {
		return thirdKindId;
	}
	public String getThirdKindName() {
		return thirdKindName;
	}
	public String getHumanName() {
		return humanName;
	}
	public String getHumanAddress() {
		return humanAddress;
	}
	public String getHumanPostcode() {
		return humanPostcode;
	}
	public String getHumanProDesignation() {
		return humanProDesignation;
	}
	public String getHumanMajorKindId() {
		return humanMajorKindId;
	}
	public String getHumanMajorKindName() {
		return humanMajorKindName;
	}
	public String getHumanMajorId() {
		return humanMajorId;
	}
	public String getHunmaMajorName() {
		return hunmaMajorName;
	}
	public String getHumanTelephone() {
		return humanTelephone;
	}
	public String getHumanMobilephone() {
		return humanMobilephone;
	}
	public String getHumanBank() {
		return humanBank;
	}
	public String getHumanAccount() {
		return humanAccount;
	}
	public String getHumanQq() {
		return humanQq;
	}
	public String getHumanEmail() {
		return humanEmail;
	}
	public String getHumanHobby() {
		return humanHobby;
	}
	public String getHumanSpeciality() {
		return humanSpeciality;
	}
	public String getHumanSex() {
		return humanSex;
	}
	public String getHumanReligion() {
		return humanReligion;
	}
	public String getHumanParty() {
		return humanParty;
	}
	public String getHumanNationality() {
		return humanNationality;
	}
	public String getHumanRace() {
		return humanRace;
	}
	public String getHumanBirthday() {
		return humanBirthday;
	}
	public String getHumanBirthplace() {
		return humanBirthplace;
	}
	public Short getHumanAge() {
		return humanAge;
	}
	public String getHumanEducatedDegree() {
		return humanEducatedDegree;
	}
	public Short getHumanEducatedYears() {
		return humanEducatedYears;
	}
	public String getHumanEducatedMajor() {
		return humanEducatedMajor;
	}
	public String getHumanSocietySecurityId() {
		return humanSocietySecurityId;
	}
	public String getHumanIdCard() {
		return humanIdCard;
	}
	public String getRemark() {
		return remark;
	}
	public String getSalaryStandardId() {
		return salaryStandardId;
	}
	public String getSalaryStandardName() {
		return salaryStandardName;
	}
	public Double getSalarySum() {
		return salarySum;
	}
	public Double getDemandSalaraySum() {
		return demandSalaraySum;
	}
	public Double getPaidSalarySum() {
		return paidSalarySum;
	}
	public Short getMajorChangeAmount() {
		return majorChangeAmount;
	}
	public Short getBonusAmount() {
		return bonusAmount;
	}
	public Short getTrainingAmount() {
		return trainingAmount;
	}
	public Short getFileChangAmount() {
		return fileChangAmount;
	}
	public String getHumanHistroyRecords() {
		return humanHistroyRecords;
	}
	public String getHumanFamilyMembership() {
		return humanFamilyMembership;
	}
	public String getHumanPicture() {
		return humanPicture;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public Short getCheckStatus() {
		return checkStatus;
	}
	public String getRegister() {
		return register;
	}
	public String getChecker() {
		return checker;
	}
	public String getChanger() {
		return changer;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public Date getLastlyChangeTime() {
		return lastlyChangeTime;
	}
	public Date getDeleteTime() {
		return deleteTime;
	}
	public Date getRecoveryTime() {
		return recoveryTime;
	}
	public Short getHumanFileStatus() {
		return humanFileStatus;
	}
	public void setHufId(Short hufId) {
		this.hufId = hufId;
	}
	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}
	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}
	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}
	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}
	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}
	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}
	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}
	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}
	public void setHumanAddress(String humanAddress) {
		this.humanAddress = humanAddress;
	}
	public void setHumanPostcode(String humanPostcode) {
		this.humanPostcode = humanPostcode;
	}
	public void setHumanProDesignation(String humanProDesignation) {
		this.humanProDesignation = humanProDesignation;
	}
	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}
	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}
	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}
	public void setHunmaMajorName(String hunmaMajorName) {
		this.hunmaMajorName = hunmaMajorName;
	}
	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}
	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
	}
	public void setHumanBank(String humanBank) {
		this.humanBank = humanBank;
	}
	public void setHumanAccount(String humanAccount) {
		this.humanAccount = humanAccount;
	}
	public void setHumanQq(String humanQq) {
		this.humanQq = humanQq;
	}
	public void setHumanEmail(String humanEmail) {
		this.humanEmail = humanEmail;
	}
	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}
	public void setHumanSpeciality(String humanSpeciality) {
		this.humanSpeciality = humanSpeciality;
	}
	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}
	public void setHumanReligion(String humanReligion) {
		this.humanReligion = humanReligion;
	}
	public void setHumanParty(String humanParty) {
		this.humanParty = humanParty;
	}
	public void setHumanNationality(String humanNationality) {
		this.humanNationality = humanNationality;
	}
	public void setHumanRace(String humanRace) {
		this.humanRace = humanRace;
	}
	public void setHumanBirthday(String humanBirthday) {
		this.humanBirthday = humanBirthday;
	}
	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}
	public void setHumanAge(Short humanAge) {
		this.humanAge = humanAge;
	}
	public void setHumanEducatedDegree(String humanEducatedDegree) {
		this.humanEducatedDegree = humanEducatedDegree;
	}
	public void setHumanEducatedYears(Short humanEducatedYears) {
		this.humanEducatedYears = humanEducatedYears;
	}
	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}
	public void setHumanSocietySecurityId(String humanSocietySecurityId) {
		this.humanSocietySecurityId = humanSocietySecurityId;
	}
	public void setHumanIdCard(String humanIdCard) {
		this.humanIdCard = humanIdCard;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}
	public void setSalaryStandardName(String salaryStandardName) {
		this.salaryStandardName = salaryStandardName;
	}
	public void setSalarySum(Double salarySum) {
		this.salarySum = salarySum;
	}
	public void setDemandSalaraySum(Double demandSalaraySum) {
		this.demandSalaraySum = demandSalaraySum;
	}
	public void setPaidSalarySum(Double paidSalarySum) {
		this.paidSalarySum = paidSalarySum;
	}
	public void setMajorChangeAmount(Short majorChangeAmount) {
		this.majorChangeAmount = majorChangeAmount;
	}
	public void setBonusAmount(Short bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	public void setTrainingAmount(Short trainingAmount) {
		this.trainingAmount = trainingAmount;
	}
	public void setFileChangAmount(Short fileChangAmount) {
		this.fileChangAmount = fileChangAmount;
	}
	public void setHumanHistroyRecords(String humanHistroyRecords) {
		this.humanHistroyRecords = humanHistroyRecords;
	}
	public void setHumanFamilyMembership(String humanFamilyMembership) {
		this.humanFamilyMembership = humanFamilyMembership;
	}
	public void setHumanPicture(String humanPicture) {
		this.humanPicture = humanPicture;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public void setCheckStatus(Short checkStatus) {
		this.checkStatus = checkStatus;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public void setLastlyChangeTime(Date lastlyChangeTime) {
		this.lastlyChangeTime = lastlyChangeTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	public void setRecoveryTime(Date recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
	public void setHumanFileStatus(Short humanFileStatus) {
		this.humanFileStatus = humanFileStatus;
	}
	@Override
	public String toString() {
		return "HumanFile [hufId=" + hufId + ", humanId=" + humanId + ", firstKindId=" + firstKindId
				+ ", firstKindName=" + firstKindName + ", secondKindId=" + secondKindId + ", secondKindName="
				+ secondKindName + ", thirdKindId=" + thirdKindId + ", thirdKindName=" + thirdKindName + ", humanName="
				+ humanName + ", humanAddress=" + humanAddress + ", humanPostcode=" + humanPostcode
				+ ", humanProDesignation=" + humanProDesignation + ", humanMajorKindId=" + humanMajorKindId
				+ ", humanMajorKindName=" + humanMajorKindName + ", humanMajorId=" + humanMajorId + ", hunmaMajorName="
				+ hunmaMajorName + ", humanTelephone=" + humanTelephone + ", humanMobilephone=" + humanMobilephone
				+ ", humanBank=" + humanBank + ", humanAccount=" + humanAccount + ", humanQq=" + humanQq
				+ ", humanEmail=" + humanEmail + ", humanHobby=" + humanHobby + ", humanSpeciality=" + humanSpeciality
				+ ", humanSex=" + humanSex + ", humanReligion=" + humanReligion + ", humanParty=" + humanParty
				+ ", humanNationality=" + humanNationality + ", humanRace=" + humanRace + ", humanBirthday="
				+ humanBirthday + ", humanBirthplace=" + humanBirthplace + ", humanAge=" + humanAge
				+ ", humanEducatedDegree=" + humanEducatedDegree + ", humanEducatedYears=" + humanEducatedYears
				+ ", humanEducatedMajor=" + humanEducatedMajor + ", humanSocietySecurityId=" + humanSocietySecurityId
				+ ", humanIdCard=" + humanIdCard + ", remark=" + remark + ", salaryStandardId=" + salaryStandardId
				+ ", salaryStandardName=" + salaryStandardName + ", salarySum=" + salarySum + ", demandSalaraySum="
				+ demandSalaraySum + ", paidSalarySum=" + paidSalarySum + ", majorChangeAmount=" + majorChangeAmount
				+ ", bonusAmount=" + bonusAmount + ", trainingAmount=" + trainingAmount + ", fileChangAmount="
				+ fileChangAmount + ", humanHistroyRecords=" + humanHistroyRecords + ", humanFamilyMembership="
				+ humanFamilyMembership + ", humanPicture=" + humanPicture + ", attachmentName=" + attachmentName
				+ ", checkStatus=" + checkStatus + ", register=" + register + ", checker=" + checker + ", changer="
				+ changer + ", registTime=" + registTime + ", checkTime=" + checkTime + ", changeTime=" + changeTime
				+ ", lastlyChangeTime=" + lastlyChangeTime + ", deleteTime=" + deleteTime + ", recoveryTime="
				+ recoveryTime + ", humanFileStatus=" + humanFileStatus + "]";
	}

	

	}