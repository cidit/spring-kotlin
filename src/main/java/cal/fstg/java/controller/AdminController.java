package cal.fstg.java.controller;

//import cal.fstg.java.dao.AdminRepository;
//import cal.fstg.java.dao.EmployerRepository;
//import cal.fstg.java.model.Admin;
//import cal.fstg.java.model.Employer;
//import cal.fstg.java.service.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;

//@RestController
//@RequestMapping("/admins")
//public class AdminController {
//
//    private final AdminService adminService;
//
//    @Autowired
//    public AdminController(AdminService adminService) {
//        this.adminService = adminService;
//    }
//
//    @GetMapping("/get/all")
//    public List<Admin> getAll() {
//        return adminService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<Admin> getOne(@PathVariable long id) {
//        return adminService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody Admin admin) {
//        adminService.save(admin);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        adminService.delete(id);
//    }
//}
