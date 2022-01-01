package com.example.islami.ui.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.islami.R

class TasbehFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasbeh, container, false)
    }

    lateinit var tasbehNumberBotton: Button
    lateinit var zekerButton: Button
    lateinit var changeModeButton: Button
    var number: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        zekerButton.setOnClickListener {
            number++
            tasbehNumberBotton.text = number.toString()
        }

        changeModeButton.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

    }

    fun initViews() {
        tasbehNumberBotton = requireView().findViewById(R.id.taspeh_num_button)
        zekerButton = requireView().findViewById(R.id.zekt_name)
        changeModeButton = requireView().findViewById(R.id.change_mode)


    }

}