package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.ui.acivityes.MainAppActivity

class ChatFragmenst: Fragment() {

    private lateinit var next_Button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        next_Button = view.findViewById(R.id.send)
        setListeners()
        return view
    }

    private fun setListeners(){
        next_Button.setOnClickListener( View.OnClickListener {
            (context as MainAppActivity).replaceFragment()
        })
    }
}
