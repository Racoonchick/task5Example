package back.controller

import back.model.Master
import back.service.AutoServiceService

object AutoServiceController {

    private val autoServiceService = AutoServiceService

    fun fireMaster() {
        autoServiceService.deleteMaster()
    }

    fun hireMaser(master: Master) {
        autoServiceService.addMaster(master)
    }

    fun getAll(): List<Master> {
        return autoServiceService.getAll()
    }

}
