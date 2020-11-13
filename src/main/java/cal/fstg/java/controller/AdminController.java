package cal.fstg.java.controller;

import cal.fstg.java.dao.AdminRepository;
import cal.fstg.java.dao.EmployerRepository;
import cal.fstg.java.model.Admin;
import cal.fstg.java.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/get/all")
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Admin> getOne(@PathVariable long id) {
        return adminRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Admin admin) {
        adminRepository.save(admin);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        adminRepository.deleteById(id);
    }
}
