package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.ISchoolHasStaffHasRole;


/** 
 * Object mapping for hibernate-handled table: school_has_staff_has_role.
 * @author autogenerated
 */

@Entity
@Table(name = "school_has_staff_has_role", catalog = "yschool", schema = "yschool")
public class SchoolHasStaffHasRole implements Cloneable, Serializable, IPojoGenEntity, ISchoolHasStaffHasRole {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977424L;

	

	/** Field mapping. */
	@Id 
	private SchoolHasStaffHasRolePK id;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public SchoolHasStaffHasRole() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public SchoolHasStaffHasRole(SchoolHasStaffHasRolePK id) {
		this.id = id;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return SchoolHasStaffHasRole.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A SchoolHasStaffHasRolePK object (this.id)
	 */
	public SchoolHasStaffHasRolePK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final SchoolHasStaffHasRolePK id) {
		this.id = id;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public SchoolHasStaffHasRole clone() throws CloneNotSupportedException {
		
        final SchoolHasStaffHasRole copy = (SchoolHasStaffHasRole)super.clone();

		copy.setId(this.getId());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final SchoolHasStaffHasRole that = (SchoolHasStaffHasRole) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}
