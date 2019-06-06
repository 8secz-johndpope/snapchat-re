package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;
import defpackage.lrw.a;
import defpackage.lrw.a.c;
import java.util.List;

/* renamed from: lsd */
public interface lsd extends ajfb<b> {

    /* renamed from: lsd$b */
    public static abstract class b implements mis<mih, b> {

        /* renamed from: lsd$b$b */
        public static final class b extends b {
            public final boolean a;
            public final List<a> b;
            public final int c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final mih g;

            private b(boolean z, List<? extends a> list, int i, boolean z2, boolean z3, boolean z4, mih mih) {
                akcr.b(list, "items");
                akcr.b(mih, "windowRect");
                super();
                this.a = z;
                this.b = list;
                this.c = i;
                this.d = z2;
                this.e = z3;
                this.f = z4;
                this.g = mih;
            }

            public /* synthetic */ b(boolean z, List list, boolean z2, boolean z3, mih mih, int i) {
                this((i & 1) != 0 ? true : z, list, 0, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, false, (i & 64) != 0 ? mih.e : mih);
            }

            public static /* synthetic */ b a(b bVar, boolean z, List list, int i, boolean z2, boolean z3, boolean z4, mih mih, int i2) {
                if ((i2 & 1) != 0) {
                    z = bVar.a;
                }
                if ((i2 & 2) != 0) {
                    list = bVar.b;
                }
                List list2 = list;
                if ((i2 & 4) != 0) {
                    i = bVar.c;
                }
                int i3 = i;
                if ((i2 & 8) != 0) {
                    z2 = bVar.d;
                }
                boolean z5 = z2;
                if ((i2 & 16) != 0) {
                    z3 = bVar.e;
                }
                boolean z6 = z3;
                if ((i2 & 32) != 0) {
                    z4 = bVar.f;
                }
                boolean z7 = z4;
                if ((i2 & 64) != 0) {
                    mih = bVar.g;
                }
                return b.a(z, list2, i3, z5, z6, z7, mih);
            }

            private static b a(boolean z, List<? extends a> list, int i, boolean z2, boolean z3, boolean z4, mih mih) {
                akcr.b(list, "items");
                akcr.b(mih, "windowRect");
                return new b(z, list, i, z2, z3, z4, mih);
            }

            public final int a() {
                int i = 0;
                for (a aVar : this.b) {
                    if (aVar instanceof c) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }

            public final boolean b() {
                return this.c == a();
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if ((this.a == bVar.a ? 1 : null) != null && akcr.a(this.b, bVar.b)) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                if ((this.d == bVar.d ? 1 : null) != null) {
                                    if ((this.e == bVar.e ? 1 : null) != null) {
                                        if ((this.f == bVar.f ? 1 : null) == null || !akcr.a(this.g, bVar.g)) {
                                            return false;
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
                int i = this.a;
                int i2 = 1;
                if (i != 0) {
                    i = 1;
                }
                i *= 31;
                List list = this.b;
                int i3 = 0;
                i = (((i + (list != null ? list.hashCode() : 0)) * 31) + this.c) * 31;
                int i4 = this.d;
                if (i4 != 0) {
                    i4 = 1;
                }
                i = (i + i4) * 31;
                i4 = this.e;
                if (i4 != 0) {
                    i4 = 1;
                }
                i = (i + i4) * 31;
                boolean z = this.f;
                if (!z) {
                    i2 = z;
                }
                i = (i + i2) * 31;
                mih mih = this.g;
                if (mih != null) {
                    i3 = mih.hashCode();
                }
                return i + i3;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object obj2 = (mih) obj;
                akcr.b(obj2, "value");
                return (akcr.a(this.g, obj2) ^ 1) != 0 ? b.a(this, false, null, 0, false, false, false, obj2, 63) : this;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Visible(closeable=");
                stringBuilder.append(this.a);
                stringBuilder.append(", items=");
                stringBuilder.append(this.b);
                stringBuilder.append(", selectedItemPosition=");
                stringBuilder.append(this.c);
                stringBuilder.append(", allowScrolling=");
                stringBuilder.append(this.d);
                stringBuilder.append(", allowSelecting=");
                stringBuilder.append(this.e);
                stringBuilder.append(", itemsHaveFlipped=");
                stringBuilder.append(this.f);
                stringBuilder.append(", windowRect=");
                stringBuilder.append(this.g);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lsd$b$a */
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

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lsd$a */
    public static abstract class a {

        /* renamed from: lsd$a$e */
        public static final class e extends a {
            final List<defpackage.lrw.a> a;
            final List<defpackage.lrw.a> b;

            public e(List<? extends defpackage.lrw.a> list, List<? extends defpackage.lrw.a> list2) {
                akcr.b(list, "items");
                akcr.b(list2, "allItems");
                super();
                this.a = list;
                this.b = list2;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.lsd.a.e;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.lsd.a.e) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lsd$a$e.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                List list = this.a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List list2 = this.b;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("VisibleItemsChanged(items=");
                stringBuilder.append(this.a);
                stringBuilder.append(", allItems=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lsd$a$c */
        public static final class c extends a {
            public final int a;
            public final defpackage.lrw.a b;

            public c(int i, defpackage.lrw.a aVar) {
                akcr.b(aVar, "item");
                super();
                this.a = i;
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if ((this.a == cVar.a ? 1 : null) == null || !akcr.a(this.b, cVar.b)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.a * 31;
                defpackage.lrw.a aVar = this.b;
                return i + (aVar != null ? aVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemSelected(position=");
                stringBuilder.append(this.a);
                stringBuilder.append(", item=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lsd$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lsd$a$d */
        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super();
            }
        }

        /* renamed from: lsd$a$b */
        public static final class b extends a {
            private final int a;

            public b(int i) {
                super();
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        if ((this.a == ((b) obj).a ? 1 : null) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return this.a;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ItemCentered(position=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: lsd$c */
    public static final class c implements ajfb<b>, lsd {
        public static final c a = new c();
        private static final ajdp<a> b;
        private final /* synthetic */ ajfb c = myr.a();

        static {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            b = a;
        }

        private c() {
        }

        public final ajdp<a> a() {
            return b;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.c.accept((b) obj);
        }
    }

    ajdp<a> a();
}
