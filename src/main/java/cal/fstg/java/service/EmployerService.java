//package cal.fstg.java.service;
//
//import cal.fstg.java.dao.EmployerRepository;
//import cal.fstg.java.dao.ResumeRepository;
//import cal.fstg.java.model.Employer;
//import cal.fstg.java.model.Resume;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployerService {
//
//    private final EmployerRepository employerRepository;
//
//    @Autowired
//    public EmployerService(EmployerRepository employerRepository) {
//        this.employerRepository = employerRepository;
//    }
//
//    public List<Employer> getAll() {
//        return employerRepository.findAll();
//    }
//
//    public Optional<Employer> getOne(long id) {
//        return employerRepository.findById(id);
//    }
//
//    public Employer save(Employer employer) {
//        return employerRepository.save(employer);
//    }
//
//    public void delete(long id) {
//        employerRepository.deleteById(id);
//    }
//}
