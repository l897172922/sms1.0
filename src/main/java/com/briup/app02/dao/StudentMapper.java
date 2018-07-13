package com.briup.app02.dao;
//映射接口
import java.util.List;

import com.briup.app02.bean.Student;

public interface StudentMapper {
	List<Student>findAll();			//查询所有学生信息
	Student findById(long id);		//通过ID查询
	void save(Student student);		//存储
	void update(Student student);	//更改
	void deleteById(long id);		//删除
}