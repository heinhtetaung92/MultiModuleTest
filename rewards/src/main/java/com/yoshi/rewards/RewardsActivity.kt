package com.yoshi.rewards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yoshi.core.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class RewardsActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)

        Log.i("RewardsActivity", repository.getUserName())


    }
}