package com.dev.texteditor

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bold_button.setOnClickListener {
            var spannableString = SpannableStringBuilder(editText.text)
            spannableString.setSpan(StyleSpan(Typeface.BOLD), editText.selectionStart, editText.selectionEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            editText.text = spannableString
        }

        italic_button.setOnClickListener {
            var spannableString = SpannableStringBuilder(editText.text)
            spannableString.setSpan(StyleSpan(Typeface.ITALIC), editText.selectionStart, editText.selectionEnd, 0)
            editText.text = spannableString
        }

        format_button.setOnClickListener {
            val stringText:String = editText.text.toString()
            editText.setText(stringText)
        }
    }
}