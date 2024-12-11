package ui.action.master

import back.controller.AutoServiceController
import ui.action.IAction

class GetAllMastersAction: IAction {

    private val autoServiceController = AutoServiceController

    override fun execute() {
        autoServiceController.getAll().forEach {
            println(it)
        }
    }
}
