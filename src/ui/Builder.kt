package ui

import ui.action.NextMenuAction
import ui.action.master.AddMasterAction
import ui.action.master.DeleteMasterAction
import ui.action.master.GetAllMastersAction

class Builder {

    private lateinit var rootMenu: Menu

    fun buildMenu() {

        rootMenu = Menu("Главное меню", mutableListOf())

        val masterMenu = Menu("Меню мастеров", mutableListOf())
        val orderMenu = Menu("Меню заказов", mutableListOf())

        val addMasterItem = MenuItem("Добавить мастера", AddMasterAction(), masterMenu)
        val deleteMasterItem = MenuItem("Удалить мастера", DeleteMasterAction(), masterMenu)
        val getAllMastersItem = MenuItem("Список мастеров", GetAllMastersAction(), masterMenu)
        val returnToPreviousMenu = MenuItem("Вернуться в прошлое меню", NextMenuAction(), rootMenu)

        masterMenu.addMenuItem(addMasterItem)
        masterMenu.addMenuItem(deleteMasterItem)
        masterMenu.addMenuItem(getAllMastersItem)
        masterMenu.addMenuItem(returnToPreviousMenu)

        orderMenu.addMenuItem(returnToPreviousMenu)

        rootMenu.addMenuItem(MenuItem("Мастера", NextMenuAction(), masterMenu))
        rootMenu.addMenuItem(MenuItem("Заказы", NextMenuAction(), orderMenu))
    }

    fun getRootMenu(): Menu {
        return rootMenu
    }
}
