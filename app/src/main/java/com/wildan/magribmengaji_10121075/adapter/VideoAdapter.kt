package com.wildan.magribmengaji_10121075.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wildan.magribmengaji_10121075.R
import com.wildan.magribmengaji_10121075.model.VideoModel

class VideoAdapter(private val videoList: List<VideoModel>) :
    RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoModel = videoList[position]
        holder.bind(videoModel)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val webView: WebView = itemView.findViewById(R.id.webview)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.video_description)

        fun bind(videoModel: VideoModel) {
            val webSettings: WebSettings = webView.settings
            webSettings.javaScriptEnabled = true
            webSettings.mediaPlaybackRequiresUserGesture = false
            webView.webViewClient = WebViewClient()
            webView.loadUrl(videoModel.videoUrl)

            // Set deskripsi video
            descriptionTextView.text = videoModel.description
        }
    }
}