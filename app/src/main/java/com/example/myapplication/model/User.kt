package com.example.myapplication.model

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable

class User(private var email: String, private var password: String) : BaseObservable() {

    val valid: Boolean
        get() = !TextUtils.isEmpty(email) &&
                Patterns.EMAIL_ADDRESS.matcher(email).matches() &&
                !TextUtils.isEmpty(password) &&
                password.length > 5

    fun setEmail(email: String) {
        this.email = email
    }

    fun getEmail(): String {
        return email
    }

    fun setPassword(password: String) {
        this.password = password
    }

    fun getPassword(): String {
        return password
    }
}
