package com.example.ebedelapp.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ebedelapp.databinding.ItemCourseBinding
import com.example.ebedelapp.model.Course

// This class draw each item of our courseList
// Here u need receive for parameters the View
class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    //    This val can reduce the process in ViewHolder
    val binding = ItemCourseBinding.bind(view)

//    With the before val isn't needed use this declarations

//    val courseCode = view.findViewById<TextView>(R.id.cCode)
//    val courseTitle = view.findViewById<TextView>(R.id.cTitle)
//    val instructorId = view.findViewById<TextView>(R.id.instructorId)
//    val instructor = view.findViewById<TextView>(R.id.instructor)
//    val building = view.findViewById<TextView>(R.id.building)
//    val room = view.findViewById<TextView>(R.id.room)
//    val beginTime = view.findViewById<TextView>(R.id.bTime)
//    val endTime = view.findViewById<TextView>(R.id.eTime)

    //    This function get a callback for each item in list Course
    fun render(courseModel: Course) {
//        Now we can get access directly into IDs in the item_course.XML
        Glide.with(binding.ivPhoto.context).load(courseModel.photo).into(binding.ivPhoto)
        binding.cCode.text = " " + courseModel.courseCode
        binding.cTitle.text = " " + courseModel.courseTitle
        binding.instructorId.text = " " + courseModel.instructorId
        binding.instructor.text = " " + courseModel.instructor
        binding.building.text = " " + courseModel.building
        binding.room.text = " " + courseModel.room
        binding.bTime.text = " " + courseModel.beginTime
        binding.eTime.text = " " + courseModel.endTime

//        ClickListener
        binding.ivPhoto.setOnClickListener {
            Toast.makeText(
                binding.ivPhoto.context,
                courseModel.courseTitle,
                Toast.LENGTH_SHORT
            ).show()
        }

//        This is a listener that show an event in function of a click on item
    }
}
