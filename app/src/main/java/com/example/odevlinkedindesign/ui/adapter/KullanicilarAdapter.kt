package com.example.odevlinkedindesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.odevlinkedindesign.data.Kullanicilar
import com.example.odevlinkedindesign.databinding.KullaniciListItemBinding

class KullanicilarAdapter(var mContext: Context, var kullanicilarListesi:List<Kullanicilar>)
    : RecyclerView.Adapter<KullanicilarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: KullaniciListItemBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = KullaniciListItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kullanicilarListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {

        val kullanicilar = kullanicilarListesi.get(position)
        val t = holder.tasarim

        t.ivProfile.load(kullanicilar.profile)
        t.bannerView.load(kullanicilar.banner)
        t.tvUserName.text = "${kullanicilar.name}"
        t.tvUserInfo.text = "${kullanicilar.career}"
        t.tvUserUni.text = "${kullanicilar.connections}"

    }
}
