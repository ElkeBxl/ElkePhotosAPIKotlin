package photos.elke.api.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/")
class ApiController {

    @GetMapping("photos")
    fun getAll() = "GET!"

    @PutMapping("photos")
    fun update() = "PUT!"

    @PostMapping("photos")
    fun create() = "POST!"

    @DeleteMapping("photos")
    fun remove() = "DELETE!"

}