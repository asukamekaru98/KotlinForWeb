package org.example.project

sealed class Screen {
    data object Home : Screen()
    data object Portfolio : Screen()
    data object WebApiLab : Screen()
    data object Placeholder1 : Screen()
    data object Placeholder2 : Screen()
    data object Placeholder3 : Screen()
}
