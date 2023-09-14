package com.jayasuryat.util

import org.jetbrains.compose.web.css.*

internal fun StyleScope.PoppinsFont(
    color: String? = null,
    size: CSSSizeValue<CSSUnit.px>? = null,
    weight: Int? = null,
) = Font(
    fontFamily = "Poppins",
    color = color,
    size = size,
    weight = weight
)

internal fun StyleScope.JetbrainsMonoFont(
    color: String? = null,
    size: CSSSizeValue<CSSUnit.px>? = null,
    weight: Int? = null,
) = Font(
    fontFamily = "JetBrains Mono",
    color = color,
    size = size,
    weight = weight
)

internal fun StyleScope.LilyScriptOneFont(
    color: String? = null,
    size: CSSSizeValue<CSSUnit.px>? = null,
    weight: Int? = null,
) = Font(
    fontFamily = "Lily Script One",
    color = color,
    size = size,
    weight = weight
)

private fun StyleScope.Font(
    fontFamily: String,
    color: String? = null,
    size: CSSSizeValue<CSSUnit.px>? = null,
    weight: Int? = null,
) {
    fontFamily(fontFamily)
    color?.let { fontColor -> color(Color(fontColor)) }
    size?.let { fontSize -> fontSize(fontSize) }
    weight?.let { fontWeight -> fontWeight(fontWeight) }
}