package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: akub */
public final class akub {
    final akqx a;
    final Locale b;
    akrc c;
    Integer d;
    Integer e;
    a[] f;
    int g;
    boolean h;
    private final long i = 0;
    private final int j;
    private final akrc k;
    private final Integer l;
    private Object m;

    /* renamed from: akub$a */
    static class a implements Comparable<a> {
        akqz a;
        int b;
        String c;
        Locale d;

        a() {
        }

        /* renamed from: a */
        public final int compareTo(a aVar) {
            akqz akqz = aVar.a;
            int a = akub.a(this.a.e(), akqz.e());
            return a != 0 ? a : akub.a(this.a.d(), akqz.d());
        }

        /* Access modifiers changed, original: final */
        public final long a(long j, boolean z) {
            String str = this.c;
            j = str == null ? this.a.c(j, this.b) : this.a.a(j, str, this.d);
            return z ? this.a.d(j) : j;
        }

        /* Access modifiers changed, original: final */
        public final void a(akqz akqz, int i) {
            this.a = akqz;
            this.b = i;
            this.c = null;
            this.d = null;
        }
    }

    /* renamed from: akub$b */
    class b {
        private akrc a;
        private Integer b;
        private a[] c;
        private int d;

        b() {
            this.a = akub.this.c;
            this.b = akub.this.d;
            this.c = akub.this.f;
            this.d = akub.this.g;
        }

        /* Access modifiers changed, original: final */
        public final boolean a(akub akub) {
            if (akub != akub.this) {
                return false;
            }
            akub.c = this.a;
            akub.d = this.b;
            akub.f = this.c;
            if (this.d < akub.g) {
                akub.h = true;
            }
            akub.g = this.d;
            return true;
        }
    }

    public akub(akqx akqx, Locale locale, Integer num, int i) {
        akqx = akrb.a(akqx);
        this.k = akqx.a();
        this.a = akqx.b();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.b = locale;
        this.j = i;
        this.l = num;
        this.c = this.k;
        this.e = this.l;
        this.f = new a[8];
    }

    static int a(akrf akrf, akrf akrf2) {
        return (akrf == null || !akrf.b()) ? (akrf2 == null || !akrf2.b()) ? 0 : -1 : (akrf2 == null || !akrf2.b()) ? 1 : -akrf.compareTo(akrf2);
    }

    /* Access modifiers changed, original: final */
    public final long a(akug akug, CharSequence charSequence) {
        int a = akug.a(this, charSequence, 0);
        if (a < 0) {
            a ^= -1;
        } else if (a >= charSequence.length()) {
            return a(charSequence);
        }
        throw new IllegalArgumentException(akud.a(charSequence.toString(), a));
    }

    public final long a(CharSequence charSequence) {
        Object[] objArr;
        int i;
        int i2;
        String str;
        StringBuilder stringBuilder;
        while (true) {
            objArr = this.f;
            i = this.g;
            if (this.h) {
                objArr = (a[]) objArr.clone();
                this.f = objArr;
                this.h = false;
            }
            if (i > 10) {
                Arrays.sort(objArr, 0, i);
            } else {
                for (i2 = 0; i2 < i; i2++) {
                    for (int i3 = i2; i3 > 0; i3--) {
                        int i4 = i3 - 1;
                        if (objArr[i4].compareTo(objArr[i3]) <= 0) {
                            break;
                        }
                        Object obj = objArr[i3];
                        objArr[i3] = objArr[i4];
                        objArr[i4] = obj;
                    }
                }
            }
            if (i <= 0) {
                break;
            }
            akrf a = akrg.e.a(this.a);
            akrf a2 = akrg.g.a(this.a);
            akrf d = objArr[0].a.d();
            if (akub.a(d, a) < 0 || akub.a(d, a2) > 0) {
                break;
            }
            a(akra.e, this.j);
        }
        long j = 0;
        i2 = 0;
        while (true) {
            str = "Cannot parse \"";
            if (i2 >= i) {
                break;
            }
            try {
                j = objArr[i2].a(j, true);
                i2++;
            } catch (akri e) {
                if (charSequence != null) {
                    stringBuilder = new StringBuilder(str);
                    stringBuilder.append(charSequence);
                    stringBuilder.append('\"');
                    String stringBuilder2 = stringBuilder.toString();
                    if (e.a != null) {
                        if (stringBuilder2 != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(stringBuilder2);
                            stringBuilder.append(": ");
                            stringBuilder.append(e.a);
                            stringBuilder2 = stringBuilder.toString();
                        }
                    }
                    e.a = stringBuilder2;
                }
                throw e;
            }
        }
        i2 = 0;
        while (i2 < i) {
            j = objArr[i2].a(j, i2 == i + -1);
            i2++;
        }
        Integer num = this.d;
        if (num != null) {
            return j - ((long) num.intValue());
        }
        akrc akrc = this.c;
        if (akrc == null) {
            return j;
        }
        int e2 = akrc.e(j);
        j -= (long) e2;
        if (e2 == this.c.b(j)) {
            return j;
        }
        StringBuilder stringBuilder3 = new StringBuilder("Illegal instant due to time zone offset transition (");
        stringBuilder3.append(this.c);
        stringBuilder3.append(')');
        String stringBuilder4 = stringBuilder3.toString();
        if (charSequence != null) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(charSequence);
            stringBuilder.append("\": ");
            stringBuilder.append(stringBuilder4);
            stringBuilder4 = stringBuilder.toString();
        }
        throw new akrj(stringBuilder4);
    }

    /* Access modifiers changed, original: final */
    public final a a() {
        a[] aVarArr = this.f;
        int i = this.g;
        if (i == aVarArr.length || this.h) {
            a[] aVarArr2 = new a[(i == aVarArr.length ? i << 1 : aVarArr.length)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
            this.f = aVarArr2;
            this.h = false;
            aVarArr = aVarArr2;
        }
        this.m = null;
        a aVar = aVarArr[i];
        if (aVar == null) {
            aVar = new a();
            aVarArr[i] = aVar;
        }
        this.g = i + 1;
        return aVar;
    }

    public final void a(akra akra, int i) {
        a().a(akra.a(this.a), i);
    }

    public final void a(akrc akrc) {
        this.m = null;
        this.c = akrc;
    }

    public final void a(Integer num) {
        this.m = null;
        this.d = num;
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof b) || !((b) obj).a(this)) {
            return false;
        }
        this.m = obj;
        return true;
    }

    public final Object b() {
        if (this.m == null) {
            this.m = new b();
        }
        return this.m;
    }
}
