package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.StudentRepository
import cal.fstg.stagerkotlin.model.Student
import cal.fstg.stagerkotlin.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(@Autowired private val studentService: StudentService) {

    @GetMapping("/get/all")
    fun getAll() = studentService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: String) = studentService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody student: Student) = studentService.save(student)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: String) = studentService.delete(id)
}