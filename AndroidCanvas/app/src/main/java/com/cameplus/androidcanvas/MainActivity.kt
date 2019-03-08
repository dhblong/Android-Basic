package com.cameplus.androidcanvas

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var canvas: Canvas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPaint()
    }

    private fun initPaint() {
        var bitmap:Bitmap = Bitmap.createBitmap(700,1000,Bitmap.Config.ARGB_8888)
        bitmap.eraseColor(Color.parseColor("#0099dd"))
        canvas = Canvas(bitmap)

        // vẽ hình chử nhật trên màn hình
        var left = 100
        var top = 100
        var right = 600
        var bottom = 400
        var shapDrawable = ShapeDrawable(RectShape())
        shapDrawable.setBounds(left,top, right, bottom)
        shapDrawable.paint.color = Color.parseColor("#ffffff")
        shapDrawable.draw(canvas)

        left = 100
        top = 500
        right = 600
        bottom = 800
        shapDrawable = ShapeDrawable(OvalShape())
        shapDrawable.setBounds(left,top,right,bottom)
        shapDrawable.paint.color = Color.parseColor("#00ffcc")
        shapDrawable.draw(canvas)

        imageV.background = BitmapDrawable(resources,bitmap)

    }

}
