package defpackage;

/* renamed from: rvx */
public final class rvx implements fwu {
    private final ajwy<ftl> a;
    private final ajwy<tnj> b;

    public rvx(ajwy<ftl> ajwy, ajwy<tnj> ajwy2) {
        akcr.b(ajwy, "config");
        akcr.b(ajwy2, "preferences");
        this.a = ajwy;
        this.b = ajwy2;
    }

    private final void a(String str) {
        ((tnj) this.b.get()).b().a((fth) fxm.SAMPLING_UUID, str).b();
    }

    public final String a() {
        String j = ((ftl) this.a.get()).j(fxm.SAMPLING_UUID);
        CharSequence charSequence = j;
        Object obj = null;
        Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj2 == null) {
            return j;
        }
        j = ((ftl) this.a.get()).j(djg.SAMPLING_UUID);
        charSequence = j;
        if (charSequence == null || charSequence.length() == 0) {
            obj = 1;
        }
        if (obj == null) {
            a(j);
            return j;
        }
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        a(uuid);
        return uuid;
    }
}
