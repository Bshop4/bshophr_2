package hr.pojo;

/**
 * EngageExamDetailsId entity. @author MyEclipse Persistence Tools
 */

public class EngageExamDetails implements java.io.Serializable {

	// Fields

	private Short exdId;
	private String examNumber;
	private String firstKindId;
	private String firstKindName;
	private String secondKindId;
	private String secondKindName;
	private Short questionAmount;

	// Constructors

	/** default constructor */
	public EngageExamDetails() {
	}

	/** full constructor */
	public EngageExamDetails(Short exdId, String examNumber, String firstKindId, String firstKindName,
			String secondKindId, String secondKindName, Short questionAmount) {
		this.exdId = exdId;
		this.examNumber = examNumber;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.questionAmount = questionAmount;
	}

	// Property accessors

	public Short getExdId() {
		return this.exdId;
	}

	public void setExdId(Short exdId) {
		this.exdId = exdId;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
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

	public Short getQuestionAmount() {
		return this.questionAmount;
	}

	public void setQuestionAmount(Short questionAmount) {
		this.questionAmount = questionAmount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageExamDetails))
			return false;
		EngageExamDetails castOther = (EngageExamDetails) other;

		return ((this.getExdId() == castOther.getExdId()) || (this.getExdId() != null && castOther.getExdId() != null
				&& this.getExdId().equals(castOther.getExdId())))
				&& ((this.getExamNumber() == castOther.getExamNumber()) || (this.getExamNumber() != null
						&& castOther.getExamNumber() != null && this.getExamNumber().equals(castOther.getExamNumber())))
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
				&& ((this.getQuestionAmount() == castOther.getQuestionAmount())
						|| (this.getQuestionAmount() != null && castOther.getQuestionAmount() != null
								&& this.getQuestionAmount().equals(castOther.getQuestionAmount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getExdId() == null ? 0 : this.getExdId().hashCode());
		result = 37 * result + (getExamNumber() == null ? 0 : this.getExamNumber().hashCode());
		result = 37 * result + (getFirstKindId() == null ? 0 : this.getFirstKindId().hashCode());
		result = 37 * result + (getFirstKindName() == null ? 0 : this.getFirstKindName().hashCode());
		result = 37 * result + (getSecondKindId() == null ? 0 : this.getSecondKindId().hashCode());
		result = 37 * result + (getSecondKindName() == null ? 0 : this.getSecondKindName().hashCode());
		result = 37 * result + (getQuestionAmount() == null ? 0 : this.getQuestionAmount().hashCode());
		return result;
	}

}