//package cal.fstg.java.service;
//
//import cal.fstg.java.dao.ResumeRepository;
//import cal.fstg.java.dao.StudentRepository;
//import cal.fstg.java.model.Resume;
//import cal.fstg.java.model.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ResumeService {
//
//    private final ResumeRepository resumeRepository;
//
//    @Autowired
//    public ResumeService(ResumeRepository resumeRepository) {
//        this.resumeRepository = resumeRepository;
//    }
//
//    public List<Resume> getAll() {
//        return resumeRepository.findAll();
//    }
//
//    public Optional<Resume> getOne(long id) {
//        return resumeRepository.findById(id);
//    }
//
//    public Resume save(Resume resume) {
//        return resumeRepository.save(resume);
//    }
//
//    public void delete(long id) {
//        resumeRepository.deleteById(id);
//    }
//}
