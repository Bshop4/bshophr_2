package hr.pojo;

/**
 * UsersId entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Short uId;
	private String uName;
	private String uTrueName;
	private String uPassword;
	private String uMajorName;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(Short UId, String UName, String UTrueName, String UPassword, String UMajorName) {
		this.uId = UId;
		this.uName = UName;
		this.uTrueName = UTrueName;
		this.uPassword = UPassword;
		this.uMajorName = UMajorName;
	}

	// Property accessors

	public Short getUId() {
		return this.uId;
	}

	public void setUId(Short UId) {
		this.uId = UId;
	}

	public String getUName() {
		return this.uName;
	}

	public void setUName(String UName) {
		this.uName = UName;
	}

	public String getUTrueName() {
		return this.uTrueName;
	}

	public void setUTrueName(String UTrueName) {
		this.uTrueName = UTrueName;
	}

	public String getUPassword() {
		return this.uPassword;
	}

	public void setUPassword(String UPassword) {
		this.uPassword = UPassword;
	}

	public String getUMajorName() {
		return this.uMajorName;
	}

	public void setUMajorName(String UMajorName) {
		this.uMajorName = UMajorName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Users))
			return false;
		Users castOther = (Users) other;

		return ((this.getUId() == castOther.getUId())
				|| (this.getUId() != null && castOther.getUId() != null && this.getUId().equals(castOther.getUId())))
				&& ((this.getUName() == castOther.getUName()) || (this.getUName() != null
						&& castOther.getUName() != null && this.getUName().equals(castOther.getUName())))
				&& ((this.getUTrueName() == castOther.getUTrueName()) || (this.getUTrueName() != null
						&& castOther.getUTrueName() != null && this.getUTrueName().equals(castOther.getUTrueName())))
				&& ((this.getUPassword() == castOther.getUPassword()) || (this.getUPassword() != null
						&& castOther.getUPassword() != null && this.getUPassword().equals(castOther.getUPassword())))
				&& ((this.getUMajorName() == castOther.getUMajorName())
						|| (this.getUMajorName() != null && castOther.getUMajorName() != null
								&& this.getUMajorName().equals(castOther.getUMajorName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUId() == null ? 0 : this.getUId().hashCode());
		result = 37 * result + (getUName() == null ? 0 : this.getUName().hashCode());
		result = 37 * result + (getUTrueName() == null ? 0 : this.getUTrueName().hashCode());
		result = 37 * result + (getUPassword() == null ? 0 : this.getUPassword().hashCode());
		result = 37 * result + (getUMajorName() == null ? 0 : this.getUMajorName().hashCode());
		return result;
	}

}