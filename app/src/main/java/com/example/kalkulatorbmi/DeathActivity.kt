package com.example.kalkulatorbmi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import java.util.*

class DeathActivity : AppCompatActivity() {
    var anyChartView: AnyChartView? = null
    var months = arrayOf("Jan", "Feb", "Mar")
    var earnings = intArrayOf(12000, 8009, 10000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_death)
        anyChartView = findViewById(R.id.any_chart_view)
        setupPieChart()
    }

    fun setupPieChart() {
        val pie = AnyChart.pie()
        val dataEntries: MutableList<DataEntry> = ArrayList()
        for (i in months.indices) {
            dataEntries.add(ValueDataEntry(months[i], earnings[i]))
        }
        pie.data(dataEntries)
        anyChartView!!.setChart(pie)
    }
}