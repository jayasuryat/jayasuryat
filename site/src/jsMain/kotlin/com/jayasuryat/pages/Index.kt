package com.jayasuryat.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.jayasuryat.pages.mobile.MobileRoot
import com.jayasuryat.pages.desktop.DesktopRoot
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.background
import org.jetbrains.compose.web.css.vh

@Page
@Composable
fun Index() {

    LaunchedEffect(Unit) {
        document.title = "Jaya Surya Thotapalli"
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .styleModifier { background("#000000") }
    ) {

        val breakpoint: Breakpoint = rememberBreakpoint()

        if (breakpoint <= Breakpoint.SM) {

            MobileRoot(
                modifier = Modifier.fillMaxSize(),
            )

        } else {

            DesktopRoot(
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}

