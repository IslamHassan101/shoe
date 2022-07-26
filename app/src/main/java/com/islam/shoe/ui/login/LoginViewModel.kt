package com.islam.shoe.ui.login

import android.text.Editable
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {

     fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }

     fun isUserNameValid(text: Editable?): Boolean {
        return text != null && text.equals("eslam101@email.com")
    }
}