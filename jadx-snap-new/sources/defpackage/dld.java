package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import com.snap.blizzard.v1.request.BlizzardRequestInterface;
import java.io.IOException;

/* renamed from: dld */
public final class dld extends dle {
    private final String b;
    private final aipn<BlizzardRequestInterface> c;
    private String d;
    private aipn<dje> e;
    private aipn<dii> f;
    private final aipn<zfw> g;
    private final aipn<ajdw> h;

    /* renamed from: dld$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: dld$b */
    static final class b<T1, T2> implements ajew<akws<Void>, Throwable> {
        private /* synthetic */ dld a;
        private /* synthetic */ dlf b;

        b(dld dld, dlf dlf) {
            this.a = dld;
            this.b = dlf;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            akws akws = (akws) obj;
            Throwable th = (Throwable) obj2;
            dld dld = this.a;
            dkz dkz = this.b;
            akcr.b(dkz, "uploadDetails");
            if (th != null) {
                String str = null;
                if (th != null) {
                    str = th.getMessage();
                    if (TextUtils.isEmpty(str)) {
                        str = th.toString();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = th.getClass().getName();
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(" - ");
                        stringBuilder.append(th.getClass().getName());
                        str = akcr.a(str, stringBuilder.toString());
                    }
                }
                dkz.h = str;
            }
            boolean z = false;
            if (akws == null) {
                dkz.c = false;
            } else {
                dkz.c = true;
                dkz.g = akws.a().b();
                dkz.b = akws.a().h() - akws.a().g();
                akhw d = akws.a().d();
                if (d != null) {
                    dkz.f = d.b();
                }
                try {
                    akhu c = akws.a().a().c();
                    dkz.d = c != null ? c.contentLength() : dkz.j;
                } catch (IOException unused) {
                }
            }
            if (dkz.c && dkz.g >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && dkz.g <= 299) {
                z = true;
            }
            dld.a(z);
            if (dld.b()) {
                dld.c().a(dkz);
            } else {
                dld.c().b(dkz);
            }
        }
    }

    static {
        a aVar = new a();
    }

    public dld(String str, aipn<BlizzardRequestInterface> aipn, String str2, aipn<dje> aipn2, aipn<dii> aipn3, aipn<zfw> aipn4, aipn<ajdw> aipn5) {
        akcr.b(str, "queueName");
        akcr.b(aipn, "blizzardRequestInterface");
        akcr.b(str2, "baseUrl");
        akcr.b(aipn2, "configProvider");
        akcr.b(aipn3, "blizzardPropertiesProvider");
        akcr.b(aipn4, "sharedSchedulers");
        akcr.b(aipn5, "blizzardScheduler");
        super(str, str2, aipn2, aipn3);
        this.b = str;
        this.c = aipn;
        this.d = str2;
        this.e = aipn2;
        this.f = aipn3;
        this.g = aipn4;
        this.h = aipn5;
    }

    public final String a() {
        return this.b;
    }

    public final void a(dkt dkt, dkw dkw) {
        akcr.b(dkt, "eventUploadBatch");
        akcr.b(dkw, "uploadContext");
        long currentTimeMillis = System.currentTimeMillis();
        String a = a(dkw);
        dlf dlf = new dlf(this.b, a, dkt, currentTimeMillis);
        BlizzardRequestInterface blizzardRequestInterface = (BlizzardRequestInterface) this.c.get();
        Object obj = this.f.get();
        akcr.a(obj, "blizzardPropertiesProvider.get()");
        obj = ((dii) obj).b();
        akcr.a(obj, "blizzardPropertiesProvider.get().blizzardAuthToken");
        Object obj2 = this.e.get();
        akcr.a(obj2, "configProvider.get()");
        obj2 = ((dje) obj2).c();
        akcr.a(obj2, "configProvider.get().version");
        Object b = dkt.b(currentTimeMillis);
        akcr.a(b, "eventUploadBatch.getEven…DictionaryList(timestamp)");
        dlf.a = blizzardRequestInterface.uploadEvents(a, obj, obj2, b).b((ajdw) ((zfw) this.g.get()).g()).a((ajdw) this.h.get()).b((ajew) new b(this, dlf));
    }

    public final String d() {
        return this.d;
    }
}
