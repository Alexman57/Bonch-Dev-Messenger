package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.Constraints.TAG
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import kotlinx.android.synthetic.main.fragment_profile.*

class DialogFragment: Fragment() {

    private lateinit var dialog : PasswordFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dialog, fragment_container_2, false)
        setListener()
        return view

    }

    fun setListener(){
        change_password_button.setOnClickListener(){

            Log.d(TAG, "Opening Dialog")
            dialog.show(fragmentManager, "PasswordFragment")
        }
    }
}