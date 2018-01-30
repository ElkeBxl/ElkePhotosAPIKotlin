package photos.elke.api.controller

import org.springframework.web.bind.annotation.*
import photos.elke.api.repository.PhotoRepository

@RestController
@RequestMapping("api/v1/")
class ApiController(val repository: PhotoRepository) {

    @GetMapping("photos")
    fun getAll() = repository.findAll()

    @PutMapping("photos")
    fun update() = "PUT!"

    @PostMapping("photos")
    fun create() = "POST!"

    @DeleteMapping("photos")
    fun remove() = "DELETE!"

}