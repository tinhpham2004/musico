package com.pht.musico.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.pht.musico.R
import com.pht.musico.presentation.common.AppButton
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.c_transparent
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.boderWidth_1
import com.pht.musico.util.Dimens.borderRadius_25
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_24
import com.pht.musico.util.Dimens.space_64

@Composable
fun AuthScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = space_64)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Musico",
                style = typography.displaySmall,
                color = c_FFFFFF.copy(alpha = 0.75f)
            )

            Spacer(Modifier.width(space_16))

            Image(
                painter = painterResource(id = R.drawable.musico_extra_title),
                contentDescription = null,
            )
        }

        Spacer(Modifier.height(space_24))

        Text(
            "Just keep on vibin’",
            style = typography.headlineSmall,
            color = c_FFFFFF.copy(alpha = 0.5f)
        )


        AppButton(
            onClick = { /*TODO*/ },
            title = "Sign in",
            modifier = Modifier
                .padding(horizontal = space_16)
                .background(c_transparent)
                .border(boderWidth_1, c_FFFFFF, RoundedCornerShape(borderRadius_25)),
            titleColor = c_FFFFFF,
            contentPadding = space_24
        )
    }
}