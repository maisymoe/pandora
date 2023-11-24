package moe.maisy.pandora.presentation.screens

sealed class Screen(val route: String) {
    object Landing : Screen("landing")
    object Shizuku : Screen("shizuku")
}