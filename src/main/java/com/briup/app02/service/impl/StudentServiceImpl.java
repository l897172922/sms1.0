package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired  //自动获取
	private StudentMapper studentMapper;
	
	
	
	
	@Override
	public List<Student> findAll() throws Exception {
		//调用studentMapper查询
		List<Student> list = studentMapper.findAll();
		return list;
	}
	
	@Override
	public Student findById(long id) throws Exception{
		Student student = studentMapper.findById(id);
		if(student!=null)
			return studentMapper.findById(id);
		else
			throw new Exception("查询失败！");
	}
	
	@Override
	public void save(Student sutdent) throws Exception{
		
			studentMapper.save(sutdent);
		
	}
	
	@Override
	public void update(Student student) throws Exception{
		//Student student = studentMapper.findById(id);
		if(student!=null)
			studentMapper.update(student);
		else
			throw new Exception();
	}

	@Override
	public void deleteById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		
		if(student!=null)
			studentMapper.deleteById(id);
		else
			throw new Exception("删除失败!");
		
	}
}
