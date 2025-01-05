package com.pht.musico.presentation.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_4

/**
 * A composable function that represents a list tile with optional leading, title, subtitle, and trailing components.
 *
 * @param leading A composable function that provides the leading component, such as an icon or image.
 * @param title A composable function that provides the title component.
 * @param subtitle A composable function that provides the subtitle component.
 * @param trailing A composable function that provides the trailing component, such as an icon or action button.
 * @param onClick A lambda function to be invoked when the list tile is clicked.
 */
@Composable
fun ListTile(
    leading: @Composable (() -> Unit)? = null,
    title: @Composable () -> Unit,
    subtitle: @Composable (() -> Unit)? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null
) {
    val clickableModifier = if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(space_16)
            .then(clickableModifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leading != null) {
            leading()
            Spacer(modifier = Modifier.width(space_16))
        }

        Column(
            modifier = Modifier.weight(1f)
        ) {
            title()
            if (subtitle != null) {
                Spacer(modifier = Modifier.height(space_4))
                subtitle()
            }
        }

        if (trailing != null) {
            Spacer(modifier = Modifier.width(space_16))
            trailing()
        }
    }
}