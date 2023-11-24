package moe.maisy.pandora.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.compose.navscaffold.WearNavScaffold
import com.google.android.horologist.compose.navscaffold.scrollable
import moe.maisy.pandora.presentation.screens.Screen
import moe.maisy.pandora.presentation.screens.landing.LandingScreen
import moe.maisy.pandora.presentation.screens.shizuku.ShizukuScreen
import moe.maisy.pandora.presentation.theme.PandoraTheme

@OptIn(ExperimentalHorologistApi::class)
@Composable
fun WearApp(navController: NavHostController) {
    PandoraTheme {
        WearNavScaffold(startDestination = Screen.Landing.route, navController = navController) {
            scrollable(Screen.Landing.route) { LandingScreen(navController) }
            scrollable(Screen.Shizuku.route) { ShizukuScreen() }
        }
    }
}