package com.islam.shoe.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.islam.shoe.R
import com.islam.shoe.databinding.FragmentLoginBinding


class Login : Fragment() {
    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.btnLogin.setOnClickListener { view: View ->
            if (!viewModel.isPasswordValid(binding.edtPassword.text!!)) {
                Toast.makeText(context, "Password must be 8", Toast.LENGTH_SHORT).show()
            } else {
                binding.edtPassword.error = null
                view.findNavController().navigate(R.id.action_login_to_welcome)
            }
            if (!viewModel.isUserNameValid(binding.edtUserName.text!!)) {
                Toast.makeText(context, "user is right", Toast.LENGTH_SHORT).show()
            } else {
                binding.edtUserName.error = null
                view.findNavController().navigate(R.id.action_login_to_welcome)
            }
        }

        return binding.root
    }

}

