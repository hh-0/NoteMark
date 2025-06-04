package dev.haihuynh.notemark.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF5977F7),
    onPrimary = Color(0xFFFFFFFF),
    surface = Color(0xFFEFEFF2),
    onSurface = Color(0xFF1B1B1C),
    surfaceVariant = Color(0xFFFFFFFF),
    onSurfaceVariant = Color(0xFF535364),
    error = Color(0xFFE1294B)
)

@Composable
fun NoteMarkTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}