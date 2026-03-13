package com.example.todopelota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import androidx.media3.ui.AspectRatioFrameLayout
import coil.compose.AsyncImage
import androidx.activity.compose.BackHandler


@androidx.media3.common.util.UnstableApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val player = ExoPlayer.Builder(this).build()

        setContent {

            var playing by remember { mutableStateOf(false) }

            if (playing) {
                BackHandler {
                    player.stop()
                    playing = false
                }

                Box(modifier = Modifier.fillMaxSize()) {

                    AndroidView(
                        factory = {
                            PlayerView(it).apply {
                                this.player = player
                                resizeMode = AspectRatioFrameLayout.RESIZE_MODE_FIT
                            }
                        },
                        modifier = Modifier.fillMaxSize()
                    )


                }

            } else {


                LazyColumn {


                    item {
                        Spacer(modifier = Modifier.height(20.dp))
                    }

                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://98ca2.streameasthd.net/espn/index.m3u8?token=a5a9b4c78775655857a2099947face9f0a0c39f2-9d-1773421036-1773367036&ip=186.39.117.20"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()

                                playing = true
                            }
                        ) {

                            Column {

                                AsyncImage(
                                    model = "https://a1.espncdn.com/combiner/i?img=%2Fi%2Fespn%2Fespn_logos%2Fespn_red.png",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )

                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "⚽ ESPN",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Liga Argentina - En vivo")
                                }

                            }
                        }

                    }

                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://ssout.marsrivagg.click/tntar/tracks-v1a1/mono.m3u8?ip=186.39.117.205&token=d43fb395e949e4563c3a05e2639d105cbd8675fa-31-1773420062-1773366062"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://logowik.com/content/uploads/images/tnt-sports-premium4090.logowik.com.webp",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "🏆 TNT Sports Premiun",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Partidos en vivo")
                                }
                            }
                        }

                    }
                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://fgg896.marsrivagg.click/fox2ar/tracks-v1a1/mono.m3u8?ip=186.39.117.205&token=73f28b6a42445101e5c2009243658c92a244bb18-27-1773421121-1773367121"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://tavilatam.com/wp-content/uploads/2023/06/TAVI_FoxSports2-Disney.png",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "🏆 Fox Sport 2",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Partidos en vivo")
                                }
                            }
                        }

                    }

                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://live-04-11-tyc24.vodgc.net/tyc24/index_tyc24_1080.m3u8"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://logowik.com/content/uploads/images/tnt-sports-premium4090.logowik.com.webp",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "📺 Tyc Sport",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Programación en vivo")
                                }
                            }
                        }

                    }
                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://yce5o.envivoslatam.org/dsports/tracks-v1a1/mono.m3u8?ip=186.39.117.205&token=f4cdbcdd494d41848dad846b54a054c103c25c3f-f6-1773421490-1773367490"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg4FhWcE7e14OMKjkDLNoTTO7wKLzrLKymrKhyphenhyphenIo7EsZD4bWs-vXvIsHg9NMF_TeendiHVCbvhGwmhIeKWnAXwYsU6G5497ehzjzq8n-49QtDqWTL9mueVTZ2AN-MXUtdFrs10Th1oapWs/s1280/image.png",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "📺 Directv Sport",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Programación en vivo")
                                }
                            }
                        }

                    }
                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://xky9q.envivoslatam.org/espnpremium/tracks-v1a1/mono.m3u8?ip=186.39.117.205&token=7918b9ff940d90bdc97883d89ef2561c41240be3-be-1773421995-1773367995"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://www.multifibra.ar/wp-content/uploads/2023/11/IMG_espn.png",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "📺 Espn Premium",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Programación en vivo")
                                }
                            }
                        }

                    }
                    item {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            onClick = {
                                val mediaItem = MediaItem.fromUri(
                                    "https://wf6kt.envivoslatam.org/foxsports/tracks-v1a1/mono.m3u8?ip=186.39.117.205&token=6c8241d3f9aa5e8c4855dcc3c354c5ba40181e8c-ce-1773422207-1773368207"
                                )
                                player.setMediaItem(mediaItem)
                                player.prepare()
                                player.play()
                                playing = true
                            }
                        ) {
                            Column {
                                AsyncImage(
                                    model = "https://media.a24.com/p/0dd682562f7da2656cc486b27828af58/adjuntos/296/imagenes/008/323/0008323726/1200x675/smart/fox-sportshjpg.jpg",
                                    contentDescription = "Partido",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp)
                                )

                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        "📺 Fox Sport",
                                        style = MaterialTheme.typography.titleLarge
                                    )
                                    Text("Programación en vivo")
                                }
                            }
                        }

                    }

                }

            }
        }
    }

}