import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Examples() {

    var currentTab by remember { mutableStateOf(1) }
    val tabs = listOf("Documents", "Music", "Photos", "Videos", "More")

    // ScrollableTabRow
    ScrollableTabRow(selectedTabIndex = currentTab) {
        tabs.forEachIndexed { index, tab ->
            Tab(
                selected = currentTab == index,
                onClick = { currentTab = index },
                text = { Text(tab) }
            )
        }
    }


    // ScrollableTabRow Colors
    ScrollableTabRow(
        selectedTabIndex = currentTab,
        containerColor = Color(0xFF131D52),
        contentColor = Color.White,
        indicator = {
            TabRowDefaults.Indicator(
                modifier = Modifier
                    .tabIndicatorOffset(
                        currentTabPosition = it[currentTab]
                    ),
                color = Color.Blue
            )
        }
    ) {
        tabs.forEachIndexed { index, tab ->
            Tab(
                selected = currentTab == index,
                onClick = { currentTab = index },
                text = { Text(tab) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Gray,
            )
        }
    }

}
