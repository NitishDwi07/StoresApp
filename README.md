# 🛍️ Smart Store Finder App

A powerful and intuitive **multi-category store locator app** that helps users discover nearby **food**, **grocery**, **electronics**, and more — all in one place!

<p align="center">
  <img src="https://img.shields.io/badge/Built%20With-Kotlin-%23A97BFF?style=for-the-badge&logo=kotlin" />
  <img src="https://img.shields.io/badge/UI-Jetpack%20Compose-%230070C0?style=for-the-badge&logo=android" />
  <img src="https://img.shields.io/badge/Database-Firebase%20Realtime%20DB-FFCA28?style=for-the-badge&logo=firebase" />
  <img src="https://img.shields.io/badge/Map-Google%20Maps-34A853?style=for-the-badge&logo=google-maps" />
</p>

---

## 📽️ Demo

▶️ **[Watch Demo Video](https://drive.google.com/file/d/1d-2TwIf58ydOTmynvvfqiQE2F4NijUiG/view?usp=drivesdk)**

---

## ✨ Features

- 🔍 Find nearby stores categorized under Food, Grocery, Electronics, and more.
- 🌐 **Real-time** data syncing using **Firebase Realtime Database**.
- 🗺️ Seamless map integration via **Google Maps API**.
- ⚙️ Clean and scalable **MVVM architecture**.
- 🎨 Built with modern **Jetpack Compose** UI toolkit.
- 🚀 Fast and intuitive navigation experience.

---

## 🧠 Technologies Used

| Tech                  | Purpose                                      |
|-----------------------|----------------------------------------------|
| Kotlin                | Core Android development                     |
| Jetpack Compose       | Declarative UI design                        |
| Firebase Realtime DB  | Real-time data synchronization               |
| Google Maps API       | Store location visualization                 |
| MVVM Architecture     | Clean separation of concerns                 |
| Android Studio        | Development and testing environment          |

---

## 📱 Screenshots

<p float="left">
  <img src="https://via.placeholder.com/180x380?text=Home+Screen" width="180" />
  <img src="https://via.placeholder.com/180x380?text=Store+List" width="180" />
  <img src="https://via.placeholder.com/180x380?text=Google+Map" width="180" />
</p>

---

## 🔧 Google Maps Integration Setup

> 🛠️ Follow these steps after cloning the repo:

1. Go to 👉 [Google Cloud Console](http://console.cloud.google.com/)
2. Create a **New Project**.
3. Navigate to:  
   **APIs & Services > Dashboard > Enable APIs & Services**
4. Search for **Google Maps Android API** and click **Enable**.
5. Go to **Credentials > Create Credentials > API key**
6. Choose **Android**, then:
   - Enter your **Package Name**
   - Add your **SHA-1 Certificate Fingerprint**
7. Copy the generated **API key**.
8. Open `AndroidManifest.xml` and replace:
   ```xml
   android:value="YOUR_API_KEY"
