package com.example.ebedelapp.model

data class Course (
    val courseCode: String,
    val courseTitle: String,
    val instructorId: Int,
    val instructor: String,
    val room: String,
    val building: String,
    val beginTime: Int,
    val endTime: Int,
    val photo: String
)
