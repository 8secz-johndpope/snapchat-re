package defpackage;

import com.snap.core.db.column.StoryKind;
import defpackage.dpv.a.b.d;
import defpackage.wkm.a;
import defpackage.wkm.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: rvq */
public final class rvq {
    public final ajei a;
    final aipn<wki> b;
    private final ajxe c;

    /* renamed from: rvq$o */
    static final class o extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        o(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(rgr.d, "SendSessionLauncher");
        }
    }

    /* renamed from: rvq$e */
    static final class e<T> implements ajfb<ebo> {
        private /* synthetic */ rvq a;

        e(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (ebo) obj;
            wki wki = (wki) this.a.b.get();
            rvq rvq = this.a;
            akcr.a(obj2, "mediaCreationEvent");
            gcn gcn = gcn.CAMERA;
            gtt gtt = obj2.c;
            wki wki2 = (wki) rvq.b.get();
            puk pun = new pun();
            pth pth = r5;
            pth pth2 = new pth(gcn, new ptg(), null, 0, null, null, null, 16368);
            a a = wki2.a(pun, pth).a(new tob(null, null, obj2.d, 27)).a(obj2.a).a(obj2.b).a(gtt);
            rgq rgq = r3;
            rgq rgq2 = new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, obj2.b.a(), false, false, null, false, false, false, -67108865, 1);
            wki.a(a.a(rgq).b());
        }
    }

    /* renamed from: rvq$d */
    public static final class d<T> implements ajfb<dpz.a> {
        private /* synthetic */ rvq a;

        public d(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            dpz.a aVar = (dpz.a) obj;
            ((wki) this.a.b.get()).a(((wki) this.a.b.get()).a(new pus(aVar.a, ajyw.a, ajyw.a), new pth(gcn.LENS, null, null, 0, null, null, null, 16368)).a(rhl.a.a(aVar.b)).a(b.SEND_TO).b());
        }
    }

    /* renamed from: rvq$c */
    public static final class c<T> implements ajfb<psh> {
        private /* synthetic */ rvq a;

        public c(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            dnq dnq;
            psh psh = (psh) obj;
            psg psg = psh.a;
            String str = psh.b;
            prk prk = psh.c;
            boolean z = psh.d;
            pqc pqc = psh.e;
            wki wki = (wki) this.a.b.get();
            puk pun = new pun();
            pth pth = r8;
            pth pth2 = new pth(psg.a(), new ptg(), null, 0, null, null, null, 16368);
            a a = wki.a(pun, pth).a().a(str).a(b.STACKED_CAMERA_AND_EDIT_AND_SEND_TO);
            akcr.b(psg, "context");
            String str2 = null;
            List arrayList;
            rhl rhl;
            if (psg instanceof pri) {
                arrayList = new ArrayList();
                pri pri = (pri) psg;
                arrayList.add(new rhi(pri.a, new rhh(pri.b, null), pri.c));
                rhl = new rhl(arrayList, null, null, false, null, 124);
            } else if (psg instanceof psv) {
                arrayList = new ArrayList();
                psv psv = (psv) psg;
                arrayList.add(new rhp(psv.a, psv.b, new rhh(psv.c, null), null, psv.d));
                rhl = new rhl(arrayList, null, null, false, null, 124);
            } else {
                rhl rhl2 = new rhl(ajyw.a, null, null, false, null, 124);
            }
            a a2 = a.a(r2);
            if (prk != null) {
                dpv.a.b.b cVar;
                int i = rvr.a[prk.b.ordinal()];
                if (i == 1) {
                    cVar = new defpackage.dpv.a.b.c(prk.a, prk.c);
                } else if (i == 2) {
                    cVar = new dpv.a.b.a(prk.a, prk.c);
                } else if (i == 3) {
                    cVar = new dpv.a.b.b(prk.a, prk.c);
                } else {
                    throw new ajxk();
                }
                str2 = cVar;
            }
            a2 = a2.a((dpv) str2);
            if (pqc instanceof pqc.a) {
                dnq = dnq.a.a;
            } else if (pqc instanceof pqc.b) {
                dnq = new dnq.b(((pqc.b) pqc).a);
            } else {
                throw new ajxk();
            }
            a a3 = a2.a(dnq).a(z ? tod.MAIN : tod.FEED);
            if (prk != null && prk.b == prk.a.MAP) {
                a3.a((wjx) new wjy(adcw.a));
            }
            ((wki) this.a.b.get()).a(a3.b());
        }
    }

    /* renamed from: rvq$a */
    public static final class a<T> implements ajfb<ppz> {
        private /* synthetic */ rvq a;

        public a(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ppz) obj;
            defpackage.wkm.a a = ((wki) this.a.b.get()).a(new pun(), new pth(obj.d, new ptg(), null, 0, null, null, null, 16368)).a(b.STACKED_CAMERA_AND_EDIT_AND_SEND_TO);
            akcr.a(obj, "event");
            akcr.b(obj, "addToStoryEvent");
            List arrayList = new ArrayList();
            arrayList.add(new rhj(obj.a, obj.b, new rhe(rhc.STORY, obj.a), new rhh(obj.c, null), obj.e));
            ((wki) this.a.b.get()).a(a.a(new rhl(arrayList, null, null, false, null, 124)).b());
        }
    }

    /* renamed from: rvq$b */
    public static final class b<T> implements ajfb<pqe> {
        private /* synthetic */ rvq a;

        public b(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            pqe pqe = (pqe) obj;
            List list = pqe.a;
            gcn gcn = pqe.b;
            pqd pqd = pqe.c;
            a a = rvq.a(this.a, list, gcn);
            akcr.b(pqd, "context");
            List arrayList;
            rhl rhl;
            if (pqd instanceof prh) {
                arrayList = new ArrayList();
                prh prh = (prh) pqd;
                arrayList.add(new rhi(prh.a, new rhh(prh.b, null), null));
                rhl = new rhl(arrayList, null, null, false, null, 124);
            } else if (pqd instanceof psu) {
                arrayList = new ArrayList();
                psu psu = (psu) pqd;
                arrayList.add(new rhp(psu.a, psu.b, new rhh(psu.c, null), null, null));
                rhl = new rhl(arrayList, null, null, false, null, 124);
            } else {
                rhl rhl2 = new rhl(ajyw.a, null, null, false, null, 124);
            }
            ((wki) this.a.b.get()).a(a.a(r1).a(new tob(null, null, false, 31)).a(tod.CHAT_GALLERY).a((wjx) new wjy(pql.a)).b());
        }
    }

    /* renamed from: rvq$f */
    public static final class f<T> implements ajfb<nmk> {
        private /* synthetic */ rvq a;

        public f(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            a a;
            nmk nmk = (nmk) obj;
            abyi abyi = nmk.a;
            if (nmk.b) {
                a = rvq.a(this.a, ajyl.a(abyi), gcn.MAP_SCREENSHOT).a(new tob(null, null, false, 28)).a((wjx) new wjy(adcw.a));
            } else {
                a = ((wki) this.a.b.get()).a(pto.a.a(abyi, false), new pth(gcn.MAP_SCREENSHOT, null, null, 0, null, null, null, 16382));
                ajdx b = ajdx.b(ajyl.a(abyi));
                akcr.a((Object) b, "Single.just(listOf(mediaPackage))");
                a = a.a(b).a((wjx) new wjy(adcw.a)).a(b.SEND_TO);
            }
            ((wki) this.a.b.get()).a(a.b());
        }
    }

    /* renamed from: rvq$g */
    static final class g<T> implements ajfb<ojb> {
        private /* synthetic */ rvq a;

        g(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            ojb ojb = (ojb) obj;
            List list = ojb.a;
            oja oja = ojb.b;
            a a = rvq.a(this.a, list, ojb.c);
            String str2 = oja.a;
            if (oja.a == null || oja.b == null) {
                str = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(oja.a);
                stringBuilder.append(' ');
                stringBuilder.append(oja.b);
                str = stringBuilder.toString();
            }
            ((wki) this.a.b.get()).a(a.a(new tob(str2, str, false, 28)).b());
        }
    }

    /* renamed from: rvq$h */
    static final class h<T> implements ajfb<ojj> {
        private /* synthetic */ rvq a;

        h(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            pto a;
            ojj ojj = (ojj) obj;
            if (ojj instanceof ojh) {
                a = ojj.b().size() == 1 ? pto.a.a((abyi) ajyu.f(ojj.b()), false) : ptk.a.a(ojj.b());
            } else if (ojj instanceof ojk) {
                a = pue.a.a(ojj.b(), ((ojk) ojj).a);
            } else {
                throw new IllegalArgumentException("Invalid send event.");
            }
            a a2 = ((wki) this.a.b.get()).a(a, new pth(ojj.a(), new ptg((byte) 0), null, 0, null, null, null, 16368));
            ajdx b = ajdx.b(ojj.b());
            akcr.a((Object) b, "Single.just(event.mediaPackages)");
            ((wki) this.a.b.get()).a(a2.a(b).a(b.SEND_TO).a((wjx) new wjz()).b());
        }
    }

    /* renamed from: rvq$i */
    public static final class i<T> implements ajfb<gwa.b> {
        private /* synthetic */ rvq a;

        public i(rvq rvq) {
            this.a = rvq;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:50:0x0134 in {2, 3, 6, 7, 10, 13, 16, 19, 24, 25, 26, 27, 32, 33, 34, 35, 40, 41, 44, 45, 47, 49} preds:[]
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
        public final /* synthetic */ void accept(java.lang.Object r15) {
            /*
            r14 = this;
            r15 = (defpackage.gwa.b) r15;
            r0 = r15.b();
            r0 = r0.toString();
            r1 = r15 instanceof defpackage.gwa.b.d;
            r2 = 0;
            if (r1 == 0) goto L_0x001b;
            r0 = r15;
            r0 = (defpackage.gwa.b.d) r0;
            r0 = r0.b;
            r0 = defpackage.ptq.a.a(r0);
            r0 = (defpackage.puk) r0;
            goto L_0x006c;
            r3 = r15 instanceof defpackage.gwa.b.f;
            if (r3 == 0) goto L_0x002d;
            r3 = new pur;
            r4 = r15;
            r4 = (defpackage.gwa.b.f) r4;
            r4 = r4.b;
            r3.<init>(r4, r0, r2);
            r0 = r3;
            r0 = (defpackage.puk) r0;
            goto L_0x006c;
            r3 = r15 instanceof defpackage.gwa.b.c;
            if (r3 == 0) goto L_0x003e;
            r3 = new pui;
            r4 = r15;
            r4 = (defpackage.gwa.b.c) r4;
            r5 = r4.c;
            r4 = r4.b;
            r3.<init>(r5, r0, r4);
            goto L_0x0029;
            r3 = r15 instanceof defpackage.gwa.b.b;
            if (r3 == 0) goto L_0x004f;
            r3 = new pub;
            r4 = r15;
            r4 = (defpackage.gwa.b.b) r4;
            r5 = r4.b;
            r4 = r4.c;
            r3.<init>(r5, r0, r4);
            goto L_0x0029;
            r0 = r15 instanceof defpackage.gwa.b.e;
            if (r0 == 0) goto L_0x005d;
            r0 = r15;
            r0 = (defpackage.gwa.b.e) r0;
            r0 = r0.b;
            r0 = defpackage.pup.a.a(r0);
            goto L_0x0018;
            r0 = r15 instanceof defpackage.gwa.b.a;
            if (r0 == 0) goto L_0x012e;
            r0 = new ptm;
            r3 = r15;
            r3 = (defpackage.gwa.b.a) r3;
            r3 = r3.b;
            r0.<init>(r3);
            goto L_0x0018;
            r13 = new pth;
            r4 = defpackage.gcn.DISCOVER;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r12 = 16368; // 0x3ff0 float:2.2936E-41 double:8.087E-320;
            r3 = r13;
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12);
            r3 = r14.a;
            r3 = r3.b;
            r3 = r3.get();
            r3 = (defpackage.wki) r3;
            r0 = r3.a(r0, r13);
            r3 = "Single.just<List<MediaPa…stOf(event.mediaPackage))";
            if (r1 == 0) goto L_0x00b0;
            r1 = r15;
            r1 = (defpackage.gwa.b.d) r1;
            r4 = r1.c;
            if (r4 == 0) goto L_0x0099;
            r4 = defpackage.wkm.b.EDIT_AND_SEND_TO;
            goto L_0x009b;
            r4 = defpackage.wkm.b.SEND_TO;
            r4 = r0.a(r4);
            r1 = r1.b;
            r1 = defpackage.ajyl.a(r1);
            r1 = defpackage.ajdx.b(r1);
            defpackage.akcr.a(r1, r3);
            r4.a(r1);
            goto L_0x00cc;
            r1 = r15 instanceof defpackage.gwa.b.e;
            if (r1 == 0) goto L_0x00c7;
            r1 = r15;
            r1 = (defpackage.gwa.b.e) r1;
            r4 = r1.c;
            if (r4 == 0) goto L_0x00be;
            r4 = defpackage.wkm.b.EDIT_AND_SEND_TO;
            goto L_0x00c0;
            r4 = defpackage.wkm.b.SEND_TO;
            r4 = r0.a(r4);
            r1 = r1.b;
            goto L_0x00a1;
            r1 = defpackage.wkm.b.SEND_TO;
            r0.a(r1);
            r1 = r15.a();
            if (r1 == 0) goto L_0x0109;
            r3 = r1.e;
            r3 = r3.u;
            if (r3 == 0) goto L_0x00dd;
            r3 = r3.longValue();
            goto L_0x00df;
            r3 = 0;
            r5 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r7 <= 0) goto L_0x00e6;
            r2 = 1;
            r1 = defpackage.ajyl.a(r1);
            r1 = defpackage.ajdx.b(r1);
            r3 = "Single.just(listOf(preview))";
            defpackage.akcr.a(r1, r3);
            r1 = r0.b(r1);
            r3 = r15.b();
            r3 = defpackage.ajyl.a(r3);
            r3 = (java.util.Collection) r3;
            r4 = 4;
            r2 = defpackage.ebp.a.a(r3, r2, r4);
            r1.a(r2);
            r1 = r14.a;
            r1 = r1.b;
            r1 = r1.get();
            r1 = (defpackage.wki) r1;
            r15 = r15.a;
            r15 = r0.a(r15);
            r0 = new wjy;
            r2 = defpackage.ssm.a;
            r0.<init>(r2);
            r0 = (defpackage.wjx) r0;
            r15 = r15.a(r0);
            r15 = r15.b();
            r1.a(r15);
            return;
            r15 = new ajxk;
            r15.<init>();
            throw r15;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rvq$i.accept(java.lang.Object):void");
        }
    }

    /* renamed from: rvq$j */
    public static final class j<T> implements ajfb<gwa.a> {
        private /* synthetic */ rvq a;

        public j(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            gwa.a aVar = (gwa.a) obj;
            ((wki) this.a.b.get()).a(((wki) this.a.b.get()).a(new puh(aVar.b), new pth(gcn.DISCOVER, null, null, 0, null, null, null, 16368)).a(b.SEND_TO).a(aVar.a).a((wjx) new wjy(hbn.a)).b());
        }
    }

    /* renamed from: rvq$k */
    public static final class k<T> implements ajfb<fix> {
        private /* synthetic */ rvq a;

        public k(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            fix fix = (fix) obj;
            a a = ((wki) this.a.b.get()).a(new pus(fix.a, ajyw.a, ajyw.a), new pth(gcn.SHARE, null, null, 0, null, null, null, 16368));
            rgq rgq = r3;
            rgq rgq2 = new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, false, false, null, false, false, false, -2, 1);
            ((wki) this.a.b.get()).a(a.a(rgq).a(rhl.a.a(fix.b)).a(b.SEND_TO).b());
        }
    }

    /* renamed from: rvq$l */
    public static final class l<T> implements ajfb<psp> {
        private /* synthetic */ rvq a;

        public l(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            psp psp = (psp) obj;
            a a = ((wki) this.a.b.get()).a(new puu(psp.a, psp.b, psp.c, false), new pth(gcn.SHARE, null, null, 0, null, null, null, 16382));
            rgq rgq = r2;
            rgq rgq2 = new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, false, false, null, false, false, false, -2, 1);
            ((wki) this.a.b.get()).a(a.a(rgq).a(b.SEND_TO).b());
        }
    }

    /* renamed from: rvq$m */
    public static final class m<T> implements ajfb<pso> {
        private /* synthetic */ rvq a;

        public m(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            pso pso = (pso) obj;
            String str = pso.a;
            Object obj2 = pso.b;
            a a = ((wki) this.a.b.get()).a(new pur(str, ((abyi) obj2.get(0)).e.a().toString(), false), new pth(pso.c, new ptg(), null, 0, null, null, null, 16368)).a(new rgq(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, null, null, false, false, false, null, false, false, false, -2, 1));
            Object b = ajdx.b(obj2);
            akcr.a(b, "Single.just(mediaPackages)");
            ((wki) this.a.b.get()).a(a.b(b).a((wjx) new wjy(ssm.a)).a(b.SEND_TO).b());
        }
    }

    /* renamed from: rvq$n */
    public static final class n<T> implements ajfb<pss> {
        private /* synthetic */ rvq a;

        public n(rvq rvq) {
            this.a = rvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            d dVar;
            Object obj2 = (pss) obj;
            wki wki = (wki) this.a.b.get();
            rvq rvq = this.a;
            String str = "swipeUpToLensEvent";
            akcr.a(obj2, str);
            wki wki2 = (wki) rvq.b.get();
            puk pun = new pun();
            pth pth = r5;
            pth pth2 = new pth(gcn.CAMERA, null, null, 0, null, null, null, 16368);
            a a = wki2.a(pun, pth).a(b.STACKED_CAMERA_AND_EDIT_AND_SEND_TO).a((wjx) new wjy(ssm.a));
            if (obj2.a != null) {
                String str2 = obj2.a;
                if (str2 == null) {
                    akcr.a();
                }
                dVar = new d(str2, (byte) 0);
            } else {
                dVar = null;
            }
            a = a.a((dpv) dVar);
            akcr.b(obj2, str);
            List arrayList = new ArrayList();
            if (!(obj2.b == null || obj2.c == null || obj2.d == null)) {
                rhc rhc = rhc.STORY;
                str = obj2.c;
                if (str == null) {
                    akcr.a();
                }
                rhe rhe = new rhe(rhc, str);
                String str3 = obj2.c;
                if (str3 == null) {
                    akcr.a();
                }
                StoryKind storyKind = obj2.b;
                if (storyKind == null) {
                    akcr.a();
                }
                str = obj2.d;
                if (str == null) {
                    akcr.a();
                }
                rhh rhh = new rhh(str, null);
                gct gct = obj2.e;
                if (gct != null) {
                    arrayList.add(new rhj(str3, storyKind, rhe, rhh, gct));
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.core.model.StoryPostMetadata");
                }
            }
            wki.a(a.a(new rhl(arrayList, null, null, false, null, 124)).b());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rvq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public rvq(ajei ajei, zgb zgb, aipn<wki> aipn) {
        akcr.b(ajei, "disposable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "sendToController");
        this.a = ajei;
        this.b = aipn;
        this.c = ajxh.a(new o(zgb));
    }

    public static final /* synthetic */ a a(rvq rvq, List list, gcn gcn) {
        a a = ((wki) rvq.b.get()).a(pto.a.a((abyi) ajyu.f(list), false), new pth(gcn, new ptg((byte) 0), null, 0, null, null, null, 16368));
        ajdx b = ajdx.b(ajyl.a(ajyu.f(list)));
        akcr.a((Object) b, "Single.just(listOf(mediaPackages.first()))");
        return a.a(b).a(b.EDIT_AND_SEND_TO).a(ebp.a.a((Collection) ajyl.a(((abyi) ajyu.f(list)).e.a()), false, 6));
    }

    public final zfw a() {
        return (zfw) this.c.b();
    }

    public final void a(ajdp<ebo> ajdp) {
        akcr.b(ajdp, "mediaCreationEventSubject");
        Object f = ajdp.a((ajdw) a().l()).f((ajfb) new e(this));
        akcr.a(f, "mediaCreationEventSubjec…ssion))\n                }");
        std.a(f, this.a);
    }
}
