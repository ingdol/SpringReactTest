package com.multi.sub_project_spring;

import com.multi.sub_project_spring.CreateClass.CreateController;
import com.multi.sub_project_spring.Member.MemberController;
import com.multi.sub_project_spring.QnaList.QnaListController;
import com.multi.sub_project_spring.SpaceClassList.LookUpController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.sub_project_spring.CreateClass.ICreateClassDAO;
import com.multi.sub_project_spring.CreateClass.ICreateSpaceDAO;
import com.multi.sub_project_spring.Member.dao.MemberDAO;
import com.multi.sub_project_spring.QnaList.IQnaListDAO;
import com.multi.sub_project_spring.SpaceClassList.ILookUpDAO;

@SpringBootApplication
@ComponentScan(basePackages = {"com.multi.sub_project_spring"})
@ComponentScan(basePackageClasses = ReactController.class)
@ComponentScan(basePackageClasses = CustomErrorController.class)
@ComponentScan(basePackageClasses = CreateController.class)
@ComponentScan(basePackageClasses = QnaListController.class)
@ComponentScan(basePackageClasses = MemberController.class)
@ComponentScan(basePackageClasses = LookUpController.class)
@MapperScan(basePackageClasses = IQnaListDAO.class)
@MapperScan(basePackageClasses = ILookUpDAO.class)
@MapperScan(basePackageClasses = ICreateClassDAO.class)
@MapperScan(basePackageClasses = ICreateSpaceDAO.class)
@MapperScan(basePackageClasses = MemberDAO.class)

public class SubProjectSpringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SubProjectSpringApplication.class, args);
	}

}
