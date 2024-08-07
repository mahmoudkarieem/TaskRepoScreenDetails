package com.example.taskrepo.presentation.screens.issues_screen

import AppBar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskrepo.R
import com.example.taskrepo.presentation.screens.data.CardIssuesUiModel
import com.example.taskrepo.presentation.screens.issues_screen.components.CardIssuesRepoDetails

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen() {
    val fakeRepoData = listOf(
        CardIssuesUiModel(
            description = "Upgrade `axios` dependency to v1.2.0",
            state = "IN_PROGRESS",
            createdAt = "2023-11-30 14:45",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Implement new analytics ",
            state = "DONE",
            createdAt = "2023-12-05 09:20",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Fix bug in the shopping ",
            state = "NONE",
            createdAt = "2024-01-12 17:35",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Migrate database from MySQL to SQL",
            state = "IN_REVIEW",
            createdAt = "2024-02-28 11:00",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Improve mobile responsiveness of the website",
            state = "DONE",
            createdAt = "2024-03-20 15:10",
            keyIssues = "Open"
        ), CardIssuesUiModel(
            description = "Upgrade `axios` dependency to v1.2.0",
            state = "IN_PROGRESS",
            createdAt = "2023-11-30 14:45",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Implement new analytics ",
            state = "DONE",
            createdAt = "2023-12-05 09:20",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Fix bug in the shopping ",
            state = "NONE",
            createdAt = "2024-01-12 17:35",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Migrate database from MySQL to Swift",
            state = "IN_REVIEW",
            createdAt = "2024-02-28 11:00",
            keyIssues = "Open"
        ),
        CardIssuesUiModel(
            description = "Improve mobile responsiveness of the website",
            state = "DONE",
            createdAt = "2024-03-20 15:10",
            keyIssues = "Open"
        )
    )


    Column(Modifier.fillMaxSize()) {
        AppBar(
            title = stringResource(R.string.title_name_issues_screen), showBackArrow = true,

            )
        LazyColumn(
            modifier = Modifier
                .background(Color.Gray)
                .padding(horizontal = 6.dp)
        ) {
            items(fakeRepoData.size) {
                CardIssuesRepoDetails(
                    cardIssuesUiModel = fakeRepoData[it]
                )
            }

        }
    }

}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_7)
@Composable
private fun PreviewIssuesScreen() {
    IssuesScreen(

    )
}
