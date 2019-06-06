package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "attachment_info")
/* renamed from: ucu */
public final class ucu extends ggm {
    private final ucs a;
    private final gee b;

    /* renamed from: ucu$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ucu$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final /* synthetic */ Object call() {
            StringBuilder stringBuilder = new StringBuilder("request for attachment info failed! null userId? ");
            boolean z = true;
            stringBuilder.append(this.a == null);
            stringBuilder.append(", url: ");
            stringBuilder.append(this.b);
            stringBuilder.append(", null token? ");
            CharSequence charSequence = this.c;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            stringBuilder.append(z);
            return a.a((Throwable) new IllegalStateException(stringBuilder.toString()), null);
        }
    }

    /* renamed from: ucu$a */
    public static final class a extends aedh {
        @SerializedName("img_url")
        private final String a = null;
        @SerializedName("favicon_url")
        private final String b;

        public a(String str) {
            akcr.b(str, "faviconUrl");
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.ucu.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.ucu.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ucu$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AttachmentInfoRequestPayload(imageUrl=");
            stringBuilder.append(this.a);
            stringBuilder.append(", faviconUrl=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        b bVar = new b();
    }

    public ucu(ucs ucs, gee gee) {
        akcr.b(ucs, "attachmentInfoContentType");
        akcr.b(gee, "contentManager");
        this.a = ucs;
        this.b = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object of;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter("url");
        String queryParameter2 = uri.getQueryParameter("token");
        String queryParameter3 = uri.getQueryParameter("user_id");
        if (queryParameter3 != null) {
            CharSequence charSequence = queryParameter;
            Object obj = null;
            Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj2 == null) {
                charSequence = queryParameter2;
                if (charSequence == null || charSequence.length() == 0) {
                    obj = 1;
                }
                if (obj == null) {
                    gee gee = this.b;
                    if (queryParameter == null) {
                        akcr.a();
                    }
                    if (queryParameter2 == null) {
                        akcr.a();
                    }
                    String concat = "attachment_url_request_id_".concat(String.valueOf(queryParameter));
                    sbm.a aVar = new sbm.a("https://snapchat-proxy.appspot.com/scan/proxy", sac.POST);
                    of = ImmutableMap.of("X-SC-UserId", queryParameter3, "X-SC-ProxyToken", queryParameter2);
                    akcr.a(of, "ImmutableMap.of(PROXY_HE…ADER_TOKEN, requestToken)");
                    obj = aVar.d((Map) of).b(new gma(new a(queryParameter))).e();
                    akcr.a(obj, "SimpleRequest.Builder<An…                 .build()");
                    of = gee.a(new gew(concat, obj, null, null, this.a, set, set2, 284)).a(z);
                    queryParameter = "contentManager.submit(bu…tResult(closeOnTerminate)";
                    akcr.a(of, queryParameter);
                    return of;
                }
            }
        }
        of = ajdx.c((Callable) new c(queryParameter3, queryParameter, queryParameter2));
        queryParameter = "Single.fromCallable {\n  …(errorMsg))\n            }";
        akcr.a(of, queryParameter);
        return of;
    }
}
