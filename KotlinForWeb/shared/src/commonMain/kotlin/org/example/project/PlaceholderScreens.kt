package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Placeholder1Screen(onBack: () -> Unit) {
    PlaceholderPage(title = "仮ページ1", backLabel = "← WebAPIの実験室へ戻る", onBack = onBack)
}

@Composable
fun Placeholder2Screen(onBack: () -> Unit) {
    PlaceholderPage(title = "仮ページ2", backLabel = "← WebAPIの実験室へ戻る", onBack = onBack)
}

@Composable
fun Placeholder3Screen(onBack: () -> Unit) {
    PlaceholderPage(title = "仮ページ3", backLabel = "← ホームへ戻る", onBack = onBack)
}

@Composable
private fun PlaceholderPage(title: String, backLabel: String, onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextButton(onClick = onBack) { Text(backLabel) }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = title, fontSize = 36.sp, style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "ここは$title です。",
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}
