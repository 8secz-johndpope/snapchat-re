package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import defpackage.jf.b;
import defpackage.ol.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nr */
public final class nr implements a {
    public final ArrayList<b> a;
    public final ArrayList<b> b;
    public int c;
    private jf.a<b> d;
    private a e;
    private boolean f;
    private ol g;

    /* renamed from: nr$a */
    public interface a {
        ViewHolder a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* renamed from: nr$b */
    public static class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append("[");
            int i = this.a;
            String str = i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
            stringBuilder.append(str);
            stringBuilder.append(",s:");
            stringBuilder.append(this.b);
            stringBuilder.append("c:");
            stringBuilder.append(this.d);
            stringBuilder.append(",p:");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public nr(a aVar) {
        this(aVar, (byte) 0);
    }

    private nr(a aVar, byte b) {
        this.d = new b(30);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = 0;
        this.e = aVar;
        this.f = false;
        this.g = new ol(this);
    }

    private void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((b) list.get(i));
        }
        list.clear();
    }

    private void a(b bVar, int i) {
        this.e.a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.e.a(i, bVar.d);
        } else if (i2 == 4) {
            this.e.a(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int b(int i, int i2) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            b bVar = (b) this.b.get(size);
            int i3;
            if (bVar.a == 8) {
                int i4;
                if (bVar.b < bVar.d) {
                    i3 = bVar.b;
                    i4 = bVar.d;
                } else {
                    i3 = bVar.d;
                    i4 = bVar.b;
                }
                if (i < i3 || i > i4) {
                    if (i < bVar.b) {
                        if (i2 == 1) {
                            bVar.b++;
                            i3 = bVar.d + 1;
                        } else if (i2 == 2) {
                            bVar.b--;
                            i3 = bVar.d - 1;
                        }
                        bVar.d = i3;
                    }
                } else if (i3 == bVar.b) {
                    if (i2 == 1) {
                        i3 = bVar.d + 1;
                    } else {
                        if (i2 == 2) {
                            i3 = bVar.d - 1;
                        }
                        i++;
                    }
                    bVar.d = i3;
                    i++;
                } else {
                    if (i2 == 1) {
                        i3 = bVar.b + 1;
                    } else {
                        if (i2 == 2) {
                            i3 = bVar.b - 1;
                        }
                        i--;
                    }
                    bVar.b = i3;
                    i--;
                }
            } else if (bVar.b > i) {
                if (i2 == 1) {
                    i3 = bVar.b + 1;
                } else if (i2 == 2) {
                    i3 = bVar.b - 1;
                }
                bVar.b = i3;
            } else if (bVar.a == 1) {
                i -= bVar.d;
            } else if (bVar.a == 2) {
                i += bVar.d;
            }
        }
        for (i2 = this.b.size() - 1; i2 >= 0; i2--) {
            b bVar2 = (b) this.b.get(i2);
            if (bVar2.a == 8) {
                if (bVar2.d != bVar2.b && bVar2.d >= 0) {
                }
            } else if (bVar2.d > 0) {
            }
            this.b.remove(i2);
            a(bVar2);
        }
        return i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x008e in {7, 9, 10, 17, 19, 20, 22, 24, 27, 28, 29, 32, 33, 35} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void b(defpackage.nr.b r13) {
        /*
        r12 = this;
        r0 = r13.a;
        r1 = 1;
        if (r0 == r1) goto L_0x0086;
        r0 = r13.a;
        r2 = 8;
        if (r0 == r2) goto L_0x0086;
        r0 = r13.b;
        r2 = r13.a;
        r0 = r12.b(r0, r2);
        r2 = r13.b;
        r3 = r13.a;
        r4 = 2;
        r5 = 4;
        r6 = 0;
        if (r3 == r4) goto L_0x0030;
        if (r3 != r5) goto L_0x0020;
        r3 = 1;
        goto L_0x0031;
        r0 = new java.lang.IllegalArgumentException;
        r13 = java.lang.String.valueOf(r13);
        r1 = "op should be remove or update.";
        r13 = r1.concat(r13);
        r0.<init>(r13);
        throw r0;
        r3 = 0;
        r7 = r0;
        r8 = r2;
        r0 = 1;
        r2 = 1;
        r9 = r13.d;
        if (r0 >= r9) goto L_0x0072;
        r9 = r13.b;
        r10 = r3 * r0;
        r9 = r9 + r10;
        r10 = r13.a;
        r9 = r12.b(r9, r10);
        r10 = r13.a;
        if (r10 == r4) goto L_0x0052;
        if (r10 == r5) goto L_0x004c;
        r10 = 0;
        goto L_0x0055;
        r10 = r7 + 1;
        if (r9 != r10) goto L_0x004a;
        r10 = 1;
        goto L_0x0055;
        if (r9 != r7) goto L_0x004a;
        goto L_0x0050;
        if (r10 == 0) goto L_0x005a;
        r2 = r2 + 1;
        goto L_0x006f;
        r10 = r13.a;
        r11 = r13.c;
        r7 = r12.a(r10, r7, r2, r11);
        r12.a(r7, r8);
        r12.a(r7);
        r7 = r13.a;
        if (r7 != r5) goto L_0x006d;
        r8 = r8 + r2;
        r7 = r9;
        r2 = 1;
        r0 = r0 + 1;
        goto L_0x0035;
        r0 = r13.c;
        r12.a(r13);
        if (r2 <= 0) goto L_0x0085;
        r13 = r13.a;
        r13 = r12.a(r13, r7, r2, r0);
        r12.a(r13, r8);
        r12.a(r13);
        return;
        r13 = new java.lang.IllegalArgumentException;
        r0 = "should not dispatch add or move for pre layout";
        r13.<init>(r0);
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr.b(nr$b):void");
    }

    private void c(b bVar) {
        this.b.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.e.c(bVar.b, bVar.d);
        } else if (i == 2) {
            this.e.b(bVar.b, bVar.d);
        } else if (i == 4) {
            this.e.a(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.e.d(bVar.b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(bVar)));
        }
    }

    private boolean c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.b.get(i2);
            if (bVar.a == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.a == 1) {
                int i3 = bVar.b + bVar.d;
                for (int i4 = bVar.b; i4 < i3; i4++) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final int a(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            b bVar = (b) this.b.get(i2);
            if (bVar.a == 8) {
                if (bVar.b == i) {
                    i = bVar.d;
                } else {
                    if (bVar.b < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else if (bVar.b > i) {
                continue;
            } else if (bVar.a == 2) {
                if (i < bVar.b + bVar.d) {
                    return -1;
                }
                i -= bVar.d;
            } else if (bVar.a == 1) {
                i += bVar.d;
            }
            i2++;
        }
        return i;
    }

    public final b a(int i, int i2, int i3, Object obj) {
        b bVar = (b) this.d.a();
        if (bVar == null) {
            return new b(i, i2, i3, obj);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    public final void a() {
        a(this.a);
        a(this.b);
        this.c = 0;
    }

    public final void a(b bVar) {
        bVar.c = null;
        this.d.a(bVar);
    }

    public final boolean a(int i) {
        return (i & this.c) != 0;
    }

    public final int b(int i) {
        return a(i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0006 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0006 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:83:0x0179, code skipped:
            if (r11.d > r12.b) goto L_0x01ab;
     */
    /* JADX WARNING: Missing block: B:95:0x01a9, code skipped:
            if (r11.d >= r12.b) goto L_0x01ab;
     */
    /* JADX WARNING: Missing block: B:140:0x0269, code skipped:
            if (r15 == null) goto L_0x02bb;
     */
    /* JADX WARNING: Missing block: B:162:0x02b9, code skipped:
            if (r14 == null) goto L_0x02bb;
     */
    public final void b() {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.g;
        r2 = r0.a;
    L_0x0006:
        r3 = r2.size();
        r4 = 1;
        r3 = r3 - r4;
        r6 = 0;
    L_0x000d:
        r7 = 8;
        r8 = -1;
        if (r3 < 0) goto L_0x0023;
    L_0x0012:
        r9 = r2.get(r3);
        r9 = (defpackage.nr.b) r9;
        r9 = r9.a;
        if (r9 != r7) goto L_0x001f;
    L_0x001c:
        if (r6 == 0) goto L_0x0020;
    L_0x001e:
        goto L_0x0024;
    L_0x001f:
        r6 = 1;
    L_0x0020:
        r3 = r3 + -1;
        goto L_0x000d;
    L_0x0023:
        r3 = -1;
    L_0x0024:
        r6 = 0;
        r9 = 4;
        r10 = 2;
        if (r3 == r8) goto L_0x0201;
    L_0x0029:
        r7 = r3 + 1;
        r11 = r2.get(r3);
        r11 = (defpackage.nr.b) r11;
        r12 = r2.get(r7);
        r12 = (defpackage.nr.b) r12;
        r13 = r12.a;
        if (r13 == r4) goto L_0x01c9;
    L_0x003b:
        if (r13 == r10) goto L_0x00b4;
    L_0x003d:
        if (r13 == r9) goto L_0x0040;
    L_0x003f:
        goto L_0x0006;
    L_0x0040:
        r5 = r11.d;
        r8 = r12.b;
        if (r5 >= r8) goto L_0x004c;
    L_0x0046:
        r5 = r12.b;
        r5 = r5 - r4;
        r12.b = r5;
        goto L_0x0065;
    L_0x004c:
        r5 = r11.d;
        r8 = r12.b;
        r10 = r12.d;
        r8 = r8 + r10;
        if (r5 >= r8) goto L_0x0065;
    L_0x0055:
        r5 = r12.d;
        r5 = r5 - r4;
        r12.d = r5;
        r5 = r1.a;
        r8 = r11.b;
        r10 = r12.c;
        r5 = r5.a(r9, r8, r4, r10);
        goto L_0x0066;
    L_0x0065:
        r5 = r6;
    L_0x0066:
        r8 = r11.b;
        r10 = r12.b;
        if (r8 > r10) goto L_0x0072;
    L_0x006c:
        r8 = r12.b;
        r8 = r8 + r4;
        r12.b = r8;
        goto L_0x0094;
    L_0x0072:
        r8 = r11.b;
        r10 = r12.b;
        r13 = r12.d;
        r10 = r10 + r13;
        if (r8 >= r10) goto L_0x0094;
    L_0x007b:
        r6 = r12.b;
        r8 = r12.d;
        r6 = r6 + r8;
        r8 = r11.b;
        r6 = r6 - r8;
        r8 = r1.a;
        r10 = r11.b;
        r10 = r10 + r4;
        r4 = r12.c;
        r4 = r8.a(r9, r10, r6, r4);
        r8 = r12.d;
        r8 = r8 - r6;
        r12.d = r8;
        goto L_0x0095;
    L_0x0094:
        r4 = r6;
    L_0x0095:
        r2.set(r7, r11);
        r6 = r12.d;
        if (r6 <= 0) goto L_0x00a0;
    L_0x009c:
        r2.set(r3, r12);
        goto L_0x00a8;
    L_0x00a0:
        r2.remove(r3);
        r6 = r1.a;
        r6.a(r12);
    L_0x00a8:
        if (r5 == 0) goto L_0x00ad;
    L_0x00aa:
        r2.add(r3, r5);
    L_0x00ad:
        if (r4 == 0) goto L_0x0006;
    L_0x00af:
        r2.add(r3, r4);
        goto L_0x0006;
    L_0x00b4:
        r8 = r11.b;
        r9 = r11.d;
        if (r8 >= r9) goto L_0x00ce;
    L_0x00ba:
        r8 = r12.b;
        r9 = r11.b;
        if (r8 != r9) goto L_0x00cb;
    L_0x00c0:
        r8 = r12.d;
        r9 = r11.d;
        r13 = r11.b;
        r9 = r9 - r13;
        if (r8 != r9) goto L_0x00cb;
    L_0x00c9:
        r5 = 1;
        goto L_0x00cc;
    L_0x00cb:
        r5 = 0;
    L_0x00cc:
        r8 = 0;
        goto L_0x00e2;
    L_0x00ce:
        r8 = r12.b;
        r9 = r11.d;
        r9 = r9 + r4;
        if (r8 != r9) goto L_0x00e0;
    L_0x00d5:
        r8 = r12.d;
        r9 = r11.b;
        r13 = r11.d;
        r9 = r9 - r13;
        if (r8 != r9) goto L_0x00e0;
    L_0x00de:
        r5 = 1;
        goto L_0x00e1;
    L_0x00e0:
        r5 = 0;
    L_0x00e1:
        r8 = 1;
    L_0x00e2:
        r9 = r11.d;
        r13 = r12.b;
        if (r9 >= r13) goto L_0x00ee;
    L_0x00e8:
        r9 = r12.b;
        r9 = r9 - r4;
        r12.b = r9;
        goto L_0x010e;
    L_0x00ee:
        r9 = r11.d;
        r13 = r12.b;
        r14 = r12.d;
        r13 = r13 + r14;
        if (r9 >= r13) goto L_0x010e;
    L_0x00f7:
        r3 = r12.d;
        r3 = r3 - r4;
        r12.d = r3;
        r11.a = r10;
        r11.d = r4;
        r3 = r12.d;
        if (r3 != 0) goto L_0x0006;
    L_0x0104:
        r2.remove(r7);
        r3 = r1.a;
        r3.a(r12);
        goto L_0x0006;
    L_0x010e:
        r9 = r11.b;
        r13 = r12.b;
        if (r9 > r13) goto L_0x011a;
    L_0x0114:
        r9 = r12.b;
        r9 = r9 + r4;
        r12.b = r9;
        goto L_0x013b;
    L_0x011a:
        r9 = r11.b;
        r13 = r12.b;
        r14 = r12.d;
        r13 = r13 + r14;
        if (r9 >= r13) goto L_0x013b;
    L_0x0123:
        r9 = r12.b;
        r13 = r12.d;
        r9 = r9 + r13;
        r13 = r11.b;
        r9 = r9 - r13;
        r13 = r1.a;
        r14 = r11.b;
        r14 = r14 + r4;
        r6 = r13.a(r10, r14, r9, r6);
        r4 = r11.b;
        r9 = r12.b;
        r4 = r4 - r9;
        r12.d = r4;
    L_0x013b:
        if (r5 == 0) goto L_0x014a;
    L_0x013d:
        r2.set(r3, r12);
        r2.remove(r7);
        r3 = r1.a;
        r3.a(r11);
        goto L_0x0006;
    L_0x014a:
        if (r8 == 0) goto L_0x017c;
    L_0x014c:
        if (r6 == 0) goto L_0x0168;
    L_0x014e:
        r4 = r11.b;
        r5 = r6.b;
        if (r4 <= r5) goto L_0x015b;
    L_0x0154:
        r4 = r11.b;
        r5 = r6.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x015b:
        r4 = r11.d;
        r5 = r6.b;
        if (r4 <= r5) goto L_0x0168;
    L_0x0161:
        r4 = r11.d;
        r5 = r6.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x0168:
        r4 = r11.b;
        r5 = r12.b;
        if (r4 <= r5) goto L_0x0175;
    L_0x016e:
        r4 = r11.b;
        r5 = r12.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x0175:
        r4 = r11.d;
        r5 = r12.b;
        if (r4 <= r5) goto L_0x01b2;
    L_0x017b:
        goto L_0x01ab;
    L_0x017c:
        if (r6 == 0) goto L_0x0198;
    L_0x017e:
        r4 = r11.b;
        r5 = r6.b;
        if (r4 < r5) goto L_0x018b;
    L_0x0184:
        r4 = r11.b;
        r5 = r6.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x018b:
        r4 = r11.d;
        r5 = r6.b;
        if (r4 < r5) goto L_0x0198;
    L_0x0191:
        r4 = r11.d;
        r5 = r6.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x0198:
        r4 = r11.b;
        r5 = r12.b;
        if (r4 < r5) goto L_0x01a5;
    L_0x019e:
        r4 = r11.b;
        r5 = r12.d;
        r4 = r4 - r5;
        r11.b = r4;
    L_0x01a5:
        r4 = r11.d;
        r5 = r12.b;
        if (r4 < r5) goto L_0x01b2;
    L_0x01ab:
        r4 = r11.d;
        r5 = r12.d;
        r4 = r4 - r5;
        r11.d = r4;
    L_0x01b2:
        r2.set(r3, r12);
        r4 = r11.b;
        r5 = r11.d;
        if (r4 == r5) goto L_0x01bf;
    L_0x01bb:
        r2.set(r7, r11);
        goto L_0x01c2;
    L_0x01bf:
        r2.remove(r7);
    L_0x01c2:
        if (r6 == 0) goto L_0x0006;
    L_0x01c4:
        r2.add(r3, r6);
        goto L_0x0006;
    L_0x01c9:
        r4 = r11.d;
        r6 = r12.b;
        if (r4 >= r6) goto L_0x01d1;
    L_0x01cf:
        r5 = -1;
        goto L_0x01d2;
    L_0x01d1:
        r5 = 0;
    L_0x01d2:
        r4 = r11.b;
        r6 = r12.b;
        if (r4 >= r6) goto L_0x01da;
    L_0x01d8:
        r5 = r5 + 1;
    L_0x01da:
        r4 = r12.b;
        r6 = r11.b;
        if (r4 > r6) goto L_0x01e7;
    L_0x01e0:
        r4 = r11.b;
        r6 = r12.d;
        r4 = r4 + r6;
        r11.b = r4;
    L_0x01e7:
        r4 = r12.b;
        r6 = r11.d;
        if (r4 > r6) goto L_0x01f4;
    L_0x01ed:
        r4 = r11.d;
        r6 = r12.d;
        r4 = r4 + r6;
        r11.d = r4;
    L_0x01f4:
        r4 = r12.b;
        r4 = r4 + r5;
        r12.b = r4;
        r2.set(r3, r12);
        r2.set(r7, r11);
        goto L_0x0006;
    L_0x0201:
        r1 = r0.a;
        r1 = r1.size();
        r2 = 0;
    L_0x0208:
        if (r2 >= r1) goto L_0x02c6;
    L_0x020a:
        r3 = r0.a;
        r3 = r3.get(r2);
        r3 = (defpackage.nr.b) r3;
        r11 = r3.a;
        if (r11 == r4) goto L_0x02bf;
    L_0x0216:
        if (r11 == r10) goto L_0x026c;
    L_0x0218:
        if (r11 == r9) goto L_0x021e;
    L_0x021a:
        if (r11 == r7) goto L_0x02bf;
    L_0x021c:
        goto L_0x02c2;
    L_0x021e:
        r11 = r3.b;
        r12 = r3.b;
        r13 = r3.d;
        r12 = r12 + r13;
        r13 = r3.b;
        r14 = r11;
        r11 = 0;
        r15 = -1;
    L_0x022a:
        if (r13 >= r12) goto L_0x025c;
    L_0x022c:
        r5 = r0.e;
        r5 = r5.a(r13);
        if (r5 != 0) goto L_0x024a;
    L_0x0234:
        r5 = r0.c(r13);
        if (r5 == 0) goto L_0x023b;
    L_0x023a:
        goto L_0x024a;
    L_0x023b:
        if (r15 != r4) goto L_0x0248;
    L_0x023d:
        r5 = r3.c;
        r5 = r0.a(r9, r14, r11, r5);
        r0.c(r5);
        r14 = r13;
        r11 = 0;
    L_0x0248:
        r15 = 0;
        goto L_0x0258;
    L_0x024a:
        if (r15 != 0) goto L_0x0257;
    L_0x024c:
        r5 = r3.c;
        r5 = r0.a(r9, r14, r11, r5);
        r0.b(r5);
        r14 = r13;
        r11 = 0;
    L_0x0257:
        r15 = 1;
    L_0x0258:
        r11 = r11 + r4;
        r13 = r13 + 1;
        goto L_0x022a;
    L_0x025c:
        r5 = r3.d;
        if (r11 == r5) goto L_0x0269;
    L_0x0260:
        r5 = r3.c;
        r0.a(r3);
        r3 = r0.a(r9, r14, r11, r5);
    L_0x0269:
        if (r15 != 0) goto L_0x02bf;
    L_0x026b:
        goto L_0x02bb;
    L_0x026c:
        r5 = r3.b;
        r11 = r3.b;
        r12 = r3.d;
        r11 = r11 + r12;
        r12 = r3.b;
        r13 = 0;
        r14 = -1;
    L_0x0277:
        if (r12 >= r11) goto L_0x02ae;
    L_0x0279:
        r15 = r0.e;
        r15 = r15.a(r12);
        if (r15 != 0) goto L_0x0296;
    L_0x0281:
        r15 = r0.c(r12);
        if (r15 == 0) goto L_0x0288;
    L_0x0287:
        goto L_0x0296;
    L_0x0288:
        if (r14 != r4) goto L_0x0293;
    L_0x028a:
        r14 = r0.a(r10, r5, r13, r6);
        r0.c(r14);
        r14 = 1;
        goto L_0x0294;
    L_0x0293:
        r14 = 0;
    L_0x0294:
        r15 = 0;
        goto L_0x02a3;
    L_0x0296:
        if (r14 != 0) goto L_0x02a1;
    L_0x0298:
        r14 = r0.a(r10, r5, r13, r6);
        r0.b(r14);
        r14 = 1;
        goto L_0x02a2;
    L_0x02a1:
        r14 = 0;
    L_0x02a2:
        r15 = 1;
    L_0x02a3:
        if (r14 == 0) goto L_0x02a9;
    L_0x02a5:
        r12 = r12 - r13;
        r11 = r11 - r13;
        r13 = 1;
        goto L_0x02ab;
    L_0x02a9:
        r13 = r13 + 1;
    L_0x02ab:
        r12 = r12 + r4;
        r14 = r15;
        goto L_0x0277;
    L_0x02ae:
        r11 = r3.d;
        if (r13 == r11) goto L_0x02b9;
    L_0x02b2:
        r0.a(r3);
        r3 = r0.a(r10, r5, r13, r6);
    L_0x02b9:
        if (r14 != 0) goto L_0x02bf;
    L_0x02bb:
        r0.b(r3);
        goto L_0x02c2;
    L_0x02bf:
        r0.c(r3);
    L_0x02c2:
        r2 = r2 + 1;
        goto L_0x0208;
    L_0x02c6:
        r1 = r0.a;
        r1.clear();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr.b():void");
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.b((b) this.b.get(i));
        }
        a(this.b);
        this.c = 0;
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.a.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.e.b(bVar);
                this.e.c(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.e.b(bVar);
                this.e.a(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.e.b(bVar);
                this.e.a(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.e.b(bVar);
                this.e.d(bVar.b, bVar.d);
            }
        }
        a(this.a);
        this.c = 0;
    }
}
