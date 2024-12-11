package ui

class Menu (
    private val name: String,
    private var menuItems: MutableList<MenuItem>
) {
    fun getName(): String {
        return name
    }

    fun getMenuItems(): MutableList<MenuItem> {
        return menuItems
    }

    fun addMenuItem(menuItem: MenuItem) {
        menuItems += (menuItem)
    }
}
