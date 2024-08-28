package com.kathayat.bhagwanapplication.usecases

import com.kathayat.bhagwanapplication.network.ApiService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun updateUserDetails(userDetails: String) =
        apiService.updateUserDetails(userDetails)

    suspend fun updateUserLocation(updateRequest: String) =
        apiService.updateUserLocation(updateRequest)

    suspend fun getGroupUsers(userId: String) = apiService.getGroupUsers(userId)
}