package com.linkdev.localization.data.shared_prefrences

import com.linkdev.localization.Localization
import java.util.*

/**
 *  Interface to be used by [Localization] for storing a Locale and its complementary data.
 */
interface LocalizationIPrefsDataSource {
    fun getLocale(): Locale
    fun setLocale(locale: Locale)

}
