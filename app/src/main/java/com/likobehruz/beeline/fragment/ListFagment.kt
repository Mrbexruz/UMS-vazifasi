package com.likobehruz.beeline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.likobehruz.beeline.R
import com.likobehruz.beeline.adapters.MyinfoAdapters
import com.likobehruz.beeline.adapters.RvAction
import com.likobehruz.beeline.databinding.FragmentListFagmentBinding
import com.likobehruz.beeline.models.MYInfo
import com.likobehruz.beeline.utils.MyData


class ListFagment : Fragment(), RvAction {
     lateinit var binding : FragmentListFagmentBinding
     lateinit var myinfoAdapters: MyinfoAdapters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentListFagmentBinding.inflate(layoutInflater)

        val position= arguments?.getInt("keyPosition")

        when(position){
            0->myinfoAdapters=MyinfoAdapters(this,MyData.tariflist)
            1->myinfoAdapters= MyinfoAdapters(this,MyData.Daqiqalist)
            2->myinfoAdapters= MyinfoAdapters(this,MyData.Internetlist)
            3->myinfoAdapters= MyinfoAdapters(this,MyData.SMSlist)

        }
        binding.rv.adapter= myinfoAdapters

        return binding.root
    }

    override fun itemclick(myInfo: MYInfo) {
        val bundle= bundleOf("keyInfo" to myInfo )
        val listFagment =InfoFragment()
        listFagment.arguments= bundle
        parentFragmentManager.beginTransaction()
            .replace(R.id.main, listFagment)
            .addToBackStack("Bek")
            .commit()

    }


}
