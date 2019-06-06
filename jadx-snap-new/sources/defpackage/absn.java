package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.abrw.a;

/* renamed from: absn */
public final class absn {
    public boolean a;
    private boolean b;

    /* renamed from: absn$a */
    public static class a {
        public static final absn a = new absn();
    }

    private absn() {
        this.b = true;
        this.a = false;
        final ContentResolver contentResolver = AppContext.get().getContentResolver();
        this.a = absn.a(contentResolver);
        Uri uriFor = Global.getUriFor("navigationbar_hide_bar_enabled");
        if (uriFor != null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = abmq.a();
            }
            contentResolver.registerContentObserver(uriFor, false, new ContentObserver(new Handler(myLooper)) {
                public final boolean deliverSelfNotifications() {
                    return true;
                }

                public final void onChange(boolean z) {
                    absn.this.a = absn.a(contentResolver);
                }
            });
        }
    }

    /* synthetic */ absn(byte b) {
        this();
    }

    public static absn a() {
        return a.a;
    }

    static boolean a(ContentResolver contentResolver) {
        try {
            return Global.getInt(contentResolver, "navigationbar_hide_bar_enabled") == 1;
        } catch (SettingNotFoundException unused) {
        }
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return Build.MANUFACTURER.equalsIgnoreCase("huawei") ? !a.a.a() : (!this.b || this.a || absb.a.a.a) ? false : true;
    }
}
