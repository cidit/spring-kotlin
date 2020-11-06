package cal.fstg.java.service;

import cal.fstg.java.dao.EmployerRepository;
import cal.fstg.java.dao.StudentRepository;
import cal.fstg.java.dao.UserRepository;
import cal.fstg.java.model.Employer;
import cal.fstg.java.model.Student;
import cal.fstg.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopulateDatabaseService {

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final EmployerRepository employerRepository;

    @Autowired
    public PopulateDatabaseService(UserRepository userRepository, StudentRepository studentRepository, EmployerRepository employerRepository) {
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
        this.employerRepository = employerRepository;
    }

    public void insert() {
        var user = new User();
        user.setRole("none");
        user.setUsername("tata");
        user.setEmail("tat@users.com");
        user.setPassword("this_is_tata");
        user.setPhone("111-222-3333");
        userRepository.save(user);

        var student = new Student();
        student.setUsername("toto");
        student.setEmail("toto@students.com");
        student.setPassword("this_is_toto");
        student.setPhone("222-333-4444");
        student.setRegistration("TOTO12345");
        studentRepository.save(student);

        var employer = new Employer();
        employer.setUsername("titi");
        employer.setEmail("titi@employers.com");
        employer.setPassword("this_is_titi");
        employer.setPhone("333-444-5555");
        employer.setCompany("TitiTime.inc");
        employerRepository.save(employer);
    }
}
