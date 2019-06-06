package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzanm {
    public final String zzdnm;
    private boolean zzdnn;
    private int zzdno;
    private int zzdnp;
    private int zzdnq;
    private int zzdnr;
    private boolean zzdns;

    public zzanm(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzdnn = zza(jSONObject, "aggressive_media_codec_release", zzoi.zzbmi);
        this.zzdnm = zzc(jSONObject, "exo_player_version", zzoi.zzblp);
        this.zzdno = zzb(jSONObject, "exo_cache_buffer_size", zzoi.zzblw);
        this.zzdnp = zzb(jSONObject, "exo_connect_timeout_millis", zzoi.zzblq);
        this.zzdnq = zzb(jSONObject, "exo_read_timeout_millis", zzoi.zzblr);
        this.zzdnr = zzb(jSONObject, "load_check_interval_bytes", zzoi.zzbls);
        this.zzdns = zza(jSONObject, "use_cache_data_source", zzoi.zzbuh);
    }

    private static boolean zza(JSONObject jSONObject, String str, zzny<Boolean> zzny) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) zzlc.zzio().zzd(zzny)).booleanValue();
    }

    private static int zzb(JSONObject jSONObject, String str, zzny<Integer> zzny) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzlc.zzio().zzd(zzny)).intValue();
    }

    private static String zzc(JSONObject jSONObject, String str, zzny<String> zzny) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzlc.zzio().zzd(zzny);
    }
}
