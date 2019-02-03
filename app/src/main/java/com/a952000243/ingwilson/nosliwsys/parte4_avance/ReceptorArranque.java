package com.a952000243.ingwilson.nosliwsys.parte4_avance;

public class ReceptorArranque  extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, Servicio.class));
    }
}
