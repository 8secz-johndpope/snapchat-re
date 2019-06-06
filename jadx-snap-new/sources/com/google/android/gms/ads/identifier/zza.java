package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

final class zza extends Thread {
    private /* synthetic */ Map zzamz;

    zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zzamz = map;
    }

    public final void run() {
        String str;
        Throwable e;
        String message;
        String str2 = ". ";
        String str3 = "HttpUrlPinger";
        zzc zzc = new zzc();
        Map map = this.zzamz;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str4 : map.keySet()) {
            buildUpon.appendQueryParameter(str4, (String) map.get(str4));
        }
        String uri = buildUpon.build().toString();
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder;
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= MapboxConstants.ANIMATION_DURATION) {
                stringBuilder = new StringBuilder(String.valueOf(uri).length() + 65);
                stringBuilder.append("Received non-success response code ");
                stringBuilder.append(responseCode);
                stringBuilder.append(" from pinging URL: ");
                stringBuilder.append(uri);
                Log.w(str3, stringBuilder.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            message = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 32) + String.valueOf(message).length());
            str4 = "Error while parsing ping URL: ";
            stringBuilder.append(str4);
            stringBuilder.append(uri);
            stringBuilder.append(str2);
            stringBuilder.append(message);
            Log.w(str3, stringBuilder.toString(), e);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            message = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 27) + String.valueOf(message).length());
            str4 = "Error while pinging URL: ";
            stringBuilder.append(str4);
            stringBuilder.append(uri);
            stringBuilder.append(str2);
            stringBuilder.append(message);
            Log.w(str3, stringBuilder.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
