package com.yoshi.core.di

import com.yoshi.core.SampleProvider
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface CoreDependencies {
    fun getSampleProvider(): SampleProvider
}