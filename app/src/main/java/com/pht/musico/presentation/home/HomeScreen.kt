package com.pht.musico.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.pht.musico.R
import com.pht.musico.presentation.common.Stack
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.space_120
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_200
import com.pht.musico.util.Dimens.space_32
import com.pht.musico.util.Dimens.space_56
import com.pht.musico.util.Dimens.space_64
import com.pht.musico.util.Dimens.space_8

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = space_16)
            .verticalScroll(
                state = scrollState,
            ),
    ) {
        Row(
            modifier = Modifier
                .padding(end = space_16),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    "\uD83D\uDC4B Hi Tính,",
                    style = typography
                        .titleLarge
                        .copy(fontWeight = FontWeight.W400),
                    color = c_FFFFFF.copy(alpha = 0.75f)
                )

                Spacer(modifier = Modifier.height(space_16))

                Text(
                    "Good Evening",
                    style = typography
                        .headlineMedium
                        .copy(fontWeight = FontWeight.SemiBold),
                    color = c_FFFFFF.copy(alpha = 0.75f)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Stack(
                modifier = Modifier.size(space_32), // Parent box size
                alignment = Alignment.TopEnd // Enables alignment for children
            ) {
                Image(
                    imageVector = Icons.Default.Notifications,
                    colorFilter = ColorFilter.tint(c_FFFFFF.copy(alpha = 0.12f)),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .size(space_8)
                        .background(
                            color = c_FFFFFF,
                            shape = CircleShape
                        )
                )
            }

            Spacer(modifier = Modifier.width(space_16))

            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(space_56)
                    .clip(CircleShape),
            )
        }

        Spacer(modifier = Modifier.height(space_32))

        Text(
            "Featuring Today",
            style = typography.headlineLarge.copy(fontWeight = FontWeight.SemiBold),
            color = c_FFFFFF.copy(alpha = 0.75f)
        )

        Spacer(modifier = Modifier.height(space_8))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(space_16),
        ) {
            items(5) {
                Stack(
                    alignment = Alignment.CenterStart,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.new_english_songs),
                        contentDescription = null,
                        contentScale = ContentScale.FillHeight,
                        modifier = Modifier
                            .height(space_200),
                    )
                    Column {
                        Text(
                            "New",
                            style = typography.headlineSmall,
                            color = c_FFFFFF.copy(alpha = 0.75f)
                        )
                        Text(
                            "ENGLISH\nSONGS",
                            style = typography.headlineMedium,
                            color = c_FFFFFF.copy(alpha = 0.75f)
                        )
                    }
                }

            }
        }

        Spacer(modifier = Modifier.height(space_32))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = space_16),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
        ) {
            Text(
                "Recently Played",
                style = typography.headlineLarge.copy(fontWeight = FontWeight.SemiBold),
                color = c_FFFFFF.copy(alpha = 0.75f)
            )
            Text(
                "See more",
                style = typography.headlineSmall.copy(fontWeight = FontWeight.Normal),
                color = c_FFFFFF,
            )
        }

        Spacer(modifier = Modifier.height(space_16))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(space_16),
        ) {
            items(5) {
                Column {
                    Stack(
                        alignment = Alignment.BottomStart,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.new_english_songs),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(space_120)
                                .clip(RoundedCornerShape(space_16)),
                        )
                        Image(
                            painter = painterResource(id = R.drawable.play_arrow),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(space_64),
                        )
                    }
                    Spacer(modifier = Modifier.height(space_8))
                    Text(
                        "Inside Out",
                        style = typography.headlineSmall.copy(fontWeight = FontWeight.Normal),
                        color = c_FFFFFF.copy(alpha = 0.75f)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(space_32))

        Text(
            "Mixes for you",
            style = typography.headlineLarge.copy(fontWeight = FontWeight.SemiBold),
            color = c_FFFFFF.copy(alpha = 0.75f)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(space_16),
        ) {
            items(5) {
                Column {
                    Stack(
                        alignment = Alignment.BottomEnd,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.new_english_songs),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(space_120)
                                .clip(RoundedCornerShape(space_16)),
                        )
                        Text(
                            "Mix ${it + 1}",
                            style = typography.headlineSmall,
                            color = c_FFFFFF.copy(alpha = 0.75f),
                            modifier = Modifier.padding(end = space_8)
                        )
                    }
                    Spacer(modifier = Modifier.height(space_8))
                    Text(
                        "Calvin Harris, Martin Garrix",
                        style = typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                        color = c_FFFFFF.copy(alpha = 0.75f),
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .width(space_120),
                        maxLines = 1,
                    )
                    Text(
                        "Calvin Harris, Martin Garrix",
                        style = typography.headlineSmall.copy(fontWeight = FontWeight.Normal),
                        color = c_FFFFFF.copy(alpha = 0.75f),
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .width(space_120),
                        maxLines = 1,
                    )
                }
            }
        }
    }
}