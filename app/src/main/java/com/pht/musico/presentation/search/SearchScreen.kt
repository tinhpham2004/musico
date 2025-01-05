package com.pht.musico.presentation.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import com.pht.musico.ui.theme.c_000000
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.c_transparent
import com.pht.musico.util.Dimens.space_16

@Composable
fun SearchScreen() {

    val isFocusing = false

    Column {
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                if (!isFocusing) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = c_000000.copy(alpha = 0.75f)
                    )
                } else {
                    IconButton(
                        onClick = { },
                        content = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                                contentDescription = null,
                                tint = c_FFFFFF.copy(alpha = 0.75f)
                            )
                        }
                    )
                }

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(space_16)
                .clip(RoundedCornerShape(space_16)),
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = c_FFFFFF.copy(alpha = 0.75f),
                focusedContainerColor = c_transparent,

            ),
        )


    }
}