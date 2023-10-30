package com.zezzi.eventzezziapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zezzi.eventzezziapp.ui.meals.view.MealsCategoriesScreen
<<<<<<< Updated upstream
=======
import com.zezzi.eventzezziapp.ui.meals.view.MealsScreen
>>>>>>> Stashed changes

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
<<<<<<< Updated upstream
        startDestination = NavigationState.Meals.route,
        modifier = modifier
    ) {
        composable(route = NavigationState.Meals.route) {
            MealsCategoriesScreen(navController)
        }
=======
        startDestination = NavigationState.Categories.route,
        modifier = modifier
    ) {
        composable(route = NavigationState.Categories.route) {
            MealsCategoriesScreen(navController)
        }
        composable(route = NavigationState.Meals.route + "/{category}") { backstackEntry ->
            MealsScreen(navController, backstackEntry.arguments?.getString("category") ?: "")
        }
>>>>>>> Stashed changes
    }
}