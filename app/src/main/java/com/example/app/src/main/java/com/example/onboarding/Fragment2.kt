package com.example.onboarding

import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    interface OnDataPass {
        fun onDataPass(name: String)
    }

    private lateinit var dataPasser: OnDataPass

    override fun onAttach(context: Context) {
        super.onAttach(context)
        dataPasser = context as OnDataPass
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val nameInput = view.findViewById<EditText>(R.id.editName)
        val btnContinue = view.findViewById<Button>(R.id.btnContinue)

        btnContinue.setOnClickListener {
            val name = nameInput.text.toString()
            dataPasser.onDataPass(name)
        }
    }
}
