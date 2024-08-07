package com.example.taskrepo.presentation.screens.issues_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskrepo.R
import com.example.taskrepo.presentation.screens.data.CardIssuesUiModel

@Composable
fun CardIssuesRepoDetails(
    modifier: Modifier = Modifier,
    cardIssuesUiModel: CardIssuesUiModel,
) {

    Row(
        horizontalArrangement = Arrangement.Start,

        modifier = modifier
            .padding(top = 8.dp)

            .fillMaxWidth()


            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.capture), contentDescription = stringResource(
                R.string.capture_image_screen_issues_ui
            ),
            modifier = Modifier
                .padding(top = 12.dp, start = 10.dp)
                .size(60.dp)

        )
        Column(modifier = Modifier.padding(start = 10.dp, top = 12.dp)) {
            Text(

                text = cardIssuesUiModel.description,
                style = MaterialTheme.typography.headlineSmall,

                maxLines = 1,
                overflow = TextOverflow.Ellipsis,


                )

            Text(

                text = cardIssuesUiModel.state,
                style = MaterialTheme.typography.titleMedium,

                modifier = Modifier.padding(top = 10.dp)


            )
            Row(

                modifier = Modifier.padding(vertical = 14.dp)
            ) {
                Text(
                    text = "Created At : ",
                    style = MaterialTheme.typography.titleMedium,


                    )
                Text(
                    text = cardIssuesUiModel.createdAt,
                    style = MaterialTheme.typography.titleMedium,

                    )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(modifier = Modifier.padding(start = 6.dp, top = 12.dp)) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = cardIssuesUiModel.keyIssues,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,

                )

        }
    }
}


@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
private fun PreviewCardIssuesRepoDetails() {
    CardIssuesRepoDetails(

        cardIssuesUiModel = CardIssuesUiModel(
//            image = "",
            description = "Bump pyarrow from7 to 10",
            state = "NONE",
            createdAt = " 2023-10-17,22:30 PM",
            keyIssues = "Open"
        )
    )

}