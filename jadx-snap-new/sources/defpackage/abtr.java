package defpackage;

import android.view.View.OnClickListener;

/* renamed from: abtr */
public class abtr extends abtt {
    public final Integer a;
    public final int b;
    public final boolean c = false;
    private String[] e = null;
    private final Integer f = null;

    public abtr(int i, int i2, OnClickListener onClickListener) {
        super(onClickListener);
        this.a = Integer.valueOf(i);
        this.b = i2;
    }

    public abtr(int i, int i2, OnClickListener onClickListener, boolean z) {
        super(onClickListener);
        this.a = Integer.valueOf(i);
        this.b = i2;
    }

    public final boolean b() {
        return this.a != null;
    }

    public final int c() {
        return this.a.intValue();
    }

    public final int d() {
        return this.b;
    }

    public final boolean e() {
        return this.d != null;
    }
}
