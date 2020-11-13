package cal.fstg.stagerkotlin.dao

import cal.fstg.stagerkotlin.model.Admin
import cal.fstg.stagerkotlin.model.Employer
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>

interface StudentRepository : JpaRepository<Student, Long>

interface EmployerRepository : JpaRepository<Employer, Long>

interface AdminRepository : JpaRepository<Admin, Long>