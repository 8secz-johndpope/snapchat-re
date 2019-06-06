package defpackage;

import android.opengl.GLES20;
import defpackage.acwx.a;
import java.io.IOException;

/* renamed from: acwv */
public class acwv {
    protected acww a;
    protected acul b;
    protected acui c;
    private final String d;
    private final String e;
    private final String f;
    private final Enum<? extends acwx>[] g;
    private boolean h = false;
    private boolean i;
    private int[] j;

    /* renamed from: acwv$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.acwx.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.acwx.a.ATTRIBUTE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.acwx.a.UNIFORM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acwv$1.<clinit>():void");
        }
    }

    public acwv(String str, String str2, String str3, Enum<? extends acwx>[] enumArr) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = enumArr;
    }

    public final int a(acwx acwx) {
        int[] iArr = this.j;
        return iArr != null ? iArr[acwx.b()] : -1;
    }

    public final void a(acyj acyj) {
        if ((this.a != null ? 1 : null) == null) {
            acww acww = new acww();
            try {
                acww.a(GLES20.glCreateProgram(), this.e, this.f);
                this.a = acww;
                int length = this.g.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    acwx acwx = (acwx) this.g[i];
                    int i2 = 1.a[acwx.a().ordinal()];
                    if (i2 == 1) {
                        iArr[i] = acww.a(acwx.c());
                    } else if (i2 == 2) {
                        iArr[i] = acww.b(acwx.c());
                    }
                }
                this.j = iArr;
                this.b = new acul(acyj, this.h, this.d);
                if (this.i) {
                    this.c = new acui(acyj, this.b);
                }
            } catch (IOException | IllegalAccessException e) {
                acww.a();
                this.a = null;
                throw new RuntimeException(e);
            }
        }
    }

    public boolean a() {
        acww acww = this.a;
        if (acww == null) {
            return false;
        }
        acww.b();
        return true;
    }

    public final void c() {
        if (this.a == null) {
            this.h = true;
            return;
        }
        throw new IllegalStateException("You cannot enable this option after initialization has completed.");
    }

    public final void d() {
        if (this.a == null) {
            this.i = true;
            return;
        }
        throw new IllegalStateException("You cannot enable this option after initialization has completed.");
    }

    public final void e() {
        acww acww = this.a;
        if (acww != null) {
            acww.a();
            this.a = null;
        }
        acul acul = this.b;
        if (acul != null) {
            acul.a();
            this.b = null;
        }
        acui acui = this.c;
        if (acui != null) {
            acui.a.a();
            this.c = null;
        }
    }
}
