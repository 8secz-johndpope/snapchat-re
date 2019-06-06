package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzabh
public final class zzakz implements zzakr {
    private final String zzddt;

    public zzakz() {
        this(null);
    }

    public zzakz(String str) {
        this.zzddt = str;
    }

    public final void zzcp(String str) {
        StringBuilder stringBuilder;
        String str2 = "Error while pinging URL: ";
        String str3 = ". ";
        String str4;
        HttpURLConnection httpURLConnection;
        try {
            str4 = "Pinging URL: ";
            String valueOf = String.valueOf(str);
            zzaky.zzby(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            zzlc.zzij();
            zzako.zza(true, httpURLConnection, this.zzddt);
            zzaks zzaks = new zzaks();
            zzaks.zza(httpURLConnection, null);
            int responseCode = httpURLConnection.getResponseCode();
            zzaks.zza(httpURLConnection, responseCode);
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= MapboxConstants.ANIMATION_DURATION) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 65);
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(responseCode);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(str);
                zzaky.zzcz(stringBuilder2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length());
            stringBuilder3.append("Error while parsing ping URL: ");
            stringBuilder3.append(str);
            stringBuilder3.append(str3);
            stringBuilder3.append(str2);
            str = stringBuilder3.toString();
            zzaky.zzcz(str);
        } catch (IOException e2) {
            str4 = e2.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str4).length());
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(str3);
            stringBuilder.append(str4);
            str = stringBuilder.toString();
            zzaky.zzcz(str);
        } catch (RuntimeException e3) {
            str4 = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str4).length());
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(str3);
            stringBuilder.append(str4);
            str = stringBuilder.toString();
            zzaky.zzcz(str);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
