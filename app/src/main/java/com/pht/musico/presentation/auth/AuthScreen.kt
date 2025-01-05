package com.pht.musico.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.pht.musico.R
import com.pht.musico.presentation.common.AppButton
import com.pht.musico.ui.theme.c_0D0D0D
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_24
import com.pht.musico.util.Dimens.space_32
import com.pht.musico.util.Dimens.space_64

/**
 * A composable function that displays the authentication screen.
 * It includes the app title, a subtitle, and several buttons for different authentication options.
 */
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

        Spacer(modifier = Modifier.weight(1f))

        AppButton(
            onClick = {
                println("Sign up clicked")
            },
            title = "Sign up",
            titleColor = c_0D0D0D,
            modifier = Modifier
                .padding(horizontal = space_16),
            backgroundColor = c_FFFFFF.copy(alpha = 0.75f),
        )

        Spacer(Modifier.height(space_16))

        AppButton(
            onClick = {
                println("Continue with Phone Number clicked")
            },
            title = "Continue with Phone Number",
            titleColor = c_FFFFFF.copy(alpha = 0.75f),
            modifier = Modifier
                .padding(horizontal = space_16),
            prefixIcon = R.drawable.phone_number,
        )

        Spacer(Modifier.height(space_16))

        AppButton(
            onClick = {
                println("Continue with Google clicked")
            },
            title = "Continue with Google",
            titleColor = c_FFFFFF.copy(alpha = 0.75f),
            modifier = Modifier
                .padding(horizontal = space_16),
            prefixIcon = R.drawable.google,
        )

        Spacer(Modifier.height(space_16))

        AppButton(
            onClick = {
                println("Log in clicked")
            },
            title = "Log in",
            titleColor = c_FFFFFF.copy(alpha = 0.75f),
            modifier = Modifier
                .padding(horizontal = space_16),
        )

        Spacer(Modifier.height(space_64))

    }
}