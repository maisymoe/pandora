package moe.maisy.pandora.presentation.screens.shizuku

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.Text
import moe.maisy.pandora.util.checkShizukuPermission

@Composable
fun ShizukuScreen() {
    Box(modifier = Modifier.fillMaxSize().padding(2.dp)) {
        ScalingLazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                ListHeader {
                    Text(text = "Shizuku Settings")
                }
            }
            item {
                Chip(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { checkShizukuPermission(0) },
                    label = { Text(text = "Request permissions", fontSize = 14.sp) },
                    colors = ChipDefaults.secondaryChipColors()
                )
            }
            item {
                Row {
                    Text(
                        textAlign = TextAlign.Center,
                        fontSize = 8.sp,
                        text = "Depending on your watch, the Shizuku prompt may be off the screen. Adjust your DPI with ADB for now!"
                    )
                }
            }
        }
    }
}