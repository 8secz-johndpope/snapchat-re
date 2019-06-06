package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: rk */
public final class rk extends rh<Boolean> {
    private static final String b = pq.a("StorageNotLowTracker");

    public rk(Context context) {
        super(context);
    }

    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public final void a(Intent intent) {
        if (intent.getAction() != null) {
            pq.a().a(b, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            Object obj = -1;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    obj = null;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                obj = 1;
            }
            if (obj != null) {
                if (obj == 1) {
                    a((Object) Boolean.FALSE);
                }
                return;
            }
            a((Object) Boolean.TRUE);
        }
    }

    public final /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        int i = -1;
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                i = 0;
            }
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            i = 1;
        }
        return i != 0 ? i != 1 ? null : Boolean.FALSE : Boolean.TRUE;
    }
}
