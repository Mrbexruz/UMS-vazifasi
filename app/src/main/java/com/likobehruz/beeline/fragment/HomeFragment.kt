package com.likobehruz.beeline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.likobehruz.beeline.R
import com.likobehruz.beeline.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
     lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {

            btnTariflar.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 0 )
                val listFagment =ListFagment()
                listFagment.arguments= bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFagment)
                    .addToBackStack("Bek")
                    .commit()
            }
            btnDaqiqalar.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 1 )
                val listFagment =ListFagment()
                listFagment.arguments= bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFagment)
                    .addToBackStack("Bek")
                    .commit()
            }
            btnInternet.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 2 )
                val listFagment =ListFagment()
                listFagment.arguments= bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFagment)
                    .addToBackStack("Bek")
                    .commit()
            }
            btnSms.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 3 )
                val listFagment =ListFagment()
                listFagment.arguments= bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.main, listFagment)
                    .addToBackStack("Bek")
                    .commit()
            }
        }



        return binding.root
    }


    }
