package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

/* renamed from: le */
public final class le {
    public static final g a;

    /* renamed from: le$g */
    public static class g {
        g() {
        }

        public void a(TextView textView, int i) {
            ((kt) textView).setAutoSizeTextTypeWithDefaults(i);
        }

        public void a(TextView textView, int i, int i2) {
            if (textView instanceof kt) {
                ((kt) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
            }
        }

        public void a(TextView textView, Drawable drawable) {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* renamed from: le$a */
    static class a extends g {
        a() {
        }
    }

    /* renamed from: le$b */
    static class b extends a {
        b() {
        }

        public void a(TextView textView, Drawable drawable) {
            Object obj = 1;
            if (textView.getLayoutDirection() != 1) {
                obj = null;
            }
            Drawable drawable2 = obj != null ? null : drawable;
            if (obj == null) {
                drawable = null;
            }
            textView.setCompoundDrawables(drawable2, null, drawable, null);
        }
    }

    /* renamed from: le$c */
    static class c extends b {
        c() {
        }

        public final void a(TextView textView, Drawable drawable) {
            textView.setCompoundDrawablesRelative(drawable, null, null, null);
        }
    }

    /* renamed from: le$d */
    static class d extends c {
        d() {
        }
    }

    /* renamed from: le$e */
    static class e extends d {
        e() {
        }
    }

    /* renamed from: le$f */
    static class f extends e {
        f() {
        }

        public final void a(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }

        public final void a(TextView textView, int i, int i2) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
        }
    }

    static {
        g fVar = ii.b() ? new f() : VERSION.SDK_INT >= 26 ? new e() : VERSION.SDK_INT >= 23 ? new d() : VERSION.SDK_INT >= 18 ? new c() : VERSION.SDK_INT >= 17 ? new b() : VERSION.SDK_INT >= 16 ? new a() : new g();
        a = fVar;
    }

    public static void a(TextView textView, int i, int i2) {
        a.a(textView, i, i2);
    }
}
