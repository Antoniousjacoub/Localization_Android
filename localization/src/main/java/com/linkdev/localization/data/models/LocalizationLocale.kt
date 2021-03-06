package com.linkdev.localization.data.models

import java.util.*

enum class LocalizationLocale(val locale: Locale) {
    Arabic(Locale("ar")),
    English(Locale("en")),
    Albanian(Locale("sq")),
    Afrikaans(Locale("af")),
    Armenian(Locale("hy")),
    Belarus(Locale("be")),
    Bulgarian(Locale("bg")),
    Danish(Locale("da")),
    Dutch(Locale("nl")),
    Estonian(Locale("et")),
    Filipino(Locale("fil")),
    Finnish(Locale("fi")),
    French(Locale("fr")),
    Georgian(Locale("ka")),
    German(Locale("de")),
    Greek(Locale("el")),
    Hawaiian(Locale("haw")),
    Hebrew(Locale("he")),
    Hindi(Locale("hi")),
    Hungarian(Locale("hu")),
    Icelandic(Locale("is")),
    Indonesian(Locale("id")),
    Irish(Locale("ga")),
    Italian(Locale("it")),
    Japanese(Locale("ja")),
    Korean(Locale("ko")),
    Latvian(Locale("lv")),
    Lithuanian(Locale("lt")),
    Luo(Locale("luo")),
    Macedonian(Locale("mk")),
    Malagasy(Locale("mg")),
    Malay(Locale("ms")),
    Nepali(Locale("ne")),
    NorwegianBokmal(Locale("nb")),
    NorwegianNynorsk(Locale("nn")),
    Persian(Locale("fa")),
    Polish(Locale("pl")),
    Portuguese(Locale("pt")),
    Romanian(Locale("ro")),
    Russian(Locale("ru")),
    Slovak(Locale("sk")),
    Slovenian(Locale("sl")),
    Spanish(Locale("es")),
    Swedish(Locale("sv")),
    Thai(Locale("th")),
    Turkish(Locale("tr")),
    Ukrainian(Locale("uk")),
    Urdu(Locale("ur")),
    Vietnamese(Locale("vi")),
    Zulu(Locale("zu"));

    companion object {
        fun getLocale(language: String) = values().first { it.locale.language == language }
    }

}
