package com.yoshi.core

interface UserRepository {

    fun getUserName(): String
    fun getPhoneNumber(): String
    fun saveUsername(name: String)
    fun savePhoneNumber(phone: String)

}