package com.kloudone.proj.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.entity.CommentEntity;
import com.kloudone.proj.entity.PostEntity;

@Repository
public class CommentDAOImpl implements CommentDAO{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public CommentEntity updatecomment(CommentEntity commententity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		try {
			et.begin();
			entityManager.persist(commententity);
			et.commit();
			et.begin();
			PostEntity postentity=commententity.getPost();
			ArrayList<CommentEntity> al=new ArrayList<CommentEntity>();
			al.add((CommentEntity) postentity.getComments());
			postentity.setComments(al);
			entityManager.merge(postentity);
			et.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return commententity;
	}

}
