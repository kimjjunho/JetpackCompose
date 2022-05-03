package com.example.dmscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dmscompose.ui.theme.DMSComposeTheme
import com.example.dmscompose.ui.theme.Mint
import com.example.dmscompose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenView()
        }
    }
}

@Composable
fun Menu() {
    Text(text = "Menu")
}

@Composable
fun Check() {
    Text(text = "Check")
}

@Composable
fun Alarm() {
    Text(text = "Alarm")
}

@Composable
fun MyPage() {
    Column() {
        Box(modifier = Modifier
            .background(Mint)
            .fillMaxWidth()
            .height(200.dp)){
            Text(text = "MyPage",style = Typography.body1)
        }
    }
}

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
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.Menu,
        BottomNavItem.Check,
        BottomNavItem.Alarm,
        BottomNavItem.MyPage
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.Black
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

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    DMSComposeTheme {
        MyPage()
    }

}