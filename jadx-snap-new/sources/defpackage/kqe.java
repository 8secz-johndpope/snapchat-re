package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.FeedModel;
import defpackage.mhs.b;
import java.util.List;

/* renamed from: kqe */
public abstract class kqe {
    public String a;

    /* renamed from: kqe$m */
    public static final class m extends kqe {
        public static final m b = new m();

        private m() {
            super();
        }
    }

    /* renamed from: kqe$ak */
    public static final class ak extends kqe {
        final List<b> b;
        final List<a> c;

        /* renamed from: kqe$ak$b */
        public static final class b {
            public final String a;
            public final boolean b;

            public b(String str, boolean z) {
                akcr.b(str, "id");
                this.a = str;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.a, bVar.a)) {
                            if ((this.b == bVar.b ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i = this.b;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("VisibleLensStatus(id=");
                stringBuilder.append(this.a);
                stringBuilder.append(", loaded=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: kqe$ak$a */
        public static final class a {
            public final String a;
            public final boolean b;
            public final int c;

            public a(String str, boolean z, int i) {
                akcr.b(str, "id");
                this.a = str;
                this.b = z;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.a, aVar.a)) {
                            if ((this.b == aVar.b ? 1 : null) != null) {
                                if ((this.c == aVar.c ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i = this.b;
                if (i != 0) {
                    i = 1;
                }
                return ((hashCode + i) * 31) + this.c;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("LensStatus(id=");
                stringBuilder.append(this.a);
                stringBuilder.append(", seen=");
                stringBuilder.append(this.b);
                stringBuilder.append(", position=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        public ak(List<b> list, List<a> list2) {
            akcr.b(list, "visibleItems");
            akcr.b(list2, "availableItemsIds");
            super();
            this.b = list;
            this.c = list2;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kqe.ak;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kqe.ak) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.c;
            r3 = r3.c;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$ak.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List list = this.b;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List list2 = this.c;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnVisibleLensesUpdated(visibleItems=");
            stringBuilder.append(this.b);
            stringBuilder.append(", availableItemsIds=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$r */
    public static final class r extends kqe {
        public static final r b = new r();

        private r() {
            super();
        }
    }

    /* renamed from: kqe$i */
    public static final class i extends kqe {
        public static final i b = new i();

        private i() {
            super();
        }
    }

    /* renamed from: kqe$a */
    public static final class a extends kqe {
        public static final a b = new a();

        private a() {
            super();
        }
    }

    /* renamed from: kqe$s */
    public static final class s extends kqe {
        private final String b;

        public s(String str) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.s) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.s;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.s) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$s.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensCarouselItemSelected(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$aa */
    public static final class aa extends kqe {
        private final String b;

        public aa(String str) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.aa) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.aa;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.aa) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$aa.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnSelectedLensContentLoaded(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$v */
    public static final class v extends kqe {
        final String b;
        final long c;

        public v(String str, long j) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof v) {
                    v vVar = (v) obj;
                    if (akcr.a(this.b, vVar.b)) {
                        if ((this.c == vVar.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensLoaded(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", loadTime=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$j */
    public static final class j extends kqe {
        final long b;

        public j(long j) {
            super();
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof j) {
                    if ((this.b == ((j) obj).b ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.b;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnDeviceClusterSet(deviceCluster=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$x */
    public static final class x extends kqe {
        final mux b;
        final int c;
        final int d;
        final int e;

        public x(mux mux, int i, int i2, int i3) {
            akcr.b(mux, "lens");
            super();
            this.b = mux;
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (akcr.a(this.b, xVar.b)) {
                        if ((this.c == xVar.c ? 1 : null) != null) {
                            if ((this.d == xVar.d ? 1 : null) != null) {
                                if ((this.e == xVar.e ? 1 : null) != null) {
                                    return true;
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
            mux mux = this.b;
            return ((((((mux != null ? mux.hashCode() : 0) * 31) + this.c) * 31) + this.d) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensSelected(lens=");
            stringBuilder.append(this.b);
            stringBuilder.append(", lensPosition=");
            stringBuilder.append(this.c);
            stringBuilder.append(", lensCount=");
            stringBuilder.append(this.d);
            stringBuilder.append(", cameraFacing=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$e */
    public static final class e extends kqe {
        final int b;
        final int c;

        public e(int i, int i2) {
            super();
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    if ((this.b == eVar.b ? 1 : null) != null) {
                        if ((this.c == eVar.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.b * 31) + this.c;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NoLensSelected(lensCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraFacing=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$d */
    public static final class d extends kqe {
        final String b;
        final long c;
        final long d;

        public /* synthetic */ d(String str, long j) {
            this(str, j, Long.MIN_VALUE);
        }

        public d(String str, long j, long j2) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (akcr.a(this.b, dVar.b)) {
                        if ((this.c == dVar.c ? 1 : null) != null) {
                            if ((this.d == dVar.d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.c;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.d;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LensResourcesLoaded(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", loadTime=");
            stringBuilder.append(this.c);
            stringBuilder.append(", sizeBytes=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$u */
    public static final class u extends kqe {
        private final String b;

        public u(String str) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.u) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.u;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.u) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$u.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensInitiated(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$f */
    public static final class f extends kqe {
        final int b;

        public f(int i) {
            super();
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof f) {
                    if ((this.b == ((f) obj).b ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnCameraFlip(cameraFacing=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$k */
    public static final class k extends kqe {
        final String b;

        public k(String str) {
            akcr.b(str, "expression");
            super();
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.k) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.k;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.k) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$k.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnExpressionOccurred(expression=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$l */
    public static final class l extends kqe {
        final int b;
        final int c;

        public l(int i, int i2) {
            super();
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof l) {
                    l lVar = (l) obj;
                    if ((this.b == lVar.b ? 1 : null) != null) {
                        if ((this.c == lVar.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.b * 31) + this.c;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnFaceCountChanged(faceCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraFacing=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$ah */
    public static final class ah extends kqe {
        final String b;
        final double c;
        final double d;
        final double e;
        final boolean f;

        public ah(String str, double d, double d2, double d3, boolean z) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
            this.c = d;
            this.d = d2;
            this.e = d3;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ah) {
                    ah ahVar = (ah) obj;
                    if (akcr.a(this.b, ahVar.b) && Double.compare(this.c, ahVar.c) == 0 && Double.compare(this.d, ahVar.d) == 0 && Double.compare(this.e, ahVar.e) == 0) {
                        if ((this.f == ahVar.f ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long doubleToLongBits = Double.doubleToLongBits(this.c);
            hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            doubleToLongBits = Double.doubleToLongBits(this.d);
            hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            doubleToLongBits = Double.doubleToLongBits(this.e);
            hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            int i = this.f;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnStatisticsUpdated(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", avgFps=");
            stringBuilder.append(this.c);
            stringBuilder.append(", processingAvg=");
            stringBuilder.append(this.d);
            stringBuilder.append(", processingStd=");
            stringBuilder.append(this.e);
            stringBuilder.append(", isVideoRecording=");
            stringBuilder.append(this.f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$c */
    public static abstract class c extends kqe {

        /* renamed from: kqe$c$g */
        public static abstract class g {

            /* renamed from: kqe$c$g$a */
            public static final class a extends g {
                public static final a a = new a();

                private a() {
                    super();
                }

                public final String toString() {
                    return FeedModel.TABLE_NAME;
                }
            }

            /* renamed from: kqe$c$g$b */
            public static final class b extends g {
                public static final b a = new b();

                private b() {
                    super();
                }

                public final String toString() {
                    return "Subscription";
                }
            }

            private g() {
            }

            public /* synthetic */ g(byte b) {
                this();
            }
        }

        /* renamed from: kqe$c$a */
        public static final class a extends c {
            public static final a b = new a();

            private a() {
                super();
            }
        }

        /* renamed from: kqe$c$b */
        public static final class b extends c {
            public static final b b = new b();

            private b() {
                super();
            }
        }

        /* renamed from: kqe$c$c */
        public static final class c extends c {
            public final b b;
            public final b c;
            public final int d;
            public final g e;

            public c(b bVar, b bVar2, int i, g gVar) {
                akcr.b(bVar, "id");
                akcr.b(bVar2, "storyId");
                akcr.b(gVar, "section");
                super();
                this.b = bVar;
                this.c = bVar2;
                this.d = i;
                this.e = gVar;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (akcr.a(this.b, cVar.b) && akcr.a(this.c, cVar.c)) {
                            if ((this.d == cVar.d ? 1 : null) == null || !akcr.a(this.e, cVar.e)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                b bVar = this.b;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                b bVar2 = this.c;
                hashCode = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.d) * 31;
                g gVar = this.e;
                if (gVar != null) {
                    i = gVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemDisplayed(id=");
                stringBuilder.append(this.b);
                stringBuilder.append(", storyId=");
                stringBuilder.append(this.c);
                stringBuilder.append(", indexPosition=");
                stringBuilder.append(this.d);
                stringBuilder.append(", section=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: kqe$c$d */
        public static final class d extends c {
            public final b b;
            public final g c;

            public d(b bVar, g gVar) {
                akcr.b(bVar, "id");
                akcr.b(gVar, "section");
                super();
                this.b = bVar;
                this.c = gVar;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.kqe.c.d;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.kqe.c.d) r3;
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.c;
                r3 = r3.c;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$c$d.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.b;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                g gVar = this.c;
                if (gVar != null) {
                    i = gVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemHidden(id=");
                stringBuilder.append(this.b);
                stringBuilder.append(", section=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: kqe$c$e */
        public static final class e extends c {
            public final b b;
            public final int c;
            public final g d;
            private final b e;

            public e(b bVar, b bVar2, int i, g gVar) {
                akcr.b(bVar, "id");
                akcr.b(bVar2, "storyId");
                akcr.b(gVar, "section");
                super();
                this.e = bVar;
                this.b = bVar2;
                this.c = i;
                this.d = gVar;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (akcr.a(this.e, eVar.e) && akcr.a(this.b, eVar.b)) {
                            if ((this.c == eVar.c ? 1 : null) == null || !akcr.a(this.d, eVar.d)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                b bVar = this.e;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                b bVar2 = this.b;
                hashCode = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.c) * 31;
                g gVar = this.d;
                if (gVar != null) {
                    i = gVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemUnlocked(id=");
                stringBuilder.append(this.e);
                stringBuilder.append(", storyId=");
                stringBuilder.append(this.b);
                stringBuilder.append(", indexPosition=");
                stringBuilder.append(this.c);
                stringBuilder.append(", section=");
                stringBuilder.append(this.d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: kqe$c$f */
        public static final class f extends c {
            public static final f b = new f();

            private f() {
                super();
            }
        }

        /* renamed from: kqe$c$h */
        public static final class h extends c {
            public static final h b = new h();

            private h() {
                super();
            }
        }

        private c() {
            super();
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: kqe$b */
    public static final class b extends kqe {
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public b(String str, String str2, String str3, String str4) {
            akcr.b(str, "exceptionType");
            akcr.b(str2, "exceptionReason");
            super();
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x0033;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof defpackage.kqe.b;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (defpackage.kqe.b) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.e;
            r3 = r3.e;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("HandledNativeException(exceptionType=");
            stringBuilder.append(this.b);
            stringBuilder.append(", exceptionReason=");
            stringBuilder.append(this.c);
            stringBuilder.append(", lensId=");
            stringBuilder.append(this.d);
            stringBuilder.append(", upcomingLensId=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$al */
    public static final class al extends kqe {
        public final String b;
        public final String c;

        public al(String str, String str2) {
            super();
            this.b = str;
            this.c = str2;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kqe.al;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kqe.al) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.c;
            r3 = r3.c;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$al.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("PossibleNativeCrash(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", upcomingLensId=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$g */
    public static final class g extends kqe {
        public static final g b = new g();

        private g() {
            super();
        }
    }

    /* renamed from: kqe$h */
    public static final class h extends kqe {
        public static final h b = new h();

        private h() {
            super();
        }
    }

    /* renamed from: kqe$y */
    public static final class y extends kqe {
        public static final y b = new y();

        private y() {
            super();
        }
    }

    /* renamed from: kqe$aj */
    public static final class aj extends kqe {
        public static final aj b = new aj();

        private aj() {
            super();
        }
    }

    /* renamed from: kqe$ai */
    public static final class ai extends kqe {
        public static final ai b = new ai();

        private ai() {
            super();
        }
    }

    /* renamed from: kqe$o */
    public static final class o extends kqe {
        public static final o b = new o();

        private o() {
            super();
        }
    }

    /* renamed from: kqe$p */
    public static final class p extends kqe {
        public static final p b = new p();

        private p() {
            super();
        }
    }

    /* renamed from: kqe$q */
    public static final class q extends kqe {
        public static final q b = new q();

        private q() {
            super();
        }
    }

    /* renamed from: kqe$n */
    public static final class n extends kqe {
        public static final n b = new n();

        private n() {
            super();
        }
    }

    /* renamed from: kqe$ab */
    public static final class ab extends kqe {
        final kqn b;

        public ab(kqn kqn) {
            akcr.b(kqn, "combinedSnapCreationInfo");
            super();
            this.b = kqn;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.ab) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.ab;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.ab) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$ab.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            kqn kqn = this.b;
            return kqn != null ? kqn.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnSnapSend(combinedSnapCreationInfo=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$ad */
    public static final class ad extends kqe {
        final String b;
        final String c;
        final int d;

        public ad(String str, String str2, int i) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ad) {
                    ad adVar = (ad) obj;
                    if (akcr.a(this.b, adVar.b) && akcr.a(this.c, adVar.c)) {
                        if ((this.d == adVar.d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnSnappableJoin(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", snappableSessionId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", snappableSessionDepth=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$af */
    public static final class af extends kqe {
        final String b;
        final String c;
        final int d;

        public af(String str, String str2, int i) {
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            super();
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof af) {
                    af afVar = (af) obj;
                    if (akcr.a(this.b, afVar.b) && akcr.a(this.c, afVar.c)) {
                        if ((this.d == afVar.d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnSnappableSkip(lensId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", snappableSessionId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", snappableSessionDepth=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$ae */
    public static final class ae extends kqe {
        final String b;

        public ae(String str) {
            super();
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.ae) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.ae;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.ae) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$ae.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.b;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnSnappableSessionIdChanged(snappableSessionId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$ac */
    public static final class ac extends kqe {
        public static final ac b = new ac();

        private ac() {
            super();
        }
    }

    /* renamed from: kqe$ag */
    public static final class ag extends kqe {
        public static final ag b = new ag();

        private ag() {
            super();
        }
    }

    /* renamed from: kqe$t */
    public static final class t extends kqe {
        public final mjf.b b;

        public t(mjf.b bVar) {
            akcr.b(bVar, "lensReport");
            super();
            this.b = bVar;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kqe.t) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kqe.t;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kqe.t) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe$t.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mjf.b bVar = this.b;
            return bVar != null ? bVar.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensCustomEvent(lensReport=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kqe$z */
    public static final class z extends kqe {
        public static final z b = new z();

        private z() {
            super();
        }
    }

    /* renamed from: kqe$w */
    public static final class w extends kqe {
        public final int b;
        public final int c;

        public w(int i, int i2) {
            super();
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof w) {
                    w wVar = (w) obj;
                    if ((this.b == wVar.b ? 1 : null) != null) {
                        if ((this.c == wVar.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.b * 31) + this.c;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("OnLensOptionSelected(selectedOptionIndex=");
            stringBuilder.append(this.b);
            stringBuilder.append(", optionsCount=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private kqe() {
        this.a = "";
    }

    public /* synthetic */ kqe(byte b) {
        this();
    }
}
