package com.pht.musico.presentation.router

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pht.musico.presentation.home.HomeScreen
import com.pht.musico.presentation.library.LibraryScreen
import com.pht.musico.presentation.search.SearchScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val items = listOf(
        Route.Home,
        Route.Search,
        Route.Library
    )

    var selectedItem by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                items = items,
                selectedItem = selectedItem,
                onItemClick = { index ->
                    selectedItem = index
                    // Navigate to the selected screen
                    navController.navigate(items[index].route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        },
        content = { paddingValues ->
            // Use NavHost to navigate to screens
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(paddingValues)
            ) {
                composable("home") { HomeScreen() }
                composable("search") { SearchScreen() }
                composable("library") { LibraryScreen() }
            }
        }
    )
}