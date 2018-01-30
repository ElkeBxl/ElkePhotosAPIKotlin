package photos.elke.api.repository

import photos.elke.api.model.Photo
import org.springframework.data.repository.CrudRepository

interface PhotoRepository : CrudRepository<Photo, Int>