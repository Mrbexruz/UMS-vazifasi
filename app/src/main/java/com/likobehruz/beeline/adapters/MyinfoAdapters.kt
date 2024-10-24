package com.likobehruz.beeline.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.likobehruz.beeline.databinding.ItemrvBinding
import com.likobehruz.beeline.models.MYInfo

class MyinfoAdapters(var rvAction:RvAction, var list: List<MYInfo>) : RecyclerView.Adapter<MyinfoAdapters.Vh>() {
    inner class Vh(var itemrvBinding: ItemrvBinding) : RecyclerView.ViewHolder(itemrvBinding.root) {
        fun onBind(myInfo: MYInfo) {
            itemrvBinding.tvName.text = myInfo.name
            itemrvBinding.usssd.text = myInfo.code
            itemrvBinding.tvAbout.text = myInfo.about
            itemrvBinding.root.setOnClickListener {
                rvAction.itemclick(myInfo)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemrvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}

interface RvAction {
    fun itemclick(myInfo: MYInfo)
}