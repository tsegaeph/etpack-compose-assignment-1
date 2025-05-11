# Jetpack Compose Assignment 1

This is a simple Android application built using **Jetpack Compose** that displays a list of academic courses. Each course card shows the course title, code, and credit hours, and includes a dropdown icon to expand and show additional details like description and prerequisites.

## 🚀 Features

- Built entirely with **Jetpack Compose**
- Displays a list of courses using `LazyColumn`
- Expandable course cards with dropdown animation
- State management using `rememberSaveable`
- Theming and styling with **Material 3**
- Light and Dark theme support
- Smooth UI animations with `animateContentSize`
- Sample data included

## 📁 Project Structure

CourseListApp/
├── MainActivity.kt # Hosts the landing screen and navigation
├── ui/
│ ├── CourseCard.kt # Reusable CourseCard composable
│ └── CourseListScreen.kt # Displays the list of courses
├── model/
│ └── Course.kt # Course data model and sample course list
├── ui/theme/
│ ├── Color.kt # Custom colors
│ ├── Theme.kt # Light/Dark themes and color schemes
│ ├── Shape.kt # Rounded corners and shapes
│ └── Type.kt # Typography styles
