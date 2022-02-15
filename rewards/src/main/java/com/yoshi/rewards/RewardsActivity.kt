package com.yoshi.rewards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.yoshi.core.SampleProvider
import com.yoshi.core.repository.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class RewardsActivity : AppCompatActivity() {

    private val viewModel: SampleViewModel by viewModels()

    @Inject
    lateinit var toastProvider: SampleProvider

    @Inject
    lateinit var repo: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

//        viewModel.showToast(this)
        toastProvider.showToast(repo.getUserName())


    }

}