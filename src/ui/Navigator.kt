package ui

class Navigator(
    private var currentMenu: Menu,
) {

    fun printMenu() {
        println(currentMenu.getName())
        var counter = 1
        currentMenu.getMenuItems().forEach {
            println(counter.toString() + " - " +  it.getTitle())
            counter++
        }
    }

    fun navigate(index: Int) {
        val item = currentMenu.getMenuItems()[index]

        item.doAction()

        currentMenu = item.getNextMenu()

        printMenu()
    }
}

