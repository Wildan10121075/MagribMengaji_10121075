package com.wildan.magribmengaji_10121075.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wildan.magribmengaji_10121075.databinding.ItemCommunityBinding
import com.wildan.magribmengaji_10121075.model.Community

class CommunityAdapter(private val communityList: List<Community>) : RecyclerView.Adapter<CommunityAdapter.CommunityViewHolder>() {

    inner class CommunityViewHolder(val binding: ItemCommunityBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityViewHolder {
        val binding = ItemCommunityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CommunityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        val community = communityList[position]
        with(holder.binding) {
            communityImage.setImageResource(community.imageResId) // Assumes images are in drawable resources
            communityName.text = community.name
            communityDescription.text = community.description
            communityAddress.text = community.address
            communityWebsite.text = community.websiteUrl

            // Open the website link when clicked
            communityWebsite.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(community.websiteUrl))
                holder.itemView.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = communityList.size
}
