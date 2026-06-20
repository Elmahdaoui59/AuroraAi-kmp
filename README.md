# Aurora AI - Kotlin Multiplatform Firebase Auth with SwiftPM 🚀

A modern [Kotlin Multiplatform (KMP)](https://kotlinlang.org/docs/multiplatform.html) template project demonstrating how to set up **Firebase Authentication** natively on Android and iOS while maximizing shared code. 

This project uses the latest KMP project structure, **Android Gradle Plugin (AGP) 9**, and integrates iOS dependencies seamlessly using **Swift Package Manager (SwiftPM)**—no CocoaPods required!

## 📖 Read the Full Tutorial on AG Mobile Labs

This repository is the companion code for a comprehensive 3-part series on [AG Mobile Labs](https://www.ag-mobile-labs.com/). If you want to learn how to build this architecture from scratch, check out the articles:

1. [Part 1: Mastering Kotlin 2.4+ SwiftPM: The new KMP structure & AGP 9](https://www.ag-mobile-labs.com/blog/kmp-spm-agp-9)
2. [Part 2: Setting Up a Modern KMP Project with AGP 9 & SwiftPM Support](https://www.ag-mobile-labs.com/blog/kmp-spm-agp-9-part2)
3. [Part 3: Implementing Firebase Authentication in KMP using Interface Pattern](https://www.ag-mobile-labs.com/blog/kmp-spm-agp-9-part3)

## ✨ Features

* **Modern KMP Architecture:** Utilizes the new default KMP project structure with separated `shared`, `androidApp`, and `iosApp` modules.
* **SwiftPM Integration:** Direct integration of the Firebase iOS SDK using Kotlin 2.4+ SwiftPM support.
* **Interface-Driven DI:** Clean architecture utilizing Kotlin Interfaces over `expect/actual` to make business logic testable and decoupled.
* **Compose Multiplatform (Ready):** Set up to share UI across Android and iOS natively.

## 🛠 Tech Stack

* **Kotlin:** 2.4.0+
* **AGP:** 9.0+
* **Authentication:** Firebase Auth (Native Android SDK & Native iOS SDK via SwiftPM)
* **UI:** Jetpack Compose / Compose Multiplatform

## 🚀 Getting Started

### Prerequisites
* [Android Studio](https://developer.android.com/studio) (Latest version with KMP Plugin)
* Xcode (for iOS development)
* A Firebase Project configured in the [Firebase Console](https://console.firebase.google.com/)

### Firebase Configuration
To run this project, you will need to add your own Firebase configuration files:
1. **Android:** Download your `google-services.json` from Firebase and place it in the `androidApp/` directory.
2. **iOS:** Download your `GoogleService-Info.plist` from Firebase and place it in the `iosApp/` directory.

### Building the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/Elmahdaoui59/AuroraAi-kmp.git

2. Generate the Swift Package for iOS dependencies (Run in terminal):
   ```bash
   XCODEPROJ_PATH='/path/to/project/iosApp/iosApp.xcodeproj' ./gradlew :shared:integrateLinkagePackage
3. Sync the project in Android Studio and run on your preferred emulator or simulator.

## 🤝 Contributing
Contributions, issues, and feature requests are welcome!

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


Developed with ❤️ by AG Mobile Labs


