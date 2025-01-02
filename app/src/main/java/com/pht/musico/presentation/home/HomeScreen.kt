package com.pht.musico.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.pht.musico.R
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_64
import com.pht.musico.util.Dimens.space_8

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = space_64)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = space_16)
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
                        .copy(fontWeight = FontWeight.W600),
                    color = c_FFFFFF.copy(alpha = 0.75f)
                )
            }

            Spacer(modifier = Modifier.weight(1f))
            Box {
                Image(
                    imageVector = Icons.Default.Notifications,
                    colorFilter = ColorFilter.tint(c_FFFFFF.copy(alpha = 0.12f)),
                    contentDescription = null,
                )
                Box(
                    modifier = Modifier
                        .padding(end = space_16)
                        .size(space_8)
                        .background(
                            color = c_FFFFFF,
                            shape = CircleShape
                        )
                        .align(Alignment.TopEnd),

                )
            }

        }
    }
}