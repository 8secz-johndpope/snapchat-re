package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;
import defpackage.lvf.a;
import java.util.List;

/* renamed from: lvi */
public interface lvi extends ajfb<b> {

    /* renamed from: lvi$b */
    public static abstract class b implements mis<mih, b> {

        /* renamed from: lvi$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mih) obj, FriendWhoAddedMeModel.IGNORED);
                return this;
            }
        }

        /* renamed from: lvi$b$c */
        public static final class c extends b {
            public final List<a> a;
            public final boolean b;
            public final mih c;

            public /* synthetic */ c(List list, boolean z) {
                this(list, z, mih.e);
            }

            private c(List<? extends a> list, boolean z, mih mih) {
                akcr.b(list, "items");
                akcr.b(mih, "windowRect");
                super();
                this.a = list;
                this.b = z;
                this.c = mih;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if (akcr.a(this.a, cVar.a)) {
                            if ((this.b == cVar.b ? 1 : null) == null || !akcr.a(this.c, cVar.c)) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                List list = this.a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                int i2 = this.b;
                if (i2 != 0) {
                    i2 = 1;
                }
                hashCode = (hashCode + i2) * 31;
                mih mih = this.c;
                if (mih != null) {
                    i = mih.hashCode();
                }
                return hashCode + i;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "value");
                if ((akcr.a(this.c, obj) ^ 1) == 0) {
                    return this;
                }
                List list = this.a;
                boolean z = this.b;
                akcr.b(list, "items");
                akcr.b(obj, "windowRect");
                return new c(list, z, obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("WithImages(items=");
                stringBuilder.append(this.a);
                stringBuilder.append(", isLoading=");
                stringBuilder.append(this.b);
                stringBuilder.append(", windowRect=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lvi$b$b */
        public static final class b extends b {
            public final int a;
            public final mih b;

            public /* synthetic */ b(int i) {
                this(i, mih.e);
            }

            private b(int i, mih mih) {
                akcr.b(mih, "windowRect");
                super();
                this.a = i;
                this.b = mih;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if ((this.a == bVar.a ? 1 : null) == null || !akcr.a(this.b, bVar.b)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a * 31;
                mih mih = this.b;
                return i + (mih != null ? mih.hashCode() : 0);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "value");
                if ((akcr.a(this.b, obj) ^ 1) == 0) {
                    return this;
                }
                int i = this.a;
                akcr.b(obj, "windowRect");
                return new b(i, obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Message(stringId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", windowRect=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lvi$a */
    public static abstract class a {

        /* renamed from: lvi$a$a */
        public static final class a extends a {
            final defpackage.lvf.a a;

            public a(defpackage.lvf.a aVar) {
                akcr.b(aVar, "item");
                super();
                this.a = aVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lvi.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lvi.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lvi.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lvi$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.lvf.a aVar = this.a;
                return aVar != null ? aVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemSelected(item=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lvi$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajdp<a> b();
}
