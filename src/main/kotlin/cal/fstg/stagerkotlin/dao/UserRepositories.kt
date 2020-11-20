package cal.fstg.stagerkotlin.dao

import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface UserRepository : JpaRepository<User, String>

interface StudentRepository : JpaRepository<Student, String>

interface EmployerRepository : JpaRepository<Employer, String>

interface AdminRepository : JpaRepository<Admin, String>