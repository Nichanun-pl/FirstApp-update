package com.example.firstapp.Database

import androidx.lifecycle.LiveData

class UserRepository (private val userDAO: UserDao){

    val readAllDate: LiveData<List<User>> = userDAO.readAllDate()

    suspend fun addUser(user: User){
        userDAO.addUser(user)
    }
}