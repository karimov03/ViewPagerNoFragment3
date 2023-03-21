package com.example.viewpager3.Data

import com.example.viewpager3.R

object MyPager {
    data class PagerData(
        val image:Int,
        val name:String,
        val about:String
    )
    val PagerList=ArrayList<PagerData>()

    fun AddList(){
        PagerList.add(PagerData(R.drawable.img1," Geoaxborot","Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin"))
        PagerList.add(PagerData(R.drawable.img2,"Huquqiy axborot","Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin"))
        PagerList.add(PagerData(R.drawable.img3," To'lovlar xizmatlari","To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin"))
        PagerList.add(PagerData(R.drawable.img4,"Qo'shimcha imkoniyat","Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin"))
    }
}