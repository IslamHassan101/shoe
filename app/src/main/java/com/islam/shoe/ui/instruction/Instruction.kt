package com.islam.shoe.ui.instruction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.islam.shoe.R
import com.islam.shoe.databinding.FragmentInstructionBinding


class Instruction : Fragment() {
    private lateinit var viewModel: InstructionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        viewModel = ViewModelProvider(this).get(InstructionViewModel::class.java)

        val binding: FragmentInstructionBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_instruction, container, false)

        binding.btnGoShoeList.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_instruction_to_shoeList)
        }
        return binding.root
    }

}