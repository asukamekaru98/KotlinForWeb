package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(onNavigate: (Screen) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "ホーム", fontSize = 36.sp, style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(48.dp))

        NavCard(title = "ポートフォリオ", description = "私のポートフォリオページです") {
            onNavigate(Screen.Portfolio)
        }
        Spacer(modifier = Modifier.height(16.dp))
        NavCard(title = "WebAPIの実験室", description = "WebAPI連携の実験ページです") {
            onNavigate(Screen.WebApiLab)
        }
        Spacer(modifier = Modifier.height(16.dp))
        NavCard(title = "仮ページ3", description = "仮ページです") {
            onNavigate(Screen.Placeholder3)
        }
    }
}

@Composable
private fun NavCard(title: String, description: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.width(320.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
