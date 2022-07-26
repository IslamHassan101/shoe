package com.islam.shoe.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.islam.shoe.R
import com.islam.shoe.databinding.FragmentWelcomeBinding

class Welcome : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)

        binding.btnGoInsta.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_welcome_to_instruction)
        }
        return binding.root
    }

}