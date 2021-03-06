package uk.co.santander.funWithSpringboot.dto

import org.springframework.data.annotation.Id

data class Employee (
    @Id
    var id: String,
    var firstName: String,
    var lastName: String,
    var email: String
)

