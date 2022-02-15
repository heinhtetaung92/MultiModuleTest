package com.yoshi.core.di

import android.content.Context
import com.yoshi.core.SampleProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CoreModule {

    @Singleton
    @Provides
    fun provideSampleProvider(context: Context): SampleProvider = SampleProvider(context = context)

}