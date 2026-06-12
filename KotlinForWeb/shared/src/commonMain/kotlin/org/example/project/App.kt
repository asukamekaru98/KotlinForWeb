package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinforweb.shared.generated.resources.Res
import kotlinforweb.shared.generated.resources.NotoSansJP_Regular
import kotlinforweb.shared.generated.resources.NotoSansJP_Bold
import org.jetbrains.compose.resources.Font

@Composable
fun App() {
    val notoSansJP = FontFamily(
        Font(Res.font.NotoSansJP_Regular, weight = FontWeight.Normal),
        Font(Res.font.NotoSansJP_Bold, weight = FontWeight.Bold),
    )

    val appTypography = Typography(
        displayLarge   = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 57.sp),
        displayMedium  = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 45.sp),
        displaySmall   = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 36.sp),
        headlineLarge  = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 32.sp),
        headlineMedium = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 28.sp),
        headlineSmall  = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Bold,   fontSize = 24.sp),
        titleLarge     = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 22.sp),
        titleMedium    = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 16.sp),
        titleSmall     = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 14.sp),
        bodyLarge      = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Normal, fontSize = 16.sp),
        bodyMedium     = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Normal, fontSize = 14.sp),
        bodySmall      = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Normal, fontSize = 12.sp),
        labelLarge     = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 14.sp),
        labelMedium    = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 12.sp),
        labelSmall     = TextStyle(fontFamily = notoSansJP, fontWeight = FontWeight.Medium, fontSize = 11.sp),
    )

    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }

    MaterialTheme(typography = appTypography) {
        when (currentScreen) {
            is Screen.Home        -> HomeScreen(onNavigate = { currentScreen = it })
            is Screen.Portfolio   -> PortfolioScreen(onBack = { currentScreen = Screen.Home })
            is Screen.WebApiLab   -> WebApiLabScreen(
                onBack     = { currentScreen = Screen.Home },
                onNavigate = { currentScreen = it },
            )
            is Screen.Placeholder1 -> Placeholder1Screen(onBack = { currentScreen = Screen.WebApiLab })
            is Screen.Placeholder2 -> Placeholder2Screen(onBack = { currentScreen = Screen.WebApiLab })
            is Screen.Placeholder3 -> Placeholder3Screen(onBack = { currentScreen = Screen.Home })
        }
    }
}
