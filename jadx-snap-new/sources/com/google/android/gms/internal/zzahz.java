package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;

final class zzahz extends zzaib {
    private /* synthetic */ Context zzdff;
    private /* synthetic */ zzahy zzdfg;

    zzahz(zzahy zzahy, Context context) {
        this.zzdfg = zzahy;
        this.zzdff = context;
        super();
    }

    public final void zzdo() {
        SharedPreferences sharedPreferences = this.zzdff.getSharedPreferences("admob", 0);
        Editor edit = sharedPreferences.edit();
        synchronized (this.zzdfg.mLock) {
            this.zzdfg.zzbkx = sharedPreferences;
            this.zzdfg.zzdev = edit;
            this.zzdfg.zzdew = zzahy.zzql();
            this.zzdfg.zzcxd = this.zzdfg.zzbkx.getBoolean("use_https", this.zzdfg.zzcxd);
            this.zzdfg.zzcxe = this.zzdfg.zzbkx.getBoolean("content_url_opted_out", this.zzdfg.zzcxe);
            this.zzdfg.zzdex = this.zzdfg.zzbkx.getString("content_url_hashes", this.zzdfg.zzdex);
            this.zzdfg.zzcxm = this.zzdfg.zzbkx.getBoolean("auto_collect_location", this.zzdfg.zzcxm);
            this.zzdfg.zzcxf = this.zzdfg.zzbkx.getBoolean("content_vertical_opted_out", this.zzdfg.zzcxf);
            this.zzdfg.zzdey = this.zzdfg.zzbkx.getString("content_vertical_hashes", this.zzdfg.zzdey);
            this.zzdfg.zzdfc = this.zzdfg.zzbkx.getInt("version_code", this.zzdfg.zzdfc);
            this.zzdfg.zzddm = this.zzdfg.zzbkx.getString("app_settings_json", this.zzdfg.zzddm);
            this.zzdfg.zzdez = this.zzdfg.zzbkx.getLong("app_settings_last_update_ms", this.zzdfg.zzdez);
            this.zzdfg.zzdfa = this.zzdfg.zzbkx.getLong("app_last_background_time_ms", this.zzdfg.zzdfa);
            this.zzdfg.zzdef = this.zzdfg.zzbkx.getInt("request_in_session_count", this.zzdfg.zzdef);
            this.zzdfg.zzdfb = this.zzdfg.zzbkx.getLong("first_ad_req_time_ms", this.zzdfg.zzdfb);
            this.zzdfg.zzdfd = this.zzdfg.zzbkx.getStringSet("never_pool_slots", this.zzdfg.zzdfd);
            try {
                this.zzdfg.zzdfe = new JSONObject(this.zzdfg.zzbkx.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzaky.zzc("Could not convert native advanced settings to json object", e);
            }
            this.zzdfg.zzc(this.zzdfg.zzqn());
        }
    }
}
