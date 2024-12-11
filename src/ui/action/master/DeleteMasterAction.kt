package ui.action.master

import back.controller.AutoServiceController
import ui.action.IAction

class DeleteMasterAction: IAction {

    private val autoServiceController = AutoServiceController

    override fun execute() {
        autoServiceController.fireMaster()
    }
}
