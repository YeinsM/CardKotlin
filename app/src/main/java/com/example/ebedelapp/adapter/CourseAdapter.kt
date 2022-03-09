package com.example.ebedelapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ebedelapp.R
import com.example.ebedelapp.model.Course

// Get info from CourseProvider and put this info in the RecyclerView
class CourseAdapter(private val courseList: List<Course>) :
    RecyclerView.Adapter<CourseViewHolder>() {

    //    Get attributes and draw this attribs, use the layout in this method
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
//    You need a context, you can get it through any view in this case (parent = viewGroup)
//    Don't pass context directly in recyclerViews
        val layoutInflater = LayoutInflater.from(parent.context);
        return CourseViewHolder(layoutInflater.inflate(R.layout.item_course, parent, false));
    }

    //    Iterate in each item and call the superhero render
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val item = courseList[position]
        holder.render(item)
    }

    //    Method return list size
    override fun getItemCount(): Int = courseList.size
}