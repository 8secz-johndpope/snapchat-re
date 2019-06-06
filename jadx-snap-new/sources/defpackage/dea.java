package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "bitmoji/*/*")
/* renamed from: dea */
public final class dea extends ggm {
    final dei a;
    final dec b;
    final ajwy<gee> c;
    final ajwy<gpd> d;
    private final Uri e = Uri.parse("https://images.bitmoji.com");
    private final ajwy<ftl> f;
    private final ajwy<gqr> g;
    private final ajwy<ilv> h;

    /* renamed from: dea$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ dea a;
        final /* synthetic */ Set b;

        /* renamed from: dea$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                gpa gpa = (gpa) obj;
                akcr.b(gpa, "it");
                String str = gpa.a.f;
                dec dec = (gpa.a.a == null || (str != null && this.a.b.contains(str))) ? this.a.a.a : this.a.a.b;
                return dec;
            }
        }

        a(dea dea, Set set) {
            this.a = dea;
            this.b = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                obj = this.a.d.get();
                akcr.a(obj, "userAuthStoreReader.get()");
                obj = ((gpd) obj).b().f(new 1(this));
                str = "userAuthStoreReader.get(…                        }";
            } else {
                obj = ajdx.b(this.a.a);
                str = "Single.just(userScopedBitmojiContentType)";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: dea$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ boolean a;
        private /* synthetic */ dea b;
        private /* synthetic */ aedx c;
        private /* synthetic */ Set d;
        private /* synthetic */ Set e;

        b(dea dea, aedx aedx, Set set, Set set2, boolean z) {
            this.b = dea;
            this.c = aedx;
            this.d = set;
            this.e = set2;
            this.a = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (gfp) obj;
            akcr.b(obj, "contentType");
            final ajdx a = ((gee) this.b.c.get()).a(dea.a(this.b, this.c, obj, this.d, this.e)).a(this.a);
            if (!akcr.a(obj, this.b.b)) {
                return a;
            }
            gee gee = (gee) this.b.c.get();
            dea dea = this.b;
            return gee.a(dea.a(dea, this.c, dea.a, this.d, ajzs.a(gdy.READ_CACHE_ONLY))).a(false).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ b a;

                public final /* synthetic */ Object apply(Object obj) {
                    obj = (gej) obj;
                    akcr.b(obj, "it");
                    if (!obj.a()) {
                        return a;
                    }
                    boolean z = this.a.a;
                    ajdx b = ajdx.b(obj);
                    akcr.a((Object) b, "Single.just(it)");
                    return gem.a(z, b);
                }
            });
        }
    }

    public dea(dei dei, dec dec, ajwy<gee> ajwy, ajwy<gpd> ajwy2, ajwy<ftl> ajwy3, ajwy<gqr> ajwy4, ajwy<ilv> ajwy5) {
        akcr.b(dei, "userScopedBitmojiContentType");
        akcr.b(dec, "nonUserScopedBitmojiContentType");
        akcr.b(ajwy, "contentManager");
        akcr.b(ajwy2, "userAuthStoreReader");
        akcr.b(ajwy3, "configurationProvider");
        akcr.b(ajwy4, "exceptionTracker");
        akcr.b(ajwy5, "graphene");
        this.a = dei;
        this.b = dec;
        this.c = ajwy;
        this.d = ajwy2;
        this.f = ajwy3;
        this.g = ajwy4;
        this.h = ajwy5;
    }

    public static final /* synthetic */ geg a(dea dea, aedx aedx, gfp gfp, Set set, Set set2) {
        StringBuilder stringBuilder;
        String str;
        akcr.b(aedx, "req");
        String str2 = "~WEBP";
        if (aedx.c == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(aedx.a);
            stringBuilder.append('~');
            stringBuilder.append(aedx.e);
            stringBuilder.append('~');
            str = aedx.b;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(aedx.a);
            stringBuilder.append('~');
            stringBuilder.append(aedx.e);
            stringBuilder.append('~');
            stringBuilder.append(aedx.b);
            stringBuilder.append('~');
            str = aedx.c;
        }
        stringBuilder.append(str);
        stringBuilder.append(str2);
        str2 = stringBuilder.toString();
        r0 = new ajxm[2];
        r0[0] = ajxs.a("X-Feature", aedx.i);
        r0[1] = ajxs.a("X-Skip-Render-Cache", "true");
        Object d = new a(dea.a(aedx), sac.GET, ajzm.a(r0), null).e();
        akcr.a(d, "SimpleRequest.Builder<An…ders, null, null).build()");
        return new gew(str2, (sak) d, null, null, gfp, set, set2, 284);
    }

    /* JADX WARNING: Missing block: B:10:0x0050, code skipped:
            if (r3.intValue() != 1) goto L_0x0053;
     */
    private java.lang.String a(defpackage.aedx r12) {
        /*
        r11 = this;
        r0 = "req";
        defpackage.akcr.b(r12, r0);
        r0 = defpackage.ddi.WEBP;
        r1 = r12.e;
        r2 = "req.scale";
        defpackage.akcr.a(r1, r2);
        r1 = r1.intValue();
        r2 = "imageType";
        defpackage.akcr.b(r0, r2);
        r0 = 1;
        r2 = new defpackage.ajxm[r0];
        r3 = "transparent";
        r4 = "1";
        r3 = defpackage.ajxs.a(r3, r4);
        r4 = 0;
        r2[r4] = r3;
        r2 = defpackage.ajzm.b(r2);
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r3 = 2;
        if (r1 != r3) goto L_0x0037;
    L_0x002e:
        r1 = java.lang.String.valueOf(r1);
        r3 = "scale";
        r2.put(r3, r1);
    L_0x0037:
        r1 = r11.e;
        r1 = r1.buildUpon();
        r3 = defpackage.deb.a;
        r5 = r12.a;
        r3 = r3.contains(r5);
        if (r3 == 0) goto L_0x0053;
    L_0x0047:
        r3 = r12.e;
        if (r3 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0053;
    L_0x004c:
        r3 = r3.intValue();
        if (r3 != r0) goto L_0x0053;
    L_0x0052:
        goto L_0x0054;
    L_0x0053:
        r0 = 0;
    L_0x0054:
        r3 = "-v1.";
        r5 = 45;
        if (r0 == 0) goto L_0x00e6;
    L_0x005a:
        r0 = new java.lang.StringBuilder;
        r6 = "/hotshot/panel/";
        r0.<init>(r6);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r12.a;
        r6.append(r7);
        r6.append(r5);
        r7 = r12.b;
        r6.append(r7);
        r6.append(r3);
        r7 = r12.g;
        r6.append(r7);
        r6 = r6.toString();
        r7 = "MD5";
        r7 = java.security.MessageDigest.getInstance(r7);
        r8 = "MessageDigest.getInstance(\"MD5\")";
        defpackage.akcr.a(r7, r8);
        r8 = com.google.common.io.BaseEncoding.base16();
        r9 = java.nio.charset.StandardCharsets.UTF_8;
        r10 = "StandardCharsets.UTF_8";
        defpackage.akcr.a(r9, r10);
        r10 = "null cannot be cast to non-null type java.lang.String";
        if (r6 == 0) goto L_0x00e0;
    L_0x0099:
        r6 = r6.getBytes(r9);
        r9 = "(this as java.lang.String).getBytes(charset)";
        defpackage.akcr.a(r6, r9);
        r6 = r7.digest(r6);
        r6 = r8.encode(r6);
        r7 = "BaseEncoding\n           …StandardCharsets.UTF_8)))";
        defpackage.akcr.a(r6, r7);
        if (r6 == 0) goto L_0x00da;
    L_0x00b1:
        r6 = r6.toLowerCase();
        r7 = "(this as java.lang.String).toLowerCase()";
        defpackage.akcr.a(r6, r7);
        if (r6 == 0) goto L_0x00d4;
    L_0x00bc:
        r7 = 8;
        r4 = r6.substring(r4, r7);
        r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        defpackage.akcr.a(r4, r6);
        r0.append(r4);
        r4 = 47;
        r0.append(r4);
        r0 = r0.toString();
        goto L_0x00e8;
    L_0x00d4:
        r12 = new ajxt;
        r12.<init>(r10);
        throw r12;
    L_0x00da:
        r12 = new ajxt;
        r12.<init>(r10);
        throw r12;
    L_0x00e0:
        r12 = new ajxt;
        r12.<init>(r10);
        throw r12;
    L_0x00e6:
        r0 = "/render/panel/";
    L_0x00e8:
        r4 = r12.c;
        if (r4 == 0) goto L_0x0107;
    L_0x00ec:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r0 = r12.a;
        r4.append(r0);
        r4.append(r5);
        r0 = r12.b;
        r4.append(r0);
        r4.append(r5);
        r0 = r12.c;
        goto L_0x0119;
    L_0x0107:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r0 = r12.a;
        r4.append(r0);
        r4.append(r5);
        r0 = r12.b;
    L_0x0119:
        r4.append(r0);
        r4.append(r3);
        r12 = r12.g;
        r4.append(r12);
        r12 = r4.toString();
        r12 = r1.path(r12);
        r0 = r2.entrySet();
        r0 = r0.iterator();
    L_0x0134:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0150;
    L_0x013a:
        r1 = r0.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (java.lang.String) r2;
        r1 = r1.getValue();
        r1 = (java.lang.String) r1;
        r12.appendQueryParameter(r2, r1);
        goto L_0x0134;
    L_0x0150:
        r12 = r12.build();
        r12 = r12.toString();
        r0 = "baseUri.buildUpon()\n    …              .toString()";
        defpackage.akcr.a(r12, r0);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dea.a(aedx):java.lang.String");
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object b;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        if ((uri.getPathSegments().size() > 2 ? 1 : null) == null) {
            String str2 = "Missing required avatarId or templateId, likely caused from a Java call into BitmojiUriHandler with a null value";
            ((gqr) this.g.get()).a(gqt.HIGH, new Exception(str2), ddg.l.callsite("BitmojiUriHandler"));
            b = ajdx.b(ghx.a.a(new Throwable(str2), null));
            str = "Single.just(FailedConten…rror(Throwable(message)))";
        } else {
            aedx aedx = new aedx();
            aedx.b = (String) uri.getPathSegments().get(1);
            aedx.a = (String) uri.getPathSegments().get(2);
            aedx.c = uri.getQueryParameter("f");
            aedx.i = uri.getQueryParameter("feature");
            b = uri.getQueryParameter("scale");
            akcr.a(b, "uri.getQueryParameter(SCALE)");
            aedx.e = Integer.valueOf(Integer.parseInt(b));
            aedx.g = ddi.WEBP.imageType;
            Set b2 = ajzt.b(aedx.b);
            if (aedx.c != null) {
                b2.add(aedx.c);
            }
            akcr.b(b2, "bitmojiIds");
            b = ((ftl) this.f.get()).b((fth) ddx.MDP_MROOM_BITMOJI_NON_USER_SCOPE_ENABLED).a((ajfc) new a(this, b2));
            akcr.a(b, "configurationProvider.ge…      }\n                }");
            b = b.a((ajfc) new b(this, aedx, set, set2, z));
            str = "getContentType(bitmojiId…      }\n                }";
        }
        akcr.a(b, str);
        return b;
    }
}
