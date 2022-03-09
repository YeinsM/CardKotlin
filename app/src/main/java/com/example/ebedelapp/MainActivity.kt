package com.example.ebedelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebedelapp.adapter.CourseAdapter
import com.example.ebedelapp.databinding.ActivityMainBinding
import com.example.ebedelapp.model.CourseProvider

class MainActivity : AppCompatActivity() {

//    This var just connect my binding with XML activityMain
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        CourseProvider.courseList
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerCourse.layoutManager = LinearLayoutManager(this)
        binding.recyclerCourse.adapter = CourseAdapter(CourseProvider.courseList)
    }
}