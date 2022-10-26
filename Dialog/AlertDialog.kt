import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*

@Composable
fun Examples() {
    
    // AlertDialog
    var showAlert by remember { mutableStateOf(false) }

    TextButton({ showAlert = true }) {
        Text("Click for preview")
    }
    
    AnimatedVisibility(showAlert) {
        AlertDialog(
            onDismissRequest = { showAlert = false },
            title = { Text("Alert") },
            text = { Text("You clicked the button.") },
            confirmButton = {
                Button({ showAlert = false }) { Text("Confirm") }
            },
            dismissButton = {
                TextButton({ showAlert = false }) { Text("Dismiss") }
            }
        )
    }

}
