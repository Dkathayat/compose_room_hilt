package com.kathayat.bhagwanapplication.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kathayat.bhagwanapplication.network.NetworkResult
import com.kathayat.bhagwanapplication.repository.RepositoryRemote
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val remoteRepository: RepositoryRemote
) : ViewModel() {

    private val _groupUserOnce = MutableLiveData<NetworkResult<String>>()
    val groupUserOnce: LiveData<NetworkResult<String>> = _groupUserOnce

    fun addFcmToGroup(requestFcm: String) = viewModelScope.launch {
        remoteRepository.getGroupUser(requestFcm).collect {
            Log.d("RemoteFcmGroup", "User added to fmc group ${it.data}")
            _groupUserOnce.value = it
        }
    }
}
