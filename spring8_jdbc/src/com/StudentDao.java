package com;


import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
public class StudentDao {
	JdbcTemplate tmp;
	public void setTmp(JdbcTemplate tmp) {
		this.tmp = tmp;
	}
	public int save(Student s) {
		String sql="insert into student values("+s.getId()+",'"+s.getName()+"',"+s.getAge()+")";
		int x=tmp.update(sql);
		
		return x;
	}
	
	public int saveDetails(Student s) {
		String sql="insert into student values(?,?,?)";
		Object [] obj= {s.getId(),s.getName(),s.getAge()};
		int x =tmp.update(sql, obj);
		return x;
	}
	public void getAllStudent() {		
		List l =tmp.queryForList("select * from student");
		Iterator<Student> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void getDetails() {
		
		List l1 =tmp.query("select * from student", new StudentMapper());
		Iterator<Student> itr = l1.iterator();
		while(itr.hasNext()) {
			Student st =itr.next();
			System.out.println(st.getId()+" "+st.getName()+" "+st.getAge());
			
		}
	}
}
