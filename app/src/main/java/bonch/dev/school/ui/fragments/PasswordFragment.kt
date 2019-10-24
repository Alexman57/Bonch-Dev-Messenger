package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.Constraints.TAG
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import kotlinx.android.synthetic.main.fragment_profile.*

class PasswordFragment: Fragment() {

    private lateinit var acceptButton : Button
    private lateinit var dialog : PasswordFragment


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_password, container, false)
        initialise()
        setListener()
        return view
    }

    private fun initialise(){
        acceptButton = findViewById(R.id.change_password_button)
    }


    private fun setListener(){
        acceptButton.setOnClickListener(){
            Log.d(TAG, "closing dialog")
            dialog.dismiss()
        }
    }

}