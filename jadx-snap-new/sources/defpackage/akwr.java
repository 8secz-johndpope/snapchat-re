package defpackage;

import defpackage.akhp.a;

/* renamed from: akwr */
final class akwr {
    private static final char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String a;
    a b;
    akhu c;
    private final String e;
    private final akhm f;
    private akhm.a g;
    private final akht.a h = new akht.a();
    private akho i;
    private final boolean j;
    private akhj.a k;

    /* renamed from: akwr$a */
    static class a extends akhu {
        private final akhu a;
        private final akho b;

        a(akhu akhu, akho akho) {
            this.a = akhu;
            this.b = akho;
        }

        public final long contentLength() {
            return this.a.contentLength();
        }

        public final akho contentType() {
            return this.b;
        }

        public final void writeTo(akke akke) {
            this.a.writeTo(akke);
        }
    }

    akwr(String str, akhm akhm, String str2, akhl akhl, akho akho, boolean z, boolean z2, boolean z3) {
        this.e = str;
        this.f = akhm;
        this.a = str2;
        this.i = akho;
        this.j = z;
        if (akhl != null) {
            this.h.a(akhl);
        }
        if (z2) {
            this.k = new akhj.a();
            return;
        }
        if (z3) {
            this.b = new a();
            this.b.a(akhp.b);
        }
    }

    static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            String str2 = " \"<>^`{}|\\?#";
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                akkd akkd = new akkd();
                akkd.a(str, 0, i);
                akkd akkd2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!(z && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13))) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || str2.indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (akkd2 == null) {
                                akkd2 = new akkd();
                            }
                            akkd2.a(codePointAt2);
                            while (!akkd2.d()) {
                                int g = akkd2.g() & 255;
                                akkd.j(37);
                                akkd.j(d[(g >> 4) & 15]);
                                akkd.j(d[g & 15]);
                            }
                        } else {
                            akkd.a(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return akkd.n();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* Access modifiers changed, original: final */
    public final akht a() {
        akhm b;
        akhm.a aVar = this.g;
        if (aVar != null) {
            b = aVar.b();
        } else {
            b = this.f.c(this.a);
            if (b == null) {
                StringBuilder stringBuilder = new StringBuilder("Malformed URL. Base: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        akhu akhu = this.c;
        if (akhu == null) {
            akhj.a aVar2 = this.k;
            if (aVar2 != null) {
                akhu = new akhj(aVar2.a, aVar2.b);
            } else {
                a aVar3 = this.b;
                if (aVar3 != null) {
                    akhu = aVar3.a();
                } else if (this.j) {
                    akhu = akhu.create(null, new byte[0]);
                }
            }
        }
        akho akho = this.i;
        if (akho != null) {
            if (akhu != null) {
                akhu = new a(akhu, akho);
            } else {
                this.h.b("Content-Type", akho.toString());
            }
        }
        return this.h.a(b).a(this.e, akhu).a();
    }

    /* Access modifiers changed, original: final */
    public final void a(akhl akhl, akhu akhu) {
        this.b.a(akhl, akhu);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            akho a = akho.a(str2);
            if (a != null) {
                this.i = a;
                return;
            } else {
                throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)));
            }
        }
        this.h.b(str, str2);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2, boolean z) {
        String str3 = this.a;
        if (str3 != null) {
            this.g = this.f.d(str3);
            if (this.g != null) {
                this.a = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Malformed URL. Base: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (z) {
            this.g.b(str, str2);
        } else {
            this.g.a(str, str2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.k.b(str, str2);
        } else {
            this.k.a(str, str2);
        }
    }
}
