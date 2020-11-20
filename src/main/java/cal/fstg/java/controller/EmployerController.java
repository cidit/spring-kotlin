package cal.fstg.java.controller;
//
//import cal.fstg.java.dao.EmployerRepository;
//import cal.fstg.java.model.Employer;
//import cal.fstg.java.service.EmployerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;

//@RestController
//@RequestMapping("/employers")
//public class EmployerController {
//
//    private final EmployerService employerService;
//
//    @Autowired
//    public EmployerController(EmployerService employerService) {
//        this.employerService = employerService;
//    }
//
//    @GetMapping("/get/all")
//    public List<Employer> getAll() {
//        return employerService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<Employer> getOne(@PathVariable long id) {
//        return employerService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody Employer employer) {
//        employerService.save(employer);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        employerService.delete(id);
//    }
//}
