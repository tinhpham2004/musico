package com.pht.musico.presentation.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.space_0
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_64
import com.pht.musico.util.Dimens.space_8

@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    title: String,
    titleColor: Color = c_FFFFFF,
    contentPadding: Dp = space_0,
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        contentPadding = PaddingValues(contentPadding),
    ) {
        Text(
            text = title,
            style = typography.titleMedium.copy(fontWeight = FontWeight.Bold),
            color = titleColor
        )
    }
}