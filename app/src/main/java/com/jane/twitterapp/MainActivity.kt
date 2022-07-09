package com.jane.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jane.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweet()

    }
    fun displaytweet(){
        var twitter1= Tweet("Gumatorobba","@gumatoR","233","60","45","Being a software Development student is a privilege.","","","","")
        var twitter2= Tweet("Faith Mutua","@faithmuthua","200","100","78","Confidence my biggest achievement.","","","","")
        var twitter3= Tweet("Christine Wawira","@wawiramuthoni","10","20","87","As a student i found a best friend and a sister.","","","","")
        var twitter4= Tweet("Nancy Ngare","@wambuinancy","80","200","30","Being born as a designer is something i really love since it makes me to be more creative.","","","","")
        var twitter5= Tweet("Jane Ndung'u","@Ujanitah","300","40","68","Being the firstborn in the family and a role model is good thing","","","","")
        var twitter6= Tweet("Grace Waceke","@wacekegrace","290","45","44","Travelling and exploring being an adventure","","","","")
        var twitter7= Tweet("Brenda Murugi","@breebrenda","400","60","43","Thika my place of adventure and SciFi movies","","","","")
        var twitter8= Tweet("Winnie Mwangi","@winniemwa","480","70","76","I just love tatoos and found a Bestie in AkiraChix","","","","")
        var twitter9= Tweet("Maureen Kamau","@kamaunjiru","300","30","40","Practice to be a marshal and being the best student","","","","")
        var twitter10= Tweet("Judy Wanjiru","@Wjudy","150","10","30","Beautiful Beatrice the first name i said for people not to forget","","","","")

        var TwitterList = listOf(twitter1,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10)

        var twitterAdapter = TwitterRecyclerViewAdapter(TwitterList )
        binding.rvtweet.layoutManager= LinearLayoutManager(this)
        binding.rvtweet.adapter = twitterAdapter


    }

}