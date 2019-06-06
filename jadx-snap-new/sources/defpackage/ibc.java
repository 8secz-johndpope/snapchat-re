package defpackage;

/* renamed from: ibc */
public final class ibc implements hyo {
    private final tnj a;
    private final ftl b;

    public ibc(tnj tnj, ftl ftl) {
        this.a = tnj;
        this.b = ftl;
    }

    public final void a(boolean z) {
        this.a.b().a(hzf.FIDELIUS_FETCH_MISSING_FRIENDS, Boolean.valueOf(z)).b();
    }

    public final boolean a() {
        return this.b.a(hzf.FIDELIUS_FETCH_MISSING_FRIENDS);
    }

    public final void b(boolean z) {
        this.a.b().a(hzf.FIDELIUS_WIPE_REDUNDANT_DBS, Boolean.valueOf(z)).b();
    }

    public final boolean b() {
        return this.b.a(hzf.SHOW_FIDELIUS_TOASTS);
    }

    public final boolean c() {
        return this.b.a(hzf.FIDELIUS_WIPE_REDUNDANT_DBS);
    }

    public final ajdx<Boolean> d() {
        return this.b.b(hzf.FIDELIUS_ENABLE_MULTI_RECIPIENT_SUPPORT);
    }
}
