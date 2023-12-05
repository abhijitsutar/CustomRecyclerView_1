package com.bold.customrecycler0view_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton

class MainActivity : AppCompatActivity() {

    private lateinit var exitButton: ExitButton
    private lateinit var chkExit: CheckBox
    private lateinit var taskView : TaskView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chkExit = findViewById(R.id.chkExit)
        exitButton = findViewById(R.id.btnExit)
        taskView = findViewById(R.id.taskView)

        taskView.title = "Finish the assignments!"



        chkExit.setOnCheckedChangeListener { _, isChecked ->
            exitButton.exitable = isChecked
        }


    }
    private inner class MyOnChkExitCheckChangeListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            exitButton.exitable = isChecked
        }

    }


}
