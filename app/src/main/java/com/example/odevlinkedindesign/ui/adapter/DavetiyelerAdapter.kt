package com.example.odevlinkedindesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.odevlinkedindesign.data.Davetiyeler
import com.example.odevlinkedindesign.databinding.DavetiyelerListItemBinding

class DavetiyelerAdapter(var mContext: Context, var davetiyelerListesi:List<Davetiyeler>)
    : RecyclerView.Adapter<DavetiyelerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:DavetiyelerListItemBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = DavetiyelerListItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int { // kaç tane tasarım gösterecek
        return davetiyelerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val davetiyeler = davetiyelerListesi.get(position)
        val t = holder.tasarim
        t.ivProfile.load(davetiyeler.profile)
        t.tvSayfa.text = "${davetiyeler.page}"
        t.tvDepartman.text = "${davetiyeler.department}"
        t.tvDavet.text = "${davetiyeler.invitation}"
        t.tvGun.text = "${davetiyeler.day}"
    }
}