package io.github.rishivarma853.shifty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import io.github.rishivarma853.shifty.controllers.UserAuthController

open class MainActivity : AppCompatActivity() {

    lateinit var usernameLabel : EditText
    lateinit var passwordLabel : EditText
    lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameLabel = findViewById(R.id.inp_username)
        passwordLabel = findViewById(R.id.inp_password)
        loginButton = findViewById(R.id.btn_login)

        loginButton.setOnClickListener {
            if(UserAuthController().userIsAuthentic(usernameLabel.text.toString(), passwordLabel.text.toString())) {
                
            } else {
                usernameLabel.setError("Username or Password may be incorrect")
                passwordLabel.setError("Username or Password may be incorrect")
                loginButton.setError("Username or Password may be incorrect")
            }
        }

    }
}