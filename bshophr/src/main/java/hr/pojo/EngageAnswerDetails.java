package hr.pojo;

/**
 * EngageAnswerDetailsId entity. @author MyEclipse Persistence Tools
 */

public class EngageAnswerDetails implements java.io.Serializable {

	// Fields

	private Short andId;
	private String answerNumber;
	private Short subjectId;
	private String answer;

	// Constructors

	/** default constructor */
	public EngageAnswerDetails() {
	}

	/** full constructor */
	public EngageAnswerDetails(Short andId, String answerNumber, Short subjectId, String answer) {
		this.andId = andId;
		this.answerNumber = answerNumber;
		this.subjectId = subjectId;
		this.answer = answer;
	}

	// Property accessors

	public Short getAndId() {
		return this.andId;
	}

	public void setAndId(Short andId) {
		this.andId = andId;
	}

	public String getAnswerNumber() {
		return this.answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public Short getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Short subjectId) {
		this.subjectId = subjectId;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EngageAnswerDetails))
			return false;
		EngageAnswerDetails castOther = (EngageAnswerDetails) other;

		return ((this.getAndId() == castOther.getAndId()) || (this.getAndId() != null && castOther.getAndId() != null
				&& this.getAndId().equals(castOther.getAndId())))
				&& ((this.getAnswerNumber() == castOther.getAnswerNumber())
						|| (this.getAnswerNumber() != null && castOther.getAnswerNumber() != null
								&& this.getAnswerNumber().equals(castOther.getAnswerNumber())))
				&& ((this.getSubjectId() == castOther.getSubjectId()) || (this.getSubjectId() != null
						&& castOther.getSubjectId() != null && this.getSubjectId().equals(castOther.getSubjectId())))
				&& ((this.getAnswer() == castOther.getAnswer()) || (this.getAnswer() != null
						&& castOther.getAnswer() != null && this.getAnswer().equals(castOther.getAnswer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAndId() == null ? 0 : this.getAndId().hashCode());
		result = 37 * result + (getAnswerNumber() == null ? 0 : this.getAnswerNumber().hashCode());
		result = 37 * result + (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		result = 37 * result + (getAnswer() == null ? 0 : this.getAnswer().hashCode());
		return result;
	}

}