package defpackage;

import com.brightcove.player.event.Event;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hnc */
public final class hnc implements hhy {
    public final ajws<Boolean> a;
    public final AtomicReference<hnb> b = new AtomicReference(c());
    private final ajxe c = ajxh.a(a.a);

    /* renamed from: hnc$a */
    static final class a extends akcs implements akbk<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = iel.a();
            akcr.a(a, "LanguageUtils.getLanguages()");
            return ajyi.a((Object[]) a, (CharSequence) ppy.b, null, null, 0, null, null, 62);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hnc.class), Event.LANGUAGES, "getLanguages()Ljava/lang/String;");
    }

    public hnc() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.a = (ajws) ajwo;
    }

    public final String a() {
        return b().a;
    }

    public final hnb b() {
        Object obj = this.b.get();
        akcr.a(obj, "currentSession.get()");
        return (hnb) obj;
    }

    public final hnb c() {
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        return new hnb(uuid, hnd.a, (String) this.c.b(), 1);
    }
}
