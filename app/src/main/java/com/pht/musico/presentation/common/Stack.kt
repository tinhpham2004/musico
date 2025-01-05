package com.pht.musico.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * A composable function that arranges its children in a stack-like layout.
 *
 * @param modifier The modifier to be applied to the Box.
 * @param alignment The alignment of the content inside the Box. Default is [Alignment.TopStart].
 * @param items A composable lambda that defines the items to be placed inside the Box.
 */
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