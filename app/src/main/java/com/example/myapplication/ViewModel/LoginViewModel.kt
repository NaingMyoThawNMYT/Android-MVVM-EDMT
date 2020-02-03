package com.example.myapplication.ViewModel

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.myapplication.interfaces.LoginCallback
import com.example.myapplication.model.User

class LoginViewModel(private val listener: LoginCallback) : ViewModel() {
    private val user: User

    init {
        user = User("", "")
    }

    // Create function to set Email after user finishing enter text
    val emailTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setEmail(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }

    // Create function to set Password after user finishing enter text
    val passwordTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setPassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }

    fun onLogin(v: View) {
        if (user.valid) {
            listener.onSuccess("Login Success")
        } else {
            listener.onError("Login Fail")
        }
    }
}
