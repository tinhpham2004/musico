package com.pht.musico.presentation.router
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.pht.musico.R

/**
 * A sealed class representing different routes in the application.
 *
 * @property route The route string used for navigation.
 * @property title The title of the route.
 * @property selectedIcon The resource ID of the selected icon.
 * @property unselectedIcon The resource ID of the unselected icon.
 */
sealed class Route(
    val route: String,
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
) {
    /**
     * Object representing the Home route.
     */
    object Home : Route(
        route = "home",
        title = "Home",
        selectedIcon = R.drawable.home_filled,
        unselectedIcon = R.drawable.home_outlined
    )

    /**
     * Object representing the Search route.
     */
    object Search : Route(
        route = "search",
        title = "Search",
        selectedIcon = R.drawable.search_filled,
        unselectedIcon = R.drawable.search_outlined
    )

    /**
     * Object representing the Library route.
     */
    object Library : Route(
        route = "library",
        title = "Your Library",
        selectedIcon = R.drawable.library_filled,
        unselectedIcon = R.drawable.library_outlined
    )

    /**
     * A composable function that returns the selected icon as a Painter.
     *
     * @return The selected icon as a Painter.
     */
    @Composable
    fun selectedIcon(): Painter {
        return painterResource(id = selectedIcon)
    }

    /**
     * A composable function that returns the unselected icon as a Painter.
     *
     * @return The unselected icon as a Painter.
     */
    @Composable
    fun unselectedIcon(): Painter {
        return painterResource(id = unselectedIcon)
    }
}