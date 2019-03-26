package it.example.cond72.animationtest

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

/**
 * Created by alexm on 26/03/2019
 */
class ChartActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        val chart = findViewById<LineChart>(R.id.chart)

        val entries = List(10) {
            Entry(it * 3.0f, it * 2.5f)
        }

        val lineDataSet = LineDataSet(entries, "Esperimento").apply {
            color = Color.RED
            valueTextColor = Color.BLACK
        }

        chart.data = LineData(lineDataSet)
    }
}