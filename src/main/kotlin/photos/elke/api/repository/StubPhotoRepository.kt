package photos.elke.api.repository

import photos.elke.api.model.Photo
import java.util.*

class StubPhotoRepositoryImpl(private val photos: ArrayList<Photo>) : PhotoRepository  {

    override fun findAll(): MutableIterable<Photo> = photos;

    override fun deleteById(id: Int?) {
        val index = photos.indexOfFirst { it == Photo(id as Int) }
        if (index >= 0) {
            photos.removeAt(index);
        }
    }

    override fun deleteAll(photosToDelete: MutableIterable<Photo>?) {
        photosToDelete?.forEach { photos.remove(it) }
    }

    override fun deleteAll() {
        photos.clear()
    }

    override fun <S : Photo?> saveAll(p0: MutableIterable<S>?): MutableIterable<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllById(p0: MutableIterable<Int>?): MutableIterable<Photo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun existsById(p0: Int?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(p0: Int?): Optional<Photo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(p0: Photo?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : Photo?> save(p0: S): S {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}