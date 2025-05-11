package com.example.courselistapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courselistapp.model.Course

@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 36.dp, start = 16.dp, end = 16.dp),  // Added top padding here
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseListScreenPreview() {
    CourseListScreen(
        courses = listOf(
            Course(
                title = "Introduction to Computer Science",
                code = "CS101",
                creditHours = 3,
                description = "An introduction to fundamental concepts in computer science.",
                prerequisites = "None"
            ),
            Course(
                title = "Advanced Algorithms",
                code = "CS201",
                creditHours = 4,
                description = "A deep dive into algorithms, their analysis, and optimization techniques.",
                prerequisites = "CS101"
            )
        )
    )
}
