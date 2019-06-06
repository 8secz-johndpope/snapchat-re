package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.akrp.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aktz */
public final class aktz {
    private ArrayList<Object> a = new ArrayList();
    private Object b;

    /* renamed from: aktz$b */
    static class b implements akug, akui {
        private final akui[] a;
        private final akug[] b;
        private final int c;
        private final int d;

        b(List<Object> list) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            b.a((List) list, arrayList, arrayList2);
            int i = 0;
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.a = null;
                this.c = 0;
            } else {
                int size = arrayList.size();
                this.a = new akui[size];
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    akui akui = (akui) arrayList.get(i3);
                    i2 += akui.a();
                    this.a[i3] = akui;
                }
                this.c = i2;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.b = null;
                this.d = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.b = new akug[size2];
            int i4 = 0;
            while (i < size2) {
                akug akug = (akug) arrayList2.get(i);
                i4 += akug.b();
                this.b[i] = akug;
                i++;
            }
            this.d = i4;
        }

        private static void a(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof b) {
                    b.a(list2, ((b) obj).a);
                } else {
                    list2.add(obj);
                }
                obj = list.get(i + 1);
                if (obj instanceof b) {
                    b.a(list3, ((b) obj).b);
                } else {
                    list3.add(obj);
                }
            }
        }

        private static void a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        public final int a() {
            return this.c;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x001a in {5, 6, 8} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final int a(defpackage.akub r5, java.lang.CharSequence r6, int r7) {
            /*
            r4 = this;
            r0 = r4.b;
            if (r0 == 0) goto L_0x0014;
            r1 = r0.length;
            r2 = 0;
            if (r2 >= r1) goto L_0x0013;
            if (r7 < 0) goto L_0x0013;
            r3 = r0[r2];
            r7 = r3.a(r5, r6, r7);
            r2 = r2 + 1;
            goto L_0x0006;
            return r7;
            r5 = new java.lang.UnsupportedOperationException;
            r5.<init>();
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$b.a(akub, java.lang.CharSequence, int):int");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x002b in {3, 4, 7, 8, 10} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(java.lang.Appendable r14, long r15, defpackage.akqx r17, int r18, defpackage.akrc r19, java.util.Locale r20) {
            /*
            r13 = this;
            r0 = r13;
            r1 = r0.a;
            if (r1 == 0) goto L_0x0025;
            if (r20 != 0) goto L_0x000c;
            r2 = java.util.Locale.getDefault();
            goto L_0x000e;
            r2 = r20;
            r11 = r1.length;
            r3 = 0;
            r12 = 0;
            if (r12 >= r11) goto L_0x0024;
            r3 = r1[r12];
            r4 = r14;
            r5 = r15;
            r7 = r17;
            r8 = r18;
            r9 = r19;
            r10 = r2;
            r3.a(r4, r5, r7, r8, r9, r10);
            r12 = r12 + 1;
            goto L_0x0011;
            return;
            r1 = new java.lang.UnsupportedOperationException;
            r1.<init>();
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$b.a(java.lang.Appendable, long, akqx, int, akrc, java.util.Locale):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x001d in {3, 6, 7, 9} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(java.lang.Appendable r5, defpackage.akrx r6, java.util.Locale r7) {
            /*
            r4 = this;
            r0 = r4.a;
            if (r0 == 0) goto L_0x0017;
            if (r7 != 0) goto L_0x000a;
            r7 = java.util.Locale.getDefault();
            r1 = r0.length;
            r2 = 0;
            if (r2 >= r1) goto L_0x0016;
            r3 = r0[r2];
            r3.a(r5, r6, r7);
            r2 = r2 + 1;
            goto L_0x000c;
            return;
            r5 = new java.lang.UnsupportedOperationException;
            r5.<init>();
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$b.a(java.lang.Appendable, akrx, java.util.Locale):void");
        }

        public final int b() {
            return this.d;
        }

        /* Access modifiers changed, original: final */
        public final boolean c() {
            return this.a != null;
        }

        /* Access modifiers changed, original: final */
        public final boolean d() {
            return this.b != null;
        }
    }

    /* renamed from: aktz$l */
    static class l implements akug, akui {
        private final String a;
        private final String b;
        private final boolean c;
        private final int d;
        private final int e;

        l(String str, String str2, boolean z, int i) {
            this.a = str;
            this.b = str2;
            this.c = z;
            if (i >= 2) {
                this.d = 2;
                this.e = i;
                return;
            }
            throw new IllegalArgumentException();
        }

        private static int a(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (i2 = Math.min(charSequence.length() - i, i2); i2 > 0; i2--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final int a() {
            int i = this.c ? 7 : 6;
            String str = this.a;
            return (str == null || str.length() <= i) ? i : this.a.length();
        }

        /* JADX WARNING: Missing block: B:7:0x0020, code skipped:
            if (r1 != '+') goto L_0x0022;
     */
        /* JADX WARNING: Missing block: B:38:0x007f, code skipped:
            if (r6 <= '9') goto L_0x0081;
     */
        public final int a(defpackage.akub r12, java.lang.CharSequence r13, int r14) {
            /*
            r11 = this;
            r0 = r13.length();
            r0 = r0 - r14;
            r1 = r11.b;
            r2 = 43;
            r3 = 45;
            r4 = 0;
            r5 = java.lang.Integer.valueOf(r4);
            if (r1 == 0) goto L_0x0039;
        L_0x0012:
            r1 = r1.length();
            if (r1 != 0) goto L_0x0026;
        L_0x0018:
            if (r0 <= 0) goto L_0x0022;
        L_0x001a:
            r1 = r13.charAt(r14);
            if (r1 == r3) goto L_0x0039;
        L_0x0020:
            if (r1 == r2) goto L_0x0039;
        L_0x0022:
            r12.a(r5);
            return r14;
        L_0x0026:
            r1 = r11.b;
            r1 = defpackage.aktz.b(r13, r14, r1);
            if (r1 == 0) goto L_0x0039;
        L_0x002e:
            r12.a(r5);
            r12 = r11.b;
            r12 = r12.length();
            r14 = r14 + r12;
            return r14;
        L_0x0039:
            r1 = 1;
            if (r0 > r1) goto L_0x003f;
        L_0x003c:
            r12 = r14 ^ -1;
            return r12;
        L_0x003f:
            r5 = r13.charAt(r14);
            if (r5 != r3) goto L_0x0047;
        L_0x0045:
            r2 = 1;
            goto L_0x004a;
        L_0x0047:
            if (r5 != r2) goto L_0x011f;
        L_0x0049:
            r2 = 0;
        L_0x004a:
            r0 = r0 + -1;
            r14 = r14 + r1;
            r3 = 2;
            r5 = defpackage.aktz.l.a(r13, r14, r3);
            if (r5 >= r3) goto L_0x0057;
        L_0x0054:
            r12 = r14 ^ -1;
            return r12;
        L_0x0057:
            r5 = defpackage.akud.a(r13, r14);
            r6 = 23;
            if (r5 <= r6) goto L_0x0062;
        L_0x005f:
            r12 = r14 ^ -1;
            return r12;
        L_0x0062:
            r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
            r5 = r5 * r6;
            r0 = r0 + -2;
            r14 = r14 + r3;
            if (r0 <= 0) goto L_0x0114;
        L_0x006b:
            r6 = r13.charAt(r14);
            r7 = 58;
            r8 = 48;
            if (r6 != r7) goto L_0x007b;
        L_0x0075:
            r0 = r0 + -1;
            r14 = r14 + 1;
            r4 = 1;
            goto L_0x0081;
        L_0x007b:
            if (r6 < r8) goto L_0x0114;
        L_0x007d:
            r9 = 57;
            if (r6 > r9) goto L_0x0114;
        L_0x0081:
            r6 = defpackage.aktz.l.a(r13, r14, r3);
            if (r6 != 0) goto L_0x0089;
        L_0x0087:
            if (r4 == 0) goto L_0x0114;
        L_0x0089:
            if (r6 >= r3) goto L_0x008e;
        L_0x008b:
            r12 = r14 ^ -1;
            return r12;
        L_0x008e:
            r6 = defpackage.akud.a(r13, r14);
            r9 = 59;
            if (r6 <= r9) goto L_0x0099;
        L_0x0096:
            r12 = r14 ^ -1;
            return r12;
        L_0x0099:
            r10 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
            r6 = r6 * r10;
            r5 = r5 + r6;
            r0 = r0 + -2;
            r14 = r14 + 2;
            if (r0 <= 0) goto L_0x0114;
        L_0x00a4:
            if (r4 == 0) goto L_0x00b0;
        L_0x00a6:
            r6 = r13.charAt(r14);
            if (r6 != r7) goto L_0x0114;
        L_0x00ac:
            r0 = r0 + -1;
            r14 = r14 + 1;
        L_0x00b0:
            r6 = defpackage.aktz.l.a(r13, r14, r3);
            if (r6 != 0) goto L_0x00b8;
        L_0x00b6:
            if (r4 == 0) goto L_0x0114;
        L_0x00b8:
            if (r6 >= r3) goto L_0x00bd;
        L_0x00ba:
            r12 = r14 ^ -1;
            return r12;
        L_0x00bd:
            r6 = defpackage.akud.a(r13, r14);
            if (r6 <= r9) goto L_0x00c6;
        L_0x00c3:
            r12 = r14 ^ -1;
            return r12;
        L_0x00c6:
            r6 = r6 * 1000;
            r5 = r5 + r6;
            r0 = r0 + -2;
            r14 = r14 + 2;
            if (r0 <= 0) goto L_0x0114;
        L_0x00cf:
            if (r4 == 0) goto L_0x00e3;
        L_0x00d1:
            r0 = r13.charAt(r14);
            r6 = 46;
            if (r0 == r6) goto L_0x00e1;
        L_0x00d9:
            r0 = r13.charAt(r14);
            r6 = 44;
            if (r0 != r6) goto L_0x0114;
        L_0x00e1:
            r14 = r14 + 1;
        L_0x00e3:
            r0 = 3;
            r0 = defpackage.aktz.l.a(r13, r14, r0);
            if (r0 != 0) goto L_0x00ec;
        L_0x00ea:
            if (r4 == 0) goto L_0x0114;
        L_0x00ec:
            if (r0 > 0) goto L_0x00f1;
        L_0x00ee:
            r12 = r14 ^ -1;
            return r12;
        L_0x00f1:
            r4 = r14 + 1;
            r14 = r13.charAt(r14);
            r14 = r14 - r8;
            r14 = r14 * 100;
            r5 = r5 + r14;
            if (r0 <= r1) goto L_0x0113;
        L_0x00fd:
            r14 = r4 + 1;
            r1 = r13.charAt(r4);
            r1 = r1 - r8;
            r1 = r1 * 10;
            r5 = r5 + r1;
            if (r0 <= r3) goto L_0x0114;
        L_0x0109:
            r0 = r14 + 1;
            r13 = r13.charAt(r14);
            r13 = r13 - r8;
            r5 = r5 + r13;
            r14 = r0;
            goto L_0x0114;
        L_0x0113:
            r14 = r4;
        L_0x0114:
            if (r2 == 0) goto L_0x0117;
        L_0x0116:
            r5 = -r5;
        L_0x0117:
            r13 = java.lang.Integer.valueOf(r5);
            r12.a(r13);
            return r14;
        L_0x011f:
            r12 = r14 ^ -1;
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$l.a(akub, java.lang.CharSequence, int):int");
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            if (akrc != null) {
                if (i == 0) {
                    String str = this.a;
                    if (str != null) {
                        appendable.append(str);
                        return;
                    }
                }
                if (i >= 0) {
                    appendable.append('+');
                } else {
                    appendable.append('-');
                    i = -i;
                }
                int i2 = i / TelemetryConstants.ONE_HOUR_IN_MS;
                akud.a(appendable, i2, 2);
                if (this.e != 1) {
                    i -= i2 * TelemetryConstants.ONE_HOUR_IN_MS;
                    i2 = i / 60000;
                    if (this.c) {
                        appendable.append(':');
                    }
                    akud.a(appendable, i2, 2);
                    if (this.e != 2) {
                        i -= i2 * 60000;
                        if (i != 0) {
                            int i3 = i / MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                            if (this.c) {
                                appendable.append(':');
                            }
                            akud.a(appendable, i3, 2);
                            if (this.e != 3) {
                                i -= i3 * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                                if (i != 0) {
                                    if (this.c) {
                                        appendable.append('.');
                                    }
                                    akud.a(appendable, i, 3);
                                }
                            }
                        }
                    }
                }
            }
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
        }

        public final int b() {
            return a();
        }
    }

    /* renamed from: aktz$a */
    static class a implements akug, akui {
        private final char a;

        a(char c) {
            this.a = c;
        }

        public final int a() {
            return 1;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            if (i >= charSequence.length()) {
                return i ^ -1;
            }
            char charAt = charSequence.charAt(i);
            char c = this.a;
            if (charAt != c) {
                charAt = Character.toUpperCase(charAt);
                c = Character.toUpperCase(c);
                if (!(charAt == c || Character.toLowerCase(charAt) == Character.toLowerCase(c))) {
                    return i ^ -1;
                }
            }
            return i + 1;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            appendable.append(this.a);
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            appendable.append(this.a);
        }

        public final int b() {
            return 1;
        }
    }

    /* renamed from: aktz$d */
    static class d implements akug, akui {
        private final akra a;
        private int b;
        private int c;

        protected d(akra akra, int i, int i2) {
            this.a = akra;
            int i3 = 18;
            if (i2 <= 18) {
                i3 = i2;
            }
            this.b = i;
            this.c = i3;
        }

        private void a(Appendable appendable, long j, akqx akqx) {
            akqz a = this.a.a(akqx);
            int i = this.b;
            try {
                j = a.e(j);
                if (j == 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            appendable.append('0');
                        } else {
                            return;
                        }
                    }
                }
                long[] a2 = a(j, a);
                int i2 = 0;
                long j2 = a2[0];
                int i3 = (int) a2[1];
                String num = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                int length = num.length();
                while (length < i3) {
                    appendable.append('0');
                    i--;
                    i3--;
                }
                if (i < i3) {
                    while (i < i3 && length > 1 && num.charAt(length - 1) == '0') {
                        i3--;
                        length--;
                    }
                    if (length < num.length()) {
                        while (i2 < length) {
                            appendable.append(num.charAt(i2));
                            i2++;
                        }
                        return;
                    }
                }
                appendable.append(num);
            } catch (RuntimeException unused) {
                aktz.a(appendable, i);
            }
        }

        private long[] a(long j, akqz akqz) {
            long d = akqz.d().d();
            int i = this.c;
            while (true) {
                long j2;
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = TelemetryConstants.FLUSH_DELAY_MS;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((d * j2) / j2 != d) {
                    i--;
                } else {
                    return new long[]{(j * j2) / d, (long) i};
                }
            }
        }

        public final int a() {
            return this.c;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            akqz a = this.a.a(akub.a);
            int min = Math.min(this.c, charSequence.length() - i);
            long d = a.d().d() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                d /= 10;
                j += ((long) (charAt - 48)) * d;
            }
            j /= 10;
            if (i2 == 0) {
                return i ^ -1;
            }
            if (j > 2147483647L) {
                return i ^ -1;
            }
            akub.a().a(new aktp(akra.w, aktn.a, a.d()), (int) j);
            return i + i2;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            a(appendable, j, akqx);
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            a(appendable, akrx.b().a(akrx, 0), akrx.b());
        }

        public final int b() {
            return this.c;
        }
    }

    /* renamed from: aktz$e */
    static class e implements akug {
        private final akug[] a;
        private final int b;

        e(akug[] akugArr) {
            this.a = akugArr;
            int length = akugArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    akug akug = akugArr[length];
                    if (akug != null) {
                        int b = akug.b();
                        if (b > i) {
                            i = b;
                        }
                    }
                } else {
                    this.b = i;
                    return;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0050  */
        public final int a(defpackage.akub r10, java.lang.CharSequence r11, int r12) {
            /*
            r9 = this;
            r0 = r9.a;
            r1 = r0.length;
            r2 = r10.b();
            r3 = 0;
            r4 = 0;
            r5 = r12;
            r6 = r5;
            r7 = r4;
            r4 = 0;
        L_0x000d:
            if (r4 >= r1) goto L_0x0044;
        L_0x000f:
            r8 = r0[r4];
            if (r8 != 0) goto L_0x0018;
        L_0x0013:
            if (r5 > r12) goto L_0x0016;
        L_0x0015:
            return r12;
        L_0x0016:
            r3 = 1;
            goto L_0x0044;
        L_0x0018:
            r8 = r8.a(r10, r11, r12);
            if (r8 < r12) goto L_0x0037;
        L_0x001e:
            if (r8 <= r5) goto L_0x003e;
        L_0x0020:
            r5 = r11.length();
            if (r8 >= r5) goto L_0x0036;
        L_0x0026:
            r5 = r4 + 1;
            if (r5 >= r1) goto L_0x0036;
        L_0x002a:
            r5 = r0[r5];
            if (r5 != 0) goto L_0x002f;
        L_0x002e:
            goto L_0x0036;
        L_0x002f:
            r5 = r10.b();
            r7 = r5;
            r5 = r8;
            goto L_0x003e;
        L_0x0036:
            return r8;
        L_0x0037:
            if (r8 >= 0) goto L_0x003e;
        L_0x0039:
            r8 = r8 ^ -1;
            if (r8 <= r6) goto L_0x003e;
        L_0x003d:
            r6 = r8;
        L_0x003e:
            r10.a(r2);
            r4 = r4 + 1;
            goto L_0x000d;
        L_0x0044:
            if (r5 > r12) goto L_0x004e;
        L_0x0046:
            if (r5 != r12) goto L_0x004b;
        L_0x0048:
            if (r3 == 0) goto L_0x004b;
        L_0x004a:
            goto L_0x004e;
        L_0x004b:
            r10 = r6 ^ -1;
            return r10;
        L_0x004e:
            if (r7 == 0) goto L_0x0053;
        L_0x0050:
            r10.a(r7);
        L_0x0053:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$e.a(akub, java.lang.CharSequence, int):int");
        }

        public final int b() {
            return this.b;
        }
    }

    /* renamed from: aktz$f */
    static abstract class f implements akug, akui {
        protected final akra a;
        protected final int b;
        protected final boolean c;

        f(akra akra, int i, boolean z) {
            this.a = akra;
            this.b = i;
            this.c = z;
        }

        public int a(akub akub, CharSequence charSequence, int i) {
            CharSequence charSequence2 = charSequence;
            int i2 = i;
            int min = Math.min(this.b, charSequence.length() - i2);
            int i3 = 0;
            Object obj = null;
            Object obj2 = null;
            while (i3 < min) {
                int i4 = i2 + i3;
                char charAt = charSequence2.charAt(i4);
                if (i3 != 0 || ((charAt != '-' && charAt != '+') || !this.c)) {
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    i3++;
                } else {
                    Object obj3;
                    obj = 1;
                    obj2 = charAt == '-' ? 1 : null;
                    if (charAt != '+') {
                        obj = null;
                    }
                    int i5 = i3 + 1;
                    if (i5 < min) {
                        char charAt2 = charSequence2.charAt(i4 + 1);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            min = Math.min(min + 1, charSequence.length() - i2);
                            i3 = i5;
                            obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        }
                    }
                    obj3 = obj2;
                    obj2 = obj;
                    obj = obj3;
                    break;
                }
            }
            if (i3 == 0) {
                return i2 ^ -1;
            }
            int i6;
            int i7;
            if (i3 < 9) {
                i7 = (obj == null && obj2 == null) ? i2 : i2 + 1;
                min = i7 + 1;
                try {
                    i7 = charSequence2.charAt(i7) - 48;
                    i2 += i3;
                    while (min < i2) {
                        min++;
                        i7 = (((i7 << 3) + (i7 << 1)) + charSequence2.charAt(min)) - 48;
                    }
                    i6 = obj != null ? -i7 : i7;
                } catch (StringIndexOutOfBoundsException unused) {
                    return i2 ^ -1;
                }
            } else if (obj2 != null) {
                i7 = i2 + 1;
                i2 += i3;
                i6 = Integer.parseInt(charSequence2.subSequence(i7, i2).toString());
            } else {
                i3 += i2;
                i6 = Integer.parseInt(charSequence2.subSequence(i2, i3).toString());
                i2 = i3;
            }
            akub.a(this.a, i6);
            return i2;
        }

        public final int b() {
            return this.b;
        }
    }

    /* renamed from: aktz$h */
    static class h implements akug, akui {
        private final String a;

        h(String str) {
            this.a = str;
        }

        public final int a() {
            return this.a.length();
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            return aktz.b(charSequence, i, this.a) ? i + this.a.length() : i ^ -1;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            appendable.append(this.a);
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            appendable.append(this.a);
        }

        public final int b() {
            return this.a.length();
        }
    }

    /* renamed from: aktz$i */
    static class i implements akug, akui {
        private static Map<Locale, Map<akra, Object[]>> a = new ConcurrentHashMap();
        private final akra b;
        private final boolean c;

        i(akra akra, boolean z) {
            this.b = akra;
            this.c = z;
        }

        public final int a() {
            return this.c ? 6 : 20;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            int a;
            akub akub2 = akub;
            int i2 = i;
            Locale locale = akub2.b;
            Map map = (Map) a.get(locale);
            if (map == null) {
                map = new ConcurrentHashMap();
                a.put(locale, map);
            }
            Object[] objArr = (Object[]) map.get(this.b);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(32);
                akrp akrp = new akrp(akrc.a);
                akra akra = this.b;
                if (akra != null) {
                    akqz a2 = akra.a(akrp.b);
                    if (a2.c()) {
                        a aVar = new a(akrp, a2);
                        int g = aVar.a().g();
                        int h = aVar.a().h();
                        if (h - g > 32) {
                            return i2 ^ -1;
                        }
                        a = aVar.a().a(locale);
                        while (g <= h) {
                            aVar.a.a(aVar.b.b(aVar.a.a, g));
                            concurrentHashMap.put(aVar.b(locale), Boolean.TRUE);
                            concurrentHashMap.put(aVar.b(locale).toLowerCase(locale), Boolean.TRUE);
                            concurrentHashMap.put(aVar.b(locale).toUpperCase(locale), Boolean.TRUE);
                            concurrentHashMap.put(aVar.a(locale), Boolean.TRUE);
                            concurrentHashMap.put(aVar.a(locale).toLowerCase(locale), Boolean.TRUE);
                            concurrentHashMap.put(aVar.a(locale).toUpperCase(locale), Boolean.TRUE);
                            g++;
                        }
                        if ("en".equals(locale.getLanguage()) && this.b == akra.a) {
                            concurrentHashMap.put("BCE", Boolean.TRUE);
                            concurrentHashMap.put("bce", Boolean.TRUE);
                            concurrentHashMap.put("CE", Boolean.TRUE);
                            concurrentHashMap.put("ce", Boolean.TRUE);
                            a = 3;
                        }
                        map.put(this.b, new Object[]{concurrentHashMap, Integer.valueOf(a)});
                        map = concurrentHashMap;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Field '");
                        stringBuilder.append(akra);
                        stringBuilder.append("' is not supported");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                throw new IllegalArgumentException("The DateTimeFieldType must not be null");
            }
            map = (Map) objArr[0];
            a = ((Integer) objArr[1]).intValue();
            for (int min = Math.min(charSequence.length(), i2 + a); min > i2; min--) {
                String obj = charSequence.subSequence(i2, min).toString();
                if (map.containsKey(obj)) {
                    akra akra2 = this.b;
                    akub.a a3 = akub.a();
                    a3.a = akra2.a(akub2.a);
                    a3.b = 0;
                    a3.c = obj;
                    a3.d = locale;
                    return min;
                }
            }
            return i2 ^ -1;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            try {
                akqz a = this.b.a(akqx);
                appendable.append(this.c ? a.b(j, locale) : a.a(j, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            try {
                CharSequence b;
                if (akrx.b(this.b)) {
                    akqz a = this.b.a(akrx.b());
                    b = this.c ? a.b(akrx, locale) : a.a(akrx, locale);
                } else {
                    b = "�";
                }
                appendable.append(b);
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        public final int b() {
            return a();
        }
    }

    /* renamed from: aktz$j */
    enum j implements akug, akui {
        ;
        
        private static final List<String> ALL_IDS = null;
        private static final List<String> BASE_GROUPED_IDS = null;
        private static final Map<String, List<String>> GROUPED_IDS = null;
        static final int MAX_LENGTH = 0;
        static final int MAX_PREFIX_LENGTH = 0;

        static {
            BASE_GROUPED_IDS = new ArrayList();
            ArrayList arrayList = new ArrayList(akrc.b().getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String str : ALL_IDS) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf < str.length()) {
                        indexOf++;
                    }
                    i2 = Math.max(i2, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    if (!GROUPED_IDS.containsKey(substring)) {
                        GROUPED_IDS.put(substring, new ArrayList());
                    }
                    ((List) GROUPED_IDS.get(substring)).add(substring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
            MAX_PREFIX_LENGTH = i2;
        }

        private j(String str) {
        }

        public final int a() {
            return MAX_LENGTH;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
        public final int a(defpackage.akub r9, java.lang.CharSequence r10, int r11) {
            /*
            r8 = this;
            r0 = BASE_GROUPED_IDS;
            r1 = r10.length();
            r2 = MAX_PREFIX_LENGTH;
            r2 = r2 + r11;
            r2 = java.lang.Math.min(r1, r2);
            r3 = r11;
        L_0x000e:
            if (r3 >= r2) goto L_0x004e;
        L_0x0010:
            r4 = r10.charAt(r3);
            r5 = 47;
            if (r4 != r5) goto L_0x004b;
        L_0x0018:
            r0 = r3 + 1;
            r2 = r10.subSequence(r11, r0);
            r2 = r2.toString();
            r4 = r2.length();
            r4 = r4 + r11;
            if (r3 >= r1) goto L_0x003d;
        L_0x0029:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r1.append(r2);
            r0 = r10.charAt(r0);
            r1.append(r0);
            r0 = r1.toString();
            goto L_0x003e;
        L_0x003d:
            r0 = r2;
        L_0x003e:
            r1 = GROUPED_IDS;
            r0 = r1.get(r0);
            r0 = (java.util.List) r0;
            if (r0 != 0) goto L_0x0051;
        L_0x0048:
            r9 = r11 ^ -1;
            return r9;
        L_0x004b:
            r3 = r3 + 1;
            goto L_0x000e;
        L_0x004e:
            r2 = "";
            r4 = r11;
        L_0x0051:
            r1 = 0;
            r3 = 0;
        L_0x0053:
            r5 = r0.size();
            if (r3 >= r5) goto L_0x0075;
        L_0x0059:
            r5 = r0.get(r3);
            r5 = (java.lang.String) r5;
            r6 = defpackage.aktz.a(r10, r4, r5);
            if (r6 == 0) goto L_0x0072;
        L_0x0065:
            if (r1 == 0) goto L_0x0071;
        L_0x0067:
            r6 = r5.length();
            r7 = r1.length();
            if (r6 <= r7) goto L_0x0072;
        L_0x0071:
            r1 = r5;
        L_0x0072:
            r3 = r3 + 1;
            goto L_0x0053;
        L_0x0075:
            if (r1 == 0) goto L_0x0093;
        L_0x0077:
            r10 = new java.lang.StringBuilder;
            r10.<init>();
            r10.append(r2);
            r10.append(r1);
            r10 = r10.toString();
            r10 = defpackage.akrc.a(r10);
            r9.a(r10);
            r9 = r1.length();
            r4 = r4 + r9;
            return r4;
        L_0x0093:
            r9 = r11 ^ -1;
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$j.a(akub, java.lang.CharSequence, int):int");
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            appendable.append(akrc != null ? akrc.b : "");
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
        }

        public final int b() {
            return MAX_LENGTH;
        }
    }

    /* renamed from: aktz$k */
    static class k implements akug, akui {
        private final Map<String, akrc> a = null;
        private final int b;

        k(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b == 1 ? 4 : 20;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            Map map = (Map) akrb.a.get();
            String str = null;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("UT", akrc.a);
                linkedHashMap.put("UTC", akrc.a);
                linkedHashMap.put("GMT", akrc.a);
                String str2 = "America/New_York";
                akrb.a(linkedHashMap, "EST", str2);
                akrb.a(linkedHashMap, "EDT", str2);
                str2 = "America/Chicago";
                akrb.a(linkedHashMap, "CST", str2);
                akrb.a(linkedHashMap, "CDT", str2);
                str2 = "America/Denver";
                akrb.a(linkedHashMap, "MST", str2);
                akrb.a(linkedHashMap, "MDT", str2);
                str2 = "America/Los_Angeles";
                akrb.a(linkedHashMap, "PST", str2);
                akrb.a(linkedHashMap, "PDT", str2);
                map = Collections.unmodifiableMap(linkedHashMap);
                if (!akrb.a.compareAndSet(null, map)) {
                    map = (Map) akrb.a.get();
                }
            }
            for (String str3 : map.keySet()) {
                if (aktz.a(charSequence, i, str3) && (str == null || str3.length() > str.length())) {
                    str = str3;
                }
            }
            if (str == null) {
                return i ^ -1;
            }
            akub.a((akrc) map.get(str));
            return i + str.length();
        }

        /* JADX WARNING: Missing block: B:16:0x003c, code skipped:
            if (r8 != null) goto L_0x0071;
     */
        /* JADX WARNING: Missing block: B:29:0x006f, code skipped:
            if (r8 != null) goto L_0x0071;
     */
        /* JADX WARNING: Missing block: B:30:0x0071, code skipped:
            r6 = r8;
     */
        /* JADX WARNING: Missing block: B:31:0x0073, code skipped:
            r6 = defpackage.akrc.b(r10.b(r6));
     */
        public final void a(java.lang.Appendable r5, long r6, defpackage.akqx r8, int r9, defpackage.akrc r10, java.util.Locale r11) {
            /*
            r4 = this;
            r8 = (long) r9;
            r6 = r6 - r8;
            if (r10 == 0) goto L_0x007c;
        L_0x0004:
            r8 = r4.b;
            r9 = 0;
            r0 = 1;
            if (r8 == 0) goto L_0x003f;
        L_0x000a:
            if (r8 == r0) goto L_0x000d;
        L_0x000c:
            goto L_0x007c;
        L_0x000d:
            if (r11 != 0) goto L_0x0013;
        L_0x000f:
            r11 = java.util.Locale.getDefault();
        L_0x0013:
            r8 = r10.a(r6);
            if (r8 != 0) goto L_0x001a;
        L_0x0019:
            goto L_0x004b;
        L_0x001a:
            r0 = defpackage.akrc.c();
            r1 = r0 instanceof defpackage.akup;
            if (r1 == 0) goto L_0x0036;
        L_0x0022:
            r0 = (defpackage.akup) r0;
            r1 = r10.b;
            r2 = r10.d(r6);
            r8 = r0.a(r11, r1, r8, r2);
            if (r8 != 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0034;
        L_0x0031:
            r9 = 0;
            r9 = r8[r9];
        L_0x0034:
            r8 = r9;
            goto L_0x003c;
        L_0x0036:
            r9 = r10.b;
            r8 = r0.a(r11, r9, r8);
        L_0x003c:
            if (r8 == 0) goto L_0x0073;
        L_0x003e:
            goto L_0x0071;
        L_0x003f:
            if (r11 != 0) goto L_0x0045;
        L_0x0041:
            r11 = java.util.Locale.getDefault();
        L_0x0045:
            r8 = r10.a(r6);
            if (r8 != 0) goto L_0x004e;
        L_0x004b:
            r6 = r10.b;
            goto L_0x007e;
        L_0x004e:
            r1 = defpackage.akrc.c();
            r2 = r1 instanceof defpackage.akup;
            if (r2 == 0) goto L_0x0069;
        L_0x0056:
            r1 = (defpackage.akup) r1;
            r2 = r10.b;
            r3 = r10.d(r6);
            r8 = r1.a(r11, r2, r8, r3);
            if (r8 != 0) goto L_0x0065;
        L_0x0064:
            goto L_0x0067;
        L_0x0065:
            r9 = r8[r0];
        L_0x0067:
            r8 = r9;
            goto L_0x006f;
        L_0x0069:
            r9 = r10.b;
            r8 = r1.b(r11, r9, r8);
        L_0x006f:
            if (r8 == 0) goto L_0x0073;
        L_0x0071:
            r6 = r8;
            goto L_0x007e;
        L_0x0073:
            r6 = r10.b(r6);
            r6 = defpackage.akrc.b(r6);
            goto L_0x007e;
        L_0x007c:
            r6 = "";
        L_0x007e:
            r5.append(r6);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aktz$k.a(java.lang.Appendable, long, akqx, int, akrc, java.util.Locale):void");
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
        }

        public final int b() {
            return this.b == 1 ? 4 : 20;
        }
    }

    /* renamed from: aktz$m */
    static class m implements akug, akui {
        private final akra a;
        private final int b;
        private final boolean c;

        m(akra akra, int i, boolean z) {
            this.a = akra;
            this.b = i;
            this.c = z;
        }

        private int a(long j, akqx akqx) {
            try {
                int a = this.a.a(akqx).a(j);
                if (a < 0) {
                    a = -a;
                }
                return a % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        private int a(akrx akrx) {
            if (akrx.b(this.a)) {
                try {
                    int a = akrx.a(this.a);
                    if (a < 0) {
                        a = -a;
                    }
                    return a % 100;
                } catch (RuntimeException unused) {
                }
            }
            return -1;
        }

        public final int a() {
            return 2;
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            int i2;
            int parseInt;
            int i3;
            int length = charSequence.length() - i;
            if (this.c) {
                i2 = i;
                i = 0;
                Object obj = null;
                Object obj2 = null;
                while (i < length) {
                    char charAt = charSequence.charAt(i2 + i);
                    if (i != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i++;
                    } else {
                        obj2 = charAt == '-' ? 1 : null;
                        if (obj2 != null) {
                            i++;
                        } else {
                            i2++;
                            length--;
                        }
                        obj = 1;
                    }
                }
                if (i == 0) {
                    return i2 ^ -1;
                }
                if (obj == null && i == 2) {
                    i = i2;
                } else {
                    if (i >= 9) {
                        i += i2;
                        parseInt = Integer.parseInt(charSequence.subSequence(i2, i).toString());
                    } else {
                        length = obj2 != null ? i2 + 1 : i2;
                        i3 = length + 1;
                        try {
                            length = charSequence.charAt(length) - 48;
                            i += i2;
                            while (i3 < i) {
                                i3++;
                                length = (((length << 3) + (length << 1)) + charSequence.charAt(i3)) - 48;
                            }
                            parseInt = obj2 != null ? -length : length;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return i2 ^ -1;
                        }
                    }
                    akub.a(this.a, parseInt);
                    return i;
                }
            } else if (Math.min(2, length) < 2) {
                return i ^ -1;
            }
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < '0' || charAt2 > '9') {
                return i ^ -1;
            }
            length = charAt2 - 48;
            char charAt3 = charSequence.charAt(i + 1);
            if (charAt3 < '0' || charAt3 > '9') {
                return i ^ -1;
            }
            i2 = (((length << 3) + (length << 1)) + charAt3) - 48;
            parseInt = this.b;
            if (akub.e != null) {
                parseInt = akub.e.intValue();
            }
            parseInt -= 50;
            length = 100;
            i3 = parseInt >= 0 ? parseInt % 100 : ((parseInt + 1) % 100) + 99;
            if (i2 >= i3) {
                length = 0;
            }
            akub.a(this.a, i2 + ((parseInt + length) - i3));
            return i + 2;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            int a = a(j, akqx);
            if (a < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            akud.a(appendable, a, 2);
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            int a = a(akrx);
            if (a < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            akud.a(appendable, a, 2);
        }

        public final int b() {
            return this.c ? 4 : 2;
        }
    }

    /* renamed from: aktz$g */
    static class g extends f {
        private int d;

        protected g(akra akra, int i, boolean z, int i2) {
            super(akra, i, z);
            this.d = i2;
        }

        public final int a() {
            return this.b;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            try {
                akud.a(appendable, this.a.a(akqx).a(j), this.d);
            } catch (RuntimeException unused) {
                aktz.a(appendable, this.d);
            }
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            if (akrx.b(this.a)) {
                try {
                    akud.a(appendable, akrx.a(this.a), this.d);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            aktz.a(appendable, this.d);
        }
    }

    /* renamed from: aktz$n */
    static class n extends f {
        protected n(akra akra, int i, boolean z) {
            super(akra, i, z);
        }

        public final int a() {
            return this.b;
        }

        public final void a(Appendable appendable, long j, akqx akqx, int i, akrc akrc, Locale locale) {
            try {
                akud.a(appendable, this.a.a(akqx).a(j));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        public final void a(Appendable appendable, akrx akrx, Locale locale) {
            if (akrx.b(this.a)) {
                try {
                    akud.a(appendable, akrx.a(this.a));
                    return;
                } catch (RuntimeException unused) {
                    appendable.append(65533);
                    return;
                }
            }
            appendable.append(65533);
        }
    }

    /* renamed from: aktz$c */
    static class c extends g {
        protected c(akra akra, int i) {
            super(akra, i, false, i);
        }

        public final int a(akub akub, CharSequence charSequence, int i) {
            int a = super.a(akub, charSequence, i);
            if (a < 0) {
                return a;
            }
            int i2 = this.b + i;
            if (a != i2) {
                if (this.c) {
                    char charAt = charSequence.charAt(i);
                    if (charAt == '-' || charAt == '+') {
                        i2++;
                    }
                }
                if (a > i2) {
                    return (i2 + 1) ^ -1;
                }
                if (a < i2) {
                    a ^= -1;
                }
            }
            return a;
        }
    }

    static void a(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append(65533);
            } else {
                return;
            }
        }
    }

    static boolean a(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    static boolean b(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2) {
                charAt = Character.toUpperCase(charAt);
                charAt2 = Character.toUpperCase(charAt2);
                if (!(charAt == charAt2 || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(Object obj) {
        return obj instanceof akui ? obj instanceof b ? ((b) obj).c() : true : false;
    }

    private aktz c(akra akra, int i, int i2) {
        if (akra != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return a(new d(akra, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    private static void c(akua akua) {
        if (akua == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static boolean c(Object obj) {
        return obj instanceof akug ? obj instanceof b ? ((b) obj).d() : true : false;
    }

    private Object e() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                Object obj2 = this.a.get(0);
                Object obj3 = this.a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new b(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    public final akty a() {
        Object e = e();
        akug akug = null;
        akui akui = aktz.b(e) ? (akui) e : null;
        if (aktz.c(e)) {
            akug = (akug) e;
        }
        if (akui != null || akug != null) {
            return new akty(akui, akug);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public final aktz a(char c) {
        return a(new a(c));
    }

    public final aktz a(int i) {
        return a(akra.u, i, 2);
    }

    public final aktz a(int i, int i2) {
        return c(akra.t, i, i2);
    }

    public final aktz a(akra akra) {
        if (akra != null) {
            return a(new i(akra, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final aktz a(akra akra, int i) {
        if (akra == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return a(new c(akra, i));
        } else {
            throw new IllegalArgumentException("Illegal number of digits: ".concat(String.valueOf(i)));
        }
    }

    public final aktz a(akra akra, int i, int i2) {
        if (akra != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return i <= 1 ? a(new n(akra, i2, false)) : a(new g(akra, i2, false, i));
            } else {
                throw new IllegalArgumentException();
            }
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final aktz a(akty akty) {
        if (akty != null) {
            return a(akty.a, akty.b);
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public final aktz a(akua akua) {
        aktz.c(akua);
        return a(null, akuc.a(akua));
    }

    /* Access modifiers changed, original: final */
    public final aktz a(akui akui, akug akug) {
        this.b = null;
        this.a.add(akui);
        this.a.add(akug);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final aktz a(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
        return this;
    }

    public final aktz a(String str) {
        int length = str.length();
        if (length == 0) {
            return this;
        }
        return a(length != 1 ? new h(str) : new a(str.charAt(0)));
    }

    public final aktz a(String str, boolean z) {
        return a(new l(null, str, z, 2));
    }

    public final aktz a(String str, boolean z, int i) {
        return a(new l(str, str, z, i));
    }

    public final aktz a(akua[] akuaArr) {
        akug eVar;
        int length = akuaArr.length;
        int i = 0;
        if (length != 1) {
            akug[] akugArr = new akug[length];
            while (i < length - 1) {
                akug a = akuc.a(akuaArr[i]);
                akugArr[i] = a;
                if (a != null) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
            }
            akugArr[i] = akuc.a(akuaArr[i]);
            eVar = new e(akugArr);
        } else if (akuaArr[0] != null) {
            eVar = akuc.a(akuaArr[0]);
        } else {
            throw new IllegalArgumentException("No parser supplied");
        }
        return a(null, eVar);
    }

    public final aktz b(int i) {
        return a(akra.s, i, 2);
    }

    public final aktz b(int i, int i2) {
        return b(akra.j, i, i2);
    }

    public final aktz b(akra akra) {
        if (akra != null) {
            return a(new i(akra, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final aktz b(akra akra, int i, int i2) {
        if (akra != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return i <= 1 ? a(new n(akra, i2, true)) : a(new g(akra, i2, true, i));
            } else {
                throw new IllegalArgumentException();
            }
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final aktz b(akua akua) {
        aktz.c(akua);
        return a(null, new e(new akug[]{akuc.a(akua), null}));
    }

    public final akua b() {
        Object e = e();
        if (aktz.c(e)) {
            return akuh.a((akug) e);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final aktz c() {
        return c(akra.r, 1, 9);
    }

    public final aktz c(int i) {
        return a(akra.q, i, 2);
    }

    public final aktz c(int i, int i2) {
        return b(akra.e, i, i2);
    }

    public final aktz d() {
        return c(akra.q, 1, 9);
    }

    public final aktz d(int i) {
        return a(akra.l, i, 1);
    }

    public final aktz e(int i) {
        return a(akra.h, i, 2);
    }

    public final aktz f(int i) {
        return a(akra.f, i, 3);
    }

    public final aktz g(int i) {
        return a(akra.k, i, 2);
    }

    public final aktz h(int i) {
        return a(akra.g, i, 2);
    }
}
