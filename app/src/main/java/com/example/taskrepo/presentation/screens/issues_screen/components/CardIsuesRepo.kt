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
            .padding(15.dp)

            .fillMaxWidth()
            .padding(top = 10.dp, end = 24.dp)


            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(14.dp)
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.capture), contentDescription = stringResource(
                R.string.capture_image_screen_issues_ui
            ),
            modifier = Modifier
                .size(60.dp)

        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(

                text = cardIssuesUiModel.description,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,

                fontWeight = FontWeight.Bold,


                style = MaterialTheme.typography.titleSmall
            )

            Text(

                text = cardIssuesUiModel.state,
                style = MaterialTheme.typography.bodySmall,

                modifier = Modifier.padding(top = 10.dp)


            )
            Row(

                modifier = Modifier.padding(vertical = 14.dp)
            ) {
                Text(
                    text = "Created At:",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,

                    )
                Text(
                    text = cardIssuesUiModel.createdAt,
                    style = MaterialTheme.typography.bodySmall,

                    )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(modifier = Modifier.padding(start = 6.dp)) {
            Text(
                text = cardIssuesUiModel.keyIssues,
                style = MaterialTheme.typography.bodySmall,
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