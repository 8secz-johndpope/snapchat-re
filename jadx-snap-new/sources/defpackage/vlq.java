package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.ody.d;
import defpackage.ody.e;
import defpackage.ody.f;
import defpackage.vlp.a;
import defpackage.vlp.a.b;
import defpackage.vlp.a.c;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vlq */
public final class vlq implements vlp {
    final ajxe a = ajxh.a(new g(this));
    final odl b;
    final jwe c;
    final jwb d;
    final odu e;
    final ofr f;
    final admm g;
    final vmg h;
    final ofy i;
    final vll j;
    final ilv k;
    final ajwy<gqr> l;
    final abss m;
    private final ajxe n = ajxh.a(new s(this));
    private final ajxe o = ajxh.a(new f(this));
    private final ajxe p;
    private final abse q;
    private final zgb r;
    private final voo s;

    /* renamed from: vlq$m */
    static final class m extends akcq implements akbk<oee> {
        m(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (oee) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: vlq$s */
    static final class s extends akcs implements akbk<zfw> {
        private /* synthetic */ vlq a;

        s(vlq vlq) {
            this.a = vlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.b.callsite("ImageRendererImpl"));
        }
    }

    /* renamed from: vlq$f */
    static final class f extends akcs implements akbk<jwa> {
        private /* synthetic */ vlq a;

        f(vlq vlq) {
            this.a = vlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.a(this.a.b);
        }
    }

    /* renamed from: vlq$g */
    static final class g extends akcs implements akbk<jwc> {
        private /* synthetic */ vlq a;

        g(vlq vlq) {
            this.a = vlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a();
        }
    }

    /* renamed from: vlq$a */
    public static final class a {
        final abtl a;
        final int b;
        final boolean c;
        final boolean d;
        final boolean e;
        boolean f;

        public a() {
            this(null, 0, false, false, false, false, 63);
        }

        private a(abtl abtl, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            akcr.b(abtl, "imageResolutionHint");
            this.a = abtl;
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        public /* synthetic */ a(abtl abtl, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
            if ((i2 & 1) != 0) {
                abtl = vls.a;
            }
            this(abtl, (i2 & 2) != 0 ? 80 : i, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? true : z4);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a)) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            if ((this.c == aVar.c ? 1 : null) != null) {
                                if ((this.d == aVar.d ? 1 : null) != null) {
                                    if ((this.e == aVar.e ? 1 : null) != null) {
                                        if ((this.f == aVar.f ? 1 : null) != null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            abtl abtl = this.a;
            int hashCode = (((abtl != null ? abtl.hashCode() : 0) * 31) + this.b) * 31;
            int i = this.c;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.d;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.e;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.f;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ImageRenderingConfiguration(imageResolutionHint=");
            stringBuilder.append(this.a);
            stringBuilder.append(", jpegEncodingQuality=");
            stringBuilder.append(this.b);
            stringBuilder.append(", applyEdits=");
            stringBuilder.append(this.c);
            stringBuilder.append(", needRotateOrFlipMediaOverlay=");
            stringBuilder.append(this.d);
            stringBuilder.append(", renderScreenOverlayIntoSpectaclesMedia=");
            stringBuilder.append(this.e);
            stringBuilder.append(", scaleBitmapAtRenderingStage=");
            stringBuilder.append(this.f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: vlq$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ vlq a;
        private /* synthetic */ a b;
        private /* synthetic */ vlw c;
        private /* synthetic */ a d;

        b(vlq vlq, a aVar, vlw vlw, a aVar2) {
            this.a = vlq;
            this.b = aVar;
            this.c = vlw;
            this.d = aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:74:0x01eb  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0288  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0310  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x02e6  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0313  */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0325  */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x031f  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0341  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03b0  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x035e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x03fc  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x040a  */
        /* JADX WARNING: Missing block: B:60:0x019d, code skipped:
            if (r20 == null) goto L_0x019f;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r33 = this;
            r0 = r33;
            r1 = r0.a;
            r2 = r0.b;
            r3 = r0.c;
            r4 = r0.d;
            r5 = r3.a;
            r5 = r5.e;
            r6 = r4.c;
            if (r6 == 0) goto L_0x0015;
        L_0x0012:
            r6 = r3.e;
            goto L_0x0016;
        L_0x0015:
            r6 = 0;
        L_0x0016:
            r8 = r4.c;
            if (r8 == 0) goto L_0x001d;
        L_0x001a:
            r8 = r3.f;
            goto L_0x001e;
        L_0x001d:
            r8 = 0;
        L_0x001e:
            r9 = r4.c;
            if (r9 == 0) goto L_0x0025;
        L_0x0022:
            r9 = r3.g;
            goto L_0x0029;
        L_0x0025:
            r9 = defpackage.ajyw.a;
            r9 = (java.util.List) r9;
        L_0x0029:
            r11 = r9;
            r9 = r3.c;
            r10 = r5.a;
            r15 = "this.mediaType";
            defpackage.akcr.a(r10, r15);
            r10 = r10.intValue();
            r10 = defpackage.abyp.i(r10);
            if (r10 == 0) goto L_0x003e;
        L_0x003d:
            goto L_0x004c;
        L_0x003e:
            if (r8 == 0) goto L_0x004c;
        L_0x0040:
            r10 = r8.d();
            if (r10 == 0) goto L_0x004c;
        L_0x0046:
            r10 = r10.c;
            if (r10 != 0) goto L_0x004b;
        L_0x004a:
            goto L_0x004c;
        L_0x004b:
            r9 = r10;
        L_0x004c:
            r10 = r2.a();
            r12 = defpackage.vlr.c;
            r13 = r10.ordinal();
            r12 = r12[r13];
            r13 = "media";
            switch(r12) {
                case 1: goto L_0x0066;
                case 2: goto L_0x0066;
                case 3: goto L_0x0066;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x0066;
                case 7: goto L_0x0066;
                default: goto L_0x005d;
            };
        L_0x005d:
            r14 = 1;
            r7 = r1.j;
            r7 = r7.a(r5, r6);
            goto L_0x00ef;
        L_0x0066:
            defpackage.akcr.b(r5, r13);
            r12 = r5.q;
            r7 = "media.width";
            defpackage.akcr.a(r12, r7);
            r7 = r12.intValue();
            r12 = r5.p;
            r14 = "media.height";
            defpackage.akcr.a(r12, r14);
            r12 = r12.intValue();
            r7 = java.lang.Math.min(r7, r12);
            if (r10 != 0) goto L_0x0087;
        L_0x0085:
            r14 = 1;
            goto L_0x00a4;
        L_0x0087:
            r12 = defpackage.vot.b;
            r10 = r10.ordinal();
            r10 = r12[r10];
            r14 = 1;
            if (r10 == r14) goto L_0x00dd;
        L_0x0092:
            r12 = 2;
            if (r10 == r12) goto L_0x00cd;
        L_0x0095:
            r12 = 3;
            if (r10 == r12) goto L_0x00c5;
        L_0x0098:
            r12 = 4;
            r17 = 1056637821; // 0x3efb037d float:0.490261 double:5.220484475E-315;
            r18 = 1063198619; // 0x3f5f1f9b float:0.871576 double:5.252899124E-315;
            if (r10 == r12) goto L_0x00b8;
        L_0x00a1:
            r12 = 5;
            if (r10 == r12) goto L_0x00ab;
        L_0x00a4:
            r10 = new abtl;
            r10.<init>(r7, r7);
        L_0x00a9:
            r7 = r10;
            goto L_0x00ef;
        L_0x00ab:
            r10 = new abtl;
            r7 = (float) r7;
            r12 = r7 * r17;
            r12 = (int) r12;
            r7 = r7 * r18;
            r7 = (int) r7;
            r10.<init>(r12, r7);
            goto L_0x00a9;
        L_0x00b8:
            r10 = new abtl;
            r7 = (float) r7;
            r12 = r7 * r18;
            r12 = (int) r12;
            r7 = r7 * r17;
            r7 = (int) r7;
            r10.<init>(r12, r7);
            goto L_0x00a9;
        L_0x00c5:
            r10 = new abtl;
            r12 = r7 << 1;
            r10.<init>(r12, r7);
            goto L_0x00a9;
        L_0x00cd:
            r10 = new abtl;
            r7 = (float) r7;
            r12 = defpackage.vou.b;
            r12 = r12 * r7;
            r12 = (int) r12;
            r17 = defpackage.vou.b;
            r7 = r7 * r17;
            r7 = (int) r7;
            r10.<init>(r12, r7);
            goto L_0x00a9;
        L_0x00dd:
            r10 = new abtl;
            r7 = (float) r7;
            r12 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
            r12 = r12 * r7;
            r12 = (int) r12;
            r17 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
            r7 = r7 * r17;
            r7 = (int) r7;
            r10.<init>(r12, r7);
            goto L_0x00a9;
        L_0x00ef:
            r10 = r4.a;
            r12 = r10.b();
            if (r12 <= 0) goto L_0x0153;
        L_0x00f7:
            r12 = r10.c();
            if (r12 <= 0) goto L_0x0153;
        L_0x00fd:
            r12 = r10.b();
            r12 = (float) r12;
            r14 = r7.b();
            r14 = (float) r14;
            r12 = r12 / r14;
            r14 = r10.c();
            r14 = (float) r14;
            r0 = r7.c();
            r0 = (float) r0;
            r14 = r14 / r0;
            r0 = java.lang.Math.min(r12, r14);
            r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
            if (r14 <= 0) goto L_0x0145;
        L_0x011d:
            r12 = r1.m;
            r12 = r12.k();
            if (r12 != 0) goto L_0x0126;
        L_0x0125:
            goto L_0x0145;
        L_0x0126:
            r0 = new vlo;
            r1 = new java.lang.StringBuilder;
            r2 = "Invalid size hint, bitmap will be scaled up! Size hint: ";
            r1.<init>(r2);
            r1.append(r10);
            r2 = ", output resolution: ";
            r1.append(r2);
            r1.append(r7);
            r1 = r1.toString();
            r10 = 0;
            r0.<init>(r1, r10);
            r0 = (java.lang.Throwable) r0;
            throw r0;
        L_0x0145:
            r10 = 0;
            r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r0 = java.lang.Math.min(r0, r12);
            r12 = r11;
            r10 = (double) r0;
            r0 = r7.a(r10);
            goto L_0x0155;
        L_0x0153:
            r12 = r11;
            r0 = r7;
        L_0x0155:
            r10 = "calculatedResolution";
            defpackage.akcr.a(r0, r10);
            r0 = r1.a(r0);
            r10 = new vlx$a;
            r10.<init>();
            r14 = "mediaSource";
            defpackage.akcr.b(r3, r14);
            r10 = (defpackage.vlx.a) r10;
            r10.a = r3;
            r11 = "inputBitmap";
            defpackage.akcr.b(r9, r11);
            r10 = (defpackage.vlx.a) r10;
            r10.b = r9;
            r9 = "outputBitmapSize";
            defpackage.akcr.b(r0, r9);
            r10 = (defpackage.vlx.a) r10;
            r10.c = r0;
            r0 = r3.b;
            r19 = r11;
            r11 = r3.a;
            r11 = r11.d;
            r20 = new java.util.ArrayList;
            r20.<init>();
            r21 = r14;
            r14 = r20;
            r14 = (java.util.List) r14;
            if (r6 == 0) goto L_0x019f;
        L_0x0193:
            r20 = r6.a();
            if (r20 == 0) goto L_0x019f;
        L_0x0199:
            r20 = r20.a();
            if (r20 != 0) goto L_0x01a1;
        L_0x019f:
            r20 = defpackage.acae.UNFILTERED;
        L_0x01a1:
            r28 = r9;
            r9 = r20;
            r20 = r4;
            r4 = "edits?.filters?.selected…sualFilterType.UNFILTERED";
            defpackage.akcr.a(r9, r4);
            if (r6 == 0) goto L_0x01b5;
        L_0x01ae:
            r4 = r6.n();
            r24 = r4;
            goto L_0x01b7;
        L_0x01b5:
            r24 = 0;
        L_0x01b7:
            r4 = r5.a;
            defpackage.akcr.a(r4, r15);
            r4 = r4.intValue();
            r4 = defpackage.abyp.c(r4);
            if (r4 == 0) goto L_0x01d1;
        L_0x01c6:
            r4 = r5.b;
            if (r4 == 0) goto L_0x01d1;
        L_0x01ca:
            r4 = r4.intValue();
            r18 = r8;
            goto L_0x01d4;
        L_0x01d1:
            r18 = r8;
            r4 = 0;
        L_0x01d4:
            r8 = r5.c;
            r29 = r12;
            r12 = "media.isHorizontallyFlipped";
            defpackage.akcr.a(r8, r12);
            r8 = r8.booleanValue();
            r4 = defpackage.voq.a(r4, r8);
            r8 = r4.isIdentity();
            if (r8 != 0) goto L_0x01f3;
        L_0x01eb:
            r8 = new vlz;
            r8.<init>(r4);
            r14.add(r8);
        L_0x01f3:
            defpackage.akcr.b(r5, r13);
            r4 = "outputSpaceResolution";
            defpackage.akcr.b(r7, r4);
            r4 = defpackage.abyj.b(r5);
            r8 = defpackage.abyj.c(r5);
            r12 = defpackage.voq.a(r4, r8);
            if (r12 != 0) goto L_0x0235;
        L_0x0209:
            r12 = new abuf;
            r13 = r8.b();
            r30 = r3;
            r3 = r8.c();
            r31 = r10;
            r10 = r4.b();
            r4 = r4.c();
            r12.<init>(r13, r3, r10, r4);
            r3 = r12.a();
            r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r3 = r4 - r3;
            r3 = r4 / r3;
            r10 = r12.b();
            r10 = r4 - r10;
            r10 = r4 / r10;
            goto L_0x023d;
        L_0x0235:
            r30 = r3;
            r31 = r10;
            r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        L_0x023d:
            r4 = defpackage.voq.a(r8, r7);
            if (r4 != 0) goto L_0x0275;
        L_0x0243:
            r4 = new abuf;
            r12 = r7.b();
            r13 = r7.c();
            r32 = r11;
            r11 = r8.b();
            r8 = r8.c();
            r4.<init>(r12, r13, r11, r8);
            r8 = r4.a();
            r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r8 = r11 - r8;
            r8 = r11 / r8;
            r4 = r4.b();
            r4 = r11 - r4;
            r4 = r11 / r4;
            r11 = java.lang.Math.max(r8, r4);
            r8 = r8 / r11;
            r3 = r3 * r8;
            r4 = r4 / r11;
            r10 = r10 * r4;
            goto L_0x0277;
        L_0x0275:
            r32 = r11;
        L_0x0277:
            r4 = r5.a;
            r8 = "media.mediaType";
            defpackage.akcr.a(r4, r8);
            r4 = r4.intValue();
            r4 = defpackage.abyp.j(r4);
            if (r4 == 0) goto L_0x028b;
        L_0x0288:
            r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r3 = r3 * r4;
        L_0x028b:
            r4 = new ajxm;
            r3 = java.lang.Float.valueOf(r3);
            r10 = java.lang.Float.valueOf(r10);
            r4.<init>(r3, r10);
            r3 = defpackage.abyj.c(r5);
            r3 = defpackage.voq.a(r6, r3, r7);
            r10 = r1.f;
            r11 = r7.f();
            r11 = (float) r11;
            r12 = r4.a;
            r12 = (java.lang.Number) r12;
            r12 = r12.floatValue();
            r26 = r12 * r3;
            r4 = r4.b;
            r4 = (java.lang.Number) r4;
            r4 = r4.floatValue();
            r27 = r4 * r3;
            r22 = r10;
            r23 = r9;
            r25 = r11;
            r3 = r22.a(r23, r24, r25, r26, r27);
            if (r3 == 0) goto L_0x02ca;
        L_0x02c7:
            r14.add(r3);
        L_0x02ca:
            r3 = r5.a;
            defpackage.akcr.a(r3, r8);
            r3 = r3.intValue();
            r4 = r5.a;
            defpackage.akcr.a(r4, r15);
            r4 = r4.intValue();
            r4 = defpackage.abyp.c(r4);
            r3 = defpackage.abyp.j(r3);
            if (r3 == 0) goto L_0x0310;
        L_0x02e6:
            r3 = r2.a();
            r8 = defpackage.vjm.SPECTACLES_NEWPORT;
            r9 = "mediaUri.toString()";
            if (r3 != r8) goto L_0x0300;
        L_0x02f0:
            r3 = r1.f;
            r0 = r0.toString();
            defpackage.akcr.a(r0, r9);
            r8 = r32;
            r0 = r3.b(r0, r8, r4);
            goto L_0x0311;
        L_0x0300:
            r8 = r32;
            r3 = r1.f;
            r0 = r0.toString();
            defpackage.akcr.a(r0, r9);
            r0 = r3.a(r0, r8, r4);
            goto L_0x0311;
        L_0x0310:
            r0 = 0;
        L_0x0311:
            if (r0 == 0) goto L_0x0316;
        L_0x0313:
            r14.add(r0);
        L_0x0316:
            r10 = r31;
            r10.a(r14);
            r0 = r1.f;
            if (r6 == 0) goto L_0x0325;
        L_0x031f:
            r3 = r6.n();
            r12 = r3;
            goto L_0x0326;
        L_0x0325:
            r12 = 0;
        L_0x0326:
            r3 = r7.f();
            r13 = (float) r3;
            r3 = r30;
            r3 = r3.d;
            r6 = r10;
            r10 = r0;
            r0 = r19;
            r11 = r29;
            r8 = r21;
            r9 = 1;
            r14 = r7;
            r9 = r15;
            r15 = r3;
            r3 = r10.a(r11, r12, r13, r14, r15);
            if (r3 == 0) goto L_0x0344;
        L_0x0341:
            r6.a(r3);
        L_0x0344:
            r3 = r2.a();
            r4 = new java.util.ArrayList;
            r4.<init>();
            r4 = (java.util.List) r4;
            r10 = r5.a;
            defpackage.akcr.a(r10, r9);
            r10 = r10.intValue();
            r10 = defpackage.abyp.i(r10);
            if (r10 == 0) goto L_0x03b0;
        L_0x035e:
            if (r18 == 0) goto L_0x0384;
        L_0x0360:
            r10 = r18.d();
            if (r10 == 0) goto L_0x0384;
        L_0x0366:
            r11 = defpackage.vlr.a;
            r12 = r3.ordinal();
            r11 = r11[r12];
            r12 = 1;
            if (r11 == r12) goto L_0x037c;
        L_0x0371:
            r11 = new vma;
            r10 = r10.c;
            r11.<init>(r10);
        L_0x0378:
            r4.add(r11);
            goto L_0x0384;
        L_0x037c:
            r11 = new vmc;
            r10 = r10.c;
            r11.<init>(r10);
            goto L_0x0378;
        L_0x0384:
            r10 = r20;
            r10 = r10.e;
            if (r10 == 0) goto L_0x03c2;
        L_0x038a:
            if (r18 == 0) goto L_0x03c2;
        L_0x038c:
            r10 = r18.c();
            if (r10 == 0) goto L_0x03c2;
        L_0x0392:
            r11 = defpackage.vlr.b;
            r3 = r3.ordinal();
            r3 = r11[r3];
            r11 = 1;
            if (r3 == r11) goto L_0x03a8;
        L_0x039d:
            r3 = new vmb;
            r10 = r10.c;
            r3.<init>(r10);
        L_0x03a4:
            r4.add(r3);
            goto L_0x03c2;
        L_0x03a8:
            r3 = new vmd;
            r10 = r10.c;
            r3.<init>(r10);
            goto L_0x03a4;
        L_0x03b0:
            if (r18 == 0) goto L_0x03c2;
        L_0x03b2:
            r3 = r18.c();
            if (r3 == 0) goto L_0x03c2;
        L_0x03b8:
            r10 = new vma;
            r3 = r3.c;
            r10.<init>(r3);
            r4.add(r10);
        L_0x03c2:
            r6.a(r4);
            r3 = r5.a;
            defpackage.akcr.a(r3, r9);
            r3 = r3.intValue();
            r3 = defpackage.abyp.i(r3);
            if (r3 == 0) goto L_0x03f6;
        L_0x03d4:
            r3 = r2.a();
            r4 = defpackage.vjm.SPECTACLES_NEWPORT;
            if (r3 == r4) goto L_0x03f6;
        L_0x03dc:
            r3 = r5.a();
            r4 = "media.mediaTypeEnum";
            defpackage.akcr.a(r3, r4);
            r2 = r2.a();
            r2 = defpackage.vos.a(r3, r2, r7);
            r1 = r1.f;
            r1 = r1.a(r2);
            r6.a(r1);
        L_0x03f6:
            r1 = new vlx;
            r10 = r6.a;
            if (r10 != 0) goto L_0x03ff;
        L_0x03fc:
            defpackage.akcr.a(r8);
        L_0x03ff:
            r11 = r6.b;
            if (r11 != 0) goto L_0x0406;
        L_0x0403:
            defpackage.akcr.a(r0);
        L_0x0406:
            r12 = r6.c;
            if (r12 != 0) goto L_0x040d;
        L_0x040a:
            defpackage.akcr.a(r28);
        L_0x040d:
            r0 = r6.d;
            r13 = r0;
            r13 = (java.util.List) r13;
            r14 = 0;
            r9 = r1;
            r9.<init>(r10, r11, r12, r13, r14);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vlq$b.call():java.lang.Object");
        }
    }

    /* renamed from: vlq$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vlq a;
        private /* synthetic */ a b;

        c(vlq vlq, a aVar) {
            this.a = vlq;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vlx vlx = (vlx) obj;
            akcr.b(vlx, "it");
            obj = ajdx.a((ajea) new h(this.a, vlx, this.b));
            akcr.a(obj, "Single.create { emitter …Success(result)\n        }");
            return obj;
        }
    }

    /* renamed from: vlq$d */
    static final class d<T> implements ajfb<vly> {
        private /* synthetic */ vlq a;
        private /* synthetic */ a b;

        d(vlq vlq, a aVar) {
            this.a = vlq;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            iol iol;
            obj = (vly) obj;
            vlq vlq = this.a;
            a aVar = this.b;
            akcr.a(obj, "it");
            if (aVar instanceof b) {
                iol = iol.IMAGE_THUMBNAIL_GENERATE;
            } else if (aVar instanceof defpackage.vlp.a.d) {
                iol = iol.IMAGE_SEND_OR_POST;
            } else if (aVar instanceof a.a) {
                iol = iol.IMAGE_EXPORT;
            } else if (aVar instanceof c) {
                iol = iol.IMAGE_MEMORIES_BACK_UP;
            } else {
                throw new ajxk();
            }
            kaz kaz = obj.b.b;
            kaz kaz2 = obj.c;
            boolean a = obj.a();
            Bitmap bitmap = null;
            if ((kaz.isDisposed() ^ 1) == 0) {
                kaz = null;
            }
            Bitmap a2 = kaz != null ? jwz.a(kaz) : null;
            if (kaz2 != null) {
                if ((kaz2.isDisposed() ^ 1) == 0) {
                    kaz2 = null;
                }
                if (kaz2 != null) {
                    bitmap = jwz.a(kaz2);
                }
            }
            vlq.k.c(iol.a("success", a), 1);
            if (a2 != null) {
                vlq.k.b((ily) iol.IMAGE_BITMAP_SIZE_BEFORE, (long) a2.getByteCount());
            }
            if (bitmap != null) {
                vlq.k.b((ily) iol.IMAGE_BITMAP_SIZE_AFTER, (long) bitmap.getByteCount());
            }
        }
    }

    /* renamed from: vlq$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (vly) obj;
            akcr.b(obj, "it");
            return obj.a() ? ajdx.b(obj) : ajdx.b(obj.a);
        }
    }

    /* renamed from: vlq$h */
    static final class h<T> implements ajea<T> {
        private /* synthetic */ vlq a;
        private /* synthetic */ vlx b;
        private /* synthetic */ a c;

        h(vlq vlq, vlx vlx, a aVar) {
            this.a = vlq;
            this.b = vlx;
            this.c = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0054 A:{Catch:{ Exception -> 0x0081 }} */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A:{Catch:{ Exception -> 0x0081 }} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A:{Catch:{ Exception -> 0x0081 }} */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A:{Catch:{ Exception -> 0x0081 }} */
        /* JADX WARNING: Missing block: B:20:0x0071, code skipped:
            if (r1 != null) goto L_0x0074;
     */
        public final void subscribe(defpackage.ajdy<defpackage.vly> r13) {
            /*
            r12 = this;
            r0 = "emitter";
            defpackage.akcr.b(r13, r0);
            r0 = 0;
            r1 = r12.b;	 Catch:{ Exception -> 0x0081 }
            r1 = r1.c;	 Catch:{ Exception -> 0x0081 }
            r2 = r12.a;	 Catch:{ Exception -> 0x0081 }
            r2 = r2.b();	 Catch:{ Exception -> 0x0081 }
            r3 = r12.b;	 Catch:{ Exception -> 0x0081 }
            r3 = r3.b;	 Catch:{ Exception -> 0x0081 }
            r4 = r1.b();	 Catch:{ Exception -> 0x0081 }
            r5 = r1.c();	 Catch:{ Exception -> 0x0081 }
            r6 = r12.b;	 Catch:{ Exception -> 0x0081 }
            r6 = r6.d;	 Catch:{ Exception -> 0x0081 }
            r2 = r2.a(r3, r4, r5, r6);	 Catch:{ Exception -> 0x0081 }
            r3 = "bitmapFactory.transformA…gRequest.transformations)";
            defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x0081 }
            r3 = r12.c;	 Catch:{ Exception -> 0x0081 }
            r3 = r3.f;	 Catch:{ Exception -> 0x0081 }
            if (r3 == 0) goto L_0x0031;
        L_0x002f:
            r3 = r2;
            goto L_0x0032;
        L_0x0031:
            r3 = r0;
        L_0x0032:
            if (r3 == 0) goto L_0x0073;
        L_0x0034:
            r4 = defpackage.jwz.a(r3);	 Catch:{ Exception -> 0x0081 }
            r5 = r4.getWidth();	 Catch:{ Exception -> 0x0081 }
            r6 = r1.b();	 Catch:{ Exception -> 0x0081 }
            if (r5 != r6) goto L_0x004f;
        L_0x0042:
            r5 = r4.getHeight();	 Catch:{ Exception -> 0x0081 }
            r6 = r1.c();	 Catch:{ Exception -> 0x0081 }
            if (r5 == r6) goto L_0x004d;
        L_0x004c:
            goto L_0x004f;
        L_0x004d:
            r5 = 0;
            goto L_0x0050;
        L_0x004f:
            r5 = 1;
        L_0x0050:
            if (r5 == 0) goto L_0x0054;
        L_0x0052:
            r7 = r4;
            goto L_0x0055;
        L_0x0054:
            r7 = r0;
        L_0x0055:
            if (r7 == 0) goto L_0x0070;
        L_0x0057:
            r4 = r12.a;	 Catch:{ Exception -> 0x0081 }
            r6 = r4.b();	 Catch:{ Exception -> 0x0081 }
            r8 = r1.b();	 Catch:{ Exception -> 0x0081 }
            r9 = r1.c();	 Catch:{ Exception -> 0x0081 }
            r10 = 1;
            r11 = "ImageRendererImpl";
            r1 = r6.a(r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x0081 }
            r3.dispose();	 Catch:{ Exception -> 0x0081 }
            goto L_0x0071;
        L_0x0070:
            r1 = r0;
        L_0x0071:
            if (r1 != 0) goto L_0x0074;
        L_0x0073:
            r1 = r2;
        L_0x0074:
            r2 = "transformedRefCountBitma…transformedRefCountBitmap";
            defpackage.akcr.a(r1, r2);	 Catch:{ Exception -> 0x0081 }
            r2 = new vly;	 Catch:{ Exception -> 0x0081 }
            r3 = r12.b;	 Catch:{ Exception -> 0x0081 }
            r2.<init>(r3, r1);	 Catch:{ Exception -> 0x0081 }
            goto L_0x008b;
        L_0x0081:
            r1 = move-exception;
            r2 = new vly;
            r3 = r12.b;
            r1 = (java.lang.Throwable) r1;
            r2.<init>(r3, r0, r1);
        L_0x008b:
            r13.a(r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vlq$h.subscribe(ajdy):void");
        }
    }

    /* renamed from: vlq$i */
    static final class i<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ vlq a;
        final /* synthetic */ abyi b;
        final /* synthetic */ a c;
        final /* synthetic */ idd d;
        final /* synthetic */ a e;
        final /* synthetic */ ajei f;

        i(vlq vlq, abyi abyi, a aVar, idd idd, a aVar2, ajei ajei) {
            this.a = vlq;
            this.b = abyi;
            this.c = aVar;
            this.d = idd;
            this.e = aVar2;
            this.f = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odx odx = (odx) obj;
            String str = "reader";
            akcr.b(odx, str);
            Object p = ajdp.b((Callable) new Callable<T>() {
                public final /* synthetic */ Object call() {
                    return odx.a();
                }
            }).k((ajfc) new ajfc<T, ajdt<? extends R>>(this) {
                private /* synthetic */ i a;

                /* renamed from: vlq$i$2$1 */
                static final class 1<T, R> implements ajfc<T, R> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        jwu jwu = (jwu) obj;
                        akcr.b(jwu, "it");
                        vlw.a a = new vlw.a().a(jwu.a);
                        a.d = (long) jwu.b;
                        return a;
                    }
                }

                /* renamed from: vlq$i$2$2 */
                static final class 2<T, R> implements ajfc<T, R> {
                    public static final 2 a = new 2();

                    2() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        kaz kaz = (kaz) obj;
                        akcr.b(kaz, "it");
                        return new vlw.a().a(kaz);
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    vlq vlq;
                    akcr.b((odx) obj, "<anonymous parameter 0>");
                    if (this.a.c instanceof b) {
                        obj = this.a.b.e.a;
                        akcr.a(obj, "this.mediaType");
                        if (abyp.a(obj.intValue())) {
                            vlq = this.a.a;
                            idd idd = this.a.d;
                            FileInputStream f = odx.f();
                            List list = ((b) this.a.c).b;
                            admm.a aVar = ((b) this.a.c).c;
                            a aVar2 = this.a.e;
                            admm admm = vlq.g;
                            ide ide = vlq.b;
                            Object fd = f.getFD();
                            akcr.a(fd, "mediaStream.fd");
                            return admm.a(ide, idd, fd, list, aVar2.a, aVar).p(1.a);
                        }
                    }
                    vlq = this.a.a;
                    idd idd2 = this.a.d;
                    Uri e = odx.e();
                    aeew aeew = this.a.b.e;
                    a aVar3 = this.a.e;
                    jwc jwc = (jwc) vlq.a.b();
                    jxa.a aVar4 = new jxa.a();
                    abtl b = aVar3.a.equals(vls.a) ? abyj.b(aeew) : aVar3.a;
                    Integer num = aeew.b;
                    if ((num != null ? num.intValue() : 0) % 180 != 0) {
                        b = b.a();
                        akcr.a((Object) b, "resolution.transpose()");
                    }
                    abtl a = vlq.a(b);
                    aVar4.a(a.b(), a.c(), false);
                    obj = jwc.a(e, idd2, aVar4.b());
                    akcr.a(obj, "bitmapLoader.loadBitmap(…               }.build())");
                    return obj.f(2.a).i();
                }
            }).n(new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ i a;

                /* JADX WARNING: Missing block: B:8:0x006a, code skipped:
            if (r0 == null) goto L_0x006c;
     */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r12) {
                    /*
                    r11 = this;
                    r12 = (defpackage.vlw.a) r12;
                    r0 = "inputBuilder";
                    defpackage.akcr.b(r12, r0);
                    r0 = r7;
                    r0 = r0.c();
                    r1 = r12;
                    r1 = (defpackage.vlw.a) r1;
                    r1.e = r0;
                    r1 = r11.a;
                    r1 = r1.a;
                    r2 = r11.a;
                    r2 = r2.d;
                    r3 = r11.a;
                    r9 = r3.f;
                    r3 = r11.a;
                    r3 = r3.b;
                    r3 = r3.e;
                    r3 = r3.a;
                    r4 = "this.mediaType";
                    defpackage.akcr.a(r3, r4);
                    r3 = r3.intValue();
                    r3 = defpackage.abyp.i(r3);
                    r10 = r3 ^ 1;
                    if (r0 == 0) goto L_0x006c;
                L_0x0037:
                    r3 = r0.E();
                    if (r3 == 0) goto L_0x003e;
                L_0x003d:
                    goto L_0x003f;
                L_0x003e:
                    r0 = 0;
                L_0x003f:
                    r4 = r0;
                    if (r4 == 0) goto L_0x006c;
                L_0x0042:
                    r3 = r1.i;
                    r5 = new abtl;
                    r0 = r4.w();
                    r6 = r4.x();
                    r5.<init>(r0, r6);
                    r0 = r1.b;
                    r6 = "ImageRendererImpl";
                    r6 = r0.getAttributionFor(r6);
                    r7 = r2;
                    r8 = r10;
                    r0 = r3.a(r4, r5, r6, r7, r8);
                    r3 = new vlq$l;
                    r3.<init>(r1, r2, r10, r9);
                    r3 = (defpackage.ajfb) r3;
                    r0 = r0.c(r3);
                    if (r0 != 0) goto L_0x0079;
                L_0x006c:
                    r0 = defpackage.ajyw.a;
                    r0 = (java.util.List) r0;
                    r0 = defpackage.ajdx.b(r0);
                    r1 = "Single.just(emptyList())";
                    defpackage.akcr.a(r0, r1);
                L_0x0079:
                    r1 = new vlq$i$3$1;
                    r1.<init>(r12);
                    r1 = (defpackage.ajfc) r1;
                    r12 = r0.f(r1);
                    return r12;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vlq$i$3.apply(java.lang.Object):java.lang.Object");
                }
            }).n(new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ i a;

                public final /* synthetic */ Object apply(Object obj) {
                    final vlw.a aVar = (vlw.a) obj;
                    akcr.b(aVar, "inputBuilder");
                    return odx.k().f(new ajfc<T, R>(this) {
                        private /* synthetic */ 4 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            vlw.a aVar;
                            Optional optional = (Optional) obj;
                            akcr.b(optional, "optional");
                            ohz ohz = (ohz) optional.orNull();
                            if (ohz != null) {
                                ohz = ohz.b(this.a.a.d);
                                if (ohz != null) {
                                    ajvv.a((ajej) ohz, this.a.a.f);
                                    aVar = aVar;
                                    aVar.f = ohz;
                                    return aVar;
                                }
                            }
                            ohz = null;
                            aVar = aVar;
                            aVar.f = ohz;
                            return aVar;
                        }
                    });
                }
            }).p(new ajfc<T, R>(this) {
                private /* synthetic */ i a;

                public final /* synthetic */ Object apply(Object obj) {
                    vlw.a aVar = (vlw.a) obj;
                    akcr.b(aVar, "it");
                    abyi abyi = this.a.b;
                    String str = "mediaPackage";
                    akcr.b(abyi, str);
                    aVar = aVar;
                    aVar.a = abyi;
                    Uri e = odx.e();
                    String str2 = "mediaUri";
                    akcr.b(e, str2);
                    aVar = aVar;
                    aVar.b = e;
                    abyi abyi2 = aVar.a;
                    if (abyi2 == null) {
                        akcr.a(str);
                    }
                    Uri uri = aVar.b;
                    if (uri == null) {
                        akcr.a(str2);
                    }
                    kaz kaz = aVar.c;
                    if (kaz == null) {
                        akcr.a("bitmap");
                    }
                    return new vlw(abyi2, uri, kaz, aVar.d, aVar.e, aVar.f, aVar.g, (byte) 0);
                }
            });
            akcr.a(p, "Observable.fromCallable …                        }");
            Object obj2 = this.a.l.get();
            akcr.a(obj2, "exceptionTracker.get()");
            gqr gqr = (gqr) obj2;
            idd idd = this.d;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            akcr.b(p, "receiver$0");
            akcr.b(odx, str);
            akcr.b(gqr, "exceptionTracker");
            akcr.b(idd, "attributedCallsite");
            akcr.b(atomicBoolean, "disposed");
            obj = p.a((ajev) new d(odx)).q(new e(atomicBoolean, gqr, idd, odx)).b((ajev) new f(odx, atomicBoolean));
            akcr.a(obj, "this.doFinally {\n       … disposed.set(true)\n    }");
            return obj.b((ajdw) this.a.a().f());
        }
    }

    /* renamed from: vlq$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ vlq a;
        private /* synthetic */ vlw b;
        private /* synthetic */ vly c;
        private /* synthetic */ idd d;
        private /* synthetic */ a e;

        j(vlq vlq, vlw vlw, vly vly, idd idd, a aVar) {
            this.a = vlq;
            this.b = vlw;
            this.c = vly;
            this.d = idd;
            this.e = aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:76:0x01d9 in {2, 3, 12, 13, 16, 17, 27, 28, 33, 41, 42, 43, 44, 45, 46, 47, 50, 53, 55, 57, 61, 62, 65, 67, 69, 73, 75} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.abyi a(defpackage.odt r22) {
            /*
            r21 = this;
            r1 = r21;
            r0 = "builder";
            r2 = r22;
            defpackage.akcr.b(r2, r0);
            r0 = r1.b;
            r0 = r0.a;
            r0 = r0.e;
            r3 = r1.c;
            r3 = r3.b();
            r4 = defpackage.jwz.a(r3);
            r5 = r1.c;
            r5 = r5.b;
            r5 = r5.c;
            r6 = r4.getWidth();
            r4 = r4.getHeight();
            r7 = r5.b();
            r6 = java.lang.Math.min(r7, r6);
            r5 = r5.c();
            r4 = java.lang.Math.min(r5, r4);
            r5 = new abtl;
            r5.<init>(r6, r4);
            r4 = r0.x;
            r6 = java.lang.Boolean.TRUE;
            r4 = defpackage.akcr.a(r4, r6);
            if (r4 == 0) goto L_0x0049;
            r4 = defpackage.abyg.ENCODE_BITMAP_TO_PNG;
            goto L_0x004b;
            r4 = defpackage.abyg.ENCODE_BITMAP_TO_JPEG;
            r7 = r4;
            r2 = r22.a();
            r2 = (java.io.Closeable) r2;
            r10 = 0;
            r11 = r2;	 Catch:{ Throwable -> 0x01d2 }
            r11 = (defpackage.odt) r11;	 Catch:{ Throwable -> 0x01d2 }
            r4 = r11.c();	 Catch:{ Throwable -> 0x01d2 }
            r12 = r4;	 Catch:{ Throwable -> 0x01d2 }
            r12 = (java.io.Closeable) r12;	 Catch:{ Throwable -> 0x01d2 }
            r9 = r12;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r9 = (java.io.OutputStream) r9;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r4 = r1.a;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r4 = r4.h;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r6 = new vmj;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r8 = r1.d;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r13 = r0.h;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r14 = r1.b;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r14 = r14.a;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r14 = r14.b;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r6.<init>(r8, r13, r14);	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r8 = new abyf;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r16 = 0;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r13 = r1.e;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r13 = r13.b;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r17 = r5.b();	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r18 = r5.c();	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r20 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r15 = r8;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r19 = r13;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r15.<init>(r16, r17, r18, r19, r20);	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r5 = r6;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r6 = r3;	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            r4 = r4.a(r5, r6, r7, r8, r9);	 Catch:{ Throwable -> 0x01c4, all -> 0x01c1 }
            defpackage.akax.a(r12, r10);	 Catch:{ Throwable -> 0x01d2 }
            r5 = "capturedMediaMetadataBeforeTranscoding";	 Catch:{ Throwable -> 0x01d2 }
            defpackage.akcr.b(r0, r5);	 Catch:{ Throwable -> 0x01d2 }
            r5 = "imageEncodingResult";	 Catch:{ Throwable -> 0x01d2 }
            defpackage.akcr.b(r4, r5);	 Catch:{ Throwable -> 0x01d2 }
            r5 = defpackage.abyj.e(r0);	 Catch:{ Throwable -> 0x01d2 }
            r6 = r5.a;	 Catch:{ Throwable -> 0x01d2 }
            r7 = "mediaType";	 Catch:{ Throwable -> 0x01d2 }
            defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x01d2 }
            r6 = r6.intValue();	 Catch:{ Throwable -> 0x01d2 }
            r6 = defpackage.abyp.f(r6);	 Catch:{ Throwable -> 0x01d2 }
            if (r6 == 0) goto L_0x00be;	 Catch:{ Throwable -> 0x01d2 }
            r6 = defpackage.aesf.PSYCHOMANTIS;	 Catch:{ Throwable -> 0x01d2 }
            r6 = r6.a();	 Catch:{ Throwable -> 0x01d2 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Throwable -> 0x01d2 }
            goto L_0x00c0;	 Catch:{ Throwable -> 0x01d2 }
            r6 = r5.a;	 Catch:{ Throwable -> 0x01d2 }
            r5.a = r6;	 Catch:{ Throwable -> 0x01d2 }
            r6 = r4.c;	 Catch:{ Throwable -> 0x01d2 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Throwable -> 0x01d2 }
            r5.q = r6;	 Catch:{ Throwable -> 0x01d2 }
            r6 = r4.d;	 Catch:{ Throwable -> 0x01d2 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Throwable -> 0x01d2 }
            r5.p = r6;	 Catch:{ Throwable -> 0x01d2 }
            r4 = r4.b;	 Catch:{ Throwable -> 0x01d2 }
            if (r4 == 0) goto L_0x00d9;	 Catch:{ Throwable -> 0x01d2 }
            r4 = r4.length;	 Catch:{ Throwable -> 0x01d2 }
            r6 = (long) r4;	 Catch:{ Throwable -> 0x01d2 }
            goto L_0x00db;	 Catch:{ Throwable -> 0x01d2 }
            r6 = 0;	 Catch:{ Throwable -> 0x01d2 }
            r4 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x01d2 }
            r5.o = r4;	 Catch:{ Throwable -> 0x01d2 }
            r4 = 0;	 Catch:{ Throwable -> 0x01d2 }
            r6 = java.lang.Integer.valueOf(r4);	 Catch:{ Throwable -> 0x01d2 }
            r5.b = r6;	 Catch:{ Throwable -> 0x01d2 }
            r6 = java.lang.Boolean.FALSE;	 Catch:{ Throwable -> 0x01d2 }
            r5.c = r6;	 Catch:{ Throwable -> 0x01d2 }
            r6 = r1.a;	 Catch:{ Throwable -> 0x01d2 }
            r6 = ((defpackage.oee) r6.p.b());	 Catch:{ Throwable -> 0x01d2 }
            r6.a(r3, r5);	 Catch:{ Throwable -> 0x01d2 }
            r6 = r1.a;	 Catch:{ Throwable -> 0x01d2 }
            r6 = ((defpackage.oee) r6.p.b());	 Catch:{ Throwable -> 0x01d2 }
            r6.b(r3, r5);	 Catch:{ Throwable -> 0x01d2 }
            r3 = r1.e;	 Catch:{ Throwable -> 0x01d2 }
            r3 = r3.c;	 Catch:{ Throwable -> 0x01d2 }
            if (r3 != 0) goto L_0x01a2;
            r3 = r1.b;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r3 = r3.f;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r3 == 0) goto L_0x01a2;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r1.d;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r3 = r3.b(r6);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r3 == 0) goto L_0x01a2;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r1.e;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r6.d;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r6 == 0) goto L_0x011a;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r3;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            goto L_0x011b;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r10;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r6 == 0) goto L_0x019b;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r7 = r1.a;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r8 = r1.d;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r9 = r0.b;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r9 == 0) goto L_0x0129;
            r4 = r9.intValue();	 Catch:{ Throwable -> 0x01d2 }
            r0 = r0.c;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r9 = "media.isHorizontallyFlipped";	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            defpackage.akcr.a(r0, r9);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r9 = new ohz$a;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r9.<init>(r8);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r6.a;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r6.entrySet();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r6 = r6.iterator();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = r6.hasNext();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r12 == 0) goto L_0x0193;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = r6.next();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = (java.util.Map.Entry) r12;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r13 = r12.getKey();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r13 = (defpackage.ohy) r13;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = r12.getValue();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = (defpackage.ohx) r12;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r14 = defpackage.ohy.SKY_FILTER;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r13 != r14) goto L_0x0186;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r4 != 0) goto L_0x0163;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r0 == 0) goto L_0x0186;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r14 = new ohx;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r15 = r7.b();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = r12.c;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r12 = defpackage.jwz.a(r12);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r10 = defpackage.voq.a(r4, r0);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r16 = r0;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = "ImageRendererImpl";	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r15.a(r12, r10, r0);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r10 = "bitmapFactory.createBitm…                     TAG)";	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            defpackage.akcr.a(r0, r10);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r10 = defpackage.ohy.SKY_FILTER;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r14.<init>(r8, r0, r10);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            goto L_0x018c;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r16 = r0;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r14 = r12.a(r8);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r9.a(r13, r14);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r16;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r10 = 0;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            goto L_0x0143;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r9.a();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r3.dispose();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            goto L_0x019c;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r3;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r11.a(r0);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0.dispose();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r1.b;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r0.e;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            if (r0 == 0) goto L_0x01ab;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r11.a(r0);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r11.a(r5);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r3 = defpackage.abyl.RENDERED;	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r0.a(r3);	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r0 = r0.e();	 Catch:{ Throwable -> 0x01d2, all -> 0x01be }
            r3 = 0;
            defpackage.akax.a(r2, r3);
            return r0;
            r0 = move-exception;
            r3 = 0;
            goto L_0x01d5;
            r0 = move-exception;
            r3 = r10;
            goto L_0x01c9;
            r0 = move-exception;
            r3 = r10;
            r10 = r0;
            throw r10;	 Catch:{ all -> 0x01c8 }
            r0 = move-exception;
            defpackage.akax.a(r12, r10);	 Catch:{ Throwable -> 0x01d2, all -> 0x01cd }
            throw r0;	 Catch:{ Throwable -> 0x01d2, all -> 0x01cd }
            r0 = move-exception;
            goto L_0x01d5;
            r0 = move-exception;
            r3 = r10;
            goto L_0x01d5;
            r0 = move-exception;
            r10 = r0;
            throw r10;	 Catch:{ all -> 0x01cf }
            defpackage.akax.a(r2, r3);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vlq$j.a(odt):abyi");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((odt) obj);
        }
    }

    /* renamed from: vlq$k */
    static final class k<T> implements ajfb<abyi> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: vlq$l */
    static final class l<T> implements ajfb<List<? extends ofx>> {
        private /* synthetic */ vlq a;
        private /* synthetic */ idd b;
        private /* synthetic */ boolean c;
        private /* synthetic */ ajei d;

        l(vlq vlq, idd idd, boolean z, ajei ajei) {
            this.a = vlq;
            this.b = idd;
            this.c = z;
            this.d = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "targets");
            for (ofx a : (Iterable) obj) {
                this.d.a((ajej) a);
            }
        }
    }

    /* renamed from: vlq$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vlq a;
        private /* synthetic */ a b;
        private /* synthetic */ a c;

        n(vlq vlq, a aVar, a aVar2) {
            this.a = vlq;
            this.b = aVar;
            this.c = aVar2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vlw vlw = (vlw) obj;
            akcr.b(vlw, "it");
            return vlq.a(this.a, this.b, vlw, this.c);
        }
    }

    /* renamed from: vlq$o */
    static final class o<T, R> implements ajfc<T, R> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            vly vly = (vly) obj;
            akcr.b(vly, "it");
            return vly.b();
        }
    }

    /* renamed from: vlq$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vlq a;
        private /* synthetic */ a b;
        private /* synthetic */ a c;

        p(vlq vlq, a aVar, a aVar2) {
            this.a = vlq;
            this.b = aVar;
            this.c = aVar2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vlw vlw = (vlw) obj;
            akcr.b(vlw, "it");
            vlq vlq = this.a;
            a aVar = this.b;
            a aVar2 = this.c;
            aVar2.f = false;
            return vlq.a(vlq, aVar, vlw, aVar2);
        }
    }

    /* renamed from: vlq$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vlq a;
        private /* synthetic */ idd b;
        private /* synthetic */ a c;

        q(vlq vlq, idd idd, a aVar) {
            this.a = vlq;
            this.b = idd;
            this.c = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vly vly = (vly) obj;
            akcr.b(vly, "it");
            vlq vlq = this.a;
            idd a = this.b.a("ImageRendererImpl");
            a aVar = this.c;
            vlw vlw = vly.b.a;
            obj = vlq.e.a(a, vlw.a).f(new j(vlq, vlw, vly, a, aVar)).c((ajfb) k.a);
            akcr.a(obj, "mediaPackageManager.edit…ght}]\")\n                }");
            return obj;
        }
    }

    /* renamed from: vlq$r */
    static final class r implements ajev {
        private /* synthetic */ ajei a;

        r(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.a();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(vlq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(vlq.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(vlq.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(vlq.class), "mediaQualityProfiler", "getMediaQualityProfiler()Lcom/snap/media/api/quality/MediaQualityProfiler;")};
    }

    public vlq(abse abse, odl odl, zgb zgb, jwe jwe, jwb jwb, odu odu, ofr ofr, admm admm, vmg vmg, ofy ofy, vll vll, ilv ilv, ajwy<gqr> ajwy, abss abss, voo voo, ajwy<oee> ajwy2) {
        abse abse2 = abse;
        odl odl2 = odl;
        zgb zgb2 = zgb;
        jwe jwe2 = jwe;
        jwb jwb2 = jwb;
        odu odu2 = odu;
        ofr ofr2 = ofr;
        admm admm2 = admm;
        vmg vmg2 = vmg;
        ofy ofy2 = ofy;
        vll vll2 = vll;
        ilv ilv2 = ilv;
        ajwy<gqr> ajwy3 = ajwy;
        abss abss2 = abss;
        voo voo2 = voo;
        akcr.b(abse2, "displayMetrics");
        akcr.b(odl2, "mediaRenderingFeature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(jwb2, "bitmapFactoryProvider");
        akcr.b(odu2, "mediaPackageManager");
        akcr.b(ofr2, "renderPassTransformationFactory");
        akcr.b(admm2, "videoFrameRetriever");
        akcr.b(vmg2, "imageTranscoder");
        akcr.b(ofy2, "pinnableImageTranscodingTargetLoader");
        akcr.b(vll2, "outputResolutionProvider");
        akcr.b(ilv2, "graphene");
        akcr.b(ajwy3, "exceptionTracker");
        akcr.b(abss2, "releaseManager");
        akcr.b(voo2, "eglInfoProvider");
        ajwy<oee> ajwy4 = ajwy2;
        akcr.b(ajwy4, "mediaQualityProfilerProvider");
        this.q = abse2;
        this.b = odl2;
        this.r = zgb2;
        this.c = jwe2;
        this.d = jwb2;
        this.e = odu2;
        this.f = ofr2;
        this.g = admm2;
        this.h = vmg2;
        this.i = ofy2;
        this.j = vll2;
        this.k = ilv2;
        this.l = ajwy3;
        this.m = abss2;
        this.s = voo;
        this.p = ajxh.a(new m(ajwy4));
    }

    private final ajdp<vlw> a(idd idd, a aVar, abyi abyi, a aVar2, ajei ajei) {
        Object d = this.e.c(idd, abyi).d((ajfc) new i(this, abyi, aVar, idd, aVar2, ajei));
        akcr.a(d, "mediaPackageManager.crea…s.io())\n                }");
        return d;
    }

    private static a a(a aVar) {
        akcr.b(aVar, "processType");
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            return new a(dVar.a, dVar.b, false, false, false, false, 60);
        } else if (aVar instanceof a.a) {
            return new a(null, 95, false, false, true, false, 45);
        } else {
            if (aVar instanceof c) {
                return new a(null, 0, false, true, false, false, 51);
            }
            if (aVar instanceof b) {
                b bVar = (b) aVar;
                return new a(bVar.a, 0, bVar.d, false, true, false, 42);
            }
            throw new ajxk();
        }
    }

    public final abtl a(abtl abtl) {
        akcr.b(abtl, MapboxEvent.KEY_RESOLUTION);
        abtl abtl2 = (abtl) this.s.a.b();
        abtl abtl3 = new abtl(Math.min(abtl2.b(), this.q.widthPixels * 2), Math.min(abtl2.c(), this.q.heightPixels * 2));
        if (abtl.b() <= abtl3.b() && abtl.c() <= abtl3.c()) {
            return abtl;
        }
        double b = (double) abtl3.b();
        double b2 = (double) abtl.b();
        Double.isNaN(b);
        Double.isNaN(b2);
        b /= b2;
        double c = (double) abtl3.c();
        double c2 = (double) abtl.c();
        Double.isNaN(c);
        Double.isNaN(c2);
        Object a = abtl.a(Math.min(b, c / c2));
        akcr.a(a, "resolution.scale(scaleFactorForEgl)");
        return a;
    }

    public final ajdp<kaz<jwj>> a(idd idd, a aVar, abyi abyi, ajei ajei) {
        akcr.b(idd, "caller");
        akcr.b(aVar, "processType");
        akcr.b(abyi, "mediaPackage");
        akcr.b(ajei, "compositeDisposable");
        a a = vlq.a(aVar);
        Object p = a(idd.a("ImageRendererImpl"), aVar, abyi, a, ajei).n(new n(this, aVar, a)).p(o.a);
        akcr.a(p, "generateImageRenderingMe…t.outputBitmapOrError() }");
        return p;
    }

    public final ajdx<abyi> a(idd idd, a aVar, abyi abyi) {
        akcr.b(idd, "caller");
        akcr.b(aVar, "processType");
        akcr.b(abyi, "mediaPackage");
        ajei ajei = new ajei();
        a a = vlq.a(aVar);
        Object b = a(idd.a("ImageRendererImpl"), aVar, abyi, a, ajei).e().a((ajfc) new p(this, aVar, a)).a((ajfc) new q(this, idd, a)).b((ajev) new r(ajei));
        akcr.a(b, "generateImageRenderingMe…ositeDisposable.clear() }");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.n.b();
    }

    /* Access modifiers changed, original: final */
    public final jwa b() {
        return (jwa) this.o.b();
    }
}
