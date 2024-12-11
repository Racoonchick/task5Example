package back.service

import back.model.Master

object AutoServiceService {

    val masters = mutableListOf<Master>()

    fun addMaster(master: Master) {
        masters.add(master)
    }

    fun deleteMaster() {
        masters.removeLast()
    }

    fun getAll(): List<Master> {
        return masters
    }
}
