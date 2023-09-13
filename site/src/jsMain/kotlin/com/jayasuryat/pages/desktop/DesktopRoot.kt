package com.jayasuryat.pages.desktop

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.jayasuryat.components.HLine
import com.jayasuryat.components.VLine
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
internal fun DesktopRoot(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier,
    ) {

        BG(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(0)
        )

        Content(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1),
            top = {

                Name(
                    modifier = Modifier.fillMaxSize()
                        .padding(left = 32.px),
                )
            },
            bottomLeft = {

                ProfileInfo(
                    modifier = Modifier.fillMaxSize()
                )
            },
            bottomRight = {

                ProfileImage(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                )
            },
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
                .margin(top = 20.vh)
        )

        HLine(
            modifier = Modifier
                .align(alignment = Alignment.Center)
        )

        HLine(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .margin(bottom = 20.vh)
        )

        VLine(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .margin(left = 10.vw)
        )

        VLine(
            modifier = Modifier
                .align(alignment = Alignment.Center)
        )

        VLine(
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
                .margin(right = 10.vw)
        )
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    top: @Composable () -> Unit,
    bottomLeft: @Composable () -> Unit,
    bottomRight: @Composable () -> Unit,
) {

    val padding = 16

    Box(
        modifier = modifier
    ) {

        Box(
            modifier = Modifier
                .height(30.vh)
                .width(80.vw)
                .align(alignment = Alignment.TopStart)
                .margin(
                    left = 10.vw,
                    top = 20.vh,
                ).padding(
                    all = padding.px
                )
        ) {
            top()
        }

        Box(
            modifier = Modifier
                .height(30.vh)
                .width(40.vw)
                .align(alignment = Alignment.BottomStart)
                .margin(
                    left = 10.vw,
                    bottom = 20.vh,
                )
                .padding(
                    all = padding.px
                )

        ) {
            bottomLeft()
        }

        Box(
            modifier = Modifier
                .height(30.vh)
                .width(40.vw)
                .align(alignment = Alignment.BottomEnd)
                .margin(
                    right = 10.vw,
                    bottom = 20.vh,
                )
                .padding(
                    all = padding.px
                )
        ) {
            bottomRight()
        }
    }
}

@Composable
private fun Name(
    modifier: Modifier = Modifier,
) {

    val showCursor = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        while (isActive) {
            delay(500)
            showCursor.value = !showCursor.value
        }
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
    ) {

        Span(
            attrs = {
                style {
                    property("color", "#FFFFFF")
                    property("font-family", "Lily Script One")
                    property("font-weight", "bold")
                    property("font-size", "22px")
                }
            },
            content = {
                Text("howdy \uD83D\uDC4B")
            }
        )

        Row(
            verticalAlignment = Alignment.Bottom,
        ) {

            Span(
                attrs = {
                    style {
                        property("color", "white")
                        property("font-family", "JetBrains Mono")
                        property("font-weight", "600")
                        property("font-size", "64px")
                    }
                },
                content = {
                    Text("I'm jayasuryat")
                }
            )

            if (showCursor.value) {
                Span(
                    attrs = {
                        style {
                            property("color", "white")
                            property("font-family", "JetBrains Mono")
                            property("font-weight", "100")
                            property("font-size", "54px")
                            property("opacity", "0.5")
                        }
                    },
                    content = {
                        Text("_")
                    }
                )
            }
        }
    }
}

@Composable
private fun ProfileImage(
    modifier: Modifier = Modifier,
) {

    Image(
        modifier = modifier
            .styleModifier { property("object-fit", "cover") },
        src = "profile.jpeg"
    )
}

@Composable
private fun ProfileInfo(
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier
            .padding(all = 8.px),
    ) {

        Span(
            attrs = {
                style {
                    property("color", "#D9D9D9")
                    property("font-family", "Poppins")
                    property("font-size", "18px")
                    property("font-weight", "300")
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
                            property("color", "#c813dd")
                            property("font-weight", "600")
                        }
                    },
                ) { Text("Kotlin") }
                Text(" stuff.")
            }
        )

        Spacer()

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column {
                Span(
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

                Link(
                    path = "https://github.com/jayasuryat/",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                ) {

                    Image(
                        modifier = Modifier
                            .size(44.px)
                            .margin(top = 8.px),
                        src = "github_r.svg",
                    )
                }
            }

            Spacer()

            Column(
                horizontalAlignment = Alignment.End,
            ) {
                Span(
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

                Row(
                    modifier = Modifier.margin(top = 8.px)
                ) {

                    Link(
                        path = "https://www.linkedin.com/in/jayasuryat/",
                        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                    ) {

                        Image(
                            modifier = Modifier
                                .size(44.px)
                                .margin(left = 4.px)
                                .onClick { },
                            src = "linkedin_r.svg",
                        )
                    }

                    Link(
                        path = "mailto:jayasurya.dc@gmail.com",
                        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                    ) {

                        Image(
                            modifier = Modifier
                                .size(44.px)
                                .margin(left = 4.px)
                                .onClick { },
                            src = "email_r.svg",
                        )
                    }

                    Link(
                        path = "https://twitter.com/jaya_surya_t",
                        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                    ) {
                        Image(
                            modifier = Modifier
                                .size(44.px)
                                .margin(left = 4.px)
                                .onClick { },
                            src = "twitter_r.svg",
                        )
                    }
                }
            }
        }
    }
}