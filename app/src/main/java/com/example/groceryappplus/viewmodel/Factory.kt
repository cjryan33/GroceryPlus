package com.example.retrofitdemo1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitdemo1.model.repository.Repository

class Factory(private val repository: Repository) :ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DogViewModel(repository) as T
    }
}