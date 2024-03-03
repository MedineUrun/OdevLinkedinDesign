package com.example.odevlinkedindesign.data

import java.io.Serializable

data class Kullanicilar(val id:Int,
                        val name:String,
                        val career:String,
                        val connections:String,
                        val profile:String,
                        val banner:String):
    Serializable {

}