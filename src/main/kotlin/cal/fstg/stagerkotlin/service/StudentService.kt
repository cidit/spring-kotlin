package cal.fstg.stagerkotlin.service

import cal.fstg.stagerkotlin.dao.StudentRepository
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(@Autowired private val studentRepository: StudentRepository) {

    fun getAll() = studentRepository.findAll()

    fun getOne(id: String) = studentRepository.findById(id)

    fun save(student: Student) = studentRepository.save(student)

    fun delete(id: String) = studentRepository.deleteById(id)
}