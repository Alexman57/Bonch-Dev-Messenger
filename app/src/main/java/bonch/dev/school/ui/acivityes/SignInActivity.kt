package bonch.dev.school.ui.acivityes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.Guideline
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragmenst

class SignInActivity : AppCompatActivity() {


    private lateinit var sing_Up_button : Button
    private lateinit var sing_In_button : Button
    private lateinit var email: EditText
    private lateinit var password : EditText
    private lateinit var text: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        initializeView()
        setListener()
    }

    private fun initializeView(){
        sing_Up_button = findViewById(R.id.sign_up_button)
        sing_In_button = findViewById(R.id.sign_in_button)
        email = findViewById(R.id.email_sign_in_edit_text)
        password = findViewById(R.id.password_sign_in_edit_text)
        text = findViewById(R.id.textView2)
    }

    private fun setListener() {
        sing_In_button.setOnClickListener{
            val intent = Intent(this, MainAppActivity::class.java )
            startActivity(intent)
        }
        sing_Up_button.setOnClickListener {
            val intent = Intent(this, SingUpActivity::class.java)
            startActivity(intent)
        }
    }

}
