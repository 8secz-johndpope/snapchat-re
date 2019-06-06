package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import net.sqlcipher.database.SQLiteDatabase;

@zzabh
public final class zzapz extends MutableContextWrapper {
    private Context mApplicationContext;
    private Activity zzdid;
    private Context zzdsi;

    public zzapz(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.zzdsi.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.mApplicationContext = context.getApplicationContext();
        this.zzdid = context instanceof Activity ? (Activity) context : null;
        this.zzdsi = context;
        super.setBaseContext(this.mApplicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zzdid;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.mApplicationContext.startActivity(intent);
    }

    public final Activity zztj() {
        return this.zzdid;
    }

    public final Context zztv() {
        return this.zzdsi;
    }
}
