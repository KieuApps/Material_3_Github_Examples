import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {
    var notificationCount by remember { mutableStateOf(100) }

    BadgedBox(
        badge = { Badge { Text(notificationCount.toString()) } },
        modifier = Modifier.padding(24.dp)
    ) {
        Icon(Icons.Default.Notifications, "Notifications")
    }
}
