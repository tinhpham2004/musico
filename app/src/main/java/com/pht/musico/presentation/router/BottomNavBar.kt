package com.pht.musico.presentation.router

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pht.musico.ui.theme.c_000000
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.c_transparent
import com.pht.musico.util.Dimens.space_24
import com.pht.musico.util.Dimens.space_8


@Composable
fun BottomNavBar(
    items: List<Route>,
    selectedItem: Int,
    onItemClick: (Int) -> Unit,
) {
    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = c_000000.copy(alpha = 0.5f),
        tonalElevation = 0.dp,
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        val icon =
                            if (selectedItem == index) item.selectedIcon() else item.unselectedIcon()
                        val titleColor =
                            if (selectedItem == index) c_FFFFFF.copy(alpha = 0.75f) else c_FFFFFF.copy(
                                alpha = 0.25f
                            )
                        Icon(
                            painter = icon,
                            contentDescription = null,
                            modifier = Modifier.size(space_24)
                        )
                        Spacer(modifier = Modifier.height(space_8))
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.bodyLarge.copy(
                                fontWeight = FontWeight.SemiBold,
                                color = titleColor
                            ),
                        )
                    }
                },
                selected = index == selectedItem,
                onClick = { onItemClick(index) },
            )
        }
    }
}