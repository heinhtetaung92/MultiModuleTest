package com.yoshi.multimoduletest

import com.yoshi.core.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object RepositoryModule {
    @Provides
    fun bindUserRepository(): UserRepository = UserRepositoryImpl()
}