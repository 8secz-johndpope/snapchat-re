package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.protobuf.nano.MessageNano;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhs.b;
import defpackage.ryz.a;
import defpackage.ryz.c;
import java.util.List;
import java.util.Set;

@ftr(a = "user_generated_assets/*/*/*")
/* renamed from: lfb */
public final class lfb extends ggm {
    final akbl<abnb, gfl> a;
    final gee b;
    final lcq c;
    final Supplier<String> d;

    /* renamed from: lfb$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ lfb a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        a(lfb lfb, String str, String str2) {
            this.a = lfb;
            this.b = str;
            this.c = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "id");
            abnb a = this.a.c.a(bVar);
            if (a != null) {
                obj = (gfl) this.a.a.invoke(a);
                if (obj != null) {
                    ajdx b = ajdx.b(obj);
                    if (b != null) {
                        return b;
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder("no encryption algorithm found for ");
            stringBuilder.append(this.b);
            stringBuilder.append(" (registry key: ");
            stringBuilder.append(this.c);
            stringBuilder.append(')');
            return ajvo.a(ajsn.a);
        }
    }

    /* renamed from: lfb$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ lfb a;
        private /* synthetic */ String b;
        private /* synthetic */ Set c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;
        private /* synthetic */ boolean f;

        b(lfb lfb, String str, Set set, Set set2, boolean z, boolean z2) {
            this.a = lfb;
            this.b = str;
            this.c = set;
            this.d = set2;
            this.e = z;
            this.f = z2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            lep lep;
            gfl gfl = (gfl) obj;
            akcr.b(gfl, "payloadProcessor");
            gee gee = this.a.b;
            lfb lfb = this.a;
            Object obj2 = this.b;
            akcr.a(obj2, "assetId");
            Set set = this.c;
            Set set2 = this.d;
            Object obj3 = null;
            if (this.e) {
                lep = new lep("/lens/story/blob/download?snappables_media_id=".concat(String.valueOf(obj2)), null, sac.GET);
            } else {
                alfn alfn = new alfn();
                alfn.a(obj2);
                lep = new lep("/lens/blob/download", alfn, sac.POST);
            }
            String str = lep.a;
            MessageNano messageNano = lep.b;
            sac sac = lep.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String) lfb.d.get());
            stringBuilder.append(str);
            a a = new a(stringBuilder.toString(), sac, c.LARGE_MEDIA, set).a(lfc.a);
            if (messageNano != null) {
                obj3 = new glz(messageNano);
            }
            Object c = a.a(obj3).e();
            akcr.a(c, "NetworkRequest.Builder(\n…\n                .build()");
            return gee.a(new gew(obj2, (sak) c, null, gfl, lez.a, set, set2, 268)).a(this.f);
        }
    }

    public lfb(akbl<? super abnb, ? extends gfl> akbl, gee gee, lcq lcq, Supplier<String> supplier) {
        akcr.b(akbl, "protoPayloadProcessorFactory");
        akcr.b(gee, "contentManager");
        akcr.b(lcq, "encryptionRegistry");
        akcr.b(supplier, "baseUriSupplier");
        this.a = akbl;
        this.b = gee;
        this.c = lcq;
        this.d = supplier;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(1);
        String str2 = (String) pathSegments.get(2);
        String str3 = (String) pathSegments.get(3);
        if (str3 != null) {
            boolean parseBoolean = Boolean.parseBoolean(str3);
            akcr.a((Object) str2, "algorithmRegistryId");
            Object a = ajdx.b(new b(str2)).a((ajfc) new a(this, str, str2)).a((ajfc) new b(this, str, set, set2, parseBoolean, z));
            akcr.a(a, "Single.just(Identifier.K…minate)\n                }");
            return a;
        }
        throw new IllegalArgumentException("Edge cache value is not set!");
    }
}
