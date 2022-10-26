import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun Examples() {

    val snackbarState = remember { SnackbarHostState() }

    // Snackbar
    snackbarState.currentSnackbarData?.let { Snackbar(it) }

    LaunchedEffect(Unit) {
        snackbarState.showSnackbar(message = "Yum! Snacks")
    }
    
    
    // Snackbar with Action
    snackbarState.currentSnackbarData?.let { Snackbar(it) }
    
    LaunchedEffect(Unit) {
        snackbarState.showSnackbar(message = "Yum! Snacks", actionLabel = "Okay")
    }

}
