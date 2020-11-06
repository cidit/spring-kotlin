package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userRepository: UserRepository) {

    @GetMapping("/get/all")
    fun getAll(): List<User> = userRepository.findAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = userRepository.findById(id)

    @PostMapping("/save")
    fun save(@RequestBody user: User) = userRepository.save(user)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = userRepository.deleteById(id)
}