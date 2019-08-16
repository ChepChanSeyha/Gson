package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()
        val topic = Topic(1, "gg", "lol", "haha")
        val json = gson.toJson(topic)
        println(json)


        val strJson = "{'id': 101, 'name': 'HelloWorld', 'image': 'gg', 'wrong': 'hahah'}"

        val strjson = gson.fromJson(strJson, Topic::class.java)
        println(strjson)
    }
}
