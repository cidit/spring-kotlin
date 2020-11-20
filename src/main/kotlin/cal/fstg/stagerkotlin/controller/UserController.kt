package cal.fstg.stagerkotlin.controller

import cal.fstg.stagerkotlin.model.User
import cal.fstg.stagerkotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userService: UserService) {

    @GetMapping("/get/all")
    fun getAll() = userService.getAll()

    @GetMapping("/get/{id}")
    fun getOne(@PathVariable id: String) = userService.getOne(id)

    @PostMapping("/save")
    fun save(@RequestBody user: User) = userService.save(user)

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: String) = userService.delete(id)
}