package com.alanlyu.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alanlyu.springdemo.dao.OrganizationDao;
import com.alanlyu.springdemo.domain.Organization;
import com.alanlyu.springdemo.daoimpl.OrganizationDaoImpl;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {
		
		// creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		OrganizationDao dao = (OrganizationDaoImpl)ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		for (Organization org: orgs){
			System.out.println(org);
		}
		
		//close the application context
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
