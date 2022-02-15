package com.yoshi.core.repository

interface UserRepository {

    fun getUserName(): String
    fun getPhoneNumber(): String
    fun saveUsername(name: String)
    fun savePhoneNumber(phone: String)

}