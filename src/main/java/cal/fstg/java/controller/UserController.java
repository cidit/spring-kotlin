package cal.fstg.java.controller;

import cal.fstg.java.dao.UserRepository;
import cal.fstg.java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/get/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getOne(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        userRepository.deleteById(id);
    }
}
