package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.zzs;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.File;

@TargetApi(17)
public class zzaiv extends zzaix {
    public final String getDefaultUserAgent(Context context) {
        zzaki zzru = zzaki.zzru();
        if (TextUtils.isEmpty(zzru.zzddt)) {
            zzru.zzddt = (String) zzakg.zza(context, new zzakj(zzru, zzs.getRemoteContext(context), context));
        }
        return zzru.zzddt;
    }

    public final Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= MapboxConstants.MINIMUM_ZOOM || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    public final boolean zza(Context context, WebSettings webSettings) {
        super.zza(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public final void zzat(Context context) {
        zzaki zzru = zzaki.zzru();
        zzahw.v("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(zzru.zzddt)) {
            Context remoteContext = zzs.getRemoteContext(context);
            if (remoteContext == null) {
                String str = "admob_user_agent";
                Editor putString = context.getSharedPreferences(str, 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.setExecutable(true, false);
                    }
                    file.setExecutable(true, false);
                    putString.commit();
                    new File(file, str.concat(".xml")).setReadable(true, false);
                }
            }
            zzru.zzddt = defaultUserAgent;
        }
        zzahw.v("User agent is updated.");
        zzbt.zzep().zzqb();
    }
}
