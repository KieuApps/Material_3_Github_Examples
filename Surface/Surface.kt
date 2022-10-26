import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    // Surface
    Surface(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .height(160.dp)
    ) {
        // Your main content...
        Text("Example content", Modifier.padding(16.dp))
    }
    
    
    // Surface Colors & Shape
    Surface(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .height(160.dp),
        shape = RoundedCornerShape(24.dp),
        color = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        tonalElevation = 8.dp,
        shadowElevation = 8.dp,
        border = BorderStroke(
            width = 2.dp,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ) {
        // Your main content...
        Text("Example content", Modifier.padding(16.dp))
    }

}
