package com.zkb.kotlindemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class UserLoginViewModel : ViewModel() {

    val _loginResult = MutableLiveData<UserLoginResult>()
    fun login(name: String, password: String) {

        if (password == "123") {
            loginResult()
        } else {
            loginFail()
        }

    }

    fun loginResult() {


        _loginResult.value = UserLoginResult(errorType = 1, userInfo = UserInfo(name = "kang"))
    }

    fun loginFail() {


        _loginResult.value = UserLoginResult(errorType = 0)
    }



    ///mmmmdddddd
    override fun onCleared() {
        super.onCleared()
    }
}