package com.azhar.videoplayerusingexoplayer.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.azhar.videoplayerusingexoplayer.Adapter.VideoAdapter
import com.azhar.videoplayerusingexoplayer.R
import com.azhar.videoplayerusingexoplayer.databinding.FragmentVideosBinding
import java.util.ArrayList


class VideosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_videos, container, false)
        val binding = FragmentVideosBinding.bind(view)
        val tempList =ArrayList<String>()

        tempList.add("Video 1")
        tempList.add("Video 2")
        tempList.add("Video 3")
        tempList.add("Video 4")
        tempList.add("Video 5")
        tempList.add("Video 6")
        tempList.add("Video 7")
        tempList.add("Video 8")
        tempList.add("Video 9")

        binding.videoRvId.setHasFixedSize(true)
        binding.videoRvId.setItemViewCacheSize(10)
        binding.videoRvId.layoutManager =  LinearLayoutManager(requireContext())
        binding.videoRvId.adapter = VideoAdapter(requireContext(), tempList)

        return view
    }

}