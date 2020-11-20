package cal.fstg.java.controller;

import cal.fstg.java.dao.UserRepository;
import cal.fstg.java.model.User;
import cal.fstg.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/get/all")
//    public List<User> getAll() {
//        return userService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<User> getOne(@PathVariable long id) {
//        return userService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody User user) {
//        userService.save(user);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        userService.delete(id);
//    }
//}
