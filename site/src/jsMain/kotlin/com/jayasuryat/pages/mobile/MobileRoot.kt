package com.jayasuryat.pages.mobile

import androidx.compose.runtime.Composable
import com.jayasuryat.component.HLine
import com.jayasuryat.component.VLine
import com.jayasuryat.util.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun MobileRoot(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier,
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

            Span(
                attrs = {
                    style {
                        LilyScriptOneFont(
                            color = Color.chalice,
                            size = 16.px,
                        )
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

            Span(
                attrs = {
                    style {
                        JetbrainsMonoFont(
                            color = Color.onBackground,
                            size = 32.px,
                            weight = 600,
                        )
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
            Span(
                attrs = {
                    style {
                        PoppinsFont(
                            color = Color.onBackgroundVariant,
                            size = 18.px,
                            weight = 300,
                        )
                        textAlign("center")
                    }
                },
                content = {

                    Text("I'm an ")
                    Span(
                        attrs = {
                            style {
                                color(Color.android.toColor())
                                fontWeight(600)
                            }
                        },
                    ) { Text("Android") }
                    Text(" developer from India and I love to cook ")
                    Span(
                        attrs = {
                            style {
                                color(Color.kotlin.toColor())
                                fontWeight(600)
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

            Span(
                attrs = {
                    style {
                        PoppinsFont(
                            color = Color.onBackgroundVariant,
                            size = 14.px,
                            weight = 100,
                        )
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
                    src = "ic_github.svg",
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(16.px)
            )

            Span(
                attrs = {
                    style {
                        PoppinsFont(
                            color = Color.onBackgroundVariant,
                            size = 14.px,
                            weight = 100,
                        )
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
                        src = "ic_linkedin.svg",
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
                        src = "ic_email.svg",
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
                        src = "ic_twitter.svg",
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