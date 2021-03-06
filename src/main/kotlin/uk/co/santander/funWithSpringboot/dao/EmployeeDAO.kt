package uk.co.santander.funWithSpringboot.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import uk.co.santander.funWithSpringboot.dto.Employee
import uk.co.santander.funWithSpringboot.repository.EmployeeRepository
import java.util.*

@Repository
class EmployeeDAO {

    @Autowired
    private lateinit var employeeRepository: EmployeeRepository

    fun getAllEmployess() = employeeRepository.findAll()

    fun addEmployee(employee: Employee) {
        employee.id = UUID.randomUUID().toString()
        employeeRepository.save(employee)
    }
}

