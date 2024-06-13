package com.example.filmoteca

sealed class Screens (val screen: String) {
    data object Home: Screens("Home")
    data object LikedMovies: Screens("LikedMovies")
    data object DislikedMovies: Screens("DislikedMovies")
    data object SavedMovies: Screens("SavedMovies")
    data object WatchedMovies: Screens("WatchedMovies")
}