package defpackage;

import android.database.Cursor;

/* renamed from: mpp */
public interface mpp {

    /* renamed from: mpp$a */
    public interface a<T extends mpp> {
    }

    /* renamed from: mpp$d */
    public interface d<T extends f> {
        T create(String str, int i);
    }

    /* renamed from: mpp$g */
    public interface g<T extends i> {
        T create(String str, int i);
    }

    /* renamed from: mpp$b */
    public static final class b<T extends mpp> {
        private a<T> a;

        /* renamed from: mpp$b$a */
        final class a extends ainx {
            private final String[] a;

            a(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT lensId, impressionCount FROM LensStatisticsStorage WHERE lensId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa("LensStatisticsStorage"));
                this.a = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.a;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public b(a<T> aVar) {
            this.a = aVar;
        }

        public static ainx a() {
            return new ainx("SELECT lensId, impressionCount FROM LensStatisticsStorage", new aioa("LensStatisticsStorage"));
        }

        public final ainx a(String[] strArr) {
            return new a(strArr);
        }
    }

    /* renamed from: mpp$e */
    public static final class e<T extends f> implements ainw<T> {
        private final d<T> a;

        public e(d<T> dVar) {
            this.a = dVar;
        }

        public final /* synthetic */ Object map(Cursor cursor) {
            return this.a.create(cursor.getString(0), cursor.getInt(1));
        }
    }

    /* renamed from: mpp$h */
    public static final class h<T extends i> implements ainw<T> {
        private final g<T> a;

        public h(g<T> gVar) {
            this.a = gVar;
        }

        public final /* synthetic */ Object map(Cursor cursor) {
            return this.a.create(cursor.getString(0), cursor.getInt(1));
        }
    }

    /* renamed from: mpp$c */
    public static final class c extends ainy {
        public c(pa paVar) {
            super("LensStatisticsStorage", paVar.a("REPLACE INTO LensStatisticsStorage (_id, lensId, impressionCount)\nSELECT _id, IFNULL(lensId, ?), IFNULL(impressionCount, 1) FROM(\n    SELECT _id, lensId, impressionCount + 1 AS impressionCount FROM LensStatisticsStorage WHERE lensId = ?\n    UNION\n    SELECT NULL, NULL, NULL\n) ORDER BY _id DESC LIMIT 1"));
        }

        public final void a(Object obj, String str) {
            if (obj == null) {
                bindNull(1);
            } else if (obj instanceof String) {
                bindString(1, (String) obj);
            } else {
                throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg1");
            }
            bindString(2, str);
        }
    }

    /* renamed from: mpp$f */
    public interface f {
        int impressionCount();

        String lensId();
    }

    /* renamed from: mpp$i */
    public interface i {
    }

    long _id();

    int impressionCount();

    String lensId();
}
