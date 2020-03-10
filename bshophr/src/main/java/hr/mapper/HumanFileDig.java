package hr.mapper;

import java.sql.Timestamp;

/**
 * HumanFileDigId entity. @author MyEclipse Persistence Tools
 */

public class HumanFileDig implements java.io.Serializable {

	// Fields

	private Short hfdId;
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
	private Timestamp humanBirthday;
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
	private Timestamp registTime;
	private Timestamp checkTime;
	private Timestamp changeTime;
	private Timestamp lastlyChangeTime;
	private Timestamp deleteTime;
	private Timestamp recoveryTime;
	private Short humanFileStatus;

	// Constructors

	/** default constructor */
	public HumanFileDig() {
	}

	/** minimal constructor */
	public HumanFileDig(Timestamp humanBirthday, Timestamp registTime, Timestamp checkTime, Timestamp changeTime,
			Timestamp lastlyChangeTime, Timestamp deleteTime, Timestamp recoveryTime) {
		this.humanBirthday = humanBirthday;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
		this.lastlyChangeTime = lastlyChangeTime;
		this.deleteTime = deleteTime;
		this.recoveryTime = recoveryTime;
	}

	/** full constructor */
	public HumanFileDig(Short hfdId, String humanId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String thirdKindId, String thirdKindName, String humanName, String humanAddress,
			String humanPostcode, String humanProDesignation, String humanMajorKindId, String humanMajorKindName,
			String humanMajorId, String hunmaMajorName, String humanTelephone, String humanMobilephone,
			String humanBank, String humanAccount, String humanQq, String humanEmail, String humanHobby,
			String humanSpeciality, String humanSex, String humanReligion, String humanParty, String humanNationality,
			String humanRace, Timestamp humanBirthday, String humanBirthplace, Short humanAge,
			String humanEducatedDegree, Short humanEducatedYears, String humanEducatedMajor,
			String humanSocietySecurityId, String humanIdCard, String remark, String salaryStandardId,
			String salaryStandardName, Double salarySum, Double demandSalaraySum, Double paidSalarySum,
			Short majorChangeAmount, Short bonusAmount, Short trainingAmount, Short fileChangAmount,
			String humanHistroyRecords, String humanFamilyMembership, String humanPicture, String attachmentName,
			Short checkStatus, String register, String checker, String changer, Timestamp registTime,
			Timestamp checkTime, Timestamp changeTime, Timestamp lastlyChangeTime, Timestamp deleteTime,
			Timestamp recoveryTime, Short humanFileStatus) {
		this.hfdId = hfdId;
		this.humanId = humanId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.humanName = humanName;
		this.humanAddress = humanAddress;
		this.humanPostcode = humanPostcode;
		this.humanProDesignation = humanProDesignation;
		this.humanMajorKindId = humanMajorKindId;
		this.humanMajorKindName = humanMajorKindName;
		this.humanMajorId = humanMajorId;
		this.hunmaMajorName = hunmaMajorName;
		this.humanTelephone = humanTelephone;
		this.humanMobilephone = humanMobilephone;
		this.humanBank = humanBank;
		this.humanAccount = humanAccount;
		this.humanQq = humanQq;
		this.humanEmail = humanEmail;
		this.humanHobby = humanHobby;
		this.humanSpeciality = humanSpeciality;
		this.humanSex = humanSex;
		this.humanReligion = humanReligion;
		this.humanParty = humanParty;
		this.humanNationality = humanNationality;
		this.humanRace = humanRace;
		this.humanBirthday = humanBirthday;
		this.humanBirthplace = humanBirthplace;
		this.humanAge = humanAge;
		this.humanEducatedDegree = humanEducatedDegree;
		this.humanEducatedYears = humanEducatedYears;
		this.humanEducatedMajor = humanEducatedMajor;
		this.humanSocietySecurityId = humanSocietySecurityId;
		this.humanIdCard = humanIdCard;
		this.remark = remark;
		this.salaryStandardId = salaryStandardId;
		this.salaryStandardName = salaryStandardName;
		this.salarySum = salarySum;
		this.demandSalaraySum = demandSalaraySum;
		this.paidSalarySum = paidSalarySum;
		this.majorChangeAmount = majorChangeAmount;
		this.bonusAmount = bonusAmount;
		this.trainingAmount = trainingAmount;
		this.fileChangAmount = fileChangAmount;
		this.humanHistroyRecords = humanHistroyRecords;
		this.humanFamilyMembership = humanFamilyMembership;
		this.humanPicture = humanPicture;
		this.attachmentName = attachmentName;
		this.checkStatus = checkStatus;
		this.register = register;
		this.checker = checker;
		this.changer = changer;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
		this.lastlyChangeTime = lastlyChangeTime;
		this.deleteTime = deleteTime;
		this.recoveryTime = recoveryTime;
		this.humanFileStatus = humanFileStatus;
	}

	// Property accessors

	public Short getHfdId() {
		return this.hfdId;
	}

	public void setHfdId(Short hfdId) {
		this.hfdId = hfdId;
	}

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
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

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanAddress() {
		return this.humanAddress;
	}

	public void setHumanAddress(String humanAddress) {
		this.humanAddress = humanAddress;
	}

	public String getHumanPostcode() {
		return this.humanPostcode;
	}

	public void setHumanPostcode(String humanPostcode) {
		this.humanPostcode = humanPostcode;
	}

	public String getHumanProDesignation() {
		return this.humanProDesignation;
	}

	public void setHumanProDesignation(String humanProDesignation) {
		this.humanProDesignation = humanProDesignation;
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

	public String getHunmaMajorName() {
		return this.hunmaMajorName;
	}

	public void setHunmaMajorName(String hunmaMajorName) {
		this.hunmaMajorName = hunmaMajorName;
	}

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHumanMobilephone() {
		return this.humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
	}

	public String getHumanBank() {
		return this.humanBank;
	}

	public void setHumanBank(String humanBank) {
		this.humanBank = humanBank;
	}

	public String getHumanAccount() {
		return this.humanAccount;
	}

	public void setHumanAccount(String humanAccount) {
		this.humanAccount = humanAccount;
	}

	public String getHumanQq() {
		return this.humanQq;
	}

	public void setHumanQq(String humanQq) {
		this.humanQq = humanQq;
	}

	public String getHumanEmail() {
		return this.humanEmail;
	}

	public void setHumanEmail(String humanEmail) {
		this.humanEmail = humanEmail;
	}

	public String getHumanHobby() {
		return this.humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	public String getHumanSpeciality() {
		return this.humanSpeciality;
	}

	public void setHumanSpeciality(String humanSpeciality) {
		this.humanSpeciality = humanSpeciality;
	}

	public String getHumanSex() {
		return this.humanSex;
	}

	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}

	public String getHumanReligion() {
		return this.humanReligion;
	}

	public void setHumanReligion(String humanReligion) {
		this.humanReligion = humanReligion;
	}

	public String getHumanParty() {
		return this.humanParty;
	}

	public void setHumanParty(String humanParty) {
		this.humanParty = humanParty;
	}

	public String getHumanNationality() {
		return this.humanNationality;
	}

	public void setHumanNationality(String humanNationality) {
		this.humanNationality = humanNationality;
	}

	public String getHumanRace() {
		return this.humanRace;
	}

	public void setHumanRace(String humanRace) {
		this.humanRace = humanRace;
	}

	public Timestamp getHumanBirthday() {
		return this.humanBirthday;
	}

	public void setHumanBirthday(Timestamp humanBirthday) {
		this.humanBirthday = humanBirthday;
	}

	public String getHumanBirthplace() {
		return this.humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public Short getHumanAge() {
		return this.humanAge;
	}

	public void setHumanAge(Short humanAge) {
		this.humanAge = humanAge;
	}

	public String getHumanEducatedDegree() {
		return this.humanEducatedDegree;
	}

	public void setHumanEducatedDegree(String humanEducatedDegree) {
		this.humanEducatedDegree = humanEducatedDegree;
	}

	public Short getHumanEducatedYears() {
		return this.humanEducatedYears;
	}

	public void setHumanEducatedYears(Short humanEducatedYears) {
		this.humanEducatedYears = humanEducatedYears;
	}

	public String getHumanEducatedMajor() {
		return this.humanEducatedMajor;
	}

	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}

	public String getHumanSocietySecurityId() {
		return this.humanSocietySecurityId;
	}

	public void setHumanSocietySecurityId(String humanSocietySecurityId) {
		this.humanSocietySecurityId = humanSocietySecurityId;
	}

	public String getHumanIdCard() {
		return this.humanIdCard;
	}

	public void setHumanIdCard(String humanIdCard) {
		this.humanIdCard = humanIdCard;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Double getDemandSalaraySum() {
		return this.demandSalaraySum;
	}

	public void setDemandSalaraySum(Double demandSalaraySum) {
		this.demandSalaraySum = demandSalaraySum;
	}

	public Double getPaidSalarySum() {
		return this.paidSalarySum;
	}

	public void setPaidSalarySum(Double paidSalarySum) {
		this.paidSalarySum = paidSalarySum;
	}

	public Short getMajorChangeAmount() {
		return this.majorChangeAmount;
	}

	public void setMajorChangeAmount(Short majorChangeAmount) {
		this.majorChangeAmount = majorChangeAmount;
	}

	public Short getBonusAmount() {
		return this.bonusAmount;
	}

	public void setBonusAmount(Short bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public Short getTrainingAmount() {
		return this.trainingAmount;
	}

	public void setTrainingAmount(Short trainingAmount) {
		this.trainingAmount = trainingAmount;
	}

	public Short getFileChangAmount() {
		return this.fileChangAmount;
	}

	public void setFileChangAmount(Short fileChangAmount) {
		this.fileChangAmount = fileChangAmount;
	}

	public String getHumanHistroyRecords() {
		return this.humanHistroyRecords;
	}

	public void setHumanHistroyRecords(String humanHistroyRecords) {
		this.humanHistroyRecords = humanHistroyRecords;
	}

	public String getHumanFamilyMembership() {
		return this.humanFamilyMembership;
	}

	public void setHumanFamilyMembership(String humanFamilyMembership) {
		this.humanFamilyMembership = humanFamilyMembership;
	}

	public String getHumanPicture() {
		return this.humanPicture;
	}

	public void setHumanPicture(String humanPicture) {
		this.humanPicture = humanPicture;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
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

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public Timestamp getLastlyChangeTime() {
		return this.lastlyChangeTime;
	}

	public void setLastlyChangeTime(Timestamp lastlyChangeTime) {
		this.lastlyChangeTime = lastlyChangeTime;
	}

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Timestamp getRecoveryTime() {
		return this.recoveryTime;
	}

	public void setRecoveryTime(Timestamp recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	public Short getHumanFileStatus() {
		return this.humanFileStatus;
	}

	public void setHumanFileStatus(Short humanFileStatus) {
		this.humanFileStatus = humanFileStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HumanFileDig))
			return false;
		HumanFileDig castOther = (HumanFileDig) other;

		return ((this.getHfdId() == castOther.getHfdId()) || (this.getHfdId() != null && castOther.getHfdId() != null
				&& this.getHfdId().equals(castOther.getHfdId())))
				&& ((this.getHumanId() == castOther.getHumanId()) || (this.getHumanId() != null
						&& castOther.getHumanId() != null && this.getHumanId().equals(castOther.getHumanId())))
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
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getHumanAddress() == castOther.getHumanAddress())
						|| (this.getHumanAddress() != null && castOther.getHumanAddress() != null
								&& this.getHumanAddress().equals(castOther.getHumanAddress())))
				&& ((this.getHumanPostcode() == castOther.getHumanPostcode())
						|| (this.getHumanPostcode() != null && castOther.getHumanPostcode() != null
								&& this.getHumanPostcode().equals(castOther.getHumanPostcode())))
				&& ((this.getHumanProDesignation() == castOther.getHumanProDesignation())
						|| (this.getHumanProDesignation() != null && castOther.getHumanProDesignation() != null
								&& this.getHumanProDesignation().equals(castOther.getHumanProDesignation())))
				&& ((this.getHumanMajorKindId() == castOther.getHumanMajorKindId())
						|| (this.getHumanMajorKindId() != null && castOther.getHumanMajorKindId() != null
								&& this.getHumanMajorKindId().equals(castOther.getHumanMajorKindId())))
				&& ((this.getHumanMajorKindName() == castOther.getHumanMajorKindName())
						|| (this.getHumanMajorKindName() != null && castOther.getHumanMajorKindName() != null
								&& this.getHumanMajorKindName().equals(castOther.getHumanMajorKindName())))
				&& ((this.getHumanMajorId() == castOther.getHumanMajorId())
						|| (this.getHumanMajorId() != null && castOther.getHumanMajorId() != null
								&& this.getHumanMajorId().equals(castOther.getHumanMajorId())))
				&& ((this.getHunmaMajorName() == castOther.getHunmaMajorName())
						|| (this.getHunmaMajorName() != null && castOther.getHunmaMajorName() != null
								&& this.getHunmaMajorName().equals(castOther.getHunmaMajorName())))
				&& ((this.getHumanTelephone() == castOther.getHumanTelephone())
						|| (this.getHumanTelephone() != null && castOther.getHumanTelephone() != null
								&& this.getHumanTelephone().equals(castOther.getHumanTelephone())))
				&& ((this.getHumanMobilephone() == castOther.getHumanMobilephone())
						|| (this.getHumanMobilephone() != null && castOther.getHumanMobilephone() != null
								&& this.getHumanMobilephone().equals(castOther.getHumanMobilephone())))
				&& ((this.getHumanBank() == castOther.getHumanBank()) || (this.getHumanBank() != null
						&& castOther.getHumanBank() != null && this.getHumanBank().equals(castOther.getHumanBank())))
				&& ((this.getHumanAccount() == castOther.getHumanAccount())
						|| (this.getHumanAccount() != null && castOther.getHumanAccount() != null
								&& this.getHumanAccount().equals(castOther.getHumanAccount())))
				&& ((this.getHumanQq() == castOther.getHumanQq()) || (this.getHumanQq() != null
						&& castOther.getHumanQq() != null && this.getHumanQq().equals(castOther.getHumanQq())))
				&& ((this.getHumanEmail() == castOther.getHumanEmail()) || (this.getHumanEmail() != null
						&& castOther.getHumanEmail() != null && this.getHumanEmail().equals(castOther.getHumanEmail())))
				&& ((this.getHumanHobby() == castOther.getHumanHobby()) || (this.getHumanHobby() != null
						&& castOther.getHumanHobby() != null && this.getHumanHobby().equals(castOther.getHumanHobby())))
				&& ((this.getHumanSpeciality() == castOther.getHumanSpeciality())
						|| (this.getHumanSpeciality() != null && castOther.getHumanSpeciality() != null
								&& this.getHumanSpeciality().equals(castOther.getHumanSpeciality())))
				&& ((this.getHumanSex() == castOther.getHumanSex()) || (this.getHumanSex() != null
						&& castOther.getHumanSex() != null && this.getHumanSex().equals(castOther.getHumanSex())))
				&& ((this.getHumanReligion() == castOther.getHumanReligion())
						|| (this.getHumanReligion() != null && castOther.getHumanReligion() != null
								&& this.getHumanReligion().equals(castOther.getHumanReligion())))
				&& ((this.getHumanParty() == castOther.getHumanParty()) || (this.getHumanParty() != null
						&& castOther.getHumanParty() != null && this.getHumanParty().equals(castOther.getHumanParty())))
				&& ((this.getHumanNationality() == castOther.getHumanNationality())
						|| (this.getHumanNationality() != null && castOther.getHumanNationality() != null
								&& this.getHumanNationality().equals(castOther.getHumanNationality())))
				&& ((this.getHumanRace() == castOther.getHumanRace()) || (this.getHumanRace() != null
						&& castOther.getHumanRace() != null && this.getHumanRace().equals(castOther.getHumanRace())))
				&& ((this.getHumanBirthday() == castOther.getHumanBirthday())
						|| (this.getHumanBirthday() != null && castOther.getHumanBirthday() != null
								&& this.getHumanBirthday().equals(castOther.getHumanBirthday())))
				&& ((this.getHumanBirthplace() == castOther.getHumanBirthplace())
						|| (this.getHumanBirthplace() != null && castOther.getHumanBirthplace() != null
								&& this.getHumanBirthplace().equals(castOther.getHumanBirthplace())))
				&& ((this.getHumanAge() == castOther.getHumanAge()) || (this.getHumanAge() != null
						&& castOther.getHumanAge() != null && this.getHumanAge().equals(castOther.getHumanAge())))
				&& ((this.getHumanEducatedDegree() == castOther.getHumanEducatedDegree())
						|| (this.getHumanEducatedDegree() != null && castOther.getHumanEducatedDegree() != null
								&& this.getHumanEducatedDegree().equals(castOther.getHumanEducatedDegree())))
				&& ((this.getHumanEducatedYears() == castOther.getHumanEducatedYears())
						|| (this.getHumanEducatedYears() != null && castOther.getHumanEducatedYears() != null
								&& this.getHumanEducatedYears().equals(castOther.getHumanEducatedYears())))
				&& ((this.getHumanEducatedMajor() == castOther.getHumanEducatedMajor())
						|| (this.getHumanEducatedMajor() != null && castOther.getHumanEducatedMajor() != null
								&& this.getHumanEducatedMajor().equals(castOther.getHumanEducatedMajor())))
				&& ((this.getHumanSocietySecurityId() == castOther.getHumanSocietySecurityId())
						|| (this.getHumanSocietySecurityId() != null && castOther.getHumanSocietySecurityId() != null
								&& this.getHumanSocietySecurityId().equals(castOther.getHumanSocietySecurityId())))
				&& ((this.getHumanIdCard() == castOther.getHumanIdCard())
						|| (this.getHumanIdCard() != null && castOther.getHumanIdCard() != null
								&& this.getHumanIdCard().equals(castOther.getHumanIdCard())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getSalaryStandardId() == castOther.getSalaryStandardId())
						|| (this.getSalaryStandardId() != null && castOther.getSalaryStandardId() != null
								&& this.getSalaryStandardId().equals(castOther.getSalaryStandardId())))
				&& ((this.getSalaryStandardName() == castOther.getSalaryStandardName())
						|| (this.getSalaryStandardName() != null && castOther.getSalaryStandardName() != null
								&& this.getSalaryStandardName().equals(castOther.getSalaryStandardName())))
				&& ((this.getSalarySum() == castOther.getSalarySum()) || (this.getSalarySum() != null
						&& castOther.getSalarySum() != null && this.getSalarySum().equals(castOther.getSalarySum())))
				&& ((this.getDemandSalaraySum() == castOther.getDemandSalaraySum())
						|| (this.getDemandSalaraySum() != null && castOther.getDemandSalaraySum() != null
								&& this.getDemandSalaraySum().equals(castOther.getDemandSalaraySum())))
				&& ((this.getPaidSalarySum() == castOther.getPaidSalarySum())
						|| (this.getPaidSalarySum() != null && castOther.getPaidSalarySum() != null
								&& this.getPaidSalarySum().equals(castOther.getPaidSalarySum())))
				&& ((this.getMajorChangeAmount() == castOther.getMajorChangeAmount())
						|| (this.getMajorChangeAmount() != null && castOther.getMajorChangeAmount() != null
								&& this.getMajorChangeAmount().equals(castOther.getMajorChangeAmount())))
				&& ((this.getBonusAmount() == castOther.getBonusAmount())
						|| (this.getBonusAmount() != null && castOther.getBonusAmount() != null
								&& this.getBonusAmount().equals(castOther.getBonusAmount())))
				&& ((this.getTrainingAmount() == castOther.getTrainingAmount())
						|| (this.getTrainingAmount() != null && castOther.getTrainingAmount() != null
								&& this.getTrainingAmount().equals(castOther.getTrainingAmount())))
				&& ((this.getFileChangAmount() == castOther.getFileChangAmount())
						|| (this.getFileChangAmount() != null && castOther.getFileChangAmount() != null
								&& this.getFileChangAmount().equals(castOther.getFileChangAmount())))
				&& ((this.getHumanHistroyRecords() == castOther.getHumanHistroyRecords())
						|| (this.getHumanHistroyRecords() != null && castOther.getHumanHistroyRecords() != null
								&& this.getHumanHistroyRecords().equals(castOther.getHumanHistroyRecords())))
				&& ((this.getHumanFamilyMembership() == castOther.getHumanFamilyMembership())
						|| (this.getHumanFamilyMembership() != null && castOther.getHumanFamilyMembership() != null
								&& this.getHumanFamilyMembership().equals(castOther.getHumanFamilyMembership())))
				&& ((this.getHumanPicture() == castOther.getHumanPicture())
						|| (this.getHumanPicture() != null && castOther.getHumanPicture() != null
								&& this.getHumanPicture().equals(castOther.getHumanPicture())))
				&& ((this.getAttachmentName() == castOther.getAttachmentName())
						|| (this.getAttachmentName() != null && castOther.getAttachmentName() != null
								&& this.getAttachmentName().equals(castOther.getAttachmentName())))
				&& ((this.getCheckStatus() == castOther.getCheckStatus())
						|| (this.getCheckStatus() != null && castOther.getCheckStatus() != null
								&& this.getCheckStatus().equals(castOther.getCheckStatus())))
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
				&& ((this.getLastlyChangeTime() == castOther.getLastlyChangeTime())
						|| (this.getLastlyChangeTime() != null && castOther.getLastlyChangeTime() != null
								&& this.getLastlyChangeTime().equals(castOther.getLastlyChangeTime())))
				&& ((this.getDeleteTime() == castOther.getDeleteTime()) || (this.getDeleteTime() != null
						&& castOther.getDeleteTime() != null && this.getDeleteTime().equals(castOther.getDeleteTime())))
				&& ((this.getRecoveryTime() == castOther.getRecoveryTime())
						|| (this.getRecoveryTime() != null && castOther.getRecoveryTime() != null
								&& this.getRecoveryTime().equals(castOther.getRecoveryTime())))
				&& ((this.getHumanFileStatus() == castOther.getHumanFileStatus())
						|| (this.getHumanFileStatus() != null && castOther.getHumanFileStatus() != null
								&& this.getHumanFileStatus().equals(castOther.getHumanFileStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHfdId() == null ? 0 : this.getHfdId().hashCode());
		result = 37 * result + (getHumanId() == null ? 0 : this.getHumanId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getThirdKindId() == null ? 0 : this.getThirdKindId().hashCode());
		result = 37 * result + (getThirdKindName() == null ? 0 : this.getThirdKindName().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getHumanAddress() == null ? 0 : this.getHumanAddress().hashCode());
		result = 37 * result + (getHumanPostcode() == null ? 0 : this.getHumanPostcode().hashCode());
		result = 37 * result + (getHumanProDesignation() == null ? 0 : this.getHumanProDesignation().hashCode());
		result = 37 * result + (getHumanMajorKindId() == null ? 0 : this.getHumanMajorKindId().hashCode());
		result = 37 * result + (getHumanMajorKindName() == null ? 0 : this.getHumanMajorKindName().hashCode());
		result = 37 * result + (getHumanMajorId() == null ? 0 : this.getHumanMajorId().hashCode());
		result = 37 * result + (getHunmaMajorName() == null ? 0 : this.getHunmaMajorName().hashCode());
		result = 37 * result + (getHumanTelephone() == null ? 0 : this.getHumanTelephone().hashCode());
		result = 37 * result + (getHumanMobilephone() == null ? 0 : this.getHumanMobilephone().hashCode());
		result = 37 * result + (getHumanBank() == null ? 0 : this.getHumanBank().hashCode());
		result = 37 * result + (getHumanAccount() == null ? 0 : this.getHumanAccount().hashCode());
		result = 37 * result + (getHumanQq() == null ? 0 : this.getHumanQq().hashCode());
		result = 37 * result + (getHumanEmail() == null ? 0 : this.getHumanEmail().hashCode());
		result = 37 * result + (getHumanHobby() == null ? 0 : this.getHumanHobby().hashCode());
		result = 37 * result + (getHumanSpeciality() == null ? 0 : this.getHumanSpeciality().hashCode());
		result = 37 * result + (getHumanSex() == null ? 0 : this.getHumanSex().hashCode());
		result = 37 * result + (getHumanReligion() == null ? 0 : this.getHumanReligion().hashCode());
		result = 37 * result + (getHumanParty() == null ? 0 : this.getHumanParty().hashCode());
		result = 37 * result + (getHumanNationality() == null ? 0 : this.getHumanNationality().hashCode());
		result = 37 * result + (getHumanRace() == null ? 0 : this.getHumanRace().hashCode());
		result = 37 * result + (getHumanBirthday() == null ? 0 : this.getHumanBirthday().hashCode());
		result = 37 * result + (getHumanBirthplace() == null ? 0 : this.getHumanBirthplace().hashCode());
		result = 37 * result + (getHumanAge() == null ? 0 : this.getHumanAge().hashCode());
		result = 37 * result + (getHumanEducatedDegree() == null ? 0 : this.getHumanEducatedDegree().hashCode());
		result = 37 * result + (getHumanEducatedYears() == null ? 0 : this.getHumanEducatedYears().hashCode());
		result = 37 * result + (getHumanEducatedMajor() == null ? 0 : this.getHumanEducatedMajor().hashCode());
		result = 37 * result + (getHumanSocietySecurityId() == null ? 0 : this.getHumanSocietySecurityId().hashCode());
		result = 37 * result + (getHumanIdCard() == null ? 0 : this.getHumanIdCard().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getSalaryStandardId() == null ? 0 : this.getSalaryStandardId().hashCode());
		result = 37 * result + (getSalaryStandardName() == null ? 0 : this.getSalaryStandardName().hashCode());
		result = 37 * result + (getSalarySum() == null ? 0 : this.getSalarySum().hashCode());
		result = 37 * result + (getDemandSalaraySum() == null ? 0 : this.getDemandSalaraySum().hashCode());
		result = 37 * result + (getPaidSalarySum() == null ? 0 : this.getPaidSalarySum().hashCode());
		result = 37 * result + (getMajorChangeAmount() == null ? 0 : this.getMajorChangeAmount().hashCode());
		result = 37 * result + (getBonusAmount() == null ? 0 : this.getBonusAmount().hashCode());
		result = 37 * result + (getTrainingAmount() == null ? 0 : this.getTrainingAmount().hashCode());
		result = 37 * result + (getFileChangAmount() == null ? 0 : this.getFileChangAmount().hashCode());
		result = 37 * result + (getHumanHistroyRecords() == null ? 0 : this.getHumanHistroyRecords().hashCode());
		result = 37 * result + (getHumanFamilyMembership() == null ? 0 : this.getHumanFamilyMembership().hashCode());
		result = 37 * result + (getHumanPicture() == null ? 0 : this.getHumanPicture().hashCode());
		result = 37 * result + (getAttachmentName() == null ? 0 : this.getAttachmentName().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getChanger() == null ? 0 : this.getChanger().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getChangeTime() == null ? 0 : this.getChangeTime().hashCode());
		result = 37 * result + (getLastlyChangeTime() == null ? 0 : this.getLastlyChangeTime().hashCode());
		result = 37 * result + (getDeleteTime() == null ? 0 : this.getDeleteTime().hashCode());
		result = 37 * result + (getRecoveryTime() == null ? 0 : this.getRecoveryTime().hashCode());
		result = 37 * result + (getHumanFileStatus() == null ? 0 : this.getHumanFileStatus().hashCode());
		return result;
	}

}