package com.pht.musico.presentation.router
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.pht.musico.R

sealed class Route(
    val route: String,
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
) {
    object Home : Route(
        route = "home",
        title = "Home",
        selectedIcon = R.drawable.home_filled,
        unselectedIcon = R.drawable.home_outlined
    )
    object Search : Route(
        route = "search",
        title = "Search",
        selectedIcon = R.drawable.search_filled,
        unselectedIcon = R.drawable.search_outlined
    )
    object Library : Route(
        route = "library",
        title = "Your Library",
        selectedIcon = R.drawable.library_filled,
        unselectedIcon = R.drawable.library_outlined
    )

    @Composable
    fun selectedIcon(): Painter {
        return painterResource(id = selectedIcon)
    }

    @Composable
    fun unselectedIcon(): Painter {
        return painterResource(id = unselectedIcon)
    }
}