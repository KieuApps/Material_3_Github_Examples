import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun Examples() {

    var showAlert by remember { mutableStateOf(false) }


    // AlertDialog
    Button({ showAlert = true }) {
        Text("Click for preview")
    }

    AnimatedVisibility(showAlert) {
        AlertDialog(
            onDismissRequest = { showAlert = false },
            title = { Text("Alert") },
            text = { Text("You clicked the button.") },
            confirmButton = {
                Button({ showAlert = false }) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                TextButton({ showAlert = false }) {
                    Text("Dismiss")
                }
            }
        )
    }


    // AlertDialog Colors
    val containerColor = Color(0xFF5E4463)

    Button({ showAlert = true }) {
        Text("Click for preview (AlertDialog Colors)")
    }

    AnimatedVisibility(showAlert) {
        AlertDialog(
            onDismissRequest = { showAlert = false },
            title = { Text("Alert") },
            text = { Text("You clicked the button.") },
            confirmButton = {
                Button({ showAlert = false }) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                TextButton({ showAlert = false }) {
                    Text("Dismiss")
                }
            },
            shape = RectangleShape,
            containerColor = containerColor,
            iconContentColor = Color.White,
            titleContentColor = Color.White,
            textContentColor = Color.White,
            tonalElevation = 8.dp
        )
    }

}
