package com.example.myapplication.interfaces

interface LoginCallback {
    fun onSuccess(message: String)

    fun onError(message: String)
}
