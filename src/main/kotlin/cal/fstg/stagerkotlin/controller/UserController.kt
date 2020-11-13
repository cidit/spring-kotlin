package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.dao.UserRepository
import cal.fstg.stagerkotlin.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userService: UserRepository) {

    @GetMapping("/get/all")
    fun getAll(): List<User> = userService.findAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: Long) = userService.findById(id)

    @PostMapping("/save")
    fun save(@RequestBody user: User) = userService.save(user)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long) = userService.deleteById(id)
}