package com.kloudone.proj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.entity.PostEntity;

@Repository
public class PostDAOImpl implements PostDAO{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public PostEntity updatePost(PostEntity postentity) {
		// TODO Auto-generated method stub
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		try {
			et.begin();
			entityManager.persist(postentity);
			et.commit();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return postentity;
	}
	

}
