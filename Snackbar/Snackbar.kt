import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch

@Composable
fun Examples() {

    val scope = rememberCoroutineScope()
    val snackbarState = remember { SnackbarHostState() }


    // Snackbar
    Box {
        Button(
            onClick = {
                scope.launch {
                    snackbarState.showSnackbar(message = "Yum! Snacks")
                }
            }
        ) {
            Text("Click for preview")
        }

        snackbarState.currentSnackbarData?.let { Snackbar(it) }
    }


    // Snackbar with Action Label
    Box {
        Button(
            onClick = {
                scope.launch {
                    snackbarState.showSnackbar(message = "Yum! Snacks", actionLabel = "Okay")
                }
            }
        ) {
            Text("Click for preview")
        }

        snackbarState.currentSnackbarData?.let { Snackbar(it) }
    }

}
