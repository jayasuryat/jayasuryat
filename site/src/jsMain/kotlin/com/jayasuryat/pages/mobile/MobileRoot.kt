package com.jayasuryat.pages.mobile

import androidx.compose.runtime.Composable
import com.jayasuryat.components.HLine
import com.jayasuryat.components.VLine
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Tbody
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun MobileRoot(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .styleModifier { background("#000000") },
    ) {

        BG(
            modifier = Modifier.fillMaxSize()
        )

        Content(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 4.vh)
        )
    }
}

@Composable
private fun BG(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
    ) {

        HLine(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .margin(top = 4.vh)
        )

        HLine(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .margin(bottom = 4.vh)
        )

        VLine(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .margin(left = 4.vh)
        )

        VLine(
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
                .margin(right = 4.vh)
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.vh)
            )

            Tbody(
                attrs = {
                    style {
                        property("color", "#a6a6a6")
                        property("font-family", "Lily Script One")
                        property("font-weight", "bold")
                        property("font-size", "16px")
                    }
                },
                content = {
                    Text("howdy \uD83D\uDC4B")
                }
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.px)
            )

            Tbody(
                attrs = {
                    style {
                        property("color", "white")
                        property("font-family", "JetBrains Mono")
                        property("font-weight", "600")
                        property("font-size", "32px")
                    }
                },
                content = {
                    Text("I'm jayasuryat")
                }
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(left = 4.vh, right = 4.vh)
                .align(Alignment.Center)
        ) {
            Tbody(
                attrs = {
                    style {
                        property("color", "#D9D9D9")
                        property("font-family", "Poppins")
                        property("font-size", "18px")
                        property("font-weight", "300")
                        property("text-align", "center")
                    }
                },
                content = {

                    Text("I'm an ")
                    Span(
                        attrs = {
                            style {
                                property("color", "#2edf85")
                                property("font-weight", "600")
                            }
                        },
                    ) { Text("Android") }
                    Text(" developer from India and I love to cook ")
                    Span(
                        attrs = {
                            style {
                                property("font-weight", "600")
                                property("background", "-webkit-linear-gradient(rgb(130,79,254), rgb(227,70,92))")
                                property("-webkit-background-clip", "text")
                                property("-webkit-text-fill-color", "transparent")
                            }
                        },
                    ) { Text("Kotlin") }
                    Text(" stuff.")
                }
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Tbody(
                attrs = {
                    style {
                        property("color", "#D9D9D9")
                        property("font-family", "Poppins")
                        property("font-size", "14px")
                        property("font-weight", "100")
                    }
                },
                content = {
                    Text("My work")
                }
            )

            Box(modifier = Modifier.height(4.px))

            Link(
                path = "https://github.com/jayasuryat/",
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {

                Image(
                    modifier = Modifier
                        .size(54.px),
                    src = "github_r.svg",
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(16.px)
            )

            Tbody(
                attrs = {
                    style {
                        property("color", "#D9D9D9")
                        property("color", "#D9D9D9")
                        property("font-family", "Poppins")
                        property("font-size", "14px")
                        property("font-weight", "100")
                    }
                },
                content = {
                    Text(
                        "Get in touch"
                    )
                }
            )

            Box(modifier = Modifier.height(4.px))

            Row {

                Link(
                    path = "https://www.linkedin.com/in/jayasuryat/",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                ) {

                    Image(
                        modifier = Modifier
                            .size(54.px)
                            .onClick { },
                        src = "linkedin_r.svg",
                    )
                }

                Box(modifier = Modifier.width(6.px))

                Link(
                    path = "mailto:jayasurya.dc@gmail.com",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                ) {

                    Image(
                        modifier = Modifier
                            .size(54.px)
                            .onClick { },
                        src = "email_r.svg",
                    )
                }

                Box(modifier = Modifier.width(6.px))

                Link(
                    path = "https://twitter.com/jaya_surya_t",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                ) {
                    Image(
                        modifier = Modifier
                            .size(54.px)
                            .onClick { },
                        src = "twitter_r.svg",
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.vh)
            )
        }
    }
}