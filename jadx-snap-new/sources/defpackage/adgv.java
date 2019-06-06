package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adgv */
public abstract class adgv {
    public final adie c;
    public final adiv d;

    public adgv(adie adie, adiv adiv) {
        this.c = (adie) Preconditions.checkNotNull(adie);
        this.d = (adiv) Preconditions.checkNotNull(adiv);
    }

    public abstract long a();

    public String b() {
        return getClass().getName();
    }
}
