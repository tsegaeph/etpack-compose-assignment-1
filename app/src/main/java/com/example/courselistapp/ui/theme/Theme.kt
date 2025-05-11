package com.example.courselistapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Define light and dark color schemes
private val LightColors = lightColorScheme(
    primary = Color(0xFF3949A6), // Example primary color
    secondary = Color(0xFF03DAC6), // Example secondary color
    background = Color(0xFF9EBCC0),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFBB86FC), // Example primary color for dark theme
    secondary = Color(0xFF03DAC6), // Example secondary color for dark theme
    background = Color(0xFF121213),
    surface = Color(0xFF333333),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun CourseListAppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}
