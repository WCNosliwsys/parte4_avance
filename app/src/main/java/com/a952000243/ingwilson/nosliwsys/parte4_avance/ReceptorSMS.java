package com.a952000243.ingwilson.nosliwsys.parte4_avance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReceptorSMS extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, Servicio.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
