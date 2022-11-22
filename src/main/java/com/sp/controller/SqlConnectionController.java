package com.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sp.dao.Customer;
import com.sp.repo.SqlConnectionDAO;


@RestController
@RequestMapping("/api/")
public class SqlConnectionController {

	@Autowired
	SqlConnectionDAO dao;

	@GetMapping(value = "testDB")
	public ResponseEntity<?> customerInformation() {

		List<Customer> customers = dao.Read();
		
		return new ResponseEntity<>(customers,HttpStatus.OK);
	}
}
