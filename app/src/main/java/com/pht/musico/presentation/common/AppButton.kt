package com.pht.musico.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.pht.musico.R
import com.pht.musico.ui.theme.c_0D0D0D
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.boderWidth_1
import com.pht.musico.util.Dimens.borderRadius_30
import com.pht.musico.util.Dimens.space_24
import com.pht.musico.util.Dimens.space_8

/**
 * A composable function that displays a customizable button with an optional prefix icon.
 *
 * @param modifier The modifier to be applied to the button.
 * @param onClick The callback to be invoked when the button is clicked.
 * @param title The text to be displayed on the button.
 * @param titleColor The color of the button text. Default is white.
 * @param prefixIcon The resource ID of the icon to be displayed before the text. Default is null.
 * @param backgroundColor The background color of the button. Default is black.
 */
@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    title: String,
    titleColor: Color = c_FFFFFF,
    prefixIcon: Int? = null,
    backgroundColor: Color = c_0D0D0D,
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = boderWidth_1,
                color = titleColor,
                shape = RoundedCornerShape(borderRadius_30)
            ),
        onClick = onClick,
        contentPadding = PaddingValues(space_24),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = titleColor,
        ),
    ) {
        if (prefixIcon != null) {
            Image(
                painter = painterResource(prefixIcon!!),
                contentDescription = null,
            )
            Spacer(Modifier.width(space_8))
        }

        Text(
            text = title,
            style = typography.titleMedium.copy(fontWeight = FontWeight.Bold),
            color = titleColor
        )
    }
}