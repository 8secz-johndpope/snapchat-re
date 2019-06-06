package com.google.android.gms.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzapp {
    private static final Pattern zzdsg = Pattern.compile("<!DOCTYPE(\\s)*html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzdsh = Pattern.compile("<!DOCTYPE[^>]*>", 2);

    public static String zzb(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = zzdsg.matcher(str);
        int i = 0;
        int end;
        if (matcher.find()) {
            end = matcher.end();
            stringBuilder.append(str.substring(0, end));
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                if (str2 != null) {
                    stringBuilder.append(str2);
                }
                i++;
            }
            str = str.substring(end);
        } else if (!zzdsh.matcher(str).find()) {
            end = strArr.length;
            while (i < end) {
                String str3 = strArr[i];
                if (str3 != null) {
                    stringBuilder.append(str3);
                }
                i++;
            }
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static String zzvi() {
        String str = (String) zzlc.zzio().zzd(zzoi.zzbnc);
        String str2 = "12.2.11-000";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", str2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<script>");
            stringBuilder.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
            stringBuilder.append(jSONObject.toString());
            stringBuilder.append("}});");
            stringBuilder.append("</script>");
            return stringBuilder.toString();
        } catch (JSONException e) {
            zzaky.zzc("Unable to build MRAID_ENV", e);
            return null;
        }
    }
}
