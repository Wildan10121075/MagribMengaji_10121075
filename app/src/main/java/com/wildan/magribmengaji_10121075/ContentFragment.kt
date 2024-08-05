package com.wildan.magribmengaji_10121075

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wildan.magribmengaji_10121075.adapter.VideoAdapter
import com.wildan.magribmengaji_10121075.model.VideoModel

class ContentFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var videoAdapter: VideoAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Mengisi tata letak untuk fragment content
        val view = inflater.inflate(R.layout.fragment_content, container, false)

        // Inisialisasi RecyclerView
        recyclerView = view.findViewById(R.id.rv_konten)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Daftar video YouTube dengan deskripsi
        val videoList = listOf(
            VideoModel(
                "https://www.youtube.com/embed/86t80O3kYoE?si=7MrCyd9MO6YIsN3k",
                "Video pertama ini memaparkan tentang huruf hijaiyah, belajar huruf iqro dengan mudah, serta belajar mengaji dengan cepat dan lancar"
            ),
            VideoModel(
                "https://www.youtube.com/embed/VI1dmxJY2Fg?si=17VymQOwN1pE_WBh",
                "Video kedua ini memaparkan tentang cara cepat bisa membaca al qur'an, serta belajara membaca huruf hijaiyah dengan faseh"
            ),
            VideoModel(
                "https://www.youtube.com/embed/h9LOMcFdJng?si=8cox_4vZ0gBxDKMQ",
                "Video ketiga memaparkan sebuah tips baca iqro dengan sangat mudah dari nol huruf hijaiyah alif ba ta pada iqro 4 halaman 14"
            ),
            VideoModel(
                "https://www.youtube.com/embed/4cmQEugEQXo?si=1s1ZWg9CaP5wv35D",
                "Video Keempat memaparkan tentang cara memperbaiki bacaan al fatihah yang sering salah"
            ),
            VideoModel(
                "https://www.youtube.com/embed/O1TOhbkyZC8?si=Xk6C4uEHm3nKlHqb",
                "Video kelima memaparkan tentang suatu kegiatan magrib mengaji yang sangat memberikan edukasi bagi para masyarakat terutama anak-anak"
            )
        )

        // Setel adapter untuk RecyclerView
        videoAdapter = VideoAdapter(videoList)
        recyclerView.adapter = videoAdapter

        return view
    }
}