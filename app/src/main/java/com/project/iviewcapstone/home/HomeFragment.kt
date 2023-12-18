package com.project.iviewcapstone.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.iviewcapstone.R
import com.project.iviewcapstone.databinding.FragmentHomeBinding
import com.project.iviewcapstone.ui.scan.ScanActivity

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        menuAction()
    }

    private fun menuAction() {
        binding.apply {
            scan.setOnClickListener {
                Intent(requireContext(), ScanActivity::class.java).also {
                    startActivity(it)
                }

            }
        }
    }
}