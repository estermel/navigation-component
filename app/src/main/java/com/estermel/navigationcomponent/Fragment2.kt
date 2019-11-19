package com.estermel.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_two.*

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnGoToFragment1.setOnClickListener {
            val origin = "I am from Fragment 2"
            val bundle = bundleOf(Fragment1.ORIGIN_KEY to origin)
            val navController = Navigation.findNavController(activity!!, R.id.nav_controller)
            navController.navigate(R.id.action_fragment2_to_fragment1, bundle)
        }
    }

}