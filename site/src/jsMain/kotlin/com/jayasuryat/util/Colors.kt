package com.jayasuryat.util

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.Color

val Color.background: String
    get() = "#000000"

val Color.onBackground: String
    get() = "#FFFFFF"

val Color.onBackgroundVariant: String
    get() = "#D9D9D9"

val Color.android: String
    get() = "#2edf85"

val Color.kotlin: String
    get() = "#c813dd"

val Color.chalice: String
    get() = "#a6a6a6"

fun String.toColor(): CSSColorValue = Color(this)