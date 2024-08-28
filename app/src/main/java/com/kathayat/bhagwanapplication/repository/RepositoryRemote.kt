package com.kathayat.bhagwanapplication.repository

import com.kathayat.bhagwanapplication.network.BaseNetworkResponse
import com.kathayat.bhagwanapplication.network.NetworkResult
import com.kathayat.bhagwanapplication.usecases.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RepositoryRemote @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseNetworkResponse() {

    suspend fun updateUserDetails(requestFcm: String): Flow<NetworkResult<String>> {
        return flow {
            emit(safeApiCall { remoteDataSource.updateUserDetails(requestFcm) })
        }
    }

    suspend fun getGroupUser(userId: String): Flow<NetworkResult<String>> {
        return flow {
            emit(safeApiCall { remoteDataSource.getGroupUsers(userId) })
        }
    }}