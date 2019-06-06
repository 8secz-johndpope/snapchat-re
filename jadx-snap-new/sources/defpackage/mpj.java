package defpackage;

import com.brightcove.player.event.EventType;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.UriRequest;
import com.looksery.sdk.domain.UriResponse;
import com.looksery.sdk.listener.UriListener;
import com.snap.core.db.record.CognacRVModel;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.mph.a;
import defpackage.mph.b;
import defpackage.mph.b.b.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mpj */
public final class mpj implements UriListener {
    final ConcurrentHashMap<String, ajej> a = new ConcurrentHashMap();
    final mkx b;
    final Iterable<mph> c;

    /* renamed from: mpj$1 */
    static final class 1 implements ajev {
        private /* synthetic */ mpj a;

        1(mpj mpj) {
            this.a = mpj;
        }

        public final void run() {
            if (!this.a.a.isEmpty()) {
                Iterator it = this.a.a.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    it.remove();
                    ((ajej) entry.getValue()).dispose();
                }
            }
        }
    }

    /* renamed from: mpj$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mpj a;

        b(mpj mpj) {
            this.a = mpj;
        }

        private ajdp<? extends defpackage.mph.b> a(UriRequest uriRequest) {
            a aVar;
            akcr.b(uriRequest, "uriRequest");
            Object id = uriRequest.getId();
            akcr.a(id, "id");
            mhs a = mhs.a.a(id);
            if (!(a instanceof defpackage.mhs.b)) {
                a = null;
            }
            defpackage.mhs.b bVar = (defpackage.mhs.b) a;
            if (bVar != null) {
                Object uri = uriRequest.getUri();
                akcr.a(uri, MessageMediaRefModel.URI);
                Object data = uriRequest.getData();
                akcr.a(data, UnlockablesModel.DATA);
                Object method = uriRequest.getMethod();
                akcr.a(method, "method");
                Object contentType = uriRequest.getContentType();
                akcr.a(contentType, "contentType");
                a aVar2 = new a(bVar, uri, data, method, contentType);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return ajvo.a(ajot.a);
            }
            try {
                URI uri2 = new URI(aVar.b);
                String host = uri2.getHost();
                if (host == null) {
                    StringBuilder stringBuilder = new StringBuilder("URI has malformed hostname: ");
                    stringBuilder.append(uri2.getRawPath());
                    return ajdp.b(new defpackage.mph.b.b.a(aVar, stringBuilder.toString()));
                } else if (!mpk.a.contains(host)) {
                    return ajdp.b(new defpackage.mph.b.b.b(aVar, "Uri hostname not in whitelist."));
                } else {
                    for (Object next : this.a.c) {
                        if (((mph) next).a(aVar)) {
                            break;
                        }
                    }
                    Object next2 = null;
                    final mph mph = (mph) next2;
                    if (mph == null) {
                        return ajdp.b(new c(aVar, "UriHandler not found"));
                    }
                    ajdt b = mph.b();
                    ajdp e = mph.b().e((ajfb) new ajfb<ajej>() {
                        public final /* synthetic */ void accept(Object obj) {
                            mph.a().accept(aVar);
                        }
                    });
                    akcr.a((Object) e, "uriHandler.outputs.doOnS….inputs.accept(request) }");
                    return ajdp.b(b, (ajdt) myu.a(e)).a((ajfl) new ajfl<defpackage.mph.b>() {
                        public final /* synthetic */ boolean test(Object obj) {
                            defpackage.mph.b bVar = (defpackage.mph.b) obj;
                            akcr.b(bVar, "it");
                            return akcr.a(bVar.a(), aVar.a);
                        }
                    });
                }
            } catch (URISyntaxException unused) {
                StringBuilder stringBuilder2 = new StringBuilder("Exception occurred while constructing URI from ");
                stringBuilder2.append(aVar.b);
                stringBuilder2.append('\"');
                return ajdp.b(new defpackage.mph.b.b.a(aVar, stringBuilder2.toString()));
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((UriRequest) obj);
        }
    }

    /* renamed from: mpj$c */
    static final class c implements ajev {
        private /* synthetic */ mpj a;
        private /* synthetic */ UriRequest b;

        c(mpj mpj, UriRequest uriRequest) {
            this.a = mpj;
            this.b = uriRequest;
        }

        public final void run() {
            ajej ajej = (ajej) this.a.a.remove(this.b.getId());
            if (ajej != null) {
                ajej.dispose();
            }
        }
    }

    /* renamed from: mpj$d */
    static final class d<T> implements ajfb<b> {
        private /* synthetic */ mpj a;

        d(mpj mpj) {
            this.a = mpj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (b) obj;
            mpj mpj = this.a;
            akcr.a(obj, EventType.RESPONSE);
            mpj.b.b(new a(obj));
        }
    }

    /* renamed from: mpj$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            String str = this.a.a().a;
            b bVar = this.a;
            lSCoreManagerWrapper.provideUriResponse(str, new UriResponse(bVar.b(), bVar.c(), bVar.d(), bVar.e(), bVar.f()));
            return ajxw.a;
        }
    }

    public mpj(mkx mkx, Iterable<? extends mph> iterable) {
        akcr.b(mkx, "lensCore");
        akcr.b(iterable, "uriHandlers");
        this.b = mkx;
        this.c = iterable;
        mkx = this.b;
        ajej a = ajek.a((ajev) new 1(this));
        akcr.a((Object) a, "Disposables.fromAction {…)\n            }\n        }");
        mkx.a(a);
    }

    public final void cancelRequest(String str) {
        akcr.b(str, CognacRVModel.REQUESTID);
        ajej ajej = (ajej) this.a.remove(str);
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public final void requestUriData(UriRequest uriRequest) {
        akcr.b(uriRequest, "uriRequest");
        Object k = ajdp.b((Object) uriRequest).k((ajfc) new b(this));
        akcr.a(k, "Observable.just(uriReque…st.id }\n                }");
        StringBuilder stringBuilder = new StringBuilder("request[");
        stringBuilder.append(uriRequest);
        stringBuilder.append(']');
        ajej ajej = (ajej) this.a.put(uriRequest.getId(), k.a((ajev) new c(this, uriRequest)).f((ajfb) new d(this)));
        if (ajej != null) {
            ajej.dispose();
        }
    }
}
