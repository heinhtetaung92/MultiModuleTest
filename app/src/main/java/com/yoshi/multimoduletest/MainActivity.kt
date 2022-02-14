package com.yoshi.multimoduletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.yoshi.core.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigation: BottomNavigationView

    @Inject
    lateinit var repository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.navigation)
        initBottomNavigation()


        Log.i("GetUserName", repository.getUserName())
        repository.saveUsername("Hein")
        Log.i("GetUserName", repository.getUserName())

    }

    private fun initBottomNavigation() {

        val navController = bottomNavigation.setupWithNavController(
            navGraphIds = listOf(
                R.navigation.nav_graph_list,
                R.navigation.nav_graph_favourite,
                R.navigation.nav_graph_settings
            ),
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_fragment,
            intent = this.intent
        )
    }

}