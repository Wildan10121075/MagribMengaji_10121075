package com.wildan.magribmengaji_10121075

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wildan.magribmengaji_10121075.adapter.CommunityAdapter
import com.wildan.magribmengaji_10121075.adapter.PhotoAdapter
import com.wildan.magribmengaji_10121075.model.Community
import com.wildan.magribmengaji_10121075.model.Photo

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PhotoAdapter


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Mengisi tata letak untuk fragment home
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Inisialisasi Recycle View
        recyclerView = view.findViewById(R.id.rv_kegiatan)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        // Data Foto
        val photos = listOf(
            Photo(R.drawable.kegiatan1),
            Photo(R.drawable.kegiatan2),
            Photo(R.drawable.kegiatan3),
            Photo(R.drawable.kegiatan4),
            Photo(R.drawable.kegiatan5),
        )

        // Setel adapter untuk RecyclerView
        adapter = PhotoAdapter(photos)
        recyclerView.adapter = adapter


        //button cari tempat -->
        val btnCari: Button = view.findViewById(R.id.btn_cari)
        btnCari.setOnClickListener {
            // URL Google Maps dengan alamat
            val url = "https://www.google.co.id/maps/place/Masjid+Al+Ukhuwah,+Jl.+Wastukencana+No.27,+Babakan+Ciamis,+Kec.+Sumur+Bandung,+Kota+Bandung,+Jawa+Barat+40117/@-6.9108011,107.6061025,17z/data=!3m1!4b1!4m6!3m5!1s0x2e68e639c8d28573:0x36d9759101ee254f!8m2!3d-6.9108011!4d107.6086774!16s%2Fg%2F11bc8wjlm_?entry=ttu"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            intent.setPackage("com.google.android.apps.maps")
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            }
        }
        // <-- button cari tempat
        return view
    }
}
