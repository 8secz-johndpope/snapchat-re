package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;

/* renamed from: lyx */
public interface lyx extends ajfb<b> {

    /* renamed from: lyx$b */
    public static abstract class b implements mis<mih, b> {

        /* renamed from: lyx$b$a */
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

        /* renamed from: lyx$b$b */
        public static final class b extends b {
            public final mih a;
            public final boolean b;

            public /* synthetic */ b() {
                this(mih.e, false);
            }

            public b(mih mih, boolean z) {
                akcr.b(mih, "windowRect");
                super();
                this.a = mih;
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
                mih mih = this.a;
                int hashCode = (mih != null ? mih.hashCode() : 0) * 31;
                int i = this.b;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "value");
                if ((akcr.a(this.a, obj) ^ 1) == 0) {
                    return this;
                }
                boolean z = this.b;
                akcr.b(obj, "windowRect");
                return new b(obj, z);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Shown(windowRect=");
                stringBuilder.append(this.a);
                stringBuilder.append(", highlighted=");
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

    /* renamed from: lyx$a */
    public static abstract class a {

        /* renamed from: lyx$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajdp<a> a();
}
