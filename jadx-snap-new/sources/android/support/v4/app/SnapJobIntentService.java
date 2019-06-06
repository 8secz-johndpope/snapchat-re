package android.support.v4.app;

import android.util.Log;

public abstract class SnapJobIntentService extends JobIntentService {
    /* Access modifiers changed, original: final */
    public final e c() {
        try {
            return super.c();
        } catch (SecurityException e) {
            Log.d("SnapJobIntentService", "SecurityException while dequeing work", e);
            return null;
        }
    }
}
