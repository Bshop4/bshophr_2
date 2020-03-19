package hr.pojo;

/**
 * EngageSubjectsId entity. @author MyEclipse Persistence Tools
 */

public class EngageSubjects implements java.io.Serializable {

	// Fields

	private Short subId;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private String register;
	private String registTime;
	private String derivation;
	private String content;
	private String keyA;
	private String keyB;
	private String keyC;
	private String keyD;
	private String keyE;
	private String correctKey;
	private String changer;
	private String changeTime;

	// Constructors

	/** default constructor */
	public EngageSubjects() {
	}

	/** minimal constructor */
	public EngageSubjects(String registTime, String changeTime) {
		this.registTime = registTime;
		this.changeTime = changeTime;
	}

	/** full constructor */
	public EngageSubjects(Short subId, String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String register, String registTime, String derivation, String content, String keyA,
			String keyB, String keyC, String keyD, String keyE, String correctKey, String changer, String changeTime) {
		this.subId = subId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.register = register;
		this.registTime = registTime;
		this.derivation = derivation;
		this.content = content;
		this.keyA = keyA;
		this.keyB = keyB;
		this.keyC = keyC;
		this.keyD = keyD;
		this.keyE = keyE;
		this.correctKey = correctKey;
		this.changer = changer;
		this.changeTime = changeTime;
	}

	// Property accessors

	public Short getSubId() {
		return this.subId;
	}

	public void setSubId(Short subId) {
		this.subId = subId;
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

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}

	public String getDerivation() {
		return this.derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyA() {
		return this.keyA;
	}

	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

	public String getKeyB() {
		return this.keyB;
	}

	public void setKeyB(String keyB) {
		this.keyB = keyB;
	}

	public String getKeyC() {
		return this.keyC;
	}

	public void setKeyC(String keyC) {
		this.keyC = keyC;
	}

	public String getKeyD() {
		return this.keyD;
	}

	public void setKeyD(String keyD) {
		this.keyD = keyD;
	}

	public String getKeyE() {
		return this.keyE;
	}

	public void setKeyE(String keyE) {
		this.keyE = keyE;
	}

	public String getCorrectKey() {
		return this.correctKey;
	}

	public void setCorrectKey(String correctKey) {
		this.correctKey = correctKey;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public String getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageSubjects))
			return false;
		EngageSubjects castOther = (EngageSubjects) other;

		return ((this.getSubId() == castOther.getSubId()) || (this.getSubId() != null && castOther.getSubId() != null
				&& this.getSubId().equals(castOther.getSubId())))
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
				&& ((this.getRegister() == castOther.getRegister()) || (this.getRegister() != null
						&& castOther.getRegister() != null && this.getRegister().equals(castOther.getRegister())))
				&& ((this.getRegistTime() == castOther.getRegistTime()) || (this.getRegistTime() != null
						&& castOther.getRegistTime() != null && this.getRegistTime().equals(castOther.getRegistTime())))
				&& ((this.getDerivation() == castOther.getDerivation()) || (this.getDerivation() != null
						&& castOther.getDerivation() != null && this.getDerivation().equals(castOther.getDerivation())))
				&& ((this.getContent() == castOther.getContent()) || (this.getContent() != null
						&& castOther.getContent() != null && this.getContent().equals(castOther.getContent())))
				&& ((this.getKeyA() == castOther.getKeyA()) || (this.getKeyA() != null && castOther.getKeyA() != null
						&& this.getKeyA().equals(castOther.getKeyA())))
				&& ((this.getKeyB() == castOther.getKeyB()) || (this.getKeyB() != null && castOther.getKeyB() != null
						&& this.getKeyB().equals(castOther.getKeyB())))
				&& ((this.getKeyC() == castOther.getKeyC()) || (this.getKeyC() != null && castOther.getKeyC() != null
						&& this.getKeyC().equals(castOther.getKeyC())))
				&& ((this.getKeyD() == castOther.getKeyD()) || (this.getKeyD() != null && castOther.getKeyD() != null
						&& this.getKeyD().equals(castOther.getKeyD())))
				&& ((this.getKeyE() == castOther.getKeyE()) || (this.getKeyE() != null && castOther.getKeyE() != null
						&& this.getKeyE().equals(castOther.getKeyE())))
				&& ((this.getCorrectKey() == castOther.getCorrectKey()) || (this.getCorrectKey() != null
						&& castOther.getCorrectKey() != null && this.getCorrectKey().equals(castOther.getCorrectKey())))
				&& ((this.getChanger() == castOther.getChanger()) || (this.getChanger() != null
						&& castOther.getChanger() != null && this.getChanger().equals(castOther.getChanger())))
				&& ((this.getChangeTime() == castOther.getChangeTime())
						|| (this.getChangeTime() != null && castOther.getChangeTime() != null
								&& this.getChangeTime().equals(castOther.getChangeTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSubId() == null ? 0 : this.getSubId().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getRegister() == null ? 0 : this.getRegister().hashCode());
		result = 37 * result + (getRegistTime() == null ? 0 : this.getRegistTime().hashCode());
		result = 37 * result + (getDerivation() == null ? 0 : this.getDerivation().hashCode());
		result = 37 * result + (getContent() == null ? 0 : this.getContent().hashCode());
		result = 37 * result + (getKeyA() == null ? 0 : this.getKeyA().hashCode());
		result = 37 * result + (getKeyB() == null ? 0 : this.getKeyB().hashCode());
		result = 37 * result + (getKeyC() == null ? 0 : this.getKeyC().hashCode());
		result = 37 * result + (getKeyD() == null ? 0 : this.getKeyD().hashCode());
		result = 37 * result + (getKeyE() == null ? 0 : this.getKeyE().hashCode());
		result = 37 * result + (getCorrectKey() == null ? 0 : this.getCorrectKey().hashCode());
		result = 37 * result + (getChanger() == null ? 0 : this.getChanger().hashCode());
		result = 37 * result + (getChangeTime() == null ? 0 : this.getChangeTime().hashCode());
		return result;
	}

}