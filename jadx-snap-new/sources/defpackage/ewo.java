package defpackage;

import defpackage.evg.a;

/* renamed from: ewo */
public class ewo {
    final ajwy<exk> a;
    final ajwy<ilv> b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: ewo$b */
    static final class b extends akcs implements akbk<exk> {
        private /* synthetic */ ewo a;

        b(ewo ewo) {
            this.a = ewo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (exk) this.a.a.get();
        }
    }

    /* renamed from: ewo$a */
    static final class a extends akcs implements akbk<ilv> {
        private /* synthetic */ ewo a;

        a(ewo ewo) {
            this.a = ewo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.b.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ewo.class), "propertyFactory", "getPropertyFactory()Lcom/snap/circumstanceengine/lib/property/ConfigPropertyFactory;"), new akdc(akde.a(ewo.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
    }

    public ewo(ajwy<exk> ajwy, ajwy<ilv> ajwy2) {
        akcr.b(ajwy, "propertyFactoryProvider");
        akcr.b(ajwy2, "grapheneProvider");
        this.a = ajwy;
        this.b = ajwy2;
    }

    private final ilv a() {
        return (ilv) this.d.b();
    }

    private final boolean a(acby acby, acce acce) {
        if (acby != null) {
            if (acby.b() || acby.e()) {
                if (acby.b() && acby.a() == 0) {
                    return false;
                }
                if (acby.e()) {
                    return b(acby, acce);
                }
                int a = acby.a();
                for (acby a2 : acby.a) {
                    if (a(a2, acce)) {
                        if (a == 2) {
                            return true;
                        }
                    } else if (a == 1) {
                        return false;
                    }
                }
                return a == 1;
            }
        }
        return true;
    }

    private final boolean b(acby acby, acce acce) {
        exk exk = (exk) this.c.b();
        int c = acby.c();
        akcr.b(acce, "signals");
        a aVar = (a) exk.a.get(new ajxm(Integer.valueOf(c), acce));
        if (aVar != null) {
            exk.a().c(exg.a(c, true), 1);
        } else {
            ajwy ajwy = (ajwy) exk.b.get(Integer.valueOf(c));
            if (ajwy != null) {
                exk.a().c(exg.a(c, false), 1);
                a.a aVar2 = (a.a) ajwy.get();
                akcr.b(acce, "<set-?>");
                aVar2.a = acce;
                aVar = aVar2.b();
                exk.a.put(new ajxm(Integer.valueOf(c), acce), aVar);
            } else {
                throw new exr("Invalid Property: ".concat(String.valueOf(c)), c);
            }
        }
        Object obj = acby.b;
        if (aVar.a()) {
            int d = acby.d();
            if (d == 0) {
                return false;
            }
            String str = "nodeValue";
            if (d == 1) {
                akcr.a(obj, str);
                if (!(aVar.a(obj) && aVar.compareTo(obj) == 0)) {
                    return false;
                }
            } else if (d == 2) {
                akcr.a(obj, str);
                if (!aVar.a(obj) || aVar.compareTo(obj) == 0) {
                    return false;
                }
            } else if (d == 3) {
                akcr.a(obj, str);
                if (!aVar.a(obj) || aVar.compareTo(obj) < 0) {
                    return false;
                }
            } else if (d != 4) {
                return false;
            } else {
                akcr.a(obj, str);
                if (!aVar.a(obj) || aVar.compareTo(obj) > 0) {
                    return false;
                }
            }
            return true;
        }
        throw new ajxl("An operation is not implemented: ".concat("Decision on what to do with stale properties"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x00b7 in {7, 14, 17, 21, 23, 25} preds:[]
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
    public final com.google.common.base.Optional<defpackage.acbz> a(java.util.List<defpackage.acbz> r14, defpackage.acce r15) {
        /*
        r13 = this;
        r0 = "rule_id";
        r1 = "config_name";
        r2 = "configName";
        r3 = "configId";
        r4 = "ruleId";
        r5 = "configRules";
        defpackage.akcr.b(r14, r5);
        r5 = "signals";
        defpackage.akcr.b(r15, r5);
        r5 = r14.isEmpty();	 Catch:{ all -> 0x00b5 }
        r6 = "Optional.absent()";
        if (r5 == 0) goto L_0x0024;
        r14 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r14, r6);	 Catch:{ all -> 0x00b5 }
        return r14;	 Catch:{ all -> 0x00b5 }
        r14 = r14.iterator();	 Catch:{ all -> 0x00b5 }
        r5 = r14.hasNext();	 Catch:{ all -> 0x00b5 }
        if (r5 == 0) goto L_0x00ad;	 Catch:{ all -> 0x00b5 }
        r5 = r14.next();	 Catch:{ all -> 0x00b5 }
        r5 = (defpackage.acbz) r5;	 Catch:{ all -> 0x00b5 }
        r7 = r5.b();	 Catch:{ all -> 0x00b5 }
        r8 = r5.d();	 Catch:{ all -> 0x00b5 }
        r9 = r5.b;	 Catch:{ exr -> 0x0043 }
        r9 = r13.a(r9, r15);	 Catch:{ exr -> 0x0043 }
        goto L_0x0076;
        r9 = move-exception;
        r10 = r13.a();	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r7, r3);	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r8, r4);	 Catch:{ all -> 0x00b5 }
        r9 = r9.a;	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.b(r7, r2);	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.b(r8, r4);	 Catch:{ all -> 0x00b5 }
        r11 = defpackage.inr.UNKNOWN_PROPERTY;	 Catch:{ all -> 0x00b5 }
        r12 = defpackage.exg.a(r7);	 Catch:{ all -> 0x00b5 }
        r11 = r11.a(r1, r12);	 Catch:{ all -> 0x00b5 }
        r12 = defpackage.exg.a(r8);	 Catch:{ all -> 0x00b5 }
        r11 = r11.a(r0, r12);	 Catch:{ all -> 0x00b5 }
        r12 = "property_id";	 Catch:{ all -> 0x00b5 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x00b5 }
        r9 = r11.a(r12, r9);	 Catch:{ all -> 0x00b5 }
        r10.c(r9, 1);	 Catch:{ all -> 0x00b5 }
        r9 = 0;	 Catch:{ all -> 0x00b5 }
        r10 = r13.a();	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r7, r3);	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r8, r4);	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.b(r7, r2);	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.b(r8, r4);	 Catch:{ all -> 0x00b5 }
        r11 = defpackage.inr.EVAL_RULE;	 Catch:{ all -> 0x00b5 }
        r7 = defpackage.exg.a(r7);	 Catch:{ all -> 0x00b5 }
        r7 = r11.a(r1, r7);	 Catch:{ all -> 0x00b5 }
        r8 = defpackage.exg.a(r8);	 Catch:{ all -> 0x00b5 }
        r7 = r7.a(r0, r8);	 Catch:{ all -> 0x00b5 }
        r8 = "is_true";	 Catch:{ all -> 0x00b5 }
        r7 = r7.a(r8, r9);	 Catch:{ all -> 0x00b5 }
        r10.c(r7, 1);	 Catch:{ all -> 0x00b5 }
        if (r9 == 0) goto L_0x0028;	 Catch:{ all -> 0x00b5 }
        r14 = com.google.common.base.Optional.of(r5);	 Catch:{ all -> 0x00b5 }
        r15 = "Optional.of(rule)";	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r14, r15);	 Catch:{ all -> 0x00b5 }
        return r14;	 Catch:{ all -> 0x00b5 }
        r14 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x00b5 }
        defpackage.akcr.a(r14, r6);	 Catch:{ all -> 0x00b5 }
        return r14;
        r14 = move-exception;
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewo.a(java.util.List, acce):com.google.common.base.Optional");
    }
}
