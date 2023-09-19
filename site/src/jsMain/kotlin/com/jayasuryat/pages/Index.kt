package com.jayasuryat.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.jayasuryat.pages.desktop.DesktopRoot
import com.jayasuryat.pages.mobile.MobileRoot
import com.jayasuryat.util.background
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import kotlinx.browser.document
import org.jetbrains.compose.web.css.*

val HideForMobileStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.styleModifier { display(DisplayStyle.None) }
    }
    Breakpoint.SM {
        Modifier.styleModifier { display(DisplayStyle.None) }
    }
    Breakpoint.MD {
        Modifier.styleModifier { display(DisplayStyle.Contents) }
    }
}

val HideForDesktopStyle by ComponentStyle {
    Breakpoint.ZERO {
        Modifier.styleModifier { display(DisplayStyle.Contents) }
    }
    Breakpoint.SM {
        Modifier.styleModifier { display(DisplayStyle.Contents) }
    }
    Breakpoint.MD {
        Modifier.styleModifier { display(DisplayStyle.None) }
    }
}

@Page
@Composable
fun Index() {

    LaunchedEffect(Unit) {
        document.title = "Jaya Surya Thotapalli"
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .styleModifier { background(Color.background) }
    ) {

        MobileRoot(
            modifier = HideForDesktopStyle.toModifier()
                .styleModifier { property("height", "100dvh") }
                .fillMaxSize(),
        )

        DesktopRoot(
            modifier = HideForMobileStyle.toModifier()
                .height(100.vh)
                .fillMaxSize(),
        )
    }
}

