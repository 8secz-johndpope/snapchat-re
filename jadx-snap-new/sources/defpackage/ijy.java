package defpackage;

import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;

/* renamed from: ijy */
public final class ijy {
    final ajxe a;
    final ajxe b;
    final ajxe c = ajxh.a(new i(this));
    final ajxe d;
    final ajxe e;
    final ajxe f;

    /* renamed from: ijy$j */
    static final class j extends akcs implements akbk<ikw> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ikw) this.a.get();
        }
    }

    /* renamed from: ijy$h */
    static final class h extends akcs implements akbk<iko> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (iko) this.a.get();
        }
    }

    /* renamed from: ijy$i */
    static final class i extends akcs implements akbk<ikp> {
        private /* synthetic */ ijy a;

        i(ijy ijy) {
            this.a = ijy;
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x006a A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
        /* JADX WARNING: Missing block: B:37:0x00a9, code skipped:
            r5.add(r3.name());
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r11 = this;
            r0 = r11.a;
            r0 = r0.b;
            r0 = r0.b();
            r0 = (defpackage.iko) r0;
            r1 = 0;
            if (r0 == 0) goto L_0x0010;
        L_0x000d:
            r2 = r0.g;
            goto L_0x0011;
        L_0x0010:
            r2 = r1;
        L_0x0011:
            r3 = defpackage.iku.GROUP;
            if (r2 != r3) goto L_0x002a;
        L_0x0015:
            r1 = new ikp;
            r0 = defpackage.ajyy.a;
            r0 = (java.util.Set) r0;
            r2 = defpackage.aiby.GROUP_CHAT;
            r2 = r2.name();
            r2 = defpackage.ajzs.a(r2);
            r1.<init>(r0, r2);
            goto L_0x0102;
        L_0x002a:
            if (r0 == 0) goto L_0x002f;
        L_0x002c:
            r2 = r0.g;
            goto L_0x0030;
        L_0x002f:
            r2 = r1;
        L_0x0030:
            r3 = defpackage.iku.ONE_TO_ONE;
            if (r2 != r3) goto L_0x0102;
        L_0x0034:
            r2 = r0.c;
            r3 = r0.f;
            r4 = r0.e;
            r5 = new java.util.HashSet;
            r6 = 10;
            r5.<init>(r6);
            r6 = java.lang.Boolean.TRUE;
            r2 = defpackage.akcr.a(r2, r6);
            if (r2 == 0) goto L_0x0052;
        L_0x0049:
            r2 = defpackage.ahzl.BIRTHDAY;
            r2 = r2.name();
            r5.add(r2);
        L_0x0052:
            r2 = 0;
            r6 = 1;
            if (r3 == 0) goto L_0x0062;
        L_0x0056:
            r3 = (java.lang.CharSequence) r3;
            r1 = new char[r6];
            r7 = 44;
            r1[r2] = r7;
            r1 = defpackage.akgc.b(r3, r1);
        L_0x0062:
            if (r1 == 0) goto L_0x00e1;
        L_0x0064:
            r1 = (java.lang.Iterable) r1;
            r1 = r1.iterator();
        L_0x006a:
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x00e1;
        L_0x0070:
            r3 = r1.next();
            r3 = (java.lang.String) r3;
            r7 = r3.hashCode();
            switch(r7) {
                case -1326222186: goto L_0x00b1;
                case -1133742454: goto L_0x009f;
                case -1063057464: goto L_0x0094;
                case 65818599: goto L_0x0089;
                case 100247777: goto L_0x007e;
                default: goto L_0x007d;
            };
        L_0x007d:
            goto L_0x006a;
        L_0x007e:
            r7 = "one_of_your_bf";
            r3 = r3.equals(r7);
            if (r3 == 0) goto L_0x006a;
        L_0x0086:
            r3 = defpackage.ahzl.BF;
            goto L_0x00a9;
        L_0x0089:
            r7 = "you_are_one_of_there_bf_but_they_are_not_your";
            r3 = r3.equals(r7);
            if (r3 == 0) goto L_0x006a;
        L_0x0091:
            r3 = defpackage.ahzl.SMIRK;
            goto L_0x00a9;
        L_0x0094:
            r7 = "number_one_bf_for_two_months";
            r3 = r3.equals(r7);
            if (r3 == 0) goto L_0x006a;
        L_0x009c:
            r3 = defpackage.ahzl.SBFF;
            goto L_0x00a9;
        L_0x009f:
            r7 = "number_one_bf_for_two_weeks";
            r3 = r3.equals(r7);
            if (r3 == 0) goto L_0x006a;
        L_0x00a7:
            r3 = defpackage.ahzl.BFF;
        L_0x00a9:
            r3 = r3.name();
            r5.add(r3);
            goto L_0x006a;
        L_0x00b1:
            r7 = "on_fire";
            r3 = r3.equals(r7);
            if (r3 == 0) goto L_0x006a;
        L_0x00b9:
            r3 = java.util.concurrent.TimeUnit.HOURS;
            r7 = 6;
            r7 = r3.toMillis(r7);
            if (r4 == 0) goto L_0x00db;
        L_0x00c3:
            r9 = r4.longValue();
            r9 = r9 - r7;
            r3 = java.util.Calendar.getInstance();
            r7 = "Calendar.getInstance()";
            defpackage.akcr.a(r3, r7);
            r7 = r3.getTimeInMillis();
            r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
            if (r3 >= 0) goto L_0x00db;
        L_0x00d9:
            r3 = 1;
            goto L_0x00dc;
        L_0x00db:
            r3 = 0;
        L_0x00dc:
            if (r3 == 0) goto L_0x006a;
        L_0x00de:
            r3 = defpackage.ahzl.STREAK_HOURGLASS;
            goto L_0x00a9;
        L_0x00e1:
            r5 = (java.util.Set) r5;
            r1 = defpackage.aiby.ONE_TO_ONE_CHAT;
            r1 = r1.name();
            r1 = defpackage.ajzs.a(r1);
            r0 = r0.d;
            r0 = (java.lang.CharSequence) r0;
            if (r0 == 0) goto L_0x00f9;
        L_0x00f3:
            r0 = r0.length();
            if (r0 != 0) goto L_0x00fa;
        L_0x00f9:
            r2 = 1;
        L_0x00fa:
            r0 = r2 ^ 1;
            r2 = new ikp;
            r2.<init>(r5, r1, r0);
            r1 = r2;
        L_0x0102:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$i.invoke():java.lang.Object");
        }
    }

    /* renamed from: ijy$b */
    static final class b extends akcs implements akbk<ikv> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ikv) this.a.get();
        }
    }

    /* renamed from: ijy$g */
    static final class g extends akcs implements akbk<List<? extends Predicate<abzy>>> {
        final /* synthetic */ ijy a;

        /* renamed from: ijy$g$1 */
        static final class 1<T> implements Predicate<abzy> {
            public static final 1 a = new 1();

            1() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
            public final /* synthetic */ boolean apply(java.lang.Object r1) {
                /*
                r0 = this;
                r1 = (defpackage.abzy) r1;
                if (r1 == 0) goto L_0x000d;
            L_0x0004:
                r1 = r1.o();
                if (r1 == 0) goto L_0x000d;
            L_0x000a:
                r1 = r1.e;
                goto L_0x000e;
            L_0x000d:
                r1 = 0;
            L_0x000e:
                if (r1 == 0) goto L_0x0012;
            L_0x0010:
                r1 = 1;
                return r1;
            L_0x0012:
                r1 = 0;
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$g$1.apply(java.lang.Object):boolean");
            }
        }

        /* renamed from: ijy$g$2 */
        static final class 2<T> implements Predicate<abzy> {
            public static final 2 a = new 2();

            2() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
            public final /* synthetic */ boolean apply(java.lang.Object r1) {
                /*
                r0 = this;
                r1 = (defpackage.abzy) r1;
                if (r1 == 0) goto L_0x000d;
            L_0x0004:
                r1 = r1.o();
                if (r1 == 0) goto L_0x000d;
            L_0x000a:
                r1 = r1.f;
                goto L_0x000e;
            L_0x000d:
                r1 = 0;
            L_0x000e:
                if (r1 == 0) goto L_0x0012;
            L_0x0010:
                r1 = 1;
                return r1;
            L_0x0012:
                r1 = 0;
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$g$2.apply(java.lang.Object):boolean");
            }
        }

        /* renamed from: ijy$g$3 */
        static final class 3<T> implements Predicate<abzy> {
            public static final 3 a = new 3();

            3() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
            public final /* synthetic */ boolean apply(java.lang.Object r1) {
                /*
                r0 = this;
                r1 = (defpackage.abzy) r1;
                if (r1 == 0) goto L_0x000d;
            L_0x0004:
                r1 = r1.o();
                if (r1 == 0) goto L_0x000d;
            L_0x000a:
                r1 = r1.g;
                goto L_0x000e;
            L_0x000d:
                r1 = 0;
            L_0x000e:
                if (r1 == 0) goto L_0x0012;
            L_0x0010:
                r1 = 1;
                return r1;
            L_0x0012:
                r1 = 0;
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$g$3.apply(java.lang.Object):boolean");
            }
        }

        /* renamed from: ijy$g$4 */
        static final class 4<T> implements Predicate<abzy> {
            private /* synthetic */ g a;

            4(g gVar) {
                this.a = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
            public final /* synthetic */ boolean apply(java.lang.Object r8) {
                /*
                r7 = this;
                r8 = (defpackage.abzy) r8;
                r0 = 0;
                if (r8 == 0) goto L_0x00a8;
            L_0x0005:
                r1 = r7.a;
                r1 = r1.a;
                r1 = r1.a;
                r1.b();
                r1 = "it";
                defpackage.akcr.a(r8, r1);
                r1 = r7.a;
                r1 = r1.a;
                r1 = r1.c;
                r1 = r1.b();
                r1 = (defpackage.ikp) r1;
                r2 = "geofilter";
                defpackage.akcr.b(r8, r2);
                defpackage.akcr.b(r8, r2);
                r3 = r8.f();
                r4 = defpackage.afdr.GEO_FILTER;
                r5 = 1;
                if (r3 != r4) goto L_0x0044;
            L_0x0030:
                r3 = r8.m();
                r4 = defpackage.aica.FRIEND_FILTER;
                if (r3 != r4) goto L_0x0044;
            L_0x0038:
                r3 = r8.n();
                r3 = defpackage.ikw.a(r3);
                if (r3 != 0) goto L_0x0044;
            L_0x0042:
                r3 = 1;
                goto L_0x0045;
            L_0x0044:
                r3 = 0;
            L_0x0045:
                if (r3 != 0) goto L_0x004d;
            L_0x0047:
                r3 = defpackage.ikw.a(r8);
                if (r3 == 0) goto L_0x00a6;
            L_0x004d:
                if (r1 == 0) goto L_0x00a7;
            L_0x004f:
                defpackage.akcr.b(r8, r2);
                r2 = r8.o();
                r3 = 0;
                if (r2 == 0) goto L_0x005c;
            L_0x0059:
                r4 = r2.a;
                goto L_0x005d;
            L_0x005c:
                r4 = r3;
            L_0x005d:
                r6 = r1.b;
                r4 = defpackage.ikq.a(r4, r6);
                if (r4 == 0) goto L_0x0075;
            L_0x0065:
                if (r2 == 0) goto L_0x006a;
            L_0x0067:
                r2 = r2.b;
                goto L_0x006b;
            L_0x006a:
                r2 = r3;
            L_0x006b:
                r4 = r1.a;
                r2 = defpackage.ikq.a(r2, r4);
                if (r2 == 0) goto L_0x0075;
            L_0x0073:
                r2 = 1;
                goto L_0x0076;
            L_0x0075:
                r2 = 0;
            L_0x0076:
                if (r2 == 0) goto L_0x00a7;
            L_0x0078:
                r2 = r8.o();
                if (r2 == 0) goto L_0x0080;
            L_0x007e:
                r3 = r2.a;
            L_0x0080:
                r2 = defpackage.ikw.a(r8);
                if (r2 == 0) goto L_0x0098;
            L_0x0086:
                if (r3 == 0) goto L_0x0093;
            L_0x0088:
                r2 = defpackage.aiby.GROUP_CHAT;
                r2 = r2.name();
                r2 = r3.contains(r2);
                goto L_0x0094;
            L_0x0093:
                r2 = 0;
            L_0x0094:
                if (r2 == 0) goto L_0x0098;
            L_0x0096:
                r2 = 1;
                goto L_0x0099;
            L_0x0098:
                r2 = 0;
            L_0x0099:
                if (r2 != 0) goto L_0x00a7;
            L_0x009b:
                r8 = defpackage.ikw.a(r8);
                if (r8 == 0) goto L_0x00a6;
            L_0x00a1:
                r8 = r1.c;
                if (r8 != 0) goto L_0x00a6;
            L_0x00a5:
                goto L_0x00a7;
            L_0x00a6:
                return r0;
            L_0x00a7:
                return r5;
            L_0x00a8:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$g$4.apply(java.lang.Object):boolean");
            }
        }

        /* renamed from: ijy$g$5 */
        static final class 5<T> implements Predicate<abzy> {
            public static final 5 a = new 5();

            5() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:23:0x0041 A:{SYNTHETIC} */
            public final /* synthetic */ boolean apply(java.lang.Object r4) {
                /*
                r3 = this;
                r4 = (defpackage.abzy) r4;
                r0 = 0;
                if (r4 == 0) goto L_0x0043;
            L_0x0005:
                r4 = r4.g();
                if (r4 == 0) goto L_0x0043;
            L_0x000b:
                r4 = (java.lang.Iterable) r4;
                r1 = r4 instanceof java.util.Collection;
                if (r1 == 0) goto L_0x001b;
            L_0x0011:
                r1 = r4;
                r1 = (java.util.Collection) r1;
                r1 = r1.isEmpty();
                if (r1 == 0) goto L_0x001b;
            L_0x001a:
                return r0;
            L_0x001b:
                r4 = r4.iterator();
            L_0x001f:
                r1 = r4.hasNext();
                if (r1 == 0) goto L_0x0043;
            L_0x0025:
                r1 = r4.next();
                r1 = (defpackage.aenn) r1;
                r1 = r1.g;
                if (r1 == 0) goto L_0x003e;
            L_0x002f:
                r1 = r1.a;
                if (r1 == 0) goto L_0x003e;
            L_0x0033:
                r2 = defpackage.ahyt.a.RATING_STICKER;
                r2 = r2.a();
                r1 = r1.equals(r2);
                goto L_0x003f;
            L_0x003e:
                r1 = 0;
            L_0x003f:
                if (r1 == 0) goto L_0x001f;
            L_0x0041:
                r4 = 1;
                return r4;
            L_0x0043:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ijy$g$5.apply(java.lang.Object):boolean");
            }
        }

        g(ijy ijy) {
            this.a = ijy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajym.b((Object[]) new Predicate[]{1.a, 2.a, 3.a, new 4(this), 5.a});
        }
    }

    /* renamed from: ijy$a */
    static final class a extends akcs implements akbk<List<? extends akbl<? super abzy, ? extends ajdx<Boolean>>>> {
        final /* synthetic */ ijy a;

        /* renamed from: ijy$a$1 */
        static final class 1 extends akcs implements akbl<abzy, ajdx<Boolean>> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str;
                abzy abzy = (abzy) obj;
                akcr.b(abzy, "it");
                ikv ikv = (ikv) this.a.a.d.b();
                akcr.b(abzy, "geofilter");
                obj = abzy.o();
                if (obj == null) {
                    obj = ajdx.b(Boolean.FALSE);
                    str = "Single.just(false)";
                } else {
                    akcr.a(obj, "geofilter.unlockableCont…return Single.just(false)");
                    obj = ikv.a.b.f(new defpackage.ikv.a(ikv, obj));
                    str = "previewDataSource.mediaP…)\n            }\n        }";
                }
                akcr.a(obj, str);
                return obj;
            }
        }

        a(ijy ijy) {
            this.a = ijy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajyl.a(new 1(this));
        }
    }

    /* renamed from: ijy$c */
    static final class c<T> implements ajfl<abzy> {
        private /* synthetic */ ijy a;

        c(ijy ijy) {
            this.a = ijy;
        }

        public final /* synthetic */ boolean test(Object obj) {
            abzy abzy = (abzy) obj;
            akcr.b(abzy, "geofilter");
            Iterable<Predicate> iterable = (List) this.a.e.b();
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (Predicate apply : iterable) {
                    if (apply.apply(abzy)) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            return obj == null;
        }
    }

    /* renamed from: ijy$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ijy a;

        /* renamed from: ijy$d$2 */
        static final class 2<T> implements ajfl<Boolean> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                return bool.booleanValue();
            }
        }

        d(ijy ijy) {
            this.a = ijy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final abzy abzy = (abzy) obj;
            akcr.b(abzy, "geofilter");
            ajdp n = ajdp.b((Iterable) (List) this.a.f.b()).n(new ajfc<T, ajeb<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    akbl akbl = (akbl) obj;
                    akcr.b(akbl, "predicate");
                    Object obj2 = abzy;
                    akcr.a(obj2, "geofilter");
                    return (ajdx) akbl.invoke(obj2);
                }
            });
            Object obj2 = 2.a;
            ajfv.a(obj2, "predicate is null");
            return ajvo.a(new ajns(n, obj2)).f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "it");
                    return ajxs.a(bool, abzy);
                }
            });
        }
    }

    /* renamed from: ijy$e */
    static final class e<T> implements ajfl<ajxm<? extends Boolean, ? extends abzy>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return !((Boolean) ajxm.a).booleanValue();
        }
    }

    /* renamed from: ijy$f */
    static final class f<T1, T2, R> implements ajex<R, T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            List list = (List) obj;
            ajxm ajxm = (ajxm) obj2;
            akcr.b(list, "filters");
            akcr.b(ajxm, "next");
            return ajyu.a((Collection) list, ajxm.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ijy.class), "friendTargetingContextValidator", "getFriendTargetingContextValidator()Lcom/snap/geofilters/data/validator/FriendTargetingContextValidator;"), new akdc(akde.a(ijy.class), "friendFilterDataSource", "getFriendFilterDataSource()Lcom/snap/geofilters/data/friendfilter/FriendFilterDataSource;"), new akdc(akde.a(ijy.class), "friendFilterMetadata", "getFriendFilterMetadata()Lcom/snap/geofilters/data/friendfilter/FriendFilterMetadata;"), new akdc(akde.a(ijy.class), "cameraTargetingContextValidator", "getCameraTargetingContextValidator()Lcom/snap/geofilters/data/validator/CameraTargetingContextValidator;"), new akdc(akde.a(ijy.class), "eliminationPredicates", "getEliminationPredicates()Ljava/util/List;"), new akdc(akde.a(ijy.class), "asyncPredicates", "getAsyncPredicates()Ljava/util/List;")};
    }

    public ijy(ajwy<ikw> ajwy, ajwy<iko> ajwy2, ajwy<ikv> ajwy3) {
        akcr.b(ajwy, "friendTargetingContextValidatorProvider");
        akcr.b(ajwy2, "friendFilterDataSourceProvider");
        akcr.b(ajwy3, "cameraTargetingContextValidatorProvider");
        this.a = ajxh.a(new j(ajwy));
        this.b = ajxh.a(new h(ajwy2));
        this.d = ajxh.a(new b(ajwy3));
        this.e = ajxh.a(new g(this));
        this.f = ajxh.a(new a(this));
    }
}
