package ui.action.master

import back.controller.AutoServiceController
import back.model.Master
import ui.action.IAction
import java.util.Scanner

class AddMasterAction: IAction {

    private val autoServiceController = AutoServiceController

    override fun execute() {
        val scanner = Scanner(System.`in`)
        println("Введите имя мастера:")
        val name = scanner.nextLine()
        println("Введите фамилию мастера:")
        val surname = scanner.nextLine()

        val maser = Master(
            name,
            surname
        )
        autoServiceController.hireMaser(maser)
    }
}
