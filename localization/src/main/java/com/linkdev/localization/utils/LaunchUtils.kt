package com.linkdev.localization.utils

import android.app.Activity
import android.content.Intent
import android.os.Bundle

internal object LaunchUtils {
    /**
     *Will create intent with flags or bundle, start new activity[destinationActivityClass] and finish [currentActivity]
     *@param currentActivity the object of the current activity
     *@param destinationActivityClass new activity class will navigate to
     *@param bundle the new arguments
     *@param flags the intent flags
     */
    fun <T : Activity> startActivity(
        currentActivity: Activity,
        destinationActivityClass: Class<T>,
        bundle: Bundle? = null,
        flags: Int? = null
    ) {
        val intent = Intent(currentActivity, destinationActivityClass)
        if (flags != null) {
            intent.flags = flags
        }
        if (bundle != null)
            intent.putExtras(bundle)
        currentActivity.startActivity(intent)
        currentActivity.finish()
    }

}