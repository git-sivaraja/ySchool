package org.yarlithub.yschool.repository.factories.yschool;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.BeanNameAware;

import org.yarlithub.yschool.repository.model.dao.yschool.*;

/** 
 * DAO factory implementation.
 * @author autogenerated
 */
@Component
public class HibernateYschoolDaoFactory implements ApplicationContextAware, BeanNameAware {
	/** Placeholder for an instance. */
	private static HibernateYschoolDaoFactory instance;
	/** Internal state. */
	private static ApplicationContext context = null;
	/** Bean Name. */
	private static String beanName;

	/** Return an instance of this class.
	 * @return an instance of this class
	 */
	public static synchronized HibernateYschoolDaoFactory getInstance() {
		if (instance == null) {
			instance = (HibernateYschoolDaoFactory) context.getBean(beanName);
		}
		return instance;
	}

	/**
	 * Sets a Spring Application Context object.
  	 * @param ctxt ApplicationContext to set
	 * @throws BeansException on spring error
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext ctxt)
			throws BeansException 
	{
		context = ctxt;
	}

	/**
	* 
	* {@inheritDoc}
	* 
	* @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
	*/
	public void setBeanName(String name) {
		beanName = name;
	}

	/**
	 * Return the requested bean from the context, throwing a RuntimeException on error.
	 *
	 * @param beanName to return
	 * @return the bean requested.
	 */
	public static Object getBean(String beanName) {
		Object result = context.getBean(beanName);
		if (result == null) { 
			throw new IllegalStateException(String.format("Could not find bean '%s'. Did you set the right component scanning?", beanName));
		} 
		
		return result;
	}

	
	/**
	 * Returns a ClassroomDao instance.
	 * 
	 * @return a ClassroomDao instance
	 */
	public static ClassroomDao getClassroomDao() {
		return (ClassroomDao) getBean("classroomDaoImpl"); 
	}
	/**
	 * Returns a ClassroomHasStaffHasRoleDao instance.
	 * 
	 * @return a ClassroomHasStaffHasRoleDao instance
	 */
	public static ClassroomHasStaffHasRoleDao getClassroomHasStaffHasRoleDao() {
		return (ClassroomHasStaffHasRoleDao) getBean("classroomHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a ClassroomStudentDao instance.
	 * 
	 * @return a ClassroomStudentDao instance
	 */
	public static ClassroomStudentDao getClassroomStudentDao() {
		return (ClassroomStudentDao) getBean("classroomStudentDaoImpl"); 
	}
	/**
	 * Returns a ClassroomSubjectDao instance.
	 * 
	 * @return a ClassroomSubjectDao instance
	 */
	public static ClassroomSubjectDao getClassroomSubjectDao() {
		return (ClassroomSubjectDao) getBean("classroomSubjectDaoImpl"); 
	}
	/**
	 * Returns a ClassroomSubjectHasStaffHasRoleDao instance.
	 * 
	 * @return a ClassroomSubjectHasStaffHasRoleDao instance
	 */
	public static ClassroomSubjectHasStaffHasRoleDao getClassroomSubjectHasStaffHasRoleDao() {
		return (ClassroomSubjectHasStaffHasRoleDao) getBean("classroomSubjectHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a ExamDao instance.
	 * 
	 * @return a ExamDao instance
	 */
	public static ExamDao getExamDao() {
		return (ExamDao) getBean("examDaoImpl"); 
	}
	/**
	 * Returns a ExamTypeDao instance.
	 * 
	 * @return a ExamTypeDao instance
	 */
	public static ExamTypeDao getExamTypeDao() {
		return (ExamTypeDao) getBean("examTypeDaoImpl"); 
	}
	/**
	 * Returns a MarksDao instance.
	 * 
	 * @return a MarksDao instance
	 */
	public static MarksDao getMarksDao() {
		return (MarksDao) getBean("marksDaoImpl"); 
	}
	/**
	 * Returns a ResultsDao instance.
	 * 
	 * @return a ResultsDao instance
	 */
	public static ResultsDao getResultsDao() {
		return (ResultsDao) getBean("resultsDaoImpl"); 
	}
	/**
	 * Returns a ResultsRankDao instance.
	 * 
	 * @return a ResultsRankDao instance
	 */
	public static ResultsRankDao getResultsRankDao() {
		return (ResultsRankDao) getBean("resultsRankDaoImpl"); 
	}
	/**
	 * Returns a RoleDao instance.
	 * 
	 * @return a RoleDao instance
	 */
	public static RoleDao getRoleDao() {
		return (RoleDao) getBean("roleDaoImpl"); 
	}
	/**
	 * Returns a SchoolDao instance.
	 * 
	 * @return a SchoolDao instance
	 */
	public static SchoolDao getSchoolDao() {
		return (SchoolDao) getBean("schoolDaoImpl"); 
	}
	/**
	 * Returns a SchoolHasStaffHasRoleDao instance.
	 * 
	 * @return a SchoolHasStaffHasRoleDao instance
	 */
	public static SchoolHasStaffHasRoleDao getSchoolHasStaffHasRoleDao() {
		return (SchoolHasStaffHasRoleDao) getBean("schoolHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a SectionDao instance.
	 * 
	 * @return a SectionDao instance
	 */
	public static SectionDao getSectionDao() {
		return (SectionDao) getBean("sectionDaoImpl"); 
	}
	/**
	 * Returns a SectionHasStaffHasRoleDao instance.
	 * 
	 * @return a SectionHasStaffHasRoleDao instance
	 */
	public static SectionHasStaffHasRoleDao getSectionHasStaffHasRoleDao() {
		return (SectionHasStaffHasRoleDao) getBean("sectionHasStaffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a StaffDao instance.
	 * 
	 * @return a StaffDao instance
	 */
	public static StaffDao getStaffDao() {
		return (StaffDao) getBean("staffDaoImpl"); 
	}
	/**
	 * Returns a StaffHasRoleDao instance.
	 * 
	 * @return a StaffHasRoleDao instance
	 */
	public static StaffHasRoleDao getStaffHasRoleDao() {
		return (StaffHasRoleDao) getBean("staffHasRoleDaoImpl"); 
	}
	/**
	 * Returns a StudentDao instance.
	 * 
	 * @return a StudentDao instance
	 */
	public static StudentDao getStudentDao() {
		return (StudentDao) getBean("studentDaoImpl"); 
	}
	/**
	 * Returns a StudentClassroomSubjectDao instance.
	 * 
	 * @return a StudentClassroomSubjectDao instance
	 */
	public static StudentClassroomSubjectDao getStudentClassroomSubjectDao() {
		return (StudentClassroomSubjectDao) getBean("studentClassroomSubjectDaoImpl"); 
	}
	/**
	 * Returns a SubjectDao instance.
	 * 
	 * @return a SubjectDao instance
	 */
	public static SubjectDao getSubjectDao() {
		return (SubjectDao) getBean("subjectDaoImpl"); 
	}
	/**
	 * Returns a UserDao instance.
	 * 
	 * @return a UserDao instance
	 */
	public static UserDao getUserDao() {
		return (UserDao) getBean("userDaoImpl"); 
	}
	/**
	 * Returns a UserRoleDao instance.
	 * 
	 * @return a UserRoleDao instance
	 */
	public static UserRoleDao getUserRoleDao() {
		return (UserRoleDao) getBean("userRoleDaoImpl"); 
	}

}
