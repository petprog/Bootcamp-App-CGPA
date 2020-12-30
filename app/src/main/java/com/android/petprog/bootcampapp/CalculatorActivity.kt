package com.android.petprog.bootcampapp

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val editTextScore1: EditText = findViewById(R.id.editTextScore1)
        val editTextScore2: EditText = findViewById(R.id.editTextScore2)
        val editTextScore3: EditText = findViewById(R.id.editTextScore3)
        val editTextScore4: EditText = findViewById(R.id.editTextScore4)
        val editTextScore5: EditText = findViewById(R.id.editTextScore5)
        val editTextScore6: EditText = findViewById(R.id.editTextScore6)
        val editTextScore7: EditText = findViewById(R.id.editTextScore7)
        val editTextScore8: EditText = findViewById(R.id.editTextScore8)

        val textViewGrade1: TextView = findViewById(R.id.textViewGrade1)
        val textViewGrade2: TextView = findViewById(R.id.textViewGrade2)
        val textViewGrade3: TextView = findViewById(R.id.textViewGrade3)
        val textViewGrade4: TextView = findViewById(R.id.textViewGrade4)
        val textViewGrade5: TextView = findViewById(R.id.textViewGrade5)
        val textViewGrade6: TextView = findViewById(R.id.textViewGrade6)
        val textViewGrade7: TextView = findViewById(R.id.textViewGrade7)
        val textViewGrade8: TextView = findViewById(R.id.textViewGrade8)


        val editTextUnit1: EditText = findViewById(R.id.editTextUnit1)
        val editTextUnit2: EditText = findViewById(R.id.editTextUnit2)
        val editTextUnit3: EditText = findViewById(R.id.editTextUnit3)
        val editTextUnit4: EditText = findViewById(R.id.editTextUnit4)
        val editTextUnit5: EditText = findViewById(R.id.editTextUnit5)
        val editTextUnit6: EditText = findViewById(R.id.editTextUnit6)
        val editTextUnit7: EditText = findViewById(R.id.editTextUnit7)
        val editTextUnit8: EditText = findViewById(R.id.editTextUnit8)

        val textViewPoint1: TextView = findViewById(R.id.textViewPoint1)
        val textViewPoint2: TextView = findViewById(R.id.textViewPoint2)
        val textViewPoint3: TextView = findViewById(R.id.textViewPoint3)
        val textViewPoint4: TextView = findViewById(R.id.textViewPoint4)
        val textViewPoint5: TextView = findViewById(R.id.textViewPoint5)
        val textViewPoint6: TextView = findViewById(R.id.textViewPoint6)
        val textViewPoint7: TextView = findViewById(R.id.textViewPoint7)
        val textViewPoint8: TextView = findViewById(R.id.textViewPoint8)

        val buttonCalculate: Button = findViewById(R.id.buttonCalculate)
        val textViewCgpa: TextView = findViewById(R.id.textViewCgpa)


        editTextScore1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade1.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit1.text.isNotEmpty()) {
                        val unit = editTextUnit1.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint1.text = point.toString()
                        textViewGrade1.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade2.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit2.text.isNotEmpty()) {
                        val unit = editTextUnit2.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint2.text = point.toString()
                        textViewGrade2.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade3.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit3.text.isNotEmpty()) {
                        val unit = editTextUnit3.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint3.text = point.toString()
                        textViewGrade3.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore4.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade4.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit4.text.isNotEmpty()) {
                        val unit = editTextUnit4.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint4.text = point.toString()
                        textViewGrade4.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore5.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade5.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit5.text.isNotEmpty()) {
                        val unit = editTextUnit5.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint5.text = point.toString()
                        textViewGrade5.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore6.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade6.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit6.text.isNotEmpty()) {
                        val unit = editTextUnit6.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint6.text = point.toString()
                        textViewGrade6.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore7.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade7.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit7.text.isNotEmpty()) {
                        val unit = editTextUnit7.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint7.text = point.toString()
                        textViewGrade7.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })

        editTextScore8.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty()) {
                    val score = p0.toString().toInt()
                    textViewGrade8.text =
                        convertToGrade(p0.toString().toInt())
                    if (editTextUnit8.text.isNotEmpty()) {
                        val unit = editTextUnit8.text.toString().toInt()
                        val point = unit * convertToPoint(score)
                        textViewPoint8.text = point.toString()
                        textViewGrade8.text =
                            convertToGrade(p0.toString().toInt())
                    }
                }
            }

        })



        editTextUnit1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore1.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore1.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint1.text = point.toString()
                }
            }

        })

        editTextUnit2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore2.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore2.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint2.text = point.toString()
                }
            }

        })


        editTextUnit3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore3.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore3.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint3.text = point.toString()
                }
            }

        })

        editTextUnit4.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore4.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore4.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint4.text = point.toString()
                }
            }

        })

        editTextUnit5.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore5.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore5.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint5.text = point.toString()
                }
            }

        })

        editTextUnit6.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore6.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore6.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint6.text = point.toString()
                }
            }

        })

        editTextUnit7.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore7.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore7.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint7.text = point.toString()
                }
            }

        })

        editTextUnit8.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString().isNotEmpty() && editTextScore8.text.isNotEmpty()) {

                    val unit = p0.toString().toInt()
                    val score = editTextScore8.text.toString().toInt()
                    val point = unit * convertToPoint(score)
                    textViewPoint8.text = point.toString()
                }
            }

        })

        buttonCalculate.setOnClickListener {

            var totalUnits = 0.0
            var totalPoints = 0.0
            if (editTextScore1.text.isNotEmpty() &&
                editTextScore2.text.isNotEmpty() &&
                editTextScore3.text.isNotEmpty() &&
                editTextScore4.text.isNotEmpty() &&
                editTextScore5.text.isNotEmpty() &&
                editTextScore6.text.isNotEmpty() &&
                editTextScore7.text.isNotEmpty() &&
                editTextScore8.text.isNotEmpty() &&
                editTextUnit1.text.isNotEmpty() &&
                editTextUnit2.text.isNotEmpty() &&
                editTextUnit3.text.isNotEmpty() &&
                editTextUnit4.text.isNotEmpty() &&
                editTextUnit5.text.isNotEmpty() &&
                editTextUnit6.text.isNotEmpty() &&
                editTextUnit7.text.isNotEmpty() &&
                editTextUnit8.text.isNotEmpty()
            ) {
                val points = convertToPoint(
                    editTextScore1.text.toString().toInt()
                ) * editTextUnit1.text.toString().toInt() +
                        convertToPoint(
                            editTextScore2.text.toString().toInt()
                        ) * editTextUnit2.text.toString().toInt() +
                        convertToPoint(
                            editTextScore3.text.toString().toInt()
                        ) * editTextUnit3.text.toString().toInt() +
                        convertToPoint(
                            editTextScore4.text.toString().toInt()
                        ) * editTextUnit4.text.toString().toInt() +
                        convertToPoint(
                            editTextScore5.text.toString().toInt()
                        ) * editTextUnit5.text.toString().toInt() +
                        convertToPoint(
                            editTextScore6.text.toString().toInt()
                        ) * editTextUnit6.text.toString().toInt() +
                        convertToPoint(
                            editTextScore7.text.toString().toInt()
                        ) * editTextUnit7.text.toString().toInt() +
                        convertToPoint(
                            editTextScore8.text.toString().toInt()
                        ) * editTextUnit8.text.toString().toInt()

                val units = editTextUnit1.text.toString().toInt() +
                        editTextUnit2.text.toString().toInt() +
                        editTextUnit3.text.toString().toInt() +
                        editTextUnit4.text.toString().toInt() +
                        editTextUnit5.text.toString().toInt() +
                        editTextUnit6.text.toString().toInt() +
                        editTextUnit7.text.toString().toInt() +
                        editTextUnit8.text.toString().toInt()
                totalUnits += units
                totalPoints += points
            }

            val cgpa = totalPoints / totalUnits
//            Toast.makeText(this, cgpa.toString(), Toast.LENGTH_SHORT).show()
            val cgpaTo2DecimalFormat = String.format("%.2f", cgpa)
            if (cgpaTo2DecimalFormat != "NaN") {
                textViewCgpa.text = cgpaTo2DecimalFormat
            } else {
                val contextView = findViewById<View>(R.id.constraintLayout)

                Snackbar.make(contextView, R.string.instructions, Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(resources.getColor(R.color.colorPrimary))
                    .setTextColor(resources.getColor(R.color.colorWhite))
                    .show()
            }
        }

    }

    private fun convertToGrade(score: Int): String {
        return when {
            score >= 70 -> "A"
            score in 60..69 -> "B"
            score in 50..59 -> "C"
            score in 45..49 -> "D"
            score in 40..44 -> "E"
            else -> "F"
        }
    }

    private fun convertToPoint(score: Int): Int {
        return when {
            score >= 70 -> 5
            score in 60..69 -> 4
            score in 50..59 -> 3
            score in 45..49 -> 2
            score in 40..44 -> 1
            else -> 0
        }
    }
}