package com.yoshi.settings

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.yoshi.core.Constants
import com.yoshi.core.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SettingsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class SettingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var count = 1

    @Inject
    lateinit var repository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.i("SettingsFragment", "OnCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i("SettingsFragment", "OnCreateView")
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("SettingsFragment", "onViewCreated")

        Log.i("GetUserName", repository.getUserName())
        repository.saveUsername("Hein from Fragment")
        Log.i("GetUserName", repository.getUserName())


        val tvLabel = view.findViewById<TextView>(R.id.tv_label)
        tvLabel.setOnClickListener {
            findNavController().navigate(R.id.action_settingsFragment_to_profileFragment)
        }

        val tvCounter = view.findViewById<TextView>(R.id.tv_counter)
        tvCounter.text = count.toString()
        tvCounter.setOnClickListener {
            count++
            tvCounter.text = count.toString()
        }

        val tvRewards = view.findViewById<TextView>(R.id.tv_rewards)
        tvRewards.setOnClickListener {
            startActivity(createRewardsActivityIntent())
        }

    }

    private fun createRewardsActivityIntent() = Intent(Intent.ACTION_VIEW).apply {
        setClassName(
            "com.yoshi.multimoduletest",
            Constants.ACTIVITY_REWARDS
        )
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SettingsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}