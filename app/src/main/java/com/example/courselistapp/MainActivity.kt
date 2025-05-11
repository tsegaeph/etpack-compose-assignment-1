package com.example.courselistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.courselistapp.components.CourseListScreen
import com.example.courselistapp.data.getSampleCourses
import com.example.courselistapp.ui.theme.CourseListAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseListAppTheme {
                AppContent()
            }
        }
    }
}

@Composable
fun AppContent() {
    var showCourseList by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.fillMaxSize()) {
        if (showCourseList) {
            CourseListScreen(courses = getSampleCourses())
        } else {
            LandingScreen(onContinue = {
                showCourseList = true
            })
        }
    }
}

@Composable
fun LandingScreen(onContinue: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course List App",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = onContinue) {
            Text("Continue")
        }
    }
}
