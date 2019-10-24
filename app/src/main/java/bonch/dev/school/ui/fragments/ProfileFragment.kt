package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.ui.acivityes.MainAppActivity

class ProfileFragment: Fragment() {

    private lateinit var change_Password : Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        change_Password = view.findViewById(R.id.change_password_button)
        setListeners()
        return view
    }

    private fun setListeners(){
        change_Password.setOnClickListener( View.OnClickListener {
            (context as MainAppActivity).replaceFragmentPassword()
        })
    }

}