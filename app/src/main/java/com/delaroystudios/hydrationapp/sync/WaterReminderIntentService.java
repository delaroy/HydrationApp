package com.delaroystudios.hydrationapp.sync;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by delaroy on 5/4/17.
 */
public class WaterReminderIntentService extends IntentService {

    public  WaterReminderIntentService(){
        super("WaterReminderIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        String action = intent.getAction();
        ReminderTasks.executeTask(this, action);
    }
}
