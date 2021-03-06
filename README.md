# Localization

[![Platform](https://img.shields.io/badge/platform-android-brightgreen.svg)](https://developer.android.com/index.html)
![API](https://img.shields.io/badge/Min--SDK-21-yellowgreen)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

Localization is an easy to use library that will handle localization for you in your Android application.

![](images/localization_sample.gif)

## Setup

Use Gradle:
```
implementation 'com.linkdev.localization:localization:1.0.1'
```
or Maven:
```
<dependency>
  <groupId>com.linkdev.localization</groupId>
  <artifactId>localization</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

## Usage
### How to initialize

1. Add the supports rtl flag to the manifest of the consuming app if you need to support rtl languages.
```xml
  android:supportsRtl="true"
```

2. Call **Localization.initialize()** method in your application class and pass the application object of the consumer APP to initialize localization.
```kotlin
   Localization.initialize(this)
```

3. Call **Localization.onAttach()** method in consumer activity or in your base activity to notify it with the updated resources and pass the current activity and new base context to Localization.onAttach() method..

```kotlin
  override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Localization.onAttach(this, newBase))
    }
```

### How to use

* Call **Localization.setLocaleAndRestart()** to change the app language in whatever place in your application you would like to change it with new locale and restart.
```kotlin
   Localization.setLocaleAndRestart(
            currentActivity,
            newLocale,
            destinationActivityClass,
            bundle,
            flags 
        )
```

>  **Params**
>   * **currentActivity** : Current activity and it is **required**
>   * **newLocale** : New locale object that will be applied and it is **required**, you can create it using one of the following methods:
>        1. Using our custom LocalizationLocale class, It an is enum class that provides a quick access to localization locale and support all languages instead of creating it by yourself:
>
>        ``` kotlin
>                            val newLocale = LocalizationLocale.English
>                            val newLocale = LocalizationLocale.French
>                            val newLocale = LocalizationLocale.Arabic
>        ```
>
>        2. By creating a new local object:
>
>        ``` kotlin
>                            val newLocale = Locale("ar")
>        ```
>   * **destinationActivityClass** : The new activity you would like to navigate to after locale change and it is **required**
>   * **bundle** : If you need to pass data between currentActivity and destinationActivityClass and it is **optional**
>   * **flags** : The intent flags and it is **optional**


* Call **Localization.reverseLangAndRestart()** method to reverse the current language of your application, if the previous language was Arabic, then it will be modified to English and vice versa.

```kotlin
   Localization.reverseLangAndRestart(
        currentActivity,
        destinationActivityClass,
        bundle,
        flags
    )
```
>  **Params**
>   * **currentActivity** : Current activity and it is **required**
>   * **destinationActivityClass** : The new activity you would like to navigate to after locale change and it is **required**
>   * **bundle** : If you need to pass data between currentActivity and destinationActivityClass and it is **optional**
>   * **flags** : The intent flags and it is **optional**


* Call **Localization.setLocale()** method to handle the language and configuration changes, but leaves the application restart to the consumer app.
```kotlin
   Localization.setLocale(
       context, 
       newLocale
    )
```
>  **Params**
>   * **context** : The current context and it is **required**
>   * **newLocale** : New locale object that will be applied and it is **required**, you can create it using one of the following methods:
>
>        1. Using our custom LocalizationLocale class, It an is enum class that provides a quick access to localization locale and support all languages instead of creating it by yourself:
>
>        ``` kotlin
>                            val newLocale = LocalizationLocale.English
>                            val newLocale = LocalizationLocale.French
>                            val newLocale = LocalizationLocale.Arabic
>        ```
>
>        2. By creating a new local object:
>
>        ``` kotlin
>                            val newLocale = Locale("ar")
>        ```

* Call **Localization.getLocale()** method to get the current saved locale.
```kotlin
    val currentSavedLocale: Locale = Localization.getLocale()
```

* Call **Localization.getLocalizationLocale()** method to get the current saved custom enum LocalizationLocale.
```kotlin
    val currentSavedLocale: LocalizationLocale = Localization.getLocalizationLocale()
```


* Call **Localization.getLanguage()** method to get the current saved language.

```kotlin
    val currentSavedLanguage = Localization.getLanguage()
```

## License
Copyright 2020 Link Development

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


