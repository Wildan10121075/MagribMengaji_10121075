// com/wildan/magribmengaji_10121075/CommunityFragment.kt
package com.wildan.magribmengaji_10121075

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wildan.magribmengaji_10121075.adapter.CommunityAdapter
import com.wildan.magribmengaji_10121075.model.Community

class CommunityFragment : Fragment() {

    private lateinit var recyclerViewCommunities: RecyclerView
    private lateinit var communityAdapter: CommunityAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Mengisi tata letak untuk fragment community
        val view = inflater.inflate(R.layout.fragment_community, container, false)

        // Inisialisasi RecyclerView
        recyclerViewCommunities = view.findViewById(R.id.rv_komunitas)
        recyclerViewCommunities.layoutManager = LinearLayoutManager(context)

        val communityList = listOf(
            Community(R.drawable.komunitas1, "Yayasan Tarbiyah Sunnah", "Menyebarkan dakwah Islam sesuai dengan Al-Qur’an dan As-Sunnah.", "Jl. Jurang No.86, Pasteur, Kec. Sukajadi, Kota Bandung, Jawa Barat 40161", "https://tarbiyahsunnah.com/"),
            Community(R.drawable.komunitas2, "Kajian Sunnah Bandung", "Membagikan informasi seputar jadwal kajian yang diselenggarakan di Kota Bandung.", "Komplek BSD Sport Center, Jl. Ranca Mekar, Riung Bandung – Bandung","https://kajiansunnahbandung.web.id/"),
            Community(R.drawable.komunitas3, "Masjid Raya Al Jabbar", "Masjid Raya Al Jabbar menggelar pengajian rutin Ceramah Subuh dan Dzuhur, Majelis Taklim, dll.", "Jl. Cimencrang No. 14 Gedebage Bandung Jawa Barat 40294.","https://masjidaljabbar.com/"),
            Community(R.drawable.komunitas4, "Yayasan Pemuda Hijarah Indonesia", "Kajian rutin dan berbagai acara keagamaan untuk para pemuda yang ingin memperdalam keimanan.", "Jl. Gatot Subroto No.289, Cibangkong, Kec. Batununggal, Kota Bandung, Jawa Barat 40273.","https://pemudahijrah.id/"),
            Community(R.drawable.komunitas5, "Pondok Pesantren Daarut Tauhiid", "Dipimpin oleh KH. Abdullah Gymnastiar dan menawarkan berbagai program pengajian.", "Jl. Gegerkalong Girang No.38, Gegerkalong, Kec. Sukasari, Kota Bandung, Jawa Barat 40154.","https://www.daaruttauhiid.org/"),
            // Tambahkan lebih banyak komunitas sesuai kebutuhan
        )

        // Setel adapter untuk RecyclerView
        communityAdapter = CommunityAdapter(communityList)
        recyclerViewCommunities.adapter = communityAdapter

        return view
    }
}
