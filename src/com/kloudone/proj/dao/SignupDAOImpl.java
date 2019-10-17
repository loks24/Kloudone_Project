package com.kloudone.proj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.entity.LoginEntity;

@Repository
public class SignupDAOImpl implements SignupDAO{
	
@Autowired
private EntityManagerFactory entityManagerFactory;

	@Override
	public LoginEntity saveDetails(LoginEntity loginentity) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		try {
			et.begin();
			entityManager.persist(loginentity);
			et.commit();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return loginentity;
	}

}
