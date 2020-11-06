package cal.fstg.java.controller;

import cal.fstg.java.dao.EmployerRepository;
import cal.fstg.java.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employers")
public class EmployerController {

    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerController(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @GetMapping("/get/all")
    public List<Employer> getAll() {
        return employerRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Employer> getOne(@PathVariable long id) {
        return employerRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Employer employer) {
        employerRepository.save(employer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        employerRepository.deleteById(id);
    }
}
