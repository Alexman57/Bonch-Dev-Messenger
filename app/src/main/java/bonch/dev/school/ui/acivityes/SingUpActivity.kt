package bonch.dev.school.ui.acivityes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import bonch.dev.school.R
import kotlin.math.log

class SingUpActivity : AppCompatActivity() {

    private lateinit var email_Sing_Up_edit_text : EditText
    private lateinit var login : EditText
    private lateinit var text : TextView
    private lateinit var password_Sing_Up : EditText
    private lateinit var password_Confirm : EditText
    private lateinit var complete_Sing_Up_button : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        initializeView()
        setListener()
    }

    private fun initializeView(){
        email_Sing_Up_edit_text = findViewById(R.id.email_sing_up_et)
        login = findViewById(R.id.login_et)
        text = findViewById(R.id.textView)
        password_Sing_Up = findViewById(R.id.password_sing_up_et)
        password_Confirm = findViewById(R.id.password_confirm_et)
        complete_Sing_Up_button = findViewById(R.id.complete_sing_button)

    }

    private fun setListener(){
        complete_Sing_Up_button.setOnClickListener {
            val intent = Intent(this, MainAppActivity::class.java)
            startActivity(intent)
        }
    }


}
