package ui

import java.util.Scanner

class MenuController {
    private lateinit var builder: Builder
    private lateinit var navigator: Navigator

    fun run() {
        builder = Builder()
        builder.buildMenu()
        val rootMenu = builder.getRootMenu()
        navigator = Navigator(rootMenu)

        navigator.printMenu()
        while (true) {
            val answer = Scanner(System.`in`).nextInt() - 1
            navigator.navigate(answer)
        }
    }
}
