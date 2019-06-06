package defpackage;

/* renamed from: zjk */
public interface zjk extends achd<zjm, zjk> {

    /* renamed from: zjk$a */
    public static final class a {
        public static <R> R a(zjk zjk, String str, akbk<? extends R> akbk) {
            akcr.b(str, "name");
            akcr.b(akbk, "section");
            zgf.a(((zjm) zjk.getDeckPageType()).d.c.callsite(str));
            return akbk.invoke();
        }
    }
}
