package cal.fstg.java.controller;

import cal.fstg.java.dao.StudentRepository;
import cal.fstg.java.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/get/all")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getOne(@PathVariable long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        studentRepository.deleteById(id);
    }
}
