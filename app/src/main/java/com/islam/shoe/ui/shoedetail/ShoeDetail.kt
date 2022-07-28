package com.islam.shoe.ui.shoedetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.islam.shoe.R
import com.islam.shoe.databinding.FragmentShoeDetailBinding


class ShoeDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)

        binding.btnCancel.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_shoeDetail_to_shoeList)
        }

        return binding.root
    }


}