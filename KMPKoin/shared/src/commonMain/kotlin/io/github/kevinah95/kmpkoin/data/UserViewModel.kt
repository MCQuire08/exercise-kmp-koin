package io.github.kevinah95.kmpkoin.data

import androidx.lifecycle.ViewModel

// Agregamos ": ViewModel()" para que la clase herede de ViewModel
class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getGreeting(): String = "Hello, ${userRepository.getUsers().firstOrNull()?.name ?: "Guest"}!"

    fun getUsers() = userRepository.getUsers()
}