package defpackage;

import defpackage.fth.a;

/* renamed from: woo */
public enum woo implements fth {
    CONTACT_ME_CONFIG(a.a(wol.MY_FRIEND)),
    SEE_ME_IN_QUICK_ADD(a.a(true));
    
    private final a<?> delegate;

    private woo(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SETTINGS;
    }
}
