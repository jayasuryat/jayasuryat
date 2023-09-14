package com.jayasuryat.pages.desktop

import androidx.compose.runtime.Composable
import com.jayasuryat.component.HLine
import com.jayasuryat.component.VLine
import com.jayasuryat.util.*
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.color
import com.varabyte.kobweb.compose.css.objectFit
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.animation.toAnimation
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
internal fun DesktopRoot(
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier,
    ) {

        Layout(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1),
            top = {

                Name(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(left = 32.px),
                )
            },
            bottomLeft = {

                ProfileInfo(
                    modifier = Modifier
                        .fillMaxSize()
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
private fun Layout(
    modifier: Modifier = Modifier,
    top: @Composable () -> Unit,
    bottomLeft: @Composable () -> Unit,
    bottomRight: @Composable () -> Unit,
) {

    val padding = 16

    Box(
        modifier = modifier
    ) {

        // BG-Lines
        Box(
            modifier = Modifier
                .fillMaxSize()
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

        // Content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(1)
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
}

@Composable
private fun Name(
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
    ) {

        Span(
            attrs = {
                style {
                    LilyScriptOneFont(
                        color = Color.onBackground,
                        size = 22.px
                    )
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
                        JetbrainsMonoFont(
                            color = Color.onBackground,
                            size = 64.px,
                            weight = 600
                        )
                    }
                },
                content = {
                    Text("I'm jayasuryat")
                }
            )

            Box(
                modifier = Modifier
                    .animation(
                        CursorFlicker.toAnimation(
                            duration = 0.5.s,
                            iterationCount = AnimationIterationCount.Infinite,
                            direction = AnimationDirection.Alternate,
                            timingFunction = AnimationTimingFunction.steps(2),
                        )
                    )
            ) {
                Span(
                    attrs = {
                        style {
                            JetbrainsMonoFont(
                                color = Color.onBackground,
                                size = 65.px,
                                weight = 100
                            )
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

val CursorFlicker by Keyframes {
    from { Modifier.opacity(0f) }
    to { Modifier.opacity(1f) }
}

@Composable
private fun ProfileImage(
    modifier: Modifier = Modifier,
) {

    Image(
        modifier = modifier
            .styleModifier { objectFit(ObjectFit.Cover) },
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
                    PoppinsFont(
                        color = Color.onBackgroundVariant,
                        size = 18.px,
                        weight = 300
                    )
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

        Spacer()

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column {
                Span(
                    attrs = {
                        style {
                            PoppinsFont(
                                color = Color.onBackgroundVariant,
                                size = 14.px,
                                weight = 100
                            )
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
                        src = "ic_github.svg",
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
                            PoppinsFont(
                                color = Color.onBackgroundVariant,
                                size = 14.px,
                                weight = 100
                            )
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
                            src = "ic_linkedin.svg",
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
                            src = "ic_email.svg",
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
                            src = "ic_twitter.svg",
                        )
                    }
                }
            }
        }
    }
}