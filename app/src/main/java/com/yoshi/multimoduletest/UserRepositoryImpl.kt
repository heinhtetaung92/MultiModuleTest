package com.yoshi.multimoduletest

import com.yoshi.core.UserRepository
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class UserRepositoryImpl: UserRepository {
    private var name: String? = null
    private var phone: String? = null

    override fun getUserName(): String {
        return name ?: Constants.dummyName
    }

    override fun getPhoneNumber(): String {
        return phone ?: ""
    }

    override fun saveUsername(name: String) {
        this.name = name
    }

    override fun savePhoneNumber(phone: String) {
        this.phone = phone
    }
}