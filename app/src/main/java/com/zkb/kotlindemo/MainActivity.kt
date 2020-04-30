package com.zkb.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var  loginViewModel:UserLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginViewModel =  ViewModelProvider(this).get(UserLoginViewModel::class.java)

        val editName = findViewById<EditText>(R.id.editName)
        val editPwd = findViewById<EditText>(R.id.editPwd)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {

            if (editName.text.isEmpty()) {
                Toast.makeText(this, "user name is empty,please enter a user name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            if (editPwd.text.isEmpty()) {
                Toast.makeText(this, "password is empty,please enter a password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }

            loginViewModel.login(editName.text.toString(),editPwd.text.toString())
           //
        }


        loginViewModel._loginResult.observe(this, Observer {
            val info = it.userInfo ?: return@Observer


            if(it.errorType==1&&!info.name.isNullOrBlank()){

                Toast.makeText(this, " login success welcome ${info.name}!", Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(this, " login success fail", Toast.LENGTH_SHORT).show()
            }

        })

    }

}
