package com.google.android.gms.internal;

import com.brightcove.player.event.Event;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.ppy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzabh
public final class zzadz {
    private final int errorCode;
    private final String type;
    private String url;
    private final String zzcsi;
    private final List<String> zzcxu;
    private final String zzcxv;
    private final String zzcxw;
    private final boolean zzcxx;
    private final String zzcxy;
    private final boolean zzcxz;
    private final JSONObject zzcya;

    public zzadz(int i, Map<String, String> map) {
        this.url = (String) map.get("url");
        this.zzcxv = (String) map.get("base_uri");
        this.zzcxw = (String) map.get("post_parameters");
        this.zzcxx = parseBoolean((String) map.get("drt_include"));
        this.zzcsi = (String) map.get("request_id");
        this.type = (String) map.get("type");
        this.zzcxu = zzbp((String) map.get(Event.ERRORS));
        this.errorCode = i;
        this.zzcxy = (String) map.get("fetched_ad");
        this.zzcxz = parseBoolean((String) map.get("render_test_ad_label"));
        this.zzcya = new JSONObject();
    }

    public zzadz(JSONObject jSONObject) {
        this.url = jSONObject.optString("url");
        this.zzcxv = jSONObject.optString("base_uri");
        this.zzcxw = jSONObject.optString("post_parameters");
        this.zzcxx = parseBoolean(jSONObject.optString("drt_include"));
        this.zzcsi = jSONObject.optString("request_id");
        this.type = jSONObject.optString("type");
        this.zzcxu = zzbp(jSONObject.optString(Event.ERRORS));
        int i = 1;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.errorCode = i;
        this.zzcxy = jSONObject.optString("fetched_ad");
        this.zzcxz = jSONObject.optBoolean("render_test_ad_label");
        jSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.zzcya = jSONObject;
    }

    private static boolean parseBoolean(String str) {
        return str != null && (str.equals(SCamera.CAMERA_ID_FRONT) || str.equals("true"));
    }

    private static List<String> zzbp(String str) {
        return str == null ? null : Arrays.asList(str.split(ppy.b));
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getRequestId() {
        return this.zzcsi;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final List<String> zzog() {
        return this.zzcxu;
    }

    public final String zzoh() {
        return this.zzcxv;
    }

    public final String zzoi() {
        return this.zzcxw;
    }

    public final boolean zzoj() {
        return this.zzcxx;
    }

    public final String zzok() {
        return this.zzcxy;
    }

    public final boolean zzol() {
        return this.zzcxz;
    }
}
