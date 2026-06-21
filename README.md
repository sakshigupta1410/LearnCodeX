# LearnCodeX

## Overview

LearnCodeX is a fully offline Android-based E-Learning application developed to provide an interactive, structured, and accessible platform for learning programming languages. The application enables users to learn from 25+ programming languages and technologies through organized lessons, quizzes, bookmarks, search functionality, and progress tracking within a user-friendly mobile environment.

Built using Kotlin, XML, Room Database, and Firebase Authentication, LearnCodeX follows an offline-first approach where all learning content is stored locally on the device. Users can access lessons, quizzes, and learning resources anytime without an internet connection. Internet access is required only for user authentication, including registration, login, and password recovery.

The platform is designed to help students, beginners, and programming enthusiasts learn coding concepts efficiently through structured content, interactive assessments, and a seamless mobile learning experience.

---

## Project Objectives

* Provide a single platform for learning multiple programming languages.
* Deliver high-quality learning content in an offline environment.
* Enable users to learn anytime and anywhere without internet dependency.
* Offer self-assessment through interactive quizzes.
* Provide a simple, modern, and user-friendly learning experience.

---

## Key Features

### User Authentication

* User Registration
* User Login
* Forgot Password
* Secure Firebase Authentication
* Session Management

### Offline Learning System

* Fully Offline Programming Lessons
* Room Database Integration
* Multi-Language Learning Content
* Structured Topic-Based Learning
* Markdown-Based Lesson Content
* Fast Local Data Access
* No Internet Required for Learning

### Quiz System

* Topic-Based Quizzes
* Multiple Choice Questions (MCQs)
* Instant Feedback
* Result Evaluation
* Performance Assessment

### User Experience

* Modern User Interface
* Navigation Drawer
* Search Functionality
* Bookmark Management
* Profile Management
* Onboarding Screens
* Responsive Layout Design

---

## Programming Languages & Technologies Available

- Python
- Java
- C
- C++
- Kotlin
- Dart
- PHP
- HTML
- CSS
- JavaScript
- TypeScript
- React
- Node.js
- SQL
- MySQL
- Flutter
- C#
- Go
- Rust
- Swift
- R
- Scala
- Perl
- Shell Scripting
- MATLAB
- And More...
---

## Technology Stack

### Frontend

* Kotlin
* XML
* Android Studio

### Authentication

* Firebase Authentication

### Local Database & Storage

* Room Database
* SharedPreferences

### Libraries & Tools

* AndroidX
* RecyclerView
* Markwon (Markdown Rendering)
* Glide
* Material Design Components

---

## Internet Usage

LearnCodeX is designed as an offline-first learning platform.

Internet connection is required only for:

* User Registration
* User Login
* Password Reset
* Authentication Verification

All lessons, quizzes, bookmarks, and learning content remain accessible offline after successful login.

---

## Project Architecture

```text
Presentation Layer
│
├── Activities
├── Fragments
├── XML Layouts
│
Business Logic Layer
│
├── Authentication Module
├── Lesson Management Module
├── Quiz Management Module
├── Bookmark Management Module
├── Search Module
│
Data Layer
│
├── Firebase Authentication
├── Room Database
├── SharedPreferences
└── Local Content Repository
```

---

## Screenshots

<table>
<tr>
<td align="center">
<b>Splash Screen</b><br>
<img src="screenshots/01_splash.png" width="250">
</td>
<td align="center">
<b>Onboarding Screen</b><br>
<img src="screenshots/02_onboarding.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Sign Up Screen</b><br>
<img src="screenshots/03_signup.png" width="250">
</td>
<td align="center">
<b>Registration Success</b><br>
<img src="screenshots/04_signup_success.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Login Screen</b><br>
<img src="screenshots/05_login.png" width="250">
</td>
<td align="center">
<b>Login Success</b><br>
<img src="screenshots/06_login_success.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Home Screen</b><br>
<img src="screenshots/07_home.png" width="250">
</td>
<td align="center">
<b>Navigation Drawer</b><br>
<img src="screenshots/08_drawer.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Profile Update</b><br>
<img src="screenshots/09_profile_update.png" width="250">
</td>
<td align="center">
<b>Profile Updated</b><br>
<img src="screenshots/10_profile_updated.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Remove Photo</b><br>
<img src="screenshots/11_remove_photo.png" width="250">
</td>
<td align="center">
<b>Courses Screen</b><br>
<img src="screenshots/12_courses.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Settings Screen</b><br>
<img src="screenshots/13_settings.png" width="250">
</td>
<td align="center">
<b>Share Screen</b><br>
<img src="screenshots/14_share.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>About Screen</b><br>
<img src="screenshots/15_about.png" width="250">
</td>
<td align="center">
<b>Logout Screen</b><br>
<img src="screenshots/16_logout.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Lessons Screen</b><br>
<img src="screenshots/17_lessons.png" width="250">
</td>
<td align="center">
<b>Lesson Detail</b><br>
<img src="screenshots/18_lesson_detail.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Lesson Content</b><br>
<img src="screenshots/19_lesson_content.png" width="250">
</td>
<td align="center">
<b>Lesson Summary</b><br>
<img src="screenshots/20_lesson_summary.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Quiz Screen</b><br>
<img src="screenshots/21_quiz.png" width="250">
</td>
<td align="center">
<b>Wrong Answer Dialog</b><br>
<img src="screenshots/22_wrong_answer.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Correct Answer Dialog</b><br>
<img src="screenshots/23_correct_answer.png" width="250">
</td>
<td align="center">
<b>Quiz Question</b><br>
<img src="screenshots/24_quiz_question.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Bookmarks</b><br>
<img src="screenshots/25_bookmarks.png" width="250">
</td>
<td align="center">
<b>Search Python</b><br>
<img src="screenshots/26_search_python.png" width="250">
</td>
</tr>

<tr>
<td align="center">
<b>Search Dart</b><br>
<img src="screenshots/27_search_dart.png" width="250">
</td>
<td align="center">
<b>No Results Found</b><br>
<img src="screenshots/28_no_results.png" width="250">
</td>
</tr>
</table>

---

## Installation Guide

### Clone Repository

```bash
git clone https://github.com/sakshigupta1410/LearnCodeX.git
```

### Setup Project

1. Open Android Studio.
2. Clone or download the repository.
3. Sync Gradle files.
4. Add your Firebase Authentication configuration.
5. Build the project.
6. Run the application on an Android device or emulator.

---

## Future Enhancements

* Additional Programming Languages
* Learning Progress Dashboard
* Enhanced Quiz Analytics
* Achievement System
* Learning Streak Tracking
* Advanced Programming Courses
* Course Completion Certificates
* Personalized Learning Experience

---

## Author

Sakshi Gupta

Bachelor of Science in Computer Science

GitHub: https://github.com/sakshigupta1410

---

## License

This project is intended for educational and portfolio purposes.

Copyright © 2026 Sakshi Gupta. All Rights Reserved.
