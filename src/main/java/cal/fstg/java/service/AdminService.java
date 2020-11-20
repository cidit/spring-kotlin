//package cal.fstg.java.service;
//
//import cal.fstg.java.dao.AdminRepository;
//import cal.fstg.java.dao.DocumentRepository;
//import cal.fstg.java.model.Admin;
//import cal.fstg.java.model.Document;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AdminService {
//
//    private final AdminRepository adminRepository;
//
//    @Autowired
//    public AdminService(AdminRepository adminRepository) {
//        this.adminRepository = adminRepository;
//    }
//
//    public List<Admin> getAll() {
//        return adminRepository.findAll();
//    }
//
//    public Optional<Admin> getOne(long id) {
//        return adminRepository.findById(id);
//    }
//
//    public Admin save(Admin admin) {
//        return adminRepository.save(admin);
//    }
//
//    public void delete(long id) {
//        adminRepository.deleteById(id);
//    }
//
//}
