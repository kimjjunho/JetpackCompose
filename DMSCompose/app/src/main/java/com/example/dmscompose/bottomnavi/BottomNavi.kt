package com.example.dmscompose.bottomnavi

import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.dmscompose.Alarm
import com.example.dmscompose.Check
import com.example.dmscompose.Menu
import com.example.dmscompose.MyPage
import com.example.dmscompose.R


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Menu.screen_route) {
        composable(BottomNavItem.Menu.screen_route) {
            Menu()
        }
        composable(BottomNavItem.Check.screen_route) {
            Check()
        }
        composable(BottomNavItem.Alarm.screen_route) {
            Alarm()
        }
        composable(BottomNavItem.MyPage.screen_route) {
            MyPage()
        }
    }
}

@Composable
fun BottomNavigationCustom(navController: NavController) {
    val items = listOf(
        BottomNavItem.Menu,
        BottomNavItem.Check,
        BottomNavItem.Alarm,
        BottomNavItem.MyPage
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.Black,
        modifier = Modifier
            .height(60.dp)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 9.sp
                    )
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {

                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}