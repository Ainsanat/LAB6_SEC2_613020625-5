package com.example.lab6menufragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.view.*
import java.util.zip.Inflater


class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = ThreeFragment()
            replaceFragment(fragment)
        }
        return view

    }
    fun replaceFragment(someFragment: Fragment){
        fragmentManager!!.beginTransaction()
            .replace(R.id.frameLayout, someFragment)
            .addToBackStack(null)
            .commit()
    }

}