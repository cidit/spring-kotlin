//package cal.fstg.java.service;
//
//import cal.fstg.java.dao.StudentRepository;
//import cal.fstg.java.dao.UserRepository;
//import cal.fstg.java.model.Student;
//import cal.fstg.java.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//    private final StudentRepository studentRepository;
//
//    @Autowired
//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public List<Student> getAll() {
//        return studentRepository.findAll();
//    }
//
//    public Optional<Student> getOne(long id) {
//        return studentRepository.findById(id);
//    }
//
//    public Student save(Student student) {
//        return studentRepository.save(student);
//    }
//
//    public void delete(long id) {
//        studentRepository.deleteById(id);
//    }
//}
