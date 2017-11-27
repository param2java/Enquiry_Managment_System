package com.jrd.ems.dao;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.jrd.ems.entity.StudentDO;
import com.jrd.ems.entity.UserLoginDO;
import com.jrd.ems.entity.UserRegistrationDO;
import com.jrd.ems.exception.UserNotFoundException;





@Repository
public class UserDaoImpl extends GenericDAO implements UserDao {

	private final static Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	
	@Override
	public UserRegistrationDO login(UserLoginDO login) {
		UserRegistrationDO user= null;
	try {
			user= (UserRegistrationDO) getEntityManager().createQuery(
					"from UserRegistrationDO where userId='"
							+ login.getUserId() + "'").getSingleResult();
		} catch(NoResultException nre){
			throw new UserNotFoundException("User details not Found,Please try once again");
			
		}
	      catch (DataAccessException de) {
	    	LOGGER.error("Exception:"+de.getMessage());
	    	}
	return user;
	
	}

	@Override
	public void registration(UserRegistrationDO registration) {

		getEntityManager().persist(registration);

	}

	@Override
	public void studentDetails(StudentDO student) {

		getEntityManager().persist(student);

	}

	@Override
	public StudentDO getStudent(Long id) {

		return getEntityManager().find(StudentDO.class, id);
	}

}
