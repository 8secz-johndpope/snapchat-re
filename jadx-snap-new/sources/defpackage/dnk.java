package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.UnlockablesModel;

/* renamed from: dnk */
public abstract class dnk implements acih {

    /* renamed from: dnk$b */
    public static final class b extends dnk {
        public final boolean a;
        public final String b;
        public final String c;
        public final gcn d;
        public final dpv e;
        public final dnq f;

        public b(boolean z, String str, String str2, gcn gcn, dpv dpv, dnq dnq) {
            akcr.b(gcn, "sendSessionSource");
            akcr.b(dnq, "loadingOverlay");
            super();
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = gcn;
            this.e = dpv;
            this.f = dnq;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!((this.a == bVar.a ? 1 : null) != null && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e) && akcr.a(this.f, bVar.f))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.b;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            str = this.c;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            gcn gcn = this.d;
            i = (i + (gcn != null ? gcn.hashCode() : 0)) * 31;
            dpv dpv = this.e;
            i = (i + (dpv != null ? dpv.hashCode() : 0)) * 31;
            dnq dnq = this.f;
            if (dnq != null) {
                i2 = dnq.hashCode();
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Reply(isSendingToGroup=");
            stringBuilder.append(this.a);
            stringBuilder.append(", sendToId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", captionText=");
            stringBuilder.append(this.c);
            stringBuilder.append(", sendSessionSource=");
            stringBuilder.append(this.d);
            stringBuilder.append(", lensesCameraLaunchState=");
            stringBuilder.append(this.e);
            stringBuilder.append(", loadingOverlay=");
            stringBuilder.append(this.f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dnk$c */
    public static final class c extends dnk {
        public static final c a = new c();

        private c() {
            super();
        }
    }

    /* renamed from: dnk$e */
    public static abstract class e extends dnk {

        /* renamed from: dnk$e$b */
        public static final class b extends e {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        /* renamed from: dnk$e$a */
        public static final class a extends e {
            public final String a;

            public a(String str) {
                akcr.b(str, DiscoverStorySnapModel.LENSID);
                super();
                this.a = str;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dnk.e.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.dnk.e.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.dnk.e.a) r2;
                r0 = r1.a;
                r2 = r2.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dnk$e$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ById(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: dnk$e$c */
        public static final class c extends e {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: dnk$e$d */
        public static final class d extends e {
            public final String a;

            private /* synthetic */ d() {
                this(null);
            }

            public d(String str) {
                super();
                this.a = str;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dnk.e.d) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.dnk.e.d;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.dnk.e.d) r2;
                r0 = r1.a;
                r2 = r2.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dnk$e$d.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                return str != null ? str.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Placeholder(lensIconUri=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private e() {
            super();
        }

        public /* synthetic */ e(byte b) {
            this();
        }
    }

    /* renamed from: dnk$a */
    public static final class a extends dnk {
        public final gtt a;
        public final boolean b;
        public boolean c;

        private a(gtt gtt, boolean z) {
            akcr.b(gtt, "creativeKitSessionData");
            super();
            this.a = gtt;
            this.b = z;
            this.c = false;
        }

        public /* synthetic */ a(gtt gtt, boolean z, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            this(gtt, z);
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
            gtt gtt = this.a;
            int hashCode = (gtt != null ? gtt.hashCode() : 0) * 31;
            int i = this.b;
            if (i != 0) {
                i = 1;
            }
            hashCode = (hashCode + i) * 31;
            i = this.c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CreativeKit(creativeKitSessionData=");
            stringBuilder.append(this.a);
            stringBuilder.append(", showOnboardingToolTip=");
            stringBuilder.append(this.b);
            stringBuilder.append(", userClearedCreativeKitState=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dnk$d */
    public static final class d extends dnk {
        public final dqf a;

        public d(dqf dqf) {
            akcr.b(dqf, UnlockablesModel.DATA);
            super();
            this.a = dqf;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.dnk.d) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.dnk.d;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.dnk.d) r2;
            r0 = r1.a;
            r2 = r2.a;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dnk$d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            dqf dqf = this.a;
            return dqf != null ? dqf.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithCard(data=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private dnk() {
    }

    public /* synthetic */ dnk(byte b) {
        this();
    }
}
