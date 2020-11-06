package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.StudentRepository
import cal.fstg.stagerkotlin.model.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(@Autowired private val studentRepository: StudentRepository) {

    @GetMapping("/get/all")
    fun getAll(): List<Student> = studentRepository.findAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = studentRepository.findById(id)

    @PostMapping("/save")
    fun save(@RequestBody student: Student) = studentRepository.save(student)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = studentRepository.deleteById(id)
}