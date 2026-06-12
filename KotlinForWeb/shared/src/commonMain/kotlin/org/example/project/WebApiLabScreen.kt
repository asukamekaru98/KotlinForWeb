package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WebApiLabScreen(onBack: () -> Unit, onNavigate: (Screen) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextButton(onClick = onBack) { Text("← ホームへ戻る") }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "WebAPIの実験室", fontSize = 36.sp, style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "WebAPI連携の実験をするページです。",
            style = MaterialTheme.typography.bodyLarge,
        )
        Spacer(modifier = Modifier.height(40.dp))

        SubPageCard(title = "仮ページ1") { onNavigate(Screen.Placeholder1) }
        Spacer(modifier = Modifier.height(16.dp))
        SubPageCard(title = "仮ページ2") { onNavigate(Screen.Placeholder2) }
    }
}

@Composable
private fun SubPageCard(title: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.width(320.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Box(modifier = Modifier.padding(20.dp).fillMaxWidth()) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
        }
    }
}
