package defpackage;

import android.graphics.Rect;
import com.brightcove.player.event.Event;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.ClientInterfaceListener;
import com.looksery.sdk.listener.ClientInterfaceListener.InterfaceAction;
import com.looksery.sdk.listener.ClientInterfaceListener.InterfaceControl;
import com.looksery.sdk.listener.ClientInterfaceListener.SystemInterfaceElement;
import defpackage.mhs.b;
import defpackage.mjn.a.a;
import defpackage.mjn.c;
import defpackage.mjn.c.e;
import defpackage.mjn.c.f;
import defpackage.mjn.c.g;
import defpackage.mjn.c.h;
import defpackage.mjn.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: mki */
public final class mki implements mjn {
    final ajwo<d> a;
    final a b = new a(this);
    final mkx c;
    final mio d;
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: mki$b */
    static final class b extends akcs implements akbk<mid<? super a, ajxw>> {
        final /* synthetic */ mki a;

        /* renamed from: mki$b$a */
        public static final class a implements mid<defpackage.mjn.a.a, ajxw> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;
            private /* synthetic */ b i;

            /* renamed from: mki$b$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj, b bVar) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.i = bVar;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final ajxw a(defpackage.mjn.a.a aVar) {
                ajxw ajxw;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        InterfaceControl interfaceControl;
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        aVar = aVar;
                        String str = aVar.a.a;
                        mki mki = this.i.a;
                        Object obj = aVar.b;
                        if (akcr.a(obj, f.a)) {
                            interfaceControl = InterfaceControl.PLAY_BUTTON;
                        } else if (obj instanceof defpackage.mjn.c.b) {
                            interfaceControl = InterfaceControl.IMAGE_PICKER;
                        } else if (akcr.a(obj, g.a)) {
                            interfaceControl = InterfaceControl.SNAP_BUTTON;
                        } else if (akcr.a(obj, h.a)) {
                            interfaceControl = InterfaceControl.TOGGLE_CAMERA_BUTTON;
                        } else if (akcr.a(obj, defpackage.mjn.c.a.a)) {
                            interfaceControl = InterfaceControl.LENS_ATTACHMENT_BUTTON;
                        } else if (obj instanceof c.d) {
                            interfaceControl = InterfaceControl.MODAL;
                        } else if (akcr.a(obj, c.c.a)) {
                            interfaceControl = InterfaceControl.LINK_BITMOJI_CALL_TO_ACTION;
                        } else {
                            throw new Exception("Unsupported interface control ".concat(String.valueOf(mki)));
                        }
                        lSCoreManagerWrapper.handleClientInterfaceAction(str, interfaceControl, InterfaceAction.TRIGGER);
                        ajxw = ajxw.a;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                ajxw = null;
                if (ajxw == null) {
                    ajxw = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return ajxw;
            }

            public final ajdx<ajxw> b(final defpackage.mjn.a.a aVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<ajxw> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(aVar));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(defpackage.mjn.a.a aVar) {
                return defpackage.mid.a.a(this, aVar);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        b(mki mki) {
            this.a = mki;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.c, "DefaultClientInterfaceProcessor#trigger", ajxw.a, this);
        }
    }

    /* renamed from: mki$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mki a;

        1(mki mki) {
            this.a = mki;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setClientInterfaceListener(this.a.b);
            return ajxw.a;
        }
    }

    /* renamed from: mki$a */
    public static final class a implements ClientInterfaceListener {
        private /* synthetic */ mki a;

        a(mki mki) {
            this.a = mki;
        }

        public final Rect getRect(SystemInterfaceElement systemInterfaceElement) {
            akcr.b(systemInterfaceElement, "element");
            mio mio = this.a.d;
            if (systemInterfaceElement == SystemInterfaceElement.SOFT_NAVIGATION_BAR) {
                mih a = mio.a(defpackage.mio.b.a.a);
                return new Rect(a.a, a.b, a.c, a.d);
            }
            throw new Exception("Unsupported system interface element ".concat(String.valueOf(systemInterfaceElement)));
        }

        /* JADX WARNING: Missing block: B:23:0x0056, code skipped:
            r7 = r7;
     */
        public final void requestPerformAction(java.lang.String r6, com.looksery.sdk.listener.ClientInterfaceListener.InterfaceControl r7, com.looksery.sdk.listener.ClientInterfaceListener.InterfaceAction r8, com.looksery.sdk.domain.ClientInterfaceData r9) {
            /*
            r5 = this;
            if (r6 != 0) goto L_0x0003;
        L_0x0002:
            return;
        L_0x0003:
            r0 = 2;
            r1 = 1;
            r2 = 0;
            if (r7 != 0) goto L_0x0009;
        L_0x0008:
            goto L_0x0083;
        L_0x0009:
            r3 = defpackage.mkj.b;
            r7 = r7.ordinal();
            r7 = r3[r7];
            switch(r7) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0054;
                case 3: goto L_0x0051;
                case 4: goto L_0x004e;
                case 5: goto L_0x004b;
                case 6: goto L_0x0018;
                case 7: goto L_0x0015;
                default: goto L_0x0014;
            };
        L_0x0014:
            goto L_0x0083;
        L_0x0015:
            r7 = defpackage.mjn.c.c.a;
            goto L_0x0056;
        L_0x0018:
            if (r9 == 0) goto L_0x0046;
        L_0x001a:
            r7 = r9.getModalData();
            if (r7 == 0) goto L_0x0046;
        L_0x0020:
            r7 = r9.getModalData();
            r3 = "data.modalData";
            defpackage.akcr.a(r7, r3);
            r7 = r7.getHeaderId();
            r4 = "";
            if (r7 != 0) goto L_0x0032;
        L_0x0031:
            r7 = r4;
        L_0x0032:
            r9 = r9.getModalData();
            defpackage.akcr.a(r9, r3);
            r9 = r9.getDescriptionId();
            if (r9 != 0) goto L_0x0040;
        L_0x003f:
            r9 = r4;
        L_0x0040:
            r3 = new mjn$c$d;
            r3.<init>(r7, r9);
            goto L_0x0047;
        L_0x0046:
            r3 = r2;
        L_0x0047:
            r7 = r3;
            r7 = (defpackage.mjn.c) r7;
            goto L_0x0084;
        L_0x004b:
            r7 = defpackage.mjn.c.a.a;
            goto L_0x0056;
        L_0x004e:
            r7 = defpackage.mjn.c.h.a;
            goto L_0x0056;
        L_0x0051:
            r7 = defpackage.mjn.c.g.a;
            goto L_0x0056;
        L_0x0054:
            r7 = defpackage.mjn.c.f.a;
        L_0x0056:
            r7 = (defpackage.mjn.c) r7;
            goto L_0x0084;
        L_0x0059:
            if (r9 == 0) goto L_0x007e;
        L_0x005b:
            r7 = r9.getImagePickerMode();
            if (r7 == 0) goto L_0x007e;
        L_0x0061:
            r9 = defpackage.mkj.a;
            r7 = r7.ordinal();
            r7 = r9[r7];
            if (r7 == r1) goto L_0x0076;
        L_0x006b:
            if (r7 != r0) goto L_0x0070;
        L_0x006d:
            r7 = defpackage.mjn.c.b.a.FACES;
            goto L_0x0078;
        L_0x0070:
            r6 = new ajxk;
            r6.<init>();
            throw r6;
        L_0x0076:
            r7 = defpackage.mjn.c.b.a.ORIGINALS;
        L_0x0078:
            r9 = new mjn$c$b;
            r9.<init>(r7);
            goto L_0x007f;
        L_0x007e:
            r9 = r2;
        L_0x007f:
            r7 = r9;
            r7 = (defpackage.mjn.c) r7;
            goto L_0x0084;
        L_0x0083:
            r7 = r2;
        L_0x0084:
            if (r7 != 0) goto L_0x0087;
        L_0x0086:
            return;
        L_0x0087:
            r9 = new mhs$b;
            r9.<init>(r6);
            if (r8 != 0) goto L_0x008f;
        L_0x008e:
            goto L_0x00b3;
        L_0x008f:
            r6 = defpackage.mkj.c;
            r8 = r8.ordinal();
            r6 = r6[r8];
            if (r6 == r1) goto L_0x00ab;
        L_0x0099:
            if (r6 == r0) goto L_0x00a5;
        L_0x009b:
            r8 = 3;
            if (r6 == r8) goto L_0x009f;
        L_0x009e:
            goto L_0x00b3;
        L_0x009f:
            r6 = new mjn$d$c;
            r6.<init>(r9, r7);
            goto L_0x00b0;
        L_0x00a5:
            r6 = new mjn$d$a;
            r6.<init>(r9, r7);
            goto L_0x00b0;
        L_0x00ab:
            r6 = new mjn$d$b;
            r6.<init>(r9, r7);
        L_0x00b0:
            r2 = r6;
            r2 = (defpackage.mjn.d) r2;
        L_0x00b3:
            if (r2 != 0) goto L_0x00b6;
        L_0x00b5:
            return;
        L_0x00b6:
            r6 = r5.a;
            r6 = r6.a;
            r6.a(r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mki$a.requestPerformAction(java.lang.String, com.looksery.sdk.listener.ClientInterfaceListener$InterfaceControl, com.looksery.sdk.listener.ClientInterfaceListener$InterfaceAction, com.looksery.sdk.domain.ClientInterfaceData):void");
        }

        public final void requestScreenDimmingEnabled(String str, boolean z) {
            if (str != null) {
                this.a.a.a(new d.c(new b(str), new e(z)));
            }
        }

        public final void requestShowPopUpHint(String str, InterfaceControl interfaceControl, String str2) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mki.class), "trigger", "getTrigger()Lcom/snap/lenses/common/Operation;");
    }

    public mki(mkx mkx, mio mio) {
        akcr.b(mkx, "lensCore");
        akcr.b(mio, "systemUiElementsPositionProvider");
        this.c = mkx;
        this.d = mio;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Cl…rfaceProcessor.Request>()");
        this.a = ajwo;
        this.c.c(new 1(this));
    }

    public final /* bridge */ /* synthetic */ ajdp a() {
        return this.a;
    }

    public final mid<a, ajxw> b() {
        return (mid) this.e.b();
    }
}
