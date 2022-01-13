package com.example.se_al.ui.ClassBase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.se_al.R
import com.example.se_al.databinding.FragmentClassBaseBinding

class ClassBaseFragment : Fragment() {

    private var _binding: FragmentClassBaseBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentClassBaseBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btnAddItem.setOnClickListener {
            findNavController().navigate(R.id.action_classBaseFragment_to_alarmAddFragment)
//            findNavController().navigate(R.id.action_classBaseFragment_to_alarmFixFragment)
        }

        binding.btnSetting.setOnClickListener {
            findNavController().navigate(R.id.action_classBaseFragment_to_classBaseAlarmSettingFragment)
        }

        // 공지사항 탭으로 이동
        binding.notice.setOnClickListener {
            findNavController().navigate(R.id.action_classBaseFragment_to_noticeBaseListFragment)
        }


        //강의탭으로 이동
        binding.course.setOnClickListener {
            findNavController().navigate(R.id.action_classBaseFragment_to_courseBaseListFragment)
        }

        // 과제탭으로 이동
        binding.homework.setOnClickListener {
            findNavController().navigate(R.id.action_classBaseFragment_to_alarmBaseListFragment)
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}