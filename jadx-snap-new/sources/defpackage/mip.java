package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mip */
public final class mip {

    /* renamed from: mip$h */
    static final class h<Upstream, Downstream> implements ajdu<T, R> {
        private /* synthetic */ String a;

        /* renamed from: mip$h$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(Integer.MAX_VALUE);
            }
        }

        h(String str) {
            this.a = str;
        }

        public final /* synthetic */ ajdt apply(final ajdp ajdp) {
            akcr.b(ajdp, "upstream");
            return ajdp.b((Callable) new 1(this)).u(new ajfc<T, ajdt<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "value");
                    return ajdp.d((ajfb) new ajfb<T>() {
                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    }).a((ajev) new ajev() {
                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$i */
    static final class i<Upstream, Downstream> implements ajec<T, R> {
        private /* synthetic */ String a;

        /* renamed from: mip$i$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ i a;

            1(i iVar) {
                this.a = iVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(Integer.MAX_VALUE);
            }
        }

        i(String str) {
            this.a = str;
        }

        public final /* synthetic */ ajeb apply(final ajdx ajdx) {
            akcr.b(ajdx, "upstream");
            return ajdx.c((Callable) new 1(this)).a((ajfc) new ajfc<T, ajeb<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "value");
                    return ajdx.c((ajfb) new ajfb<T>() {
                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    }).b((ajev) new ajev() {
                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$k */
    static final class k<Upstream, Downstream> implements ajdu<T, R> {
        final /* synthetic */ String a;

        /* renamed from: mip$k$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ k a;

            1(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(zgo.a());
            }
        }

        k(String str) {
            this.a = str;
        }

        public final /* synthetic */ ajdt apply(final ajdp ajdp) {
            akcr.b(ajdp, "upstream");
            return ajdp.b((Callable) new 1(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                final /* synthetic */ k a;

                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "cookie");
                    final int i = atomicInteger.get();
                    return ajdp.d((ajfb) new ajfb<T>(this) {
                        private /* synthetic */ 2 a;

                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    }).a((ajev) new ajev(this) {
                        private /* synthetic */ 2 a;

                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$b */
    static final class b<T> implements ajfb<T> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: mip$c */
    static final class c<T> implements ajfb<T> {
        public static final c a = new c();

        c() {
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: mip$l */
    public static final class l<Upstream, Downstream> implements ajdi<T, R> {
        final /* synthetic */ String a;

        /* renamed from: mip$l$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ l a;

            1(l lVar) {
                this.a = lVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(zgo.a());
            }
        }

        public l(String str) {
            this.a = str;
        }

        public final /* synthetic */ akuw a(final ajde ajde) {
            akcr.b(ajde, "upstream");
            return ajde.b((Callable) new 1(this)).h(new ajfc<T, akuw<? extends R>>(this) {
                final /* synthetic */ l a;

                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "cookie");
                    final int i = atomicInteger.get();
                    return ajde.d((ajfb) new ajfb<T>(this) {
                        private /* synthetic */ 2 a;

                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    }).a((ajev) new ajev(this) {
                        private /* synthetic */ 2 a;

                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$m */
    static final class m<Upstream, Downstream> implements ajec<T, R> {
        final /* synthetic */ String a;

        /* renamed from: mip$m$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ m a;

            1(m mVar) {
                this.a = mVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(zgo.a());
            }
        }

        m(String str) {
            this.a = str;
        }

        public final /* synthetic */ ajeb apply(final ajdx ajdx) {
            akcr.b(ajdx, "upstream");
            return ajdx.c((Callable) new 1(this)).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ m a;

                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "cookie");
                    final int i = atomicInteger.get();
                    return ajdx.c((ajfb) new ajfb<T>(this) {
                        private /* synthetic */ 2 a;

                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    }).b((ajev) new ajev(this) {
                        private /* synthetic */ 2 a;

                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "cookie");
                            mip.a(atomicInteger, i);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$g */
    static final class g<Upstream, Downstream> implements ajdi<T, R> {
        private /* synthetic */ String a;

        /* renamed from: mip$g$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(Integer.MAX_VALUE);
            }
        }

        g(String str) {
            this.a = str;
        }

        public final /* synthetic */ akuw a(final ajde ajde) {
            akcr.b(ajde, "upstream");
            return ajde.b((Callable) new 1(this)).h(new ajfc<T, akuw<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "value");
                    return ajde.d((ajfb) new ajfb<T>() {
                        public final void accept(T t) {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    }).a((ajev) new ajev() {
                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$a */
    static final class a<T> implements ajfb<T> {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: mip$f */
    static final class f<T> implements ajfb<T> {
        public static final f a = new f();

        f() {
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: mip$j */
    public static final class j implements ajdc {
        private /* synthetic */ String a;

        /* renamed from: mip$j$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object call() {
                return new AtomicInteger(Integer.MAX_VALUE);
            }
        }

        public j(String str) {
            this.a = str;
        }

        public final /* synthetic */ ajdb a(final ajcx ajcx) {
            akcr.b(ajcx, "upstream");
            return ajdx.c((Callable) new 1(this)).e((ajfc) new ajfc<AtomicInteger, ajdb>() {
                public final /* synthetic */ Object apply(Object obj) {
                    final AtomicInteger atomicInteger = (AtomicInteger) obj;
                    akcr.b(atomicInteger, "value");
                    return ajcx.b((ajev) new ajev() {
                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    }).f(new ajev() {
                        public final void run() {
                            AtomicInteger atomicInteger = atomicInteger;
                            akcr.a((Object) atomicInteger, "value");
                            atomicInteger.compareAndSet(Integer.MAX_VALUE, -1);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: mip$d */
    public static final class d<T> implements ajfb<T> {
        private /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: mip$e */
    public static final class e<T> implements ajfb<T> {
        public static final e a = new e();

        e() {
        }

        public final void accept(T t) {
        }
    }

    public static final <T> ajde<T> a(ajde<T> ajde) {
        akcr.b(ajde, "receiver$0");
        Object d = ajde.d((ajfb) f.a);
        akcr.a(d, "this.doOnNext { if (fals…raceCompat.endSection() }");
        return d;
    }

    public static final <T> ajde<T> a(ajde<T> ajde, String str) {
        akcr.b(ajde, "receiver$0");
        akcr.b(str, "sectionName");
        Object a = ajde.a((ajdi) new g(mip.a(str)));
        akcr.a(a, "this.compose { upstream …_TRACE) }\n        }\n    }");
        return a;
    }

    public static final <T> ajdp<T> a(ajdp<T> ajdp, String str) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(str, "sectionName");
        Object a = ajdp.a((ajdu) new k(mip.a(str)));
        akcr.a(a, "this.compose { upstream …}\n                }\n    }");
        return a;
    }

    public static final <T> ajdx<T> a(ajdx<T> ajdx, String str) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(str, "sectionName");
        Object a = ajdx.a((ajec) new m(mip.a(str)));
        akcr.a(a, "this.compose { upstream …}\n                }\n    }");
        return a;
    }

    public static final String a(Object obj) {
        akcr.b(obj, "value");
        obj = obj.getClass().getName();
        akcr.a(obj, "value.javaClass.name");
        return (String) ajyu.h(akgc.a((CharSequence) obj, new String[]{"."}, 0, 6));
    }

    public static final String a(String str) {
        akcr.b(str, "section");
        return "LOOK:".concat(String.valueOf(str));
    }

    public static final <T> ajde<T> b(ajde<T> ajde, String str) {
        akcr.b(ajde, "receiver$0");
        akcr.b(str, "sectionName");
        Object d = ajde.d((ajfb) new a(mip.a(str)));
        akcr.a(d, "this.doOnNext { if (fals…ompat.beginSection(tag) }");
        return d;
    }

    public static final <T> ajdp<T> b(ajdp<T> ajdp, String str) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(str, "sectionName");
        Object a = ajdp.a((ajdu) new h(mip.a(str)));
        akcr.a(a, "this.compose { upstream …_TRACE) }\n        }\n    }");
        return a;
    }

    public static final <T> ajdx<T> b(ajdx<T> ajdx, String str) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(str, "sectionName");
        Object a = ajdx.a((ajec) new i(mip.a(str)));
        akcr.a(a, "this.compose { upstream …_TRACE) }\n        }\n    }");
        return a;
    }

    public static final <T> ajdp<T> c(ajdp<T> ajdp, String str) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(str, "sectionName");
        Object b = ajdp.d((ajfb) new b(mip.a(str))).b((ajfb) c.a);
        akcr.a(b, "this\n            .doOnNe…raceCompat.endSection() }");
        return b;
    }
}
