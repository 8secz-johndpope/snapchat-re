package com.snap.framework.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akgb;
import defpackage.iha;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class ChannelInfoStore {
    Context a;
    private final ajxe b = ajxh.a(new a(this));
    private ajwy<iha> c;

    static final class a extends akcs implements akbk<SharedPreferences> {
        private /* synthetic */ ChannelInfoStore a;

        a(ChannelInfoStore channelInfoStore) {
            this.a = channelInfoStore;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getSharedPreferences("channel_persistent_store", 0);
        }
    }

    @Keep
    static final class ChannelInfo {
        @SerializedName("channelId")
        private final String channelId;

        public final String getChannelId() {
            return this.channelId;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ChannelInfoStore.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;");
    }

    public ChannelInfoStore(Context context, ajwy<iha> ajwy) {
        akcr.b(context, "context");
        akcr.b(ajwy, "serializationHelper");
        this.a = context;
        this.c = ajwy;
    }

    private final SharedPreferences b() {
        return (SharedPreferences) this.b.b();
    }

    private final void c() {
        b().edit().putBoolean("has_channel_info", false).apply();
    }

    private String d() {
        String str = "channelId";
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
                if (applicationInfo != null) {
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle == null || !bundle.containsKey(str) || TextUtils.isEmpty(bundle.getString(str))) {
                        c();
                    } else {
                        str = bundle.getString(str);
                        if (str == null) {
                            akcr.a();
                        }
                        return str;
                    }
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return "";
    }

    private String e() {
        try {
            File file = new File("/data/etc/appchannel", "snap_appchannel.txt");
            if (file.exists()) {
                ChannelInfo channelInfo = (ChannelInfo) ((iha) this.c.get()).a((InputStream) new FileInputStream(file), ChannelInfo.class);
                if ((channelInfo != null ? channelInfo.getChannelId() : null) != null) {
                    return channelInfo.getChannelId();
                }
            }
            c();
        } catch (Exception unused) {
        }
        return "";
    }

    public final synchronized String a() {
        String string;
        string = b().getString("channelId", "");
        akcr.a((Object) string, "sharedPreferences.getString(CHANNEL_ID, NOT_SET)");
        if (TextUtils.isEmpty(string)) {
            boolean z = true;
            if (b().getBoolean("has_channel_info", true)) {
                if (!akgb.a("oppo", Build.MANUFACTURER, true)) {
                    if (!akgb.a("vivo", Build.MANUFACTURER, true)) {
                        z = false;
                    }
                }
                string = z ? e() : d();
                if (!TextUtils.isEmpty(string)) {
                    b().edit().putString("channelId", string).apply();
                }
            }
        }
        return string;
    }
}
