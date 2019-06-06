package defpackage;

import com.snap.core.db.record.UnlockablesModel;
import defpackage.mhs.b;

/* renamed from: mnr */
public interface mnr {

    /* renamed from: mnr$a */
    public static final class a implements mnr {
        public static final a a = new a();

        private a() {
        }

        public final ajcx a(b bVar, byte[] bArr) {
            akcr.b(bVar, "id");
            akcr.b(bArr, UnlockablesModel.DATA);
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }

        public final ajdx<byte[]> a(b bVar) {
            akcr.b(bVar, "id");
            Object b = ajdx.b(mhj.a);
            akcr.a(b, "Single.just(EMPTY_BYTES)");
            return b;
        }

        public final ajcx b() {
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
    }

    ajcx a(b bVar, byte[] bArr);

    ajdx<byte[]> a(b bVar);

    ajcx b();
}
