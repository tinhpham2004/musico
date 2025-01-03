package com.pht.musico.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Stack(
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.TopStart,
    items: @Composable () -> Unit
) {
    Box(
        modifier = modifier,
        contentAlignment = alignment
    ) {
        items()
    }
}