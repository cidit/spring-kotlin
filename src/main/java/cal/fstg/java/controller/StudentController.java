package cal.fstg.java.controller;

import cal.fstg.java.dao.StudentRepository;
import cal.fstg.java.model.Student;
import cal.fstg.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    private final StudentService studentService;
//
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @GetMapping("/get/all")
//    public List<Student> getAll() {
//        return studentService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<Student> getOne(@PathVariable long id) {
//        return studentService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody Student student) {
//        studentService.save(student);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        studentService.delete(id);
//    }
//}
