package uk.co.santander.funWithSpringboot.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import uk.co.santander.funWithSpringboot.dao.EmployeeDAO
import uk.co.santander.funWithSpringboot.dto.Employee

@RestController
@RequestMapping(path = ["/employee"])
class EmployeeController {

    @Autowired
    private lateinit var employeeDao: EmployeeDAO

    @GetMapping("/",
    produces = ["application/json"])
    fun getEmployees() =
        employeeDao.getAllEmployess()


    @PostMapping("/")
    fun saveEmployee(@RequestBody employee: Employee) =
        employeeDao.addEmployee(employee)

}