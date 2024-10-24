package com.likobehruz.beeline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.beeline.R
import com.likobehruz.beeline.databinding.FragmentInfoBinding
import com.likobehruz.beeline.models.MYInfo
import java.io.Serializable


class InfoFragment : Fragment() {
    lateinit var binding : FragmentInfoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding= FragmentInfoBinding.inflate(layoutInflater)

        val myInfo = arguments?.getSerializable("keyInfo") as MYInfo
        binding.tvInfo.text=myInfo.toString()

        return binding.root
    }


    }
