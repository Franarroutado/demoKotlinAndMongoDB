package uk.co.santander.funWithSpringboot.repository

import org.springframework.data.mongodb.repository.MongoRepository
import uk.co.santander.funWithSpringboot.dto.Employee

interface EmployeeRepository : MongoRepository<Employee?, String?> {

//    fun findByFirstName(firstName: String?): List<Employee?>?
//    fun findByLastName(lastName: String?): List<Employee?>?
}