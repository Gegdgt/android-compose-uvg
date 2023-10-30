package com.zezzi.eventzezziapp.navigation

sealed class NavigationState(val route: String) {
<<<<<<< Updated upstream
=======
    object Categories: NavigationState("Categories")
>>>>>>> Stashed changes
    object Meals: NavigationState("Meals")
}