package com.konkuk.kuitprojectsetting.presentation.diary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.konkuk.kuitprojectsetting.core.component.KuitTitle

@Composable
fun DiaryScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        KuitTitle(
            title = "Diary Screen"
        )
    }
}

@Preview
@Composable
private fun DiaryScreenPreview() {
    DiaryScreen()
}