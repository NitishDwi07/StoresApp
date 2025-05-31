# Smart Store Finder App
 A multi-category store locator app that helps users find nearby stores, including food, grocery, electronics, and more.

Key Features:

- Find nearby stores across multiple categories
- Real-time updates and efficient data flow using Firebase Realtime Database and MVVM architecture
- Seamless navigation with Google Maps API integration

## Demo

https://drive.google.com/file/d/1d-2TwIf58ydOTmynvvfqiQE2F4NijUiG/view?usp=drivesdk

### Note :
To integrate Google Map Follow the following steps after cloning the github Repo:


1. Go to the Google Cloud Console website (http://console.cloud.google.com/) and create a new project.
2. Click on "Select a project" and then "New Project."
3. Enter a project name, select an organization (if applicable), and click "Create."

4. In the sidebar, click on "APIs & Services" > "Dashboard."
5. Click on "Enable APIs and Services" and search for "Google Maps Android API."
6. Click on "Google Maps Android API" and click on the "Enable" button.

7. Click on "Navigation menu" (three horizontal lines in the top left corner) and click on "APIs & Services" > "Credentials."

8. Click on "Create Credentials" > "API key."

9. Select "Android" as the application type and enter the package name and SHA-1 certificate fingerprint.

10. Click on "Create" and copy the API key.

11. Open the AndroidManifest.xml file.

12. Replace YOUR_API_KEY with the API key you created.

That's it , Your all Set To GO!!


## Technologies Used:

- Kotlin: Primary programming language for Android app development
- Jetpack Compose: Modern UI toolkit for building intuitive and engaging user interfaces
- Firebase Realtime Database: NoSQL database for real-time data synchronization and efficient data flow
- MVVM Architecture: Maintainable and scalable architecture pattern for robust app development
- Google Maps API: Integration for accurate store locations and navigation
- Android Studio: Development environment for building and testing the app

## Skills Demonstrated:

- Android app development with Kotlin and Jetpack Compose
- Real-time data management with Firebase Realtime Database and MVVM
- Integration of Google Maps API for location-based services
- Design and development of a multi-category store locator app with a user-friendly interface
