package com.example.courselistapp.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.courselistapp.model.Course
import com.example.courselistapp.ui.theme.CourseListAppTheme

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    // Card with rounded corners
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(animationSpec = tween(durationMillis = 300)),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(12.dp) // Make the corners rounded
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp) // Padding inside the card
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween // Ensure icon is aligned to the right
            ) {
                Column(
                    modifier = Modifier.weight(1f) // Ensure the text takes up the available space
                ) {
                    Text(
                        text = course.title,
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Code: ${course.code}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Text(
                        text = "Credits: ${course.creditHours}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                // Dropdown icon to expand/collapse content
                IconButton(
                    onClick = { isExpanded = !isExpanded },
                    modifier = Modifier.padding(start = 8.dp) // Add some spacing to the left of the icon
                ) {
                    if (isExpanded) {
                        Icon(Icons.Filled.ArrowDropUp, contentDescription = "Collapse")
                    } else {
                        Icon(Icons.Filled.ArrowDropDown, contentDescription = "Expand")
                    }
                }
            }

            // Expanded content
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Description: ${course.description}",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Prerequisites: ${course.prerequisites}",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CourseCardPreview() {
    CourseListAppTheme(darkTheme = false) { // Light mode preview
        CourseCard(
            course = Course(
                title = "Introduction to Computer Science",
                code = "CS101",
                creditHours = 3,
                description = "An introduction to fundamental concepts in computer science.",
                prerequisites = "None"
            )
        )
    }
}

@Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CourseCardPreviewDark() {
    CourseListAppTheme(darkTheme = true) { // Dark mode preview
        CourseCard(
            course = Course(
                title = "Introduction to Computer Science",
                code = "CS101",
                creditHours = 3,
                description = "An introduction to fundamental concepts in computer science.",
                prerequisites = "None"
            )
        )
    }
}
