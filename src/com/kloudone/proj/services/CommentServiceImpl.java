package com.kloudone.proj.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.CommentBean;
import com.kloudone.proj.dao.CommentDAO;
import com.kloudone.proj.entity.CommentEntity;
import com.kloudone.proj.entity.PostEntity;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	CommentDAO commentdao;
	
	@Override
	public CommentBean updateComment(CommentBean commentbean) {
		CommentEntity commententity=new CommentEntity();
		BeanUtils.copyProperties(commentbean, commententity);
		CommentEntity commententity1=commentdao.updatecomment(commententity);
		return commentbean;
	}

}
