package com.jsp.SpringJdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jsp.SpringJdbc.Entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Student> getStudent() {
		String sql="select * from springjdbc.student";
		List<Student> s=(List<Student>) jdbcTemplate.query(sql, new RowMapperImpl());
		//rowmapper it will acceot the object of rowmapper
		return s;
	}


	
}
