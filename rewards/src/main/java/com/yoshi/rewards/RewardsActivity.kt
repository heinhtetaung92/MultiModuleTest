package com.yoshi.rewards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yoshi.core.SampleProvider
import com.yoshi.core.di.CoreDependencies
import com.yoshi.rewards.di.DaggerRewardsComponent
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject


class RewardsActivity : AppCompatActivity() {

    @Inject
    lateinit var toastProvider: SampleProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

//        Log.i("RewardsActivity", repository.getUserName())
        initDependencies()
        toastProvider.showToast("Hey, greeting from Provider")


    }

    private fun initDependencies() {
        DaggerRewardsComponent.factory()
            .coreDependency(
                EntryPointAccessors.fromApplication(application, CoreDependencies::class.java)
            ).inject(this)
    }

}