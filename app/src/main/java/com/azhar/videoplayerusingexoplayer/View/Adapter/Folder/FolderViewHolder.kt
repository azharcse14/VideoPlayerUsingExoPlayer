package com.azhar.videoplayerusingexoplayer.View.Adapter.Folder

import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.azhar.videoplayerusingexoplayer.databinding.FolderViewChildBinding

class FolderViewHolder(binding: FolderViewChildBinding): RecyclerView.ViewHolder(
    binding.root
) {
    val icon = binding.iconIdFv
    val folderName = binding.folderNameIdFv

}