package hr.pojo;

import java.sql.Timestamp;

/**
 * EngageResumeId entity. @author MyEclipse Persistence Tools
 */

public class EngageResume implements java.io.Serializable {

	// Fields

	private Short resId;
	private String humanName;
	private String engageType;
	private String humanAddress;
	private String humanPostcode;
	private String humanMajorKindId;
	private String humanMajorKindName;
	private String humanMajorId;
	private String humanMajorName;
	private String humanTelephone;
	private String humanHomephone;
	private String humanMobilephone;
	private String humanEmail;
	private String humanHobby;
	private String humanSpecility;
	private String humanSex;
	private String humanReligion;
	private String humanParty;
	private String humanNationality;
	private String humanRace;
	private Timestamp humanBirthday;
	private Short humanAge;
	private String humanEducatedDegree;
	private Short humanEducatedYears;
	private String humanEducatedMajor;
	private String humanCollege;
	private String humanIdcard;
	private String humanBirthplace;
	private Double demandSalaryStandard;
	private String humanHistoryRecords;
	private String remark;
	private String recomandation;
	private String humanPicture;
	private String attachmentName;
	private Short checkStatus;
	private String register;
	private Timestamp registTime;
	private String checker;
	private Timestamp checkTime;
	private Short interviewStatus;
	private Double totalPoints;
	private Short testAmount;
	private String testChecker;
	private Timestamp testCheckTime;
	private String passRegister;
	private Timestamp passRegistTime;
	private String passChecker;
	private Timestamp passCheckTime;
	private Short passCheckStatus;
	private String passCheckComment;
	private String passPassComment;

	// Constructors

	/** default constructor */
	public EngageResume() {
	}

	/** minimal constructor */
	public EngageResume(Timestamp humanBirthday, Timestamp registTime, Timestamp checkTime, Timestamp testCheckTime,
			Timestamp passRegistTime, Timestamp passCheckTime) {
		this.humanBirthday = humanBirthday;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.testCheckTime = testCheckTime;
		this.passRegistTime = passRegistTime;
		this.passCheckTime = passCheckTime;
	}

	/** full constructor */
	public EngageResume(Short resId, String humanName, String engageType, String humanAddress, String humanPostcode,
			String humanMajorKindId, String humanMajorKindName, String humanMajorId, String humanMajorName,
			String humanTelephone, String humanHomephone, String humanMobilephone, String humanEmail, String humanHobby,
			String humanSpecility, String humanSex, String humanReligion, String humanParty, String humanNationality,
			String humanRace, Timestamp humanBirthday, Short humanAge, String humanEducatedDegree,
			Short humanEducatedYears, String humanEducatedMajor, String humanCollege, String humanIdcard,
			String humanBirthplace, Double demandSalaryStandard, String humanHistoryRecords, String remark,
			String recomandation, String humanPicture, String attachmentName, Short checkStatus, String register,
			Timestamp registTime, String checker, Timestamp checkTime, Short interviewStatus, Double totalPoints,
			Short testAmount, String testChecker, Timestamp testCheckTime, String passRegister,
			Timestamp passRegistTime, String passChecker, Timestamp passCheckTime, Short passCheckStatus,
			String passCheckComment, String passPassComment) {
		this.resId = resId;
		this.humanName = humanName;
		this.engageType = engageType;
		this.humanAddress = humanAddress;
		this.humanPostcode = humanPostcode;
		this.humanMajorKindId = humanMajorKindId;
		this.humanMajorKindName = humanMajorKindName;
		this.humanMajorId = humanMajorId;
		this.humanMajorName = humanMajorName;
		this.humanTelephone = humanTelephone;
		this.humanHomephone = humanHomephone;
		this.humanMobilephone = humanMobilephone;
		this.humanEmail = humanEmail;
		this.humanHobby = humanHobby;
		this.humanSpecility = humanSpecility;
		this.humanSex = humanSex;
		this.humanReligion = humanReligion;
		this.humanParty = humanParty;
		this.humanNationality = humanNationality;
		this.humanRace = humanRace;
		this.humanBirthday = humanBirthday;
		this.humanAge = humanAge;
		this.humanEducatedDegree = humanEducatedDegree;
		this.humanEducatedYears = humanEducatedYears;
		this.humanEducatedMajor = humanEducatedMajor;
		this.humanCollege = humanCollege;
		this.humanIdcard = humanIdcard;
		this.humanBirthplace = humanBirthplace;
		this.demandSalaryStandard = demandSalaryStandard;
		this.humanHistoryRecords = humanHistoryRecords;
		this.remark = remark;
		this.recomandation = recomandation;
		this.humanPicture = humanPicture;
		this.attachmentName = attachmentName;
		this.checkStatus = checkStatus;
		this.register = register;
		this.registTime = registTime;
		this.checker = checker;
		this.checkTime = checkTime;
		this.interviewStatus = interviewStatus;
		this.totalPoints = totalPoints;
		this.testAmount = testAmount;
		this.testChecker = testChecker;
		this.testCheckTime = testCheckTime;
		this.passRegister = passRegister;
		this.passRegistTime = passRegistTime;
		this.passChecker = passChecker;
		this.passCheckTime = passCheckTime;
		this.passCheckStatus = passCheckStatus;
		this.passCheckComment = passCheckComment;
		this.passPassComment = passPassComment;
	}

	// Property accessors

	public Short getResId() {
		return this.resId;
	}

	public void setResId(Short resId) {
		this.resId = resId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getEngageType() {
		return this.engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
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

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHumanHomephone() {
		return this.humanHomephone;
	}

	public void setHumanHomephone(String humanHomephone) {
		this.humanHomephone = humanHomephone;
	}

	public String getHumanMobilephone() {
		return this.humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
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

	public String getHumanSpecility() {
		return this.humanSpecility;
	}

	public void setHumanSpecility(String humanSpecility) {
		this.humanSpecility = humanSpecility;
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

	public String getHumanCollege() {
		return this.humanCollege;
	}

	public void setHumanCollege(String humanCollege) {
		this.humanCollege = humanCollege;
	}

	public String getHumanIdcard() {
		return this.humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
	}

	public String getHumanBirthplace() {
		return this.humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public Double getDemandSalaryStandard() {
		return this.demandSalaryStandard;
	}

	public void setDemandSalaryStandard(Double demandSalaryStandard) {
		this.demandSalaryStandard = demandSalaryStandard;
	}

	public String getHumanHistoryRecords() {
		return this.humanHistoryRecords;
	}

	public void setHumanHistoryRecords(String humanHistoryRecords) {
		this.humanHistoryRecords = humanHistoryRecords;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRecomandation() {
		return this.recomandation;
	}

	public void setRecomandation(String recomandation) {
		this.recomandation = recomandation;
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

	public Short getInterviewStatus() {
		return this.interviewStatus;
	}

	public void setInterviewStatus(Short interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public Double getTotalPoints() {
		return this.totalPoints;
	}

	public void setTotalPoints(Double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Short getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(Short testAmount) {
		this.testAmount = testAmount;
	}

	public String getTestChecker() {
		return this.testChecker;
	}

	public void setTestChecker(String testChecker) {
		this.testChecker = testChecker;
	}

	public Timestamp getTestCheckTime() {
		return this.testCheckTime;
	}

	public void setTestCheckTime(Timestamp testCheckTime) {
		this.testCheckTime = testCheckTime;
	}

	public String getPassRegister() {
		return this.passRegister;
	}

	public void setPassRegister(String passRegister) {
		this.passRegister = passRegister;
	}

	public Timestamp getPassRegistTime() {
		return this.passRegistTime;
	}

	public void setPassRegistTime(Timestamp passRegistTime) {
		this.passRegistTime = passRegistTime;
	}

	public String getPassChecker() {
		return this.passChecker;
	}

	public void setPassChecker(String passChecker) {
		this.passChecker = passChecker;
	}

	public Timestamp getPassCheckTime() {
		return this.passCheckTime;
	}

	public void setPassCheckTime(Timestamp passCheckTime) {
		this.passCheckTime = passCheckTime;
	}

	public Short getPassCheckStatus() {
		return this.passCheckStatus;
	}

	public void setPassCheckStatus(Short passCheckStatus) {
		this.passCheckStatus = passCheckStatus;
	}

	public String getPassCheckComment() {
		return this.passCheckComment;
	}

	public void setPassCheckComment(String passCheckComment) {
		this.passCheckComment = passCheckComment;
	}

	public String getPassPassComment() {
		return this.passPassComment;
	}

	public void setPassPassComment(String passPassComment) {
		this.passPassComment = passPassComment;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageResume))
			return false;
		EngageResume castOther = (EngageResume) other;

		return ((this.getResId() == castOther.getResId()) || (this.getResId() != null && castOther.getResId() != null
				&& this.getResId().equals(castOther.getResId())))
				&& ((this.getHumanName() == castOther.getHumanName()) || (this.getHumanName() != null
						&& castOther.getHumanName() != null && this.getHumanName().equals(castOther.getHumanName())))
				&& ((this.getEngageType() == castOther.getEngageType()) || (this.getEngageType() != null
						&& castOther.getEngageType() != null && this.getEngageType().equals(castOther.getEngageType())))
				&& ((this.getHumanAddress() == castOther.getHumanAddress())
						|| (this.getHumanAddress() != null && castOther.getHumanAddress() != null
								&& this.getHumanAddress().equals(castOther.getHumanAddress())))
				&& ((this.getHumanPostcode() == castOther.getHumanPostcode())
						|| (this.getHumanPostcode() != null && castOther.getHumanPostcode() != null
								&& this.getHumanPostcode().equals(castOther.getHumanPostcode())))
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
				&& ((this.getHumanTelephone() == castOther.getHumanTelephone())
						|| (this.getHumanTelephone() != null && castOther.getHumanTelephone() != null
								&& this.getHumanTelephone().equals(castOther.getHumanTelephone())))
				&& ((this.getHumanHomephone() == castOther.getHumanHomephone())
						|| (this.getHumanHomephone() != null && castOther.getHumanHomephone() != null
								&& this.getHumanHomephone().equals(castOther.getHumanHomephone())))
				&& ((this.getHumanMobilephone() == castOther.getHumanMobilephone())
						|| (this.getHumanMobilephone() != null && castOther.getHumanMobilephone() != null
								&& this.getHumanMobilephone().equals(castOther.getHumanMobilephone())))
				&& ((this.getHumanEmail() == castOther.getHumanEmail()) || (this.getHumanEmail() != null
						&& castOther.getHumanEmail() != null && this.getHumanEmail().equals(castOther.getHumanEmail())))
				&& ((this.getHumanHobby() == castOther.getHumanHobby()) || (this.getHumanHobby() != null
						&& castOther.getHumanHobby() != null && this.getHumanHobby().equals(castOther.getHumanHobby())))
				&& ((this.getHumanSpecility() == castOther.getHumanSpecility())
						|| (this.getHumanSpecility() != null && castOther.getHumanSpecility() != null
								&& this.getHumanSpecility().equals(castOther.getHumanSpecility())))
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
				&& ((this.getHumanCollege() == castOther.getHumanCollege())
						|| (this.getHumanCollege() != null && castOther.getHumanCollege() != null
								&& this.getHumanCollege().equals(castOther.getHumanCollege())))
				&& ((this.getHumanIdcard() == castOther.getHumanIdcard())
						|| (this.getHumanIdcard() != null && castOther.getHumanIdcard() != null
								&& this.getHumanIdcard().equals(castOther.getHumanIdcard())))
				&& ((this.getHumanBirthplace() == castOther.getHumanBirthplace())
						|| (this.getHumanBirthplace() != null && castOther.getHumanBirthplace() != null
								&& this.getHumanBirthplace().equals(castOther.getHumanBirthplace())))
				&& ((this.getDemandSalaryStandard() == castOther.getDemandSalaryStandard())
						|| (this.getDemandSalaryStandard() != null && castOther.getDemandSalaryStandard() != null
								&& this.getDemandSalaryStandard().equals(castOther.getDemandSalaryStandard())))
				&& ((this.getHumanHistoryRecords() == castOther.getHumanHistoryRecords())
						|| (this.getHumanHistoryRecords() != null && castOther.getHumanHistoryRecords() != null
								&& this.getHumanHistoryRecords().equals(castOther.getHumanHistoryRecords())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getRecomandation() == castOther.getRecomandation())
						|| (this.getRecomandation() != null && castOther.getRecomandation() != null
								&& this.getRecomandation().equals(castOther.getRecomandation())))
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
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getChecker() == castOther.getChecker()) || (this.getChecker() != null
						&& castOther.getChecker() != null && this.getChecker().equals(castOther.getChecker())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this.getCheckTime() != null
						&& castOther.getCheckTime() != null && this.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getInterviewStatus() == castOther.getInterviewStatus())
						|| (this.getInterviewStatus() != null && castOther.getInterviewStatus() != null
								&& this.getInterviewStatus().equals(castOther.getInterviewStatus())))
				&& ((this.getTotalPoints() == castOther.getTotalPoints())
						|| (this.getTotalPoints() != null && castOther.getTotalPoints() != null
								&& this.getTotalPoints().equals(castOther.getTotalPoints())))
				&& ((this.getTestAmount() == castOther.getTestAmount()) || (this.getTestAmount() != null
						&& castOther.getTestAmount() != null && this.getTestAmount().equals(castOther.getTestAmount())))
				&& ((this.getTestChecker() == castOther.getTestChecker())
						|| (this.getTestChecker() != null && castOther.getTestChecker() != null
								&& this.getTestChecker().equals(castOther.getTestChecker())))
				&& ((this.getTestCheckTime() == castOther.getTestCheckTime())
						|| (this.getTestCheckTime() != null && castOther.getTestCheckTime() != null
								&& this.getTestCheckTime().equals(castOther.getTestCheckTime())))
				&& ((this.getPassRegister() == castOther.getPassRegister())
						|| (this.getPassRegister() != null && castOther.getPassRegister() != null
								&& this.getPassRegister().equals(castOther.getPassRegister())))
				&& ((this.getPassRegistTime() == castOther.getPassRegistTime())
						|| (this.getPassRegistTime() != null && castOther.getPassRegistTime() != null
								&& this.getPassRegistTime().equals(castOther.getPassRegistTime())))
				&& ((this.getPassChecker() == castOther.getPassChecker())
						|| (this.getPassChecker() != null && castOther.getPassChecker() != null
								&& this.getPassChecker().equals(castOther.getPassChecker())))
				&& ((this.getPassCheckTime() == castOther.getPassCheckTime())
						|| (this.getPassCheckTime() != null && castOther.getPassCheckTime() != null
								&& this.getPassCheckTime().equals(castOther.getPassCheckTime())))
				&& ((this.getPassCheckStatus() == castOther.getPassCheckStatus())
						|| (this.getPassCheckStatus() != null && castOther.getPassCheckStatus() != null
								&& this.getPassCheckStatus().equals(castOther.getPassCheckStatus())))
				&& ((this.getPassCheckComment() == castOther.getPassCheckComment())
						|| (this.getPassCheckComment() != null && castOther.getPassCheckComment() != null
								&& this.getPassCheckComment().equals(castOther.getPassCheckComment())))
				&& ((this.getPassPassComment() == castOther.getPassPassComment())
						|| (this.getPassPassComment() != null && castOther.getPassPassComment() != null
								&& this.getPassPassComment().equals(castOther.getPassPassComment())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getResId() == null ? 0 : this.getResId().hashCode());
		result = 37 * result + (getHumanName() == null ? 0 : this.getHumanName().hashCode());
		result = 37 * result + (getEngageType() == null ? 0 : this.getEngageType().hashCode());
		result = 37 * result + (getHumanAddress() == null ? 0 : this.getHumanAddress().hashCode());
		result = 37 * result + (getHumanPostcode() == null ? 0 : this.getHumanPostcode().hashCode());
		result = 37 * result + (getHumanMajorKindId() == null ? 0 : this.getHumanMajorKindId().hashCode());
		result = 37 * result + (getHumanMajorKindName() == null ? 0 : this.getHumanMajorKindName().hashCode());
		result = 37 * result + (getHumanMajorId() == null ? 0 : this.getHumanMajorId().hashCode());
		result = 37 * result + (getHumanMajorName() == null ? 0 : this.getHumanMajorName().hashCode());
		result = 37 * result + (getHumanTelephone() == null ? 0 : this.getHumanTelephone().hashCode());
		result = 37 * result + (getHumanHomephone() == null ? 0 : this.getHumanHomephone().hashCode());
		result = 37 * result + (getHumanMobilephone() == null ? 0 : this.getHumanMobilephone().hashCode());
		result = 37 * result + (getHumanEmail() == null ? 0 : this.getHumanEmail().hashCode());
		result = 37 * result + (getHumanHobby() == null ? 0 : this.getHumanHobby().hashCode());
		result = 37 * result + (getHumanSpecility() == null ? 0 : this.getHumanSpecility().hashCode());
		result = 37 * result + (getHumanSex() == null ? 0 : this.getHumanSex().hashCode());
		result = 37 * result + (getHumanReligion() == null ? 0 : this.getHumanReligion().hashCode());
		result = 37 * result + (getHumanParty() == null ? 0 : this.getHumanParty().hashCode());
		result = 37 * result + (getHumanNationality() == null ? 0 : this.getHumanNationality().hashCode());
		result = 37 * result + (getHumanRace() == null ? 0 : this.getHumanRace().hashCode());
		result = 37 * result + (getHumanBirthday() == null ? 0 : this.getHumanBirthday().hashCode());
		result = 37 * result + (getHumanAge() == null ? 0 : this.getHumanAge().hashCode());
		result = 37 * result + (getHumanEducatedDegree() == null ? 0 : this.getHumanEducatedDegree().hashCode());
		result = 37 * result + (getHumanEducatedYears() == null ? 0 : this.getHumanEducatedYears().hashCode());
		result = 37 * result + (getHumanEducatedMajor() == null ? 0 : this.getHumanEducatedMajor().hashCode());
		result = 37 * result + (getHumanCollege() == null ? 0 : this.getHumanCollege().hashCode());
		result = 37 * result + (getHumanIdcard() == null ? 0 : this.getHumanIdcard().hashCode());
		result = 37 * result + (getHumanBirthplace() == null ? 0 : this.getHumanBirthplace().hashCode());
		result = 37 * result + (getDemandSalaryStandard() == null ? 0 : this.getDemandSalaryStandard().hashCode());
		result = 37 * result + (getHumanHistoryRecords() == null ? 0 : this.getHumanHistoryRecords().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getRecomandation() == null ? 0 : this.getRecomandation().hashCode());
		result = 37 * result + (getHumanPicture() == null ? 0 : this.getHumanPicture().hashCode());
		result = 37 * result + (getAttachmentName() == null ? 0 : this.getAttachmentName().hashCode());
		result = 37 * result + (getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getChecker() == null ? 0 : this.getChecker().hashCode());
		result = 37 * result + (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result + (getInterviewStatus() == null ? 0 : this.getInterviewStatus().hashCode());
		result = 37 * result + (getTotalPoints() == null ? 0 : this.getTotalPoints().hashCode());
		result = 37 * result + (getTestAmount() == null ? 0 : this.getTestAmount().hashCode());
		result = 37 * result + (getTestChecker() == null ? 0 : this.getTestChecker().hashCode());
		result = 37 * result + (getTestCheckTime() == null ? 0 : this.getTestCheckTime().hashCode());
		result = 37 * result + (getPassRegister() == null ? 0 : this.getPassRegister().hashCode());
		result = 37 * result + (getPassRegistTime() == null ? 0 : this.getPassRegistTime().hashCode());
		result = 37 * result + (getPassChecker() == null ? 0 : this.getPassChecker().hashCode());
		result = 37 * result + (getPassCheckTime() == null ? 0 : this.getPassCheckTime().hashCode());
		result = 37 * result + (getPassCheckStatus() == null ? 0 : this.getPassCheckStatus().hashCode());
		result = 37 * result + (getPassCheckComment() == null ? 0 : this.getPassCheckComment().hashCode());
		result = 37 * result + (getPassPassComment() == null ? 0 : this.getPassPassComment().hashCode());
		return result;
	}

}