package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.Constraints.TAG
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import kotlinx.android.synthetic.main.fragment_profile.*

class PasswordFragment: DialogFragment() {

    private lateinit var acceptButton : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        acceptButton = view!!.findViewById(R.id.change_password_button)
        setListener()
        return view
    }

    override fun onStart(){
        super.onStart()
            dialog!!.window!!.setLayout(800, 800)
    }
    
    private fun setListener(){
        acceptButton.setOnClickListener(){
            Log.d(TAG, "closing dialog")
            dialog!!.dismiss()
        }
    }

}