package com.kloudone.proj.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kloudone.proj.bean.PostBean;
import com.kloudone.proj.dao.PostDAO;
import com.kloudone.proj.entity.PostEntity;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostDAO postdao;
	@Override
	public PostBean updatePost(PostBean postbean) {
		// TODO Auto-generated method stub
		PostEntity postentity=new PostEntity();
		BeanUtils.copyProperties(postbean, postentity);
		PostEntity postentity1=postdao.updatePost(postentity);
		return postbean;
	}

}
