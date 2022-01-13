package com.example.se_al.ui

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.se_al.SampleData

class AlarmBaseListViewModel(application: Application) : AndroidViewModel(application) {
    var main_text: ObservableField<String> = ObservableField("직접추가")

    val mApplication = application

    fun onClickButton() {
        // Click 시 데이터를 추가.
        Toast.makeText(mApplication, "Click!", Toast.LENGTH_SHORT).show()

    }
}