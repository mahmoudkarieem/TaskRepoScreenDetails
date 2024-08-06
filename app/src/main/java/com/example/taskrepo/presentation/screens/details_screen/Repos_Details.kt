package com.example.taskrepo.presentation.screens.details_screen

import AppBar
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.taskrepo.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepoDetails(
    modifier: Modifier = Modifier

) {
    Scaffold(
        topBar = {
            AppBar(title = "task Repo")
//
        },

        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight()

                    .padding(top = 90.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(
                        ImageRequest.Builder(LocalContext.current)
                            .data(data = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png")
                    ),
                    contentDescription = "Image_Go  ogle_Logo",
                    modifier = Modifier

                        .size(180.dp),
                )
                Text(
                    "language",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(top = 20.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                        .padding(horizontal = 70.dp),


                    ) {
                    Text(
                        text = "1525",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier


                    )
                    Image(
                        painter = painterResource(id = R.drawable.baseline_star_rate_24),
                        contentDescription = "Star_Rate",
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .size(30.dp),

                        )
                    Text(
                        text = "Python",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 10.dp)


                    )
                    Image(
                        painter = painterResource(id = R.drawable.point_blue),
                        contentDescription = "point_blue",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(start = 5.dp)


                    )
                    Text(
                        text = "374",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 10.dp)


                    )
                    Image(
                        painter = painterResource(id = R.drawable.baseline_pattern_24),
                        contentDescription = "point_blue",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(start = 5.dp)


                    )
                }
                Text(
                    stringResource(R.string.text_body_repo),

                    style = MaterialTheme.typography.bodyLarge,

                    modifier = Modifier
                        .padding(
                            top = 30.dp

                        )
                        .padding(horizontal = 50.dp)
                )

                Button(
                    onClick = { },
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),


                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 120.dp)

                        .padding(horizontal = 25.dp),


                    ) {
                    Text(
                        text = stringResource(R.string.text_button),
                        fontWeight = FontWeight.Bold,

                        style = MaterialTheme.typography.titleLarge,
                    )


                }

            }
        }
    )
}


@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_7)
@Composable
private fun PreviewRepoDetails() {
    RepoDetails()

}