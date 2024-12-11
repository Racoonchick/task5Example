package ui

import ui.action.IAction

class MenuItem(
    private val title: String,
    private val action: IAction,
    private val nextMenu: Menu
) {

    fun doAction() {
        action.execute()
    }

    fun getNextMenu(): Menu {
        return nextMenu
    }

    fun getTitle(): String {
        return title
    }
}
