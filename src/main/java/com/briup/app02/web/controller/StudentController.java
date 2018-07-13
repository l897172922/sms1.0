package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	//注入StudentService实例
	@Autowired
	private IStudentService studentService;
	
	//http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		try{
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询成功", list);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("findStudentById")
	public MsgResponse findStudentById(long id){
		try{
			Student student = studentService.findById(id);
			return MsgResponse.success("查询成功", student);
			
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	/*
	 * 保存学生信息
	 * @author
	 * @param student
	 * @return*/
	@PostMapping("saveStudent")
	public MsgResponse save(Student student){
		try{
			studentService.save(student);
			return MsgResponse.success("添加成功", student);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updatestudent")
	public MsgResponse updateStudent(Student student) {
		
		try {
			studentService.update(student);
			return MsgResponse.success("修改成功", student);
			
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
			}
	}
	
	@PostMapping("deletestudent")
	public MsgResponse deleteStudeng(long id){
		try {
			//调用service层代码删除学生信息
			studentService.deleteById(id);
			//返回成功信息
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			//1.打印错误信息 2.返回错误信息
			e.printStackTrace();
			//
			return MsgResponse.error(e.getMessage());
		}
	}
}
