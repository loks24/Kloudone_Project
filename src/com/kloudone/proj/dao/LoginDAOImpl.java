package com.kloudone.proj.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.entity.LoginEntity;

@Repository
public class LoginDAOImpl implements LoginDAO {


	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public LoginEntity findLoginDetails(String username) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		LoginEntity loginDetailEntity = null;
		try {
			loginDetailEntity = entityManager.find(LoginEntity.class, username);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return loginDetailEntity;

	}

}
