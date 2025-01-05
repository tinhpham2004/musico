package com.pht.musico.presentation.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.pht.musico.R
import com.pht.musico.presentation.common.ListTile
import com.pht.musico.presentation.common.Stack
import com.pht.musico.ui.theme.c_000000
import com.pht.musico.ui.theme.c_FFFFFF
import com.pht.musico.ui.theme.c_transparent
import com.pht.musico.ui.theme.typography
import com.pht.musico.util.Dimens.space_16
import com.pht.musico.util.Dimens.space_24
import com.pht.musico.util.Dimens.space_32
import com.pht.musico.util.Dimens.space_40
import com.pht.musico.util.Dimens.space_8
import com.pht.musico.util.Dimens.space_80

/**
 * A composable function that displays the search screen.
 * It includes a search bar, trending artists, and a browse section.
 */
@Composable
fun SearchScreen() {
    var isFocusing by remember { mutableStateOf(false) }
    var searchQuery by remember { mutableStateOf("") }

    // Create a FocusRequester to control focus programmatically
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current

    Column {
        TextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = {
                Text(
                    "Search for songs, albums, artists, and more",
                    style = typography.titleMedium.copy(
                        fontSize = 20.sp,
                        color = if (!isFocusing)
                            c_000000.copy(alpha = 0.75f)
                        else
                            c_FFFFFF.copy(alpha = 0.25f)
                    ),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                )
            },
            leadingIcon = {
                if (!isFocusing) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = c_000000.copy(alpha = 0.75f),
                        modifier = Modifier.size(space_32)
                    )
                } else {
                    IconButton(
                        onClick = {
                            isFocusing = false
                            searchQuery = ""
                            focusManager.clearFocus()
                        },
                        content = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = null,
                                tint = c_FFFFFF.copy(alpha = 0.75f),
                                modifier = Modifier.size(space_32)
                            )
                        }
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(space_16)
                .clip(RoundedCornerShape(space_16))
                .focusRequester(focusRequester)
                .onFocusChanged { focusState ->
                    isFocusing = focusState.isFocused
                },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = c_FFFFFF.copy(alpha = 0.75f),
                focusedContainerColor = c_transparent,
                focusedIndicatorColor = c_transparent,
                unfocusedIndicatorColor = c_transparent
            ),
        )

        Spacer(modifier = Modifier.height(space_24))

        if (!isFocusing) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space_16),
                verticalAlignment = Alignment.CenterVertically,

                ) {
                Icon(
                    painter = painterResource(R.drawable.trending_up),
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(space_8))

                Text(
                    "Trending Artists",
                    style = typography.titleMedium.copy(
                        fontSize = 20.sp,
                        color = c_FFFFFF.copy(alpha = 0.75f)
                    ),
                )
            }

            Spacer(modifier = Modifier.height(space_16))

            LazyRow(
                modifier = Modifier.padding(start = space_16),
                horizontalArrangement = Arrangement.spacedBy(space_16),
            ) {
                items(5) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.new_english_songs),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(space_80)
                                .clip(CircleShape),
                        )
                        Spacer(modifier = Modifier.height(space_8))
                        Text(
                            "Childish Gambino",
                            style = typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                            color = c_FFFFFF.copy(alpha = 0.75f),
                            modifier = Modifier.width(space_80),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(space_24))

            Text(
                "Browse",
                style = typography.titleMedium.copy(
                    fontSize = 20.sp,
                    color = c_FFFFFF.copy(alpha = 0.75f)
                ),
                modifier = Modifier.padding(horizontal = space_16)
            )

            Spacer(modifier = Modifier.height(space_16))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = space_16),
                horizontalArrangement = Arrangement.spacedBy(space_16),
                verticalArrangement = Arrangement.spacedBy(space_16),
            ) {
                items(20) { index ->
                    Stack(
                        alignment = Alignment.BottomCenter,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.new_english_songs),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Text(
                            "POP",
                            style = typography.titleMedium.copy(
                                fontSize = 20.sp,
                                color = c_FFFFFF.copy(alpha = 0.75f),
                                fontWeight = FontWeight.SemiBold
                            ),
                            modifier = Modifier.padding(space_8)
                        )
                    }
                }
            }
        } else {
            Text(
                "Recent searches",
                style = typography.titleMedium.copy(
                    fontSize = 20.sp,
                    color = c_FFFFFF.copy(alpha = 0.75f)
                ),
                modifier = Modifier.padding(horizontal = space_16)
            )

            Spacer(modifier = Modifier.height(space_24))

            LazyColumn(
                modifier = Modifier.padding(horizontal = space_16),
                verticalArrangement = Arrangement.spacedBy(space_16),
            ) {
                items(5) {
                    ListTile(
                        title = {
                            Text(
                                "You (feat. Travis Scott)",
                                style = typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                                color = c_FFFFFF.copy(alpha = 0.75f)
                            )
                        },
                        subtitle = {
                            Text(
                                "Song - Don Toliver",
                                style = typography.titleMedium.copy(
                                    color = c_FFFFFF.copy(alpha = 0.5f)
                                )
                            )
                        },
                        leading = {
                            Image(
                                painter = painterResource(id = R.drawable.new_english_songs),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(space_40)
                                    .clip(RoundedCornerShape(space_8))
                            )
                        },
                        trailing = {
                            Icon(
                                imageVector = Icons.Default.Clear,
                                contentDescription = null,
                                tint = c_FFFFFF.copy(alpha = 0.75f),
                            )
                        }
                    )
                }
            }

            Text(
                "Clear history",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space_16)
                    .align(Alignment.End),
                style = typography.titleMedium.copy(
                    fontSize = 20.sp,
                    color = c_FFFFFF.copy(alpha = 0.25f),
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.End
            )
        }
    }
}