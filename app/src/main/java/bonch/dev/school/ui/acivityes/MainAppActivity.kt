package bonch.dev.school.ui.acivityes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragmenst
import bonch.dev.school.ui.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        attachFragment()
    }

    fun attachFragment() {
        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_1, ChatFragmenst())
            .commit()
    }

    fun replaceFragment(){
        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_1, ProfileFragment())
            .addToBackStack("second_fragment")
            .commit()
    }
}
