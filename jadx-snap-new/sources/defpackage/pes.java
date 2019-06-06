package defpackage;

import android.net.Uri;
import com.google.common.base.Enums;
import com.google.common.collect.Lists;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@ftr(a = "memories_entry_media_prefetcher")
/* renamed from: pes */
public final class pes extends ggm {
    final pfe a;
    final gel b;
    private final owf c;

    /* renamed from: pes$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: pes$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ pes a;
        final /* synthetic */ String b;
        final /* synthetic */ Uri c;
        private /* synthetic */ agop d;
        private /* synthetic */ Set e;
        private /* synthetic */ boolean f;
        private /* synthetic */ Set g;

        /* renamed from: pes$b$1 */
        static final class 1<T> implements ajfl<gej> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                gej gej = (gej) obj;
                akcr.b(gej, "it");
                return gej.a();
            }
        }

        /* renamed from: pes$b$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            private /* synthetic */ b a;

            2(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                if (list.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder("No successful content results for entry ");
                    stringBuilder.append(this.a.b);
                    return new ghx(new gey(0, new RuntimeException(stringBuilder.toString())));
                }
                gel gel = this.a.a.b;
                Iterable iterable = list;
                String uri = this.a.c.toString();
                akcr.a((Object) uri, "uri.toString()");
                return gel.a(iterable, uri);
            }
        }

        b(pes pes, agop agop, Set set, boolean z, Set set2, String str, Uri uri) {
            this.a = pes;
            this.d = agop;
            this.e = set;
            this.f = z;
            this.g = set2;
            this.b = str;
            this.c = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            piu piu;
            List list = (List) obj;
            akcr.b(list, "snapIdsList");
            Object obj2 = this.d;
            String str = "entryType";
            akcr.a(obj2, str);
            akcr.b(obj2, str);
            switch (piv.a[obj2.ordinal()]) {
                case 1:
                case 2:
                    piu = piu.SNAP_ENTRY_POLICY;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    piu = piu.STORY_ENTRY_POLICY;
                    break;
                case 9:
                    piu = piu.DEFAULT_ENTRY_POLICY;
                    break;
                default:
                    throw new ajxk();
            }
            int i = piu.snapsToPrefetch;
            if (i <= 0) {
                list = Collections.emptyList();
                akcr.a((Object) list, "Collections.emptyList()");
            } else {
                list = ajyu.a(list, new akdy(0, Math.min(list.size(), i) - 1));
            }
            obj2 = Lists.newArrayList();
            akcr.a(obj2, "Lists.newArrayList()");
            List list2 = (List) obj2;
            for (String str2 : r7) {
                pfe pfe = this.a.a;
                akcr.b(str2, "snapId");
                list2.add(pfe.a(pnj.f(str2), this.e, this.f, this.g));
            }
            return ajdx.b(ajde.a((Iterable) list2)).b((ajfl) 1.a).i().f(new 2(this));
        }
    }

    static {
        a aVar = new a();
    }

    public pes(pfe pfe, owf owf, gel gel) {
        akcr.b(pfe, "snapPrefetcherUriHandler");
        akcr.b(owf, "entryRepository");
        akcr.b(gel, "contentResultFactory");
        this.a = pfe;
        this.c = owf;
        this.b = gel;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object queryParameter = uri.getQueryParameter("ID");
        agop agop = (agop) Enums.getIfPresent(agop.class, uri.getQueryParameter("ENTRY_TYPE")).or(agop.UNRECOGNIZED_VALUE);
        owf owf = this.c;
        akcr.a(queryParameter, "entryId");
        ajdx a = owf.c(queryParameter).a((ajeb) ajdx.b((Object) ajyw.a)).a((ajfc) new b(this, agop, set, z, set2, queryParameter, uri));
        akcr.a((Object) a, "entryRepository.getSnapI…      }\n                }");
        return gem.a(a, z);
    }
}
