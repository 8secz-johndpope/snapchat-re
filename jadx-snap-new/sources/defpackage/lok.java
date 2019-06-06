package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.lny.a.a;
import defpackage.mhs.b;
import defpackage.miq.f;
import defpackage.moc.c;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: lok */
public final class lok implements loi {
    final mok<c> a;
    private final lnx b;

    /* renamed from: lok$a */
    static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ lok a;

        a(lok lok) {
            this.a = lok;
        }

        public final /* synthetic */ Object apply(Object obj) {
            muc muc = (muc) obj;
            akcr.b(muc, "it");
            return this.a.a.a(new defpackage.moc.c.a(muc, (byte) 0));
        }
    }

    public lok(mok<? super c> mok, lnx lnx) {
        akcr.b(mok, "resourceUriResolver");
        akcr.b(lnx, "manifestItemProvider");
        this.a = mok;
        this.b = lnx;
    }

    public final ajdj<miq> a(lny lny, b bVar, b bVar2, mhs mhs, byte[] bArr, byte[] bArr2) {
        akcr.b(lny, "assetSource");
        akcr.b(bVar, "assetId");
        akcr.b(bVar2, DiscoverStorySnapModel.LENSID);
        akcr.b(mhs, "avatarId");
        String str = "Maybe.empty()";
        Object a;
        if (lny instanceof a) {
            f.b bVar3 = ((a) lny).a;
            ajdj<miq> ajdj = null;
            try {
                String host = new URI(bVar3.a).getHost();
                if (host != null && lol.a.contains(host)) {
                    ajdj = this.a.a(new c.a(bVar, (miq) bVar3));
                }
            } catch (URISyntaxException unused) {
            }
            if (ajdj != null) {
                return ajdj;
            }
            a = ajvo.a(ajlu.a);
            akcr.a(a, str);
            return a;
        } else if (akcr.a((Object) lny, lny.a.b.a)) {
            a = ((ajdj) this.b.invoke(bVar, bVar2, mhs)).a((ajfc) new a(this));
            akcr.a(a, "manifestItemProvider(ass…RemoteAsset.Static(it)) }");
            return a;
        } else if (!akcr.a((Object) lny, lny.b.a)) {
            throw new ajxk();
        } else if (bArr == null || bArr2 == null) {
            a = ajvo.a(ajlu.a);
            akcr.a(a, str);
            return a;
        } else {
            return this.a.a(new c.b(bVar, new abmv(bArr, bArr2)));
        }
    }
}
