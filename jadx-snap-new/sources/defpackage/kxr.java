package defpackage;

import defpackage.mip.e;
import defpackage.mmi.d;
import defpackage.mwe.a.b;
import java.util.List;

/* renamed from: kxr */
public final class kxr implements ajec<d, d> {
    final mwe a;
    final nay b;
    final mnr c;
    final ajdp<kya> d;
    final akbk<String> e;
    final kxz f;
    final kqf g;

    /* renamed from: kxr$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ kxr a;

        a(kxr kxr) {
            this.a = kxr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (d) obj;
            akcr.b(obj, "request");
            ajde a = this.a.a.a(new b(obj.a));
            StringBuilder stringBuilder = new StringBuilder("ExternalMetadataFilterRequestTransformer.lensRepository#query[");
            stringBuilder.append(obj.a);
            stringBuilder.append(']');
            String stringBuilder2 = stringBuilder.toString();
            akcr.b(a, "receiver$0");
            akcr.b(stringBuilder2, "sectionName");
            Object b = a.d((ajfb) new mip.d(mip.a(stringBuilder2))).b((ajfb) e.a);
            akcr.a(b, "this\n            .doOnNe…raceCompat.endSection() }");
            return b.b().a((ajfc) new ajfc<T, ajdn<? extends R>>(this) {
                final /* synthetic */ a a;

                /* renamed from: kxr$a$1$a */
                public static final class a<T1, T2, T3, T4, R> implements ajfe<T1, T2, T3, T4, R> {
                    public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                        Object obj = (defpackage.kxz.a) t4;
                        byte[] bArr = (byte[]) t3;
                        nau nau = (nau) t2;
                        kya kya = (kya) t1;
                        akcr.a(obj, "t4");
                        return new kxw(kya, nau, bArr, obj);
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "lenses");
                    if (list.isEmpty()) {
                        return ajdj.b(obj);
                    }
                    final mux mux = (mux) ajyu.f(list);
                    Object c = mux.a() ? this.a.a.d.d().c(kya.c) : ajdj.b(kya.c);
                    akcr.a(c, "if (lens.isSnappable) {\n…                        }");
                    c = (ajdn) c;
                    Object d = this.a.a.b.a(nay.b.b.a).d();
                    akcr.a(d, "userDataRepository\n     …          .firstElement()");
                    d = (ajdn) d;
                    Object h = this.a.a.c.a(mux.a).h();
                    akcr.a(h, "persistenceRepository.read(lens.id).toMaybe()");
                    h = (ajdn) h;
                    Object h2 = this.a.a.f.a().h();
                    akcr.a(h2, "lensEntryPointTracker.entryPoint().toMaybe()");
                    h2 = (ajdn) h2;
                    ajfe aVar = new a();
                    ajfv.a(c, "source1 is null");
                    ajfv.a(d, "source2 is null");
                    ajfv.a(h, "source3 is null");
                    ajfv.a(h2, "source4 is null");
                    c = ajdj.a(ajfu.a(aVar), c, d, h, h2);
                    akcr.a(c, "Maybe.zip(s1, s2, s3, s4…invoke(t1, t2, t3, t4) })");
                    return c.f(new ajfc<T, R>(this) {
                        private /* synthetic */ 1 a;

                        /* JADX WARNING: Missing block: B:10:0x0034, code skipped:
            if (r2 == null) goto L_0x0036;
     */
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object r19) {
                            /*
                            r18 = this;
                            r0 = r18;
                            r1 = r19;
                            r1 = (defpackage.kxw) r1;
                            r2 = "<name for destructuring parameter 0>";
                            defpackage.akcr.b(r1, r2);
                            r2 = r1.a;
                            r3 = r1.b;
                            r4 = r1.c;
                            r1 = r1.d;
                            r5 = r8;
                            r5 = r5.a();
                            r6 = 0;
                            if (r5 == 0) goto L_0x0042;
                        L_0x001c:
                            if (r2 == 0) goto L_0x0021;
                        L_0x001e:
                            r5 = r2.a;
                            goto L_0x0022;
                        L_0x0021:
                            r5 = r6;
                        L_0x0022:
                            r7 = r8;
                            r7 = r7.a;
                            r5 = defpackage.akcr.a(r5, r7);
                            if (r5 == 0) goto L_0x003c;
                        L_0x002c:
                            r2 = r2.a();
                            if (r2 == 0) goto L_0x0036;
                        L_0x0032:
                            r2 = r2.a;
                            if (r2 != 0) goto L_0x0043;
                        L_0x0036:
                            r2 = new algb;
                            r2.<init>();
                            goto L_0x0043;
                        L_0x003c:
                            r2 = new algb;
                            r2.<init>();
                            goto L_0x0043;
                        L_0x0042:
                            r2 = r6;
                        L_0x0043:
                            r5 = r0.a;
                            r5 = r4;
                            r7 = r0.a;
                            r7 = r7.a;
                            r7 = r7.a;
                            r8 = new alft;
                            r8.<init>();
                            if (r3 == 0) goto L_0x005b;
                        L_0x0054:
                            r9 = r3.a;
                            if (r9 == 0) goto L_0x005b;
                        L_0x0058:
                            r8.a(r9);
                        L_0x005b:
                            if (r2 == 0) goto L_0x005f;
                        L_0x005d:
                            r8.a = r2;
                        L_0x005f:
                            r2 = r8.a;
                            if (r2 == 0) goto L_0x0093;
                        L_0x0063:
                            r9 = r8.a;
                            r10 = "snappable";
                            defpackage.akcr.a(r9, r10);
                            r9 = r9.a();
                            r9 = (java.lang.CharSequence) r9;
                            if (r9 == 0) goto L_0x007b;
                        L_0x0072:
                            r9 = r9.length();
                            if (r9 != 0) goto L_0x0079;
                        L_0x0078:
                            goto L_0x007b;
                        L_0x0079:
                            r9 = 0;
                            goto L_0x007c;
                        L_0x007b:
                            r9 = 1;
                        L_0x007c:
                            if (r9 == 0) goto L_0x0087;
                        L_0x007e:
                            r9 = r7.e;
                            r9 = r9.invoke();
                            r9 = (java.lang.String) r9;
                            goto L_0x0090;
                        L_0x0087:
                            r9 = r8.a;
                            defpackage.akcr.a(r9, r10);
                            r9 = r9.a();
                        L_0x0090:
                            r2.a(r9);
                        L_0x0093:
                            r2 = r7.g;
                            r7 = new kqe$ae;
                            r9 = r8.a;
                            if (r9 == 0) goto L_0x00a0;
                        L_0x009b:
                            r9 = r9.a();
                            goto L_0x00a1;
                        L_0x00a0:
                            r9 = r6;
                        L_0x00a1:
                            r7.<init>(r9);
                            r7 = (defpackage.kqe) r7;
                            r2.a(r7);
                            r1 = r1.value;
                            r8.a(r1);
                            if (r4 == 0) goto L_0x00ba;
                        L_0x00b0:
                            r1 = new alfv;
                            r1.<init>();
                            r1.a(r4);
                            r8.c = r1;
                        L_0x00ba:
                            if (r3 == 0) goto L_0x0109;
                        L_0x00bc:
                            r6 = new alfw;
                            r6.<init>();
                            r1 = r3.a;
                            if (r1 == 0) goto L_0x00c8;
                        L_0x00c5:
                            r6.a(r1);
                        L_0x00c8:
                            r1 = r3.b;
                            if (r1 == 0) goto L_0x00cf;
                        L_0x00cc:
                            r6.b(r1);
                        L_0x00cf:
                            r1 = r3.c;
                            if (r1 == 0) goto L_0x00d6;
                        L_0x00d3:
                            r6.d(r1);
                        L_0x00d6:
                            r1 = r3.f;
                            if (r1 == 0) goto L_0x00dd;
                        L_0x00da:
                            r6.e(r1);
                        L_0x00dd:
                            r1 = r3.e;
                            if (r1 == 0) goto L_0x00e6;
                        L_0x00e1:
                            r1 = r1.longValue();
                            goto L_0x00e8;
                        L_0x00e6:
                            r1 = 0;
                        L_0x00e8:
                            r6.a(r1);
                            r1 = r3.d;
                            if (r1 == 0) goto L_0x0109;
                        L_0x00ef:
                            r1 = (java.lang.Number) r1;
                            r1 = r1.longValue();
                            r3 = defpackage.kxs.a;
                            r3 = r3.b();
                            r3 = (java.text.SimpleDateFormat) r3;
                            r4 = new java.util.Date;
                            r4.<init>(r1);
                            r1 = r3.format(r4);
                            r6.c(r1);
                        L_0x0109:
                            r8.b = r6;
                            r8 = (com.google.protobuf.nano.MessageNano) r8;
                            r17 = com.google.protobuf.nano.MessageNano.toByteArray(r8);
                            r10 = r5.a;
                            r11 = r5.b;
                            r12 = r5.c;
                            r13 = r5.d;
                            r14 = r5.e;
                            r15 = r5.f;
                            r1 = r5.g;
                            r2 = "id";
                            defpackage.akcr.b(r10, r2);
                            r2 = "contentUri";
                            defpackage.akcr.b(r11, r2);
                            r2 = "overlayImageUri";
                            defpackage.akcr.b(r15, r2);
                            r2 = new mmi$d;
                            r9 = r2;
                            r16 = r1;
                            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17);
                            return r2;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxr$a$1$1.apply(java.lang.Object):java.lang.Object");
                        }
                    }).c(obj);
                }
            }).d(obj);
        }
    }

    public kxr(mwe mwe, nay nay, mnr mnr, ajdp<kya> ajdp, akbk<String> akbk, kxz kxz, kqf kqf) {
        akcr.b(mwe, "lensRepository");
        akcr.b(nay, "userDataRepository");
        akcr.b(mnr, "persistenceRepository");
        akcr.b(ajdp, "lensesCameraExternalMetadata");
        akcr.b(akbk, "sessionIdGenerate");
        akcr.b(kxz, "lensEntryPointTracker");
        akcr.b(kqf, "analyticsEventHandler");
        this.a = mwe;
        this.b = nay;
        this.c = mnr;
        this.d = ajdp;
        this.e = akbk;
        this.f = kxz;
        this.g = kqf;
    }

    public final ajeb<d> apply(ajdx<d> ajdx) {
        akcr.b(ajdx, "upstream");
        Object a = ajdx.a((ajfc) new a(this));
        akcr.a(a, "upstream.flatMap { reque…Single(request)\n        }");
        return (ajeb) a;
    }
}
