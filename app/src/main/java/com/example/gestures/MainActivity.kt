package com.example.gestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

//Se agregan las clases gestos
class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private var myTextView:TextView?=null
    private var gDetector: GestureDetectorCompat?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById<TextView>(R.id.txtMensajes)
        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent): Boolean {
        myTextView!!.text="onDown"
        return false

    }

    override fun onShowPress(p0: MotionEvent) {
        myTextView!!.text="OnShowPress"
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        myTextView!!.text="onSingleTapUp"
        return false

    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        myTextView!!.text="onScroll"
        return false
    }

    override fun onLongPress(p0: MotionEvent) {
        myTextView!!.text="onLongPress$p0"
    }

    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        myTextView!!.text="onFling"
        return false

    }

    override fun onSingleTapConfirmed(p0: MotionEvent): Boolean {
        myTextView!!.text="onSingleTapConfirmed"
        return false

    }

    override fun onDoubleTap(p0: MotionEvent): Boolean {
        myTextView!!.text="onDoubleTap"
        return false

    }

    override fun onDoubleTapEvent(p0: MotionEvent): Boolean {
        myTextView!!.text="onDoubleTapEvent"
        return false

    }
}