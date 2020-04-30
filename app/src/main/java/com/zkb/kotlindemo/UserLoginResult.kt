package com.zkb.kotlindemo

data class UserLoginResult(
    var userInfo: UserInfo?=null,
    var errorType: Int? = null
)

class UserInfo (

    var name: String ? = null

)
