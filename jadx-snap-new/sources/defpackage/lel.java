package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mwp.a;
import defpackage.mwp.a.b;

/* renamed from: lel */
public final class lel {

    /* renamed from: lel$b */
    public static final class b implements akbl<String, a> {
        private /* synthetic */ mwp a;
        private /* synthetic */ String b;
        private /* synthetic */ defpackage.mhs.b c;

        b(mwp mwp, String str, defpackage.mhs.b bVar) {
            this.a = mwp;
            this.b = str;
            this.c = bVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "checksum");
            mwp mwp = this.a;
            String str2 = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.c.a);
            return mwp.a(str2, stringBuilder.toString());
        }
    }

    /* renamed from: lel$c */
    public static final class c implements akbl<String, a> {
        private /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (String) obj;
            akcr.b(obj, "checksum");
            return akcr.a(this.a, obj) ? b.a : new a.a(new RuntimeException("Failed validating tracking data checksum"));
        }
    }

    /* renamed from: lel$a */
    static final class a extends akcs implements akbl<String, b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((String) obj, "it");
            return b.a;
        }
    }

    static {
        lel lel = new lel();
    }

    private lel() {
    }

    public static final akbl<String, a> a(mhs.b bVar, String str, mwp mwp) {
        akcr.b(bVar, DiscoverStorySnapModel.LENSID);
        akcr.b(str, "lensSignature");
        akcr.b(mwp, "signatureValidator");
        return new b(mwp, str, bVar);
    }
}
