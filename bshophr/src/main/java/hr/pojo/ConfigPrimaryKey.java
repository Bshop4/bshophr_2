package hr.pojo;

/**
 * ConfigPrimaryKeyId entity. @author MyEclipse Persistence Tools
 */

public class ConfigPrimaryKey implements java.io.Serializable {

	// Fields

	private Short prkId;
	private String primaryKeyTable;
	private String primaryKey;
	private String keyName;
	private Short primaryKeyStatus;

	// Constructors

	/** default constructor */
	public ConfigPrimaryKey() {
	}

	/** full constructor */
	public ConfigPrimaryKey(Short prkId, String primaryKeyTable, String primaryKey, String keyName,
			Short primaryKeyStatus) {
		this.prkId = prkId;
		this.primaryKeyTable = primaryKeyTable;
		this.primaryKey = primaryKey;
		this.keyName = keyName;
		this.primaryKeyStatus = primaryKeyStatus;
	}

	// Property accessors

	public Short getPrkId() {
		return this.prkId;
	}

	public void setPrkId(Short prkId) {
		this.prkId = prkId;
	}

	public String getPrimaryKeyTable() {
		return this.primaryKeyTable;
	}

	public void setPrimaryKeyTable(String primaryKeyTable) {
		this.primaryKeyTable = primaryKeyTable;
	}

	public String getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Short getPrimaryKeyStatus() {
		return this.primaryKeyStatus;
	}

	public void setPrimaryKeyStatus(Short primaryKeyStatus) {
		this.primaryKeyStatus = primaryKeyStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ConfigPrimaryKey))
			return false;
		ConfigPrimaryKey castOther = (ConfigPrimaryKey) other;

		return ((this.getPrkId() == castOther.getPrkId()) || (this.getPrkId() != null && castOther.getPrkId() != null
				&& this.getPrkId().equals(castOther.getPrkId())))
				&& ((this.getPrimaryKeyTable() == castOther.getPrimaryKeyTable())
						|| (this.getPrimaryKeyTable() != null && castOther.getPrimaryKeyTable() != null
								&& this.getPrimaryKeyTable().equals(castOther.getPrimaryKeyTable())))
				&& ((this.getPrimaryKey() == castOther.getPrimaryKey()) || (this.getPrimaryKey() != null
						&& castOther.getPrimaryKey() != null && this.getPrimaryKey().equals(castOther.getPrimaryKey())))
				&& ((this.getKeyName() == castOther.getKeyName()) || (this.getKeyName() != null
						&& castOther.getKeyName() != null && this.getKeyName().equals(castOther.getKeyName())))
				&& ((this.getPrimaryKeyStatus() == castOther.getPrimaryKeyStatus())
						|| (this.getPrimaryKeyStatus() != null && castOther.getPrimaryKeyStatus() != null
								&& this.getPrimaryKeyStatus().equals(castOther.getPrimaryKeyStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPrkId() == null ? 0 : this.getPrkId().hashCode());
		result = 37 * result + (getPrimaryKeyTable() == null ? 0 : this.getPrimaryKeyTable().hashCode());
		result = 37 * result + (getPrimaryKey() == null ? 0 : this.getPrimaryKey().hashCode());
		result = 37 * result + (getKeyName() == null ? 0 : this.getKeyName().hashCode());
		result = 37 * result + (getPrimaryKeyStatus() == null ? 0 : this.getPrimaryKeyStatus().hashCode());
		return result;
	}

}