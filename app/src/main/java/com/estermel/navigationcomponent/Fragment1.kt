package com.estermel.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import androidx.navigation.Navigation


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            Toast.makeText(
                activity,
                it.getString(ORIGIN_KEY),
                Toast.LENGTH_SHORT
            ).show()
        }

        btnGoToFragment2.setOnClickListener {
            val navController = Navigation.findNavController(activity!!, R.id.nav_controller)
            navController.navigate(R.id.action_global_fragment2)
        }
    }

    companion object {
        const val ORIGIN_KEY = "origin"
    }

}