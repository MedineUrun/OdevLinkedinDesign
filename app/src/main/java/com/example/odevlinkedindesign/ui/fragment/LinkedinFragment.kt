package com.example.odevlinkedindesign.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odevlinkedindesign.R
import com.example.odevlinkedindesign.data.Davetiyeler
import com.example.odevlinkedindesign.data.Kullanicilar
import com.example.odevlinkedindesign.databinding.FragmentLinkedinBinding
import com.example.odevlinkedindesign.ui.adapter.DavetiyelerAdapter
import com.example.odevlinkedindesign.ui.adapter.KullanicilarAdapter

class LinkedinFragment : Fragment() {
    private lateinit var binding: FragmentLinkedinBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLinkedinBinding.inflate(inflater, container, false)

        val kullanicilarListesi = ArrayList<Kullanicilar>()
        val k1 = Kullanicilar(
            1,
            "Medine Bozkurt",
            "Computer Engineering Software Developer",
            "15 ortak bağlantı",
            "https://media.licdn.com/dms/image/D4D35AQHYpWqN4s2Xlg/profile-framedphoto-shrink_200_200/0/1700635966474?e=1709654400&v=beta&t=weOUDhPSvc6LZRIBnD1PT6jWzWyoREx2OH5J2y38qUw",
            "https://images.unsplash.com/photo-1614851099175-e5b30eb6f696?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80"
        )
        val k2 = Kullanicilar(
            2,
            "Kasım Adalan",
            "Android - IOS Developer and Trainer",
            "34 ortak bağlantı",
            "https://media.licdn.com/dms/image/D4D03AQEb34W15rkQew/profile-displayphoto-shrink_200_200/0/1685118386423?e=1714608000&v=beta&t=XPMevzahq3JhBfQsfJfSmxJdRdYm1hPEwuWfgdS_Bek",
            "https://media.licdn.com/dms/image/D4D16AQHPRwf5FcGPmw/profile-displaybackgroundimage-shrink_350_1400/0/1691915935392?e=1714608000&v=beta&t=f0bh7ENSEE9tghV7c4m1Y59jnT1IkF9n6aqlOVJDRaY"
        )
        kullanicilarListesi.add(k1)
        kullanicilarListesi.add(k2)

        val kullanicilarAdapter = KullanicilarAdapter(requireContext(), kullanicilarListesi)
        binding.kullanicilarRv.adapter = kullanicilarAdapter
        binding.kullanicilarRv.layoutManager = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)


        val davetiyelerListesi = ArrayList<Davetiyeler>()
        val d1 = Davetiyeler(
            1,
            "https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80",
            "Sayfa",
            "Yazılım Geliştirme",
            "Derya Bahar, sizi Google, şirketini takip etmeniz için davet etti",
            "2 Gün Önce"
        )
        val d2 = Davetiyeler(
            2,
            "https://images.unsplash.com/photo-1568602471122-7832951cc4c5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1170&q=80",
            "Sayfa",
            "Yazılım Geliştirme",
            "Ahmet Kaya, sizi Cresoft, şirketini takip etmeniz için davet etti",
            "10 Gün Önce"
        )

        davetiyelerListesi.add(d1)
        davetiyelerListesi.add(d2)

        val davetiyelerAdapter = DavetiyelerAdapter(requireContext(), davetiyelerListesi)
        binding.davetiyelerRv.adapter = davetiyelerAdapter
        binding.davetiyelerRv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        return binding.root
    }
}