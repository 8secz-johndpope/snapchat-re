package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhs.a;
import defpackage.mhs.b;
import defpackage.miq.f;

/* renamed from: moc */
public abstract class moc {

    /* renamed from: moc$c */
    public static abstract class c extends moc {

        /* renamed from: moc$c$a */
        public static final class a extends c {
            public final muc a;
            private mod b;
            private final b c;
            private final boolean d;

            public a(b bVar, miq miq) {
                akcr.b(bVar, "assetId");
                akcr.b(miq, MessageMediaRefModel.URI);
                this(new muc(bVar, miq, null, null, null, 0, 124), (byte) 0);
            }

            private a(muc muc) {
                akcr.b(muc, "manifestItem");
                super();
                this.a = muc;
                this.d = false;
                this.b = mod.b.a;
                this.c = this.a.a;
            }

            public final /* bridge */ /* synthetic */ mhs a() {
                return this.c;
            }

            public final boolean b() {
                return false;
            }

            public final mod c() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.moc.c.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.moc.c.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.moc.c.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.moc$c$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                muc muc = this.a;
                return (muc != null ? muc.hashCode() : 0) * 31;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("RemoteAsset.Static(id=");
                stringBuilder.append(this.a.a);
                stringBuilder.append(", uri=");
                stringBuilder.append(this.a.b);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }

        /* renamed from: moc$c$b */
        public static final class b extends c {
            public final defpackage.mhs.b a;
            public final abnb b;
            public final boolean c;
            public final boolean d;
            private mod e;

            public /* synthetic */ b(defpackage.mhs.b bVar, abnb abnb) {
                this(bVar, abnb, false, false);
            }

            public b(defpackage.mhs.b bVar, abnb abnb, boolean z, boolean z2) {
                akcr.b(bVar, "senderId");
                akcr.b(abnb, "encryptionAlgorithm");
                super();
                this.a = bVar;
                this.b = abnb;
                this.c = z;
                this.d = z2;
                this.e = defpackage.mod.b.a;
            }

            public final /* bridge */ /* synthetic */ mhs a() {
                return this.a;
            }

            public final boolean b() {
                return this.d;
            }

            public final mod c() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b)) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                if ((this.d == bVar.d ? 1 : null) != null) {
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
                defpackage.mhs.b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                abnb abnb = this.b;
                if (abnb != null) {
                    i = abnb.hashCode();
                }
                hashCode = (hashCode + i) * 31;
                i = this.c;
                if (i != 0) {
                    i = 1;
                }
                hashCode = (hashCode + i) * 31;
                i = this.d;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("UserGenerated(senderId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", encryptionAlgorithm=");
                stringBuilder.append(this.b);
                stringBuilder.append(", isEdgeCached=");
                stringBuilder.append(this.c);
                stringBuilder.append(", withAuthority=");
                stringBuilder.append(this.d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
            super();
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: moc$b */
    public static abstract class b extends moc {

        /* renamed from: moc$b$b */
        public static final class b extends b {
            public final f a;
            private mod b;
            private final defpackage.mhs.b c;
            private final boolean d;

            private b(defpackage.mhs.b bVar, f fVar) {
                akcr.b(bVar, "senderId");
                akcr.b(fVar, MessageMediaRefModel.URI);
                super();
                this.c = bVar;
                this.a = fVar;
                this.d = true;
                this.b = defpackage.mod.b.a;
            }

            public /* synthetic */ b(defpackage.mhs.b bVar, f fVar, byte b) {
                this(bVar, fVar);
            }

            public final /* bridge */ /* synthetic */ mhs a() {
                return this.c;
            }

            public final boolean b() {
                return true;
            }

            public final mod c() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.moc.b.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.moc.b.b) r3;
                r0 = r2.c;
                r1 = r3.c;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.moc$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.c;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                f fVar = this.a;
                if (fVar != null) {
                    i = fVar.hashCode();
                }
                return ((hashCode + i) * 31) + 1;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Icon(senderId=");
                stringBuilder.append(this.c);
                stringBuilder.append(", uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(", withAuthority=true");
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: moc$b$a */
        public static final class a extends b {
            public final defpackage.mhs.b a;
            public final f b;
            public final String c;
            private mod d;
            private final boolean e;

            public /* synthetic */ a(defpackage.mhs.b bVar, f fVar, String str) {
                this(bVar, fVar, false, str);
            }

            private a(defpackage.mhs.b bVar, f fVar, String str, mod mod) {
                akcr.b(bVar, "senderId");
                akcr.b(fVar, MessageMediaRefModel.URI);
                akcr.b(mod, "priority");
                this(bVar, fVar, false, str);
                this.d = mod;
            }

            public /* synthetic */ a(defpackage.mhs.b bVar, f fVar, String str, mod mod, byte b) {
                this(bVar, fVar, str, mod);
            }

            private a(defpackage.mhs.b bVar, f fVar, boolean z, String str) {
                akcr.b(bVar, "senderId");
                akcr.b(fVar, MessageMediaRefModel.URI);
                super();
                this.a = bVar;
                this.b = fVar;
                this.e = false;
                this.c = str;
                this.d = defpackage.mod.b.a;
            }

            public final /* bridge */ /* synthetic */ mhs a() {
                return this.a;
            }

            public final boolean b() {
                return this.e;
            }

            public final mod c() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.a, aVar.a) && akcr.a(this.b, aVar.b)) {
                            if ((this.e == aVar.e ? 1 : null) == null || !akcr.a(this.c, aVar.c)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                f fVar = this.b;
                hashCode = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
                int i2 = this.e;
                if (i2 != 0) {
                    i2 = 1;
                }
                hashCode = (hashCode + i2) * 31;
                String str = this.c;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Content(senderId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", uri=");
                stringBuilder.append(this.b);
                stringBuilder.append(", withAuthority=");
                stringBuilder.append(this.e);
                stringBuilder.append(", contentSignature=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: moc$b$c */
        public static final class c extends b {
            public final f a;
            private mod b;
            private final defpackage.mhs.b c;
            private final boolean d;

            private c(defpackage.mhs.b bVar, f fVar) {
                akcr.b(bVar, "senderId");
                akcr.b(fVar, MessageMediaRefModel.URI);
                super();
                this.c = bVar;
                this.a = fVar;
                this.d = false;
                this.b = defpackage.mod.b.a;
            }

            public /* synthetic */ c(defpackage.mhs.b bVar, f fVar, byte b) {
                this(bVar, fVar);
            }

            public final /* bridge */ /* synthetic */ mhs a() {
                return this.c;
            }

            public final boolean b() {
                return false;
            }

            public final mod c() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.moc.b.c;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.moc.b.c) r3;
                r0 = r2.c;
                r1 = r3.c;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.moc$b$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.c;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                f fVar = this.a;
                if (fVar != null) {
                    i = fVar.hashCode();
                }
                return (hashCode + i) * 31;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Overlay(senderId=");
                stringBuilder.append(this.c);
                stringBuilder.append(", uri=");
                stringBuilder.append(this.a);
                stringBuilder.append(", withAuthority=false");
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
            super();
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: moc$d */
    public static final class d extends moc {
        public final String a;
        public final String b;
        private mod c;
        private final mhs d;
        private final boolean e;

        public /* synthetic */ d(String str, String str2) {
            this(str, str2, false);
        }

        private d(String str, String str2, mod mod) {
            akcr.b(str, "name");
            akcr.b(str2, "checksum");
            akcr.b(mod, "priority");
            this(str, str2, false);
            this.c = mod;
        }

        public /* synthetic */ d(String str, String str2, mod mod, byte b) {
            this(str, str2, mod);
        }

        private d(String str, String str2, boolean z) {
            akcr.b(str, "name");
            akcr.b(str2, "checksum");
            super();
            this.a = str;
            this.b = str2;
            this.e = false;
            this.c = mod.b.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(this.b);
            this.d = a.a(stringBuilder.toString());
        }

        public final mhs a() {
            return this.d;
        }

        public final boolean b() {
            return this.e;
        }

        public final mod c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (akcr.a(this.a, dVar.a) && akcr.a(this.b, dVar.b)) {
                        if ((this.e == dVar.e ? 1 : null) != null) {
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
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.e;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TrackingData(name=");
            stringBuilder.append(this.a);
            stringBuilder.append(", checksum=");
            stringBuilder.append(this.b);
            stringBuilder.append(", withAuthority=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: moc$a */
    public static abstract class a extends moc {

        /* renamed from: moc$a$a */
        public enum a {
            PROD,
            STAGING,
            DEV
        }

        /* renamed from: moc$a$b */
        public static final class b extends a {
            public final defpackage.mhs.b a;
            public final defpackage.mhs.b b;
            public final defpackage.mhs.b c;
            public final String d;
            public final a e;
            private mod f;
            private final mhs g;
            private final boolean h;

            public /* synthetic */ b(defpackage.mhs.b bVar, defpackage.mhs.b bVar2, defpackage.mhs.b bVar3) {
                defpackage.mhs.b bVar4 = bVar;
                defpackage.mhs.b bVar5 = bVar2;
                defpackage.mhs.b bVar6 = bVar3;
                this(bVar4, bVar5, bVar6, "/bitmoji/get_avatar_assets", a.PROD);
            }

            private b(defpackage.mhs.b bVar, defpackage.mhs.b bVar2, defpackage.mhs.b bVar3, String str, a aVar) {
                akcr.b(bVar, "assetGroupId");
                akcr.b(bVar2, "userId");
                akcr.b(bVar3, "avatarId");
                akcr.b(str, "path");
                akcr.b(aVar, "assetEnvironment");
                super();
                this.a = bVar;
                this.b = bVar2;
                this.c = bVar3;
                this.d = str;
                this.e = aVar;
                this.h = false;
                this.f = defpackage.mod.b.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                stringBuilder.append(this.a);
                this.g = defpackage.mhs.a.a(stringBuilder.toString());
            }

            public final mhs a() {
                return this.g;
            }

            public final boolean b() {
                return false;
            }

            public final mod c() {
                return this.f;
            }

            /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x003d;
            L_0x0002:
                r0 = r3 instanceof defpackage.moc.a.b;
                if (r0 == 0) goto L_0x003b;
            L_0x0006:
                r3 = (defpackage.moc.a.b) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x003b;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x003b;
            L_0x001c:
                r0 = r2.c;
                r1 = r3.c;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x003b;
            L_0x0026:
                r0 = r2.d;
                r1 = r3.d;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x003b;
            L_0x0030:
                r0 = r2.e;
                r3 = r3.e;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x003b;
            L_0x003a:
                goto L_0x003d;
            L_0x003b:
                r3 = 0;
                return r3;
            L_0x003d:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.moc$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                defpackage.mhs.b bVar2 = this.b;
                hashCode = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
                bVar2 = this.c;
                hashCode = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
                String str = this.d;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                a aVar = this.e;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return (hashCode + i) * 31;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("AvatarAsset(assetGroupId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", userId=");
                stringBuilder.append(this.b);
                stringBuilder.append(", avatarId=");
                stringBuilder.append(this.c);
                stringBuilder.append(", path=");
                stringBuilder.append(this.d);
                stringBuilder.append(", assetEnvironment=");
                stringBuilder.append(this.e);
                stringBuilder.append(", withAuthority=false");
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: moc$a$c */
        public static final class c extends a {
            public final b a;
            public final b b;
            public final String c;
            public final a d;
            private mod e;
            private final mhs f;
            private final boolean g;

            public /* synthetic */ c(b bVar, b bVar2) {
                this(bVar, bVar2, "/bitmoji/get_3d_asset", a.PROD);
            }

            private c(b bVar, b bVar2, String str, a aVar) {
                akcr.b(bVar, "userId");
                akcr.b(bVar2, "avatarId");
                akcr.b(str, "path");
                akcr.b(aVar, "assetEnvironment");
                super();
                this.a = bVar;
                this.b = bVar2;
                this.c = str;
                this.d = aVar;
                this.g = false;
                this.e = mod.b.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a);
                stringBuilder.append(this.b);
                this.f = defpackage.mhs.a.a(stringBuilder.toString());
            }

            public final mhs a() {
                return this.f;
            }

            public final boolean b() {
                return false;
            }

            public final mod c() {
                return this.e;
            }

            /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0033;
            L_0x0002:
                r0 = r3 instanceof defpackage.moc.a.c;
                if (r0 == 0) goto L_0x0031;
            L_0x0006:
                r3 = (defpackage.moc.a.c) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x001c:
                r0 = r2.c;
                r1 = r3.c;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0031;
            L_0x0026:
                r0 = r2.d;
                r3 = r3.d;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.moc$a$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                b bVar2 = this.b;
                hashCode = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
                String str = this.c;
                hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                a aVar = this.d;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return (hashCode + i) * 31;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Metadata(userId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", avatarId=");
                stringBuilder.append(this.b);
                stringBuilder.append(", path=");
                stringBuilder.append(this.c);
                stringBuilder.append(", assetEnvironment=");
                stringBuilder.append(this.d);
                stringBuilder.append(", withAuthority=false");
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
            super();
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private moc() {
    }

    public /* synthetic */ moc(byte b) {
        this();
    }

    public abstract mhs a();

    public abstract boolean b();

    public abstract mod c();
}
