package com.Spring2.com.Spring.web1.Repository;






import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring2.com.Spring.web1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}