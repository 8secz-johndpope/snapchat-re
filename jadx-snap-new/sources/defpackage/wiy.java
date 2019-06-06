package defpackage;

import com.snap.core.db.record.SnapTokenModel;
import com.snap.security.snaptoken.SnapTokenHttpInterface;
import java.util.Map;

/* renamed from: wiy */
public final class wiy {
    public volatile aipn<SnapTokenHttpInterface> a;
    final wje b;

    /* renamed from: wiy$a */
    public static final class a {
        final Map<wjd, alqu> a;
        private final aeao b;

        public a(aeao aeao, Map<wjd, alqu> map) {
            akcr.b(aeao, "prefetchHint");
            akcr.b(map, SnapTokenModel.ACCESSTOKENS);
            this.b = aeao;
            this.a = map;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.wiy.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.wiy.a) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.a;
            r3 = r3.a;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            aeao aeao = this.b;
            int i = 0;
            int hashCode = (aeao != null ? aeao.hashCode() : 0) * 31;
            Map map = this.a;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AccessTokenResult(prefetchHint=");
            stringBuilder.append(this.b);
            stringBuilder.append(", accessTokens=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: wiy$b */
    public static final class b {
        final String a;
        final Map<wjd, alqu> b;
        private final aeao c;

        public b(String str, aeao aeao, Map<wjd, alqu> map) {
            akcr.b(str, SnapTokenModel.REFRESHTOKEN);
            akcr.b(aeao, "prefetchHint");
            akcr.b(map, SnapTokenModel.ACCESSTOKENS);
            this.a = str;
            this.c = aeao;
            this.b = map;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.wiy.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.wiy.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            aeao aeao = this.c;
            hashCode = (hashCode + (aeao != null ? aeao.hashCode() : 0)) * 31;
            Map map = this.b;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SessionTokenResult(refreshToken=");
            stringBuilder.append(this.a);
            stringBuilder.append(", prefetchHint=");
            stringBuilder.append(this.c);
            stringBuilder.append(", accessTokens=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: wiy$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wiy a;
        private /* synthetic */ String b;

        c(wiy wiy, String str) {
            this.a = wiy;
            this.b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.akxa) r9;
            r0 = "it";
            defpackage.akcr.b(r9, r0);
            r0 = r8.a;
            r1 = r8.b;
            r2 = "result";
            defpackage.akcr.b(r9, r2);
            r2 = r9.a();
            r3 = 0;
            if (r2 == 0) goto L_0x001e;
        L_0x0017:
            r2 = r2.f();
            r2 = (defpackage.aeaq) r2;
            goto L_0x001f;
        L_0x001e:
            r2 = r3;
        L_0x001f:
            r4 = r9.c();
            r5 = "body.snapAccessTokens";
            if (r4 == 0) goto L_0x005d;
        L_0x0027:
            r2 = new wjo;
            r4 = defpackage.wjc.NETWORK_FAILURE;
            r6 = new java.lang.StringBuilder;
            r7 = "Failed snap access tokens http request, http code: ";
            r6.<init>(r7);
            r7 = r9.a();
            if (r7 == 0) goto L_0x0040;
        L_0x0038:
            r3 = r7.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x0040:
            r6.append(r3);
            r3 = r6.toString();
            r6 = r9.b();
            if (r6 != 0) goto L_0x0050;
        L_0x004d:
            defpackage.akcr.a();
        L_0x0050:
            r7 = "result.error()!!";
            defpackage.akcr.a(r6, r7);
            r2.<init>(r4, r3, r6);
        L_0x0058:
            r3 = r2;
            r3 = (java.lang.Throwable) r3;
            goto L_0x0110;
        L_0x005d:
            r4 = r9.a();
            if (r4 == 0) goto L_0x006b;
        L_0x0063:
            r4 = r4.b();
            r6 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
            if (r4 == r6) goto L_0x0079;
        L_0x006b:
            r4 = r9.a();
            if (r4 == 0) goto L_0x009d;
        L_0x0071:
            r4 = r4.b();
            r6 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
            if (r4 != r6) goto L_0x009d;
        L_0x0079:
            r2 = new wjo;
            r4 = defpackage.wjc.NETWORK_PERMISSION_ERROR;
            r6 = new java.lang.StringBuilder;
            r7 = "Permission error on snap access tokens http request, http code: ";
            r6.<init>(r7);
            r7 = r9.a();
            if (r7 == 0) goto L_0x0092;
        L_0x008a:
            r3 = r7.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x0092:
            r6.append(r3);
            r3 = r6.toString();
            r2.<init>(r4, r3);
            goto L_0x0058;
        L_0x009d:
            if (r2 != 0) goto L_0x00c3;
        L_0x009f:
            r2 = new wjo;
            r4 = defpackage.wjc.NETWORK_FAILURE;
            r6 = new java.lang.StringBuilder;
            r7 = "Failed to parse snap access tokens response body, http code: ";
            r6.<init>(r7);
            r7 = r9.a();
            if (r7 == 0) goto L_0x00b8;
        L_0x00b0:
            r3 = r7.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x00b8:
            r6.append(r3);
            r3 = r6.toString();
            r2.<init>(r4, r3);
            goto L_0x0058;
        L_0x00c3:
            r4 = r2.a();
            r6 = 1;
            if (r4 == r6) goto L_0x00f9;
        L_0x00ca:
            r3 = new wjo;
            r4 = r2.a();
            r6 = 2;
            if (r4 == r6) goto L_0x00df;
        L_0x00d3:
            r6 = 4;
            if (r4 == r6) goto L_0x00df;
        L_0x00d6:
            r6 = 5;
            if (r4 == r6) goto L_0x00dc;
        L_0x00d9:
            r4 = defpackage.wjc.SERVER_RESPONSE_ERROR;
            goto L_0x00e1;
        L_0x00dc:
            r4 = defpackage.wjc.UNAUTHORIZED_SCOPE;
            goto L_0x00e1;
        L_0x00df:
            r4 = defpackage.wjc.SERVER_INVALID_REFRESH_TOKEN;
        L_0x00e1:
            r6 = new java.lang.StringBuilder;
            r7 = "Access tokens network response soju error code: ";
            r6.<init>(r7);
            r2 = r2.a();
            r6.append(r2);
            r2 = r6.toString();
            r3.<init>(r4, r2);
            r3 = (java.lang.Throwable) r3;
            goto L_0x0110;
        L_0x00f9:
            r2 = r2.a;
            defpackage.akcr.a(r2, r5);
            r2 = r2.length;
            if (r2 != 0) goto L_0x0102;
        L_0x0101:
            goto L_0x0103;
        L_0x0102:
            r6 = 0;
        L_0x0103:
            if (r6 == 0) goto L_0x0110;
        L_0x0105:
            r2 = new wjo;
            r3 = defpackage.wjc.SERVER_RESPONSE_ERROR;
            r4 = "Access tokens response is missing tokens";
            r2.<init>(r3, r4);
            goto L_0x0058;
        L_0x0110:
            if (r3 == 0) goto L_0x011c;
        L_0x0112:
            r9 = defpackage.ajdx.b(r3);
            r0 = "Single.error<AccessTokenResult>(it)";
        L_0x0118:
            defpackage.akcr.a(r9, r0);
            return r9;
        L_0x011c:
            r9 = r9.a();
            if (r9 == 0) goto L_0x015d;
        L_0x0122:
            r9 = r9.f();
            r9 = (defpackage.aeaq) r9;
            if (r9 != 0) goto L_0x012b;
        L_0x012a:
            goto L_0x015d;
        L_0x012b:
            r2 = "result.response()?.body(….invalidServerResponse())";
            defpackage.akcr.a(r9, r2);
            r2 = r9.b;
            if (r2 != 0) goto L_0x0138;
        L_0x0134:
            r2 = defpackage.wjf.a();
        L_0x0138:
            r3 = new wiy$a;
            r4 = "prefetchHint";
            defpackage.akcr.a(r2, r4);
            r0 = r0.b;
            r9 = r9.a;
            defpackage.akcr.a(r9, r5);
            r9 = defpackage.ajyi.i(r9);
            r9 = r0.a(r1, r2, r9);
            r0 = "snapTokenDiskUtils.conve…napAccessTokens.toList())";
            defpackage.akcr.a(r9, r0);
            r3.<init>(r2, r9);
            r9 = defpackage.ajdx.b(r3);
            r0 = "Single.just(AccessTokenR…pAccessTokens.toList())))";
            goto L_0x0118;
        L_0x015d:
            r9 = new wjo;
            r0 = defpackage.wjc.SERVER_RESPONSE_ERROR;
            r1 = "Invalid server response";
            r9.<init>(r0, r1);
            r9 = (java.lang.Throwable) r9;
            r9 = defpackage.ajdx.b(r9);
            r0 = "Single.error(SnapAccessT….invalidServerResponse())";
            goto L_0x0118;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: wiy$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ wiy a;
        private /* synthetic */ String b;

        d(wiy wiy, String str) {
            this.a = wiy;
            this.b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.akxa) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r7.a;
            r1 = r7.b;
            r2 = "result";
            defpackage.akcr.b(r8, r2);
            r2 = r8.a();
            r3 = 0;
            if (r2 == 0) goto L_0x001e;
        L_0x0017:
            r2 = r2.f();
            r2 = (defpackage.aeas) r2;
            goto L_0x001f;
        L_0x001e:
            r2 = r3;
        L_0x001f:
            r4 = r8.c();
            if (r4 == 0) goto L_0x005b;
        L_0x0025:
            r2 = new wjp;
            r4 = defpackage.wjm.NETWORK_FAILURE;
            r5 = new java.lang.StringBuilder;
            r6 = "Failed snap session http request, http code: ";
            r5.<init>(r6);
            r6 = r8.a();
            if (r6 == 0) goto L_0x003e;
        L_0x0036:
            r3 = r6.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x003e:
            r5.append(r3);
            r3 = r5.toString();
            r5 = r8.b();
            if (r5 != 0) goto L_0x004e;
        L_0x004b:
            defpackage.akcr.a();
        L_0x004e:
            r6 = "result.error()!!";
            defpackage.akcr.a(r5, r6);
            r2.<init>(r4, r3, r5);
        L_0x0056:
            r3 = r2;
            r3 = (java.lang.Throwable) r3;
            goto L_0x00f9;
        L_0x005b:
            r4 = r8.a();
            if (r4 == 0) goto L_0x0069;
        L_0x0061:
            r4 = r4.b();
            r5 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
            if (r4 == r5) goto L_0x0077;
        L_0x0069:
            r4 = r8.a();
            if (r4 == 0) goto L_0x009b;
        L_0x006f:
            r4 = r4.b();
            r5 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
            if (r4 != r5) goto L_0x009b;
        L_0x0077:
            r2 = new wjp;
            r4 = defpackage.wjm.NETWORK_PERMISSION_ERROR;
            r5 = new java.lang.StringBuilder;
            r6 = "Permission error on snap access tokens http request, http code: ";
            r5.<init>(r6);
            r6 = r8.a();
            if (r6 == 0) goto L_0x0090;
        L_0x0088:
            r3 = r6.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x0090:
            r5.append(r3);
            r3 = r5.toString();
            r2.<init>(r4, r3);
            goto L_0x0056;
        L_0x009b:
            if (r2 != 0) goto L_0x00c1;
        L_0x009d:
            r2 = new wjp;
            r4 = defpackage.wjm.NETWORK_FAILURE;
            r5 = new java.lang.StringBuilder;
            r6 = "Failed to parse snap session response body, http code: ";
            r5.<init>(r6);
            r6 = r8.a();
            if (r6 == 0) goto L_0x00b6;
        L_0x00ae:
            r3 = r6.b();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x00b6:
            r5.append(r3);
            r3 = r5.toString();
            r2.<init>(r4, r3);
            goto L_0x0056;
        L_0x00c1:
            r4 = r2.b();
            r5 = 1;
            if (r4 == r5) goto L_0x00e4;
        L_0x00c8:
            r3 = new wjp;
            r4 = defpackage.wjm.SERVER_RESPONSE_ERROR;
            r5 = new java.lang.StringBuilder;
            r6 = "Snap session network response soju error code: ";
            r5.<init>(r6);
            r2 = r2.b();
            r5.append(r2);
            r2 = r5.toString();
            r3.<init>(r4, r2);
            r3 = (java.lang.Throwable) r3;
            goto L_0x00f9;
        L_0x00e4:
            r2 = r2.a();
            r2 = com.google.common.base.Strings.isNullOrEmpty(r2);
            if (r2 == 0) goto L_0x00f9;
        L_0x00ee:
            r2 = new wjp;
            r3 = defpackage.wjm.SERVER_RESPONSE_ERROR;
            r4 = "Snap Session response is missing refresh token";
            r2.<init>(r3, r4);
            goto L_0x0056;
        L_0x00f9:
            if (r3 == 0) goto L_0x0105;
        L_0x00fb:
            r8 = defpackage.ajdx.b(r3);
            r0 = "Single.error<SessionTokenResult>(it)";
        L_0x0101:
            defpackage.akcr.a(r8, r0);
            return r8;
        L_0x0105:
            r8 = r8.a();
            if (r8 == 0) goto L_0x0151;
        L_0x010b:
            r8 = r8.f();
            r8 = (defpackage.aeas) r8;
            if (r8 != 0) goto L_0x0114;
        L_0x0113:
            goto L_0x0151;
        L_0x0114:
            r2 = "result.response()?.body(….invalidServerResponse())";
            defpackage.akcr.a(r8, r2);
            r2 = r8.b;
            if (r2 != 0) goto L_0x0121;
        L_0x011d:
            r2 = defpackage.wjf.a();
        L_0x0121:
            r3 = new wiy$b;
            r4 = r8.a();
            r5 = "body.refreshToken";
            defpackage.akcr.a(r4, r5);
            r5 = "prefetchHint";
            defpackage.akcr.a(r2, r5);
            r0 = r0.b;
            r8 = r8.a;
            r5 = "body.snapAccessTokens";
            defpackage.akcr.a(r8, r5);
            r8 = defpackage.ajyi.i(r8);
            r8 = r0.a(r1, r2, r8);
            r0 = "snapTokenDiskUtils.conve…napAccessTokens.toList())";
            defpackage.akcr.a(r8, r0);
            r3.<init>(r4, r2, r8);
            r8 = defpackage.ajdx.b(r3);
            r0 = "Single.just(SessionToken…pAccessTokens.toList())))";
            goto L_0x0101;
        L_0x0151:
            r8 = new wjp;
            r0 = defpackage.wjm.SERVER_RESPONSE_ERROR;
            r1 = "Invalid server response";
            r8.<init>(r0, r1);
            r8 = (java.lang.Throwable) r8;
            r8 = defpackage.ajdx.b(r8);
            r0 = "Single.error(SnapSession….invalidServerResponse())";
            goto L_0x0101;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    public wiy(wje wje) {
        akcr.b(wje, "snapTokenDiskUtils");
        this.b = wje;
    }
}
