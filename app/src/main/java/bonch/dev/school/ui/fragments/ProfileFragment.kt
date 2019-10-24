package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.Constraints.TAG
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import bonch.dev.school.ui.acivityes.MainAppActivity

class ProfileFragment: Fragment() {

    private lateinit var change_Password : Button
    private lateinit var image_avatar: ImageView
    private lateinit var dialog : PasswordFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        change_Password = view.findViewById(R.id.change_password_button)
        image_avatar = view.findViewById(R.id.avatar_image_view)
        image_avatar.setImageResource(R.drawable.avatar)
        setListeners()
        return view
    }

    private fun setListeners(){
        change_Password.setOnClickListener( View.OnClickListener {
            fragmentManager
                .beginTransaction()
                 Log.d(TAG, "Opening Dialog")
                dialog.show(fragmentManager, "PasswordFragment").commit()
        })
    }

}