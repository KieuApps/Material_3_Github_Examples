import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

enum class ListItem(
    val headlineText: String,
    val overlineText: String,
    val supportingText: String,
    val icon: ImageVector,
) {
    First(
        headlineText = "First Headline Text",
        overlineText = "First overline text",
        supportingText = "First supporting text",
        icon = Icons.Default.Favorite
    ),
    Second(
        headlineText = "Second Headline Text",
        overlineText = "Second overline text",
        supportingText = "Second supporting text",
        icon = Icons.Default.Build
    ),
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Examples() {

    val list = remember { ListItem.values() }


    // ListItem
    Column {
        list.forEach { item ->
            ListItem(
                headlineText = { Text(item.headlineText) },
                overlineText = { Text(item.overlineText) },
                supportingText = { Text(item.supportingText) },
                leadingContent = { Icon(item.icon, item.headlineText) },
                trailingContent = { Icon(item.icon, item.headlineText) }
            )
        }
    }


    // ListItem Colors
    val containerColor = Color(0xFF161A1A)
    val contentColor = Color(0xFF7CC4BC)

    Column {
        Text(
            "ListItem Colors",
            color = MaterialTheme.colorScheme.onBackground.copy(0.5f),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(start = 8.dp, bottom = 8.dp, end = 8.dp)
        )
        list.forEach { item ->
            ListItem(
                headlineText = { Text(item.headlineText) },
                overlineText = { Text(item.overlineText) },
                supportingText = { Text(item.supportingText) },
                leadingContent = { Icon(item.icon, item.headlineText) },
                trailingContent = { Icon(item.icon, item.headlineText) },
                colors = ListItemDefaults.colors(
                    containerColor = containerColor,
                    headlineColor = contentColor,
                    leadingIconColor = contentColor,
                    overlineColor = contentColor,
                    supportingColor = contentColor,
                    trailingIconColor = contentColor,
                )
            )
        }
    }
}
