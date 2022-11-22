package com.sp.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sp.dao.Customer;

@Repository
public class SqlConnectionDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	static final String SQL = "SELECT * FROM KALEESWARAN_EMPLOYEES";

	public List<Customer> Read() {

		List<Customer> customers = new ArrayList<Customer>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setId((int) row.get("ID"));
			customer.setFirstName((String) row.get("FIRST_NAME"));
			customer.setLastName((String) row.get("LAST_NAME"));
			customer.setSalary((java.math.BigDecimal) row.get("SALARY"));
			customer.setDeptId((int) row.get("DEPARTMENT_ID"));
			customer.setJoinDate((java.sql.Date) row.get("YEAR_OF_JOINING"));
			customer.setRelieveDate((java.sql.Date) row.get("YEAR_OF_RELIEVING"));
			customers.add(customer);
		}

		return customers;

	}

}
