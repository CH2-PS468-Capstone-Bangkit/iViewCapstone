package com.project.iviewcapstone.ui.articles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.iviewcapstone.R
import com.project.iviewcapstone.databinding.ActivityScanBinding
import com.project.iviewcapstone.databinding.FragmentDetailArticlesBinding

class DetailArticlesFragment : Fragment() {

    private lateinit var binding: FragmentDetailArticlesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentDetailArticlesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            toolbar.navBack.visibility = View.GONE
            toolbar.tvToolbarName.text = "Artikel"
        }
    }
}