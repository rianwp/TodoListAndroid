package com.example.finalproject

data class DataRecycleView(
    val judul: String,
    val jam: String,
    val deskripsi: String,
    val tanggal: String,
    val doneStatus: Boolean,
    val id: String
): java.io.Serializable