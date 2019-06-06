package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;

@zzabh
public final class zzya extends zzyn {
    private final Context mContext;
    private final Map<String, String> zzbwu;
    private String zzcks = zzbk("description");
    private long zzckt = zzbl("start_ticks");
    private long zzcku = zzbl("end_ticks");
    private String zzckv = zzbk("summary");
    private String zzckw = zzbk(MapboxEvent.TYPE_LOCATION);

    public zzya(zzaof zzaof, Map<String, String> map) {
        super(zzaof, "createCalendarEvent");
        this.zzbwu = map;
        this.mContext = zzaof.zztj();
    }

    private final String zzbk(String str) {
        return TextUtils.isEmpty((CharSequence) this.zzbwu.get(str)) ? "" : (String) this.zzbwu.get(str);
    }

    private final long zzbl(String str) {
        str = (String) this.zzbwu.get(str);
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    /* Access modifiers changed, original: final */
    @TargetApi(14)
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.zzcks);
        data.putExtra("eventLocation", this.zzckw);
        data.putExtra("description", this.zzckv);
        long j = this.zzckt;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        j = this.zzcku;
        if (j > -1) {
            data.putExtra(Event.END_TIME, j);
        }
        data.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        return data;
    }

    public final void execute() {
        if (this.mContext == null) {
            zzbm("Activity context is not available.");
            return;
        }
        zzbt.zzel();
        if (zzaij.zzal(this.mContext).zzjd()) {
            zzbt.zzel();
            Builder zzak = zzaij.zzak(this.mContext);
            Resources resources = zzbt.zzep().getResources();
            zzak.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
            zzak.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
            zzak.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzyb(this));
            zzak.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzyc(this));
            zzak.create().show();
            return;
        }
        zzbm("This feature is not available on the device.");
    }
}
