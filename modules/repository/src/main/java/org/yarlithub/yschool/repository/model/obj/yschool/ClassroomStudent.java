package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IClassroomStudent;


/** 
 * Object mapping for hibernate-handled table: classroom_student.
 * @author autogenerated
 */

@Entity
@Table(name = "classroom_student", catalog = "yschool", schema = "yschool")
public class ClassroomStudent implements Cloneable, Serializable, IPojoGenEntity, IClassroomStudent {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977436L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Classroom classroomIdclass;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Set<StudentClassroomSubject> studentClassroomSubjects = new HashSet<StudentClassroomSubject>();

	/** Field mapping. */
	private Student studentIdstudent;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public ClassroomStudent() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public ClassroomStudent(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param classroomIdclass Classroom object;
	 * @param id Integer object;
	 * @param studentIdstudent Student object;
	 */
	public ClassroomStudent(Classroom classroomIdclass, Integer id, Student studentIdstudent) {

		this.classroomIdclass = classroomIdclass;
		this.id = id;
		this.studentIdstudent = studentIdstudent;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return ClassroomStudent.class;
	}
 

    /**
     * Return the value associated with the column: classroomIdclass.
	 * @return A Classroom object (this.classroomIdclass)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "classroom_idclass", nullable = false )
	public Classroom getClassroomIdclass() {
		return this.classroomIdclass;
		
	}
	

  
    /**  
     * Set the value related to the column: classroomIdclass.
	 * @param classroomIdclass the classroomIdclass value you wish to set
	 */
	public void setClassroomIdclass(final Classroom classroomIdclass) {
		this.classroomIdclass = classroomIdclass;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idclassroom_student", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: studentClassroomSubject.
	 * @return A Set&lt;StudentClassroomSubject&gt; object (this.studentClassroomSubject)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "classroomStudentIdclassroomStudent"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "idclassroom_student", nullable = false  )
	public Set<StudentClassroomSubject> getStudentClassroomSubjects() {
		return this.studentClassroomSubjects;
		
	}
	
	/**
	 * Adds a bi-directional link of type StudentClassroomSubject to the studentClassroomSubjects set.
	 * @param studentClassroomSubject item to add
	 */
	public void addStudentClassroomSubject(StudentClassroomSubject studentClassroomSubject) {
		studentClassroomSubject.setClassroomStudentIdclassroomStudent(this);
		this.studentClassroomSubjects.add(studentClassroomSubject);
	}

  
    /**  
     * Set the value related to the column: studentClassroomSubject.
	 * @param studentClassroomSubject the studentClassroomSubject value you wish to set
	 */
	public void setStudentClassroomSubjects(final Set<StudentClassroomSubject> studentClassroomSubject) {
		this.studentClassroomSubjects = studentClassroomSubject;
	}

    /**
     * Return the value associated with the column: studentIdstudent.
	 * @return A Student object (this.studentIdstudent)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "student_idstudent", nullable = false )
	public Student getStudentIdstudent() {
		return this.studentIdstudent;
		
	}
	

  
    /**  
     * Set the value related to the column: studentIdstudent.
	 * @param studentIdstudent the studentIdstudent value you wish to set
	 */
	public void setStudentIdstudent(final Student studentIdstudent) {
		this.studentIdstudent = studentIdstudent;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public ClassroomStudent clone() throws CloneNotSupportedException {
		
        final ClassroomStudent copy = (ClassroomStudent)super.clone();

		copy.setClassroomIdclass(this.getClassroomIdclass());
		copy.setId(this.getId());
		if (this.getStudentClassroomSubjects() != null) {
			copy.getStudentClassroomSubjects().addAll(this.getStudentClassroomSubjects());
		}
		copy.setStudentIdstudent(this.getStudentIdstudent());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final ClassroomStudent that; 
		try {
			that = (ClassroomStudent) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getClassroomIdclass() == null) && (that.getClassroomIdclass() == null)) || (getClassroomIdclass() != null && getClassroomIdclass().getId().equals(that.getClassroomIdclass().getId())));	
		result = result && (((getStudentIdstudent() == null) && (that.getStudentIdstudent() == null)) || (getStudentIdstudent() != null && getStudentIdstudent().getId().equals(that.getStudentIdstudent().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
