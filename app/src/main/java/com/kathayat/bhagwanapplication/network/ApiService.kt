package com.kathayat.bhagwanapplication.network

import com.kathayat.bhagwanapplication.network.NetworkConstant.GET_GROUP_USERS
import com.kathayat.bhagwanapplication.network.NetworkConstant.UPDATE_USER_DETAILS
import com.kathayat.bhagwanapplication.network.NetworkConstant.UPDATE_USER_LOCATION
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST(UPDATE_USER_DETAILS)
    suspend fun updateUserDetails(
        @Body
        userDetails: String//UserDetails
    ): Response<String>    //<UserDetailsResponse>

    @POST(UPDATE_USER_LOCATION)
    suspend fun updateUserLocation(
        @Body
        locationUpdateRequest: String//LocationUpdateRequest

    ): Response<String>//<CommanResponse>

    @GET(GET_GROUP_USERS)
    suspend fun getGroupUsers(
        @Query("userId") userId:String
    ): Response<String>
}