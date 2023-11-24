package moe.maisy.pandora.util

import android.content.pm.PackageManager
import rikka.shizuku.Shizuku

fun checkShizukuPermission(code: Int): Boolean {
    return if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) {
        true
    } else if (Shizuku.shouldShowRequestPermissionRationale()) {
        false
    } else {
        Shizuku.requestPermission(code)
        false
    }
}