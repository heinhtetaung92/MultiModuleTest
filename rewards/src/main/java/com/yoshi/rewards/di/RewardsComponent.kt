package com.yoshi.rewards.di

import com.yoshi.core.di.CoreDependencies
import com.yoshi.rewards.RewardsActivity
import dagger.Component

@Component(dependencies = [CoreDependencies::class])
interface RewardsComponent {

    fun inject(activity: RewardsActivity)

    @Component.Factory
    interface Factory {
        fun coreDependency(dependencies: CoreDependencies): RewardsComponent
    }

}