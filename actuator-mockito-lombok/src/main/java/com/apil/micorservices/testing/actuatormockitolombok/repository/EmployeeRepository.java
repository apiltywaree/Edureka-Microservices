package com.apil.micorservices.testing.actuatormockitolombok.repository;

import com.apil.micorservices.testing.actuatormockitolombok.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
