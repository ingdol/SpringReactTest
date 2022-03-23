package com.multi.sub_project_spring;

import com.multi.sub_project_spring.SpaceClassList.ILookUpDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.sub_project_spring.Member.dao.MemberDAO;
import com.multi.sub_project_spring.QnaList.IQnaListDAO;

@SpringBootApplication
@ComponentScan(basePackages = {"com.multi.sub_project_spring"})
@MapperScan(basePackageClasses = IQnaListDAO.class)
@MapperScan(basePackageClasses = ILookUpDAO.class)

@MapperScan(basePackageClasses = MemberDAO.class)

public class SubProjectSpringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SubProjectSpringApplication.class, args);
	}

}
