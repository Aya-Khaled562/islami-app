package com.example.islami.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.ui.home.fragments.HadethFragment
import com.example.islami.ui.home.fragments.QuranFragment
import com.example.islami.ui.home.fragments.RadioFragment
import com.example.islami.ui.home.fragments.TasbehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var buttomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttomNavigation = findViewById(R.id.bottom_navigation_bar)
        buttomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { menueItem ->
            if (menueItem.itemId == R.id.navigation_quran) {
                pushFragment(QuranFragment())
            } else if (menueItem.itemId == R.id.navigation_hadeth) {
                pushFragment(HadethFragment())
            } else if (menueItem.itemId == R.id.navigation_sebha) {
                pushFragment(TasbehFragment())
            } else if (menueItem.itemId == R.id.navigation_radio) {
                pushFragment(RadioFragment())
            }

            return@OnItemSelectedListener true

        })
        buttomNavigation.selectedItemId = R.id.navigation_quran
    }

    fun pushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}