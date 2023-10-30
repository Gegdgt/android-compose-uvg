package com.zezzi.eventzezziapp.data.repository

import com.zezzi.eventzezziapp.data.networking.MealsWebService
import com.zezzi.eventzezziapp.data.networking.response.MealsCategoriesResponse
<<<<<<< Updated upstream

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
=======
import com.zezzi.eventzezziapp.data.networking.response.MealsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    suspend fun getCategories(): MealsCategoriesResponse {
        return withContext(Dispatchers.IO) {
            webService.getCategories()
        }
    }
    suspend fun getMealsByCategory(category: String): MealsResponse {
        return withContext(Dispatchers.IO) {
            webService.getMealsByCategory(category)
        }
>>>>>>> Stashed changes
    }
}