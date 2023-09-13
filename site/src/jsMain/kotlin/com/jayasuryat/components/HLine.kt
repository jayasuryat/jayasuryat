package com.jayasuryat.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw

@Composable
internal fun HLine(
    modifier: Modifier = Modifier,
) {

    Line(
        modifier = modifier
            .width(100.vw)
            .height(1.px)
    )
}

@Composable
internal fun VLine(
    modifier: Modifier = Modifier,
) {

    Line(
        modifier = modifier
            .width(1.px)
            .height(100.vh)
    )
}

@Composable
private fun Line(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .styleModifier { property("background-color", "#545454") }
            .opacity(0.32f)
    )
}