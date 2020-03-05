package com.ovatsia.piirto

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View

class MunView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint: Paint = Paint()
        paint.color = Color.BLACK
        canvas.drawOval(200.0f, 200.0f, 200.0f, 200.0f, paint)
    }
}