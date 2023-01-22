package com.example.calisthenicsworkout.models

import android.app.Application
import com.example.calisthenicsworkout.models.bridges.BridgesDatabase
import com.example.calisthenicsworkout.models.legRaises.LegRaisesDatabase
import com.example.calisthenicsworkout.models.pullups.PullUpsDatabase
import com.example.calisthenicsworkout.models.pushups.PushUpsDatabase
import com.example.calisthenicsworkout.models.squats.SquatsDatabase

class DatabasesApp: Application() {

    val pushUpsDB by lazy{
        PushUpsDatabase.getInstance(this)
    }

    val legRaisesDB by lazy{
        LegRaisesDatabase.getInstance(this)
    }

    val squatsDB by lazy{
        SquatsDatabase.getInstance(this)
    }

    val pullUpsDB by lazy{
        PullUpsDatabase.getInstance(this)
    }

    val bridgesDB by lazy{
        BridgesDatabase.getInstance(this)
    }
}