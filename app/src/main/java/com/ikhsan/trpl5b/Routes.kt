package  com.ikhsan.trpl5b

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Profile : Routes("profile")
    object Setting : Routes("setting")
}