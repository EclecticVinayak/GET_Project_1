package com.getBatch3.BillingManagementBackend.Daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.getBatch3.BillingManagementBackend.models.Developer;


@Component
@Repository(value="developerDao")
@Transactional
public class DeveloperDaoImpl implements DeveloperDao {
	                                                                                              
	@Autowired
	private SessionFactory sessionFactory;//To get session factory from dbconfig.java file
	
	public List<Developer> getAllDeveloper() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from Developer");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
