package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.StudentRepository
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.reactor.flux
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(@Autowired private val studentRepository: StudentRepository) {

    @ExperimentalCoroutinesApi
    fun getAll() = flux<Student> { studentRepository.findAll() }

    fun getOne(id: String) = mono { studentRepository.findById(id) }

    fun save(student: Student) = mono { studentRepository.save(student) }

    fun delete(id: String) = studentRepository.deleteById(id)
}