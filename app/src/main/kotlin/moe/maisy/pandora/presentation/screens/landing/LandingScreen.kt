package moe.maisy.pandora.presentation.screens.landing

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.Text
import moe.maisy.pandora.presentation.screens.Screen

@Composable
fun LandingScreen(navHost: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().padding(2.dp)) {
        ScalingLazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                ListHeader {
                    Text(text = "Pandora's Watch")
                }
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { navHost.navigate(Screen.Shizuku.route) },
                    label = { Text("Shizuku Settings") },
                    colors = ChipDefaults.secondaryChipColors()
                )
            }
        }
    }
}