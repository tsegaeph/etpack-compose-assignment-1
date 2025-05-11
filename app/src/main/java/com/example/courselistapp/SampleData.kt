package com.example.courselistapp.data

import com.example.courselistapp.model.Course

fun getSampleCourses(): List<Course> {
    return listOf(
        Course(
            title = "Introduction to Computer Science",
            code = "CS101",
            creditHours = 3,
            description = "An introductory course in computer science, covering basic programming concepts and algorithms.",
            prerequisites = "None"
        ),
        Course(
            title = "Data Structures and Algorithms",
            code = "CS201",
            creditHours = 4,
            description = "A course focused on the implementation and analysis of data structures and algorithms.",
            prerequisites = "CS101"
        ),
        Course(
            title = "Operating Systems",
            code = "CS301",
            creditHours = 3,
            description = "A study of the fundamentals of operating systems, including processes, memory management, and file systems.",
            prerequisites = "CS101"
        ),
        Course(
            title = "Software Engineering",
            code = "CS401",
            creditHours = 4,
            description = "An overview of software engineering principles, including requirements gathering, design, and testing.",
            prerequisites = "CS201"
        ),
        Course(
            title = "Artificial Intelligence",
            code = "CS601",
            creditHours = 4,
            description = "An introduction to artificial intelligence, covering topics such as machine learning, neural networks, and search algorithms.",
            prerequisites = "CS201"
        ),
        Course(
            title = "Database Systems",
            code = "CS501",
            creditHours = 4,
            description = "A course on relational database systems, including database design, SQL, and database management systems.",
            prerequisites = "CS101"
        )
    )
}


