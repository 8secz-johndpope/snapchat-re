package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import com.snapchat.android.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: cc */
public final class cc {
    public final Intent a;
    private Bundle b;

    /* renamed from: cc$a */
    public static final class a {
        private final Intent a;
        private ArrayList<Bundle> b;
        private Bundle c;
        private ArrayList<Bundle> d;
        private boolean e;

        public a() {
            this(null);
        }

        public a(ce ceVar) {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = true;
            if (ceVar != null) {
                this.a.setPackage(ceVar.b.getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            IBinder asBinder = ceVar == null ? null : ceVar.a.asBinder();
            if (VERSION.SDK_INT >= 18) {
                bundle.putBinder(str, asBinder);
            } else {
                String str2 = "BundleCompatBaseImpl";
                if (!defpackage.fu.a.b) {
                    try {
                        Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                        defpackage.fu.a.a = method;
                        method.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i(str2, "Failed to retrieve putIBinder method", e);
                    }
                    defpackage.fu.a.b = true;
                }
                if (defpackage.fu.a.a != null) {
                    try {
                        defpackage.fu.a.a.invoke(bundle, new Object[]{str, asBinder});
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                        Log.i(str2, "Failed to invoke putIBinder via reflection", e2);
                        defpackage.fu.a.a = null;
                    }
                }
            }
            this.a.putExtras(bundle);
        }

        public final a a() {
            this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", -16777216);
            return this;
        }

        public final a a(Context context) {
            this.c = fr.a(context, R.anim.webview_enter, R.anim.webview_exit).a();
            return this;
        }

        public final a b(Context context) {
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", fr.a(context, R.anim.webview_enter, R.anim.webview_exit).a());
            return this;
        }

        public final cc b() {
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
            return new cc(this.a, this.c, (byte) 0);
        }
    }

    private cc(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    /* synthetic */ cc(Intent intent, Bundle bundle, byte b) {
        this(intent, bundle);
    }

    public final void a(Context context, Uri uri) {
        this.a.setData(uri);
        ContextCompat.startActivity(context, this.a, this.b);
    }
}
