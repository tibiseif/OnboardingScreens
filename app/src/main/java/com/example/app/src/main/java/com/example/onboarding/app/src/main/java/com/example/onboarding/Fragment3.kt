package com.example.onboarding

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class Fragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val name = arguments?.getString("name") ?: ""
        val tvWelcome = view.findViewById<TextView>(R.id.tvWelcome)
        val checkConfirm = view.findViewById<CheckBox>(R.id.checkConfirm)
        val btnContinue = view.findViewById<Button>(R.id.btnContinue)

        tvWelcome.text = "Welcome, $name!"

        checkConfirm.setOnCheckedChangeListener { _, isChecked ->
            btnContinue.isEnabled = isChecked
            btnContinue.text = if (isChecked) "Finish" else "Continue"
        }
    }
}
