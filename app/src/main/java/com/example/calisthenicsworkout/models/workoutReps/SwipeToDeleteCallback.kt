package com.example.calisthenicsworkout.models.workoutReps

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.calisthenicsworkout.R

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator




abstract class SwipeToDeleteCallback(context: Context): ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

    private val deleteBackgroundColor = Color.parseColor("#f44336")

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {

    }

    //Third party library is used to get swipe red background and image
    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {

        RecyclerViewSwipeDecorator.Builder(
            c,
            recyclerView,
            viewHolder,
            dX,
            dY,
            actionState,
            isCurrentlyActive
        )
            .addBackgroundColor(deleteBackgroundColor)
            .addActionIcon(R.drawable.ic_delete)
            .create()
            .decorate()

        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }
}