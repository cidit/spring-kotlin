package cal.fstg.java.controller;

//import cal.fstg.java.model.Document;
//import cal.fstg.java.model.Resume;
//import cal.fstg.java.service.DocumentService;
//import cal.fstg.java.service.ResumeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;

//@RestController
//@RequestMapping("/resumes")
//public class ResumeController {
//
//    private final ResumeService resumeService;
//
//    @Autowired
//    public ResumeController(ResumeService resumeService) {
//        this.resumeService = resumeService;
//    }
//
//    @GetMapping("/get/all")
//    public List<Resume> getAll() {
//        return resumeService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<Resume> getOne(@PathVariable long id) {
//        return resumeService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody Resume resume) {
//        resumeService.save(resume);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        resumeService.delete(id);
//    }
//}
