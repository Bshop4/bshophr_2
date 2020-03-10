package hr.mapper;

import java.sql.Timestamp;


/**
 * BonusId entity. @author MyEclipse Persistence Tools
 */

public class Bonus  implements java.io.Serializable {


    // Fields    

     private Short bonId;
     private String majorKindId;
     private String majorKindName;
     private String majorId;
     private String majorName;
     private String humanId;
     private String humanName;
     private String bonusItem;
     private Double bonusWorth;
     private String bonusDegree;
     private String remark;
     private String register;
     private String checker;
     private Timestamp registTime;
     private Timestamp checkTime;
     private Short checkStatus;


    // Constructors

    /** default constructor */
    public Bonus() {
    }

	/** minimal constructor */
    public Bonus(Timestamp registTime, Timestamp checkTime) {
        this.registTime = registTime;
        this.checkTime = checkTime;
    }
    
    /** full constructor */
    public Bonus(Short bonId, String majorKindId, String majorKindName, String majorId, String majorName, String humanId, String humanName, String bonusItem, Double bonusWorth, String bonusDegree, String remark, String register, String checker, Timestamp registTime, Timestamp checkTime, Short checkStatus) {
        this.bonId = bonId;
        this.majorKindId = majorKindId;
        this.majorKindName = majorKindName;
        this.majorId = majorId;
        this.majorName = majorName;
        this.humanId = humanId;
        this.humanName = humanName;
        this.bonusItem = bonusItem;
        this.bonusWorth = bonusWorth;
        this.bonusDegree = bonusDegree;
        this.remark = remark;
        this.register = register;
        this.checker = checker;
        this.registTime = registTime;
        this.checkTime = checkTime;
        this.checkStatus = checkStatus;
    }

   
    // Property accessors

    public Short getBonId() {
        return this.bonId;
    }
    
    public void setBonId(Short bonId) {
        this.bonId = bonId;
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

    public String getHumanId() {
        return this.humanId;
    }
    
    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return this.humanName;
    }
    
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getBonusItem() {
        return this.bonusItem;
    }
    
    public void setBonusItem(String bonusItem) {
        this.bonusItem = bonusItem;
    }

    public Double getBonusWorth() {
        return this.bonusWorth;
    }
    
    public void setBonusWorth(Double bonusWorth) {
        this.bonusWorth = bonusWorth;
    }

    public String getBonusDegree() {
        return this.bonusDegree;
    }
    
    public void setBonusDegree(String bonusDegree) {
        this.bonusDegree = bonusDegree;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
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

    public Short getCheckStatus() {
        return this.checkStatus;
    }
    
    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Bonus) ) return false;
		 Bonus castOther = ( Bonus ) other; 
         
		 return ( (this.getBonId()==castOther.getBonId()) || ( this.getBonId()!=null && castOther.getBonId()!=null && this.getBonId().equals(castOther.getBonId()) ) )
 && ( (this.getMajorKindId()==castOther.getMajorKindId()) || ( this.getMajorKindId()!=null && castOther.getMajorKindId()!=null && this.getMajorKindId().equals(castOther.getMajorKindId()) ) )
 && ( (this.getMajorKindName()==castOther.getMajorKindName()) || ( this.getMajorKindName()!=null && castOther.getMajorKindName()!=null && this.getMajorKindName().equals(castOther.getMajorKindName()) ) )
 && ( (this.getMajorId()==castOther.getMajorId()) || ( this.getMajorId()!=null && castOther.getMajorId()!=null && this.getMajorId().equals(castOther.getMajorId()) ) )
 && ( (this.getMajorName()==castOther.getMajorName()) || ( this.getMajorName()!=null && castOther.getMajorName()!=null && this.getMajorName().equals(castOther.getMajorName()) ) )
 && ( (this.getHumanId()==castOther.getHumanId()) || ( this.getHumanId()!=null && castOther.getHumanId()!=null && this.getHumanId().equals(castOther.getHumanId()) ) )
 && ( (this.getHumanName()==castOther.getHumanName()) || ( this.getHumanName()!=null && castOther.getHumanName()!=null && this.getHumanName().equals(castOther.getHumanName()) ) )
 && ( (this.getBonusItem()==castOther.getBonusItem()) || ( this.getBonusItem()!=null && castOther.getBonusItem()!=null && this.getBonusItem().equals(castOther.getBonusItem()) ) )
 && ( (this.getBonusWorth()==castOther.getBonusWorth()) || ( this.getBonusWorth()!=null && castOther.getBonusWorth()!=null && this.getBonusWorth().equals(castOther.getBonusWorth()) ) )
 && ( (this.getBonusDegree()==castOther.getBonusDegree()) || ( this.getBonusDegree()!=null && castOther.getBonusDegree()!=null && this.getBonusDegree().equals(castOther.getBonusDegree()) ) )
 && ( (this.getRemark()==castOther.getRemark()) || ( this.getRemark()!=null && castOther.getRemark()!=null && this.getRemark().equals(castOther.getRemark()) ) )
 && ( (this.getRegister()==castOther.getRegister()) || ( this.getRegister()!=null && castOther.getRegister()!=null && this.getRegister().equals(castOther.getRegister()) ) )
 && ( (this.getChecker()==castOther.getChecker()) || ( this.getChecker()!=null && castOther.getChecker()!=null && this.getChecker().equals(castOther.getChecker()) ) )
 && ( (this.getRegistTime()==castOther.getRegistTime()) || ( this.getRegistTime()!=null && castOther.getRegistTime()!=null && this.getRegistTime().equals(castOther.getRegistTime()) ) )
 && ( (this.getCheckTime()==castOther.getCheckTime()) || ( this.getCheckTime()!=null && castOther.getCheckTime()!=null && this.getCheckTime().equals(castOther.getCheckTime()) ) )
 && ( (this.getCheckStatus()==castOther.getCheckStatus()) || ( this.getCheckStatus()!=null && castOther.getCheckStatus()!=null && this.getCheckStatus().equals(castOther.getCheckStatus()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBonId() == null ? 0 : this.getBonId().hashCode() );
         result = 37 * result + ( getMajorKindId() == null ? 0 : this.getMajorKindId().hashCode() );
         result = 37 * result + ( getMajorKindName() == null ? 0 : this.getMajorKindName().hashCode() );
         result = 37 * result + ( getMajorId() == null ? 0 : this.getMajorId().hashCode() );
         result = 37 * result + ( getMajorName() == null ? 0 : this.getMajorName().hashCode() );
         result = 37 * result + ( getHumanId() == null ? 0 : this.getHumanId().hashCode() );
         result = 37 * result + ( getHumanName() == null ? 0 : this.getHumanName().hashCode() );
         result = 37 * result + ( getBonusItem() == null ? 0 : this.getBonusItem().hashCode() );
         result = 37 * result + ( getBonusWorth() == null ? 0 : this.getBonusWorth().hashCode() );
         result = 37 * result + ( getBonusDegree() == null ? 0 : this.getBonusDegree().hashCode() );
         result = 37 * result + ( getRemark() == null ? 0 : this.getRemark().hashCode() );
         result = 37 * result + ( getRegister() == null ? 0 : this.getRegister().hashCode() );
         result = 37 * result + ( getChecker() == null ? 0 : this.getChecker().hashCode() );
         result = 37 * result + ( getRegistTime() == null ? 0 : this.getRegistTime().hashCode() );
         result = 37 * result + ( getCheckTime() == null ? 0 : this.getCheckTime().hashCode() );
         result = 37 * result + ( getCheckStatus() == null ? 0 : this.getCheckStatus().hashCode() );
         return result;
   }   





}