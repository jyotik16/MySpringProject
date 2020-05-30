package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper {
	
	
	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		 Student st = new Student();
		 st.setId(rs.getInt(1));
         st.setName(rs.getString(2));
         st.setAge(rs.getInt(3));
			
		return st;
	}

}
