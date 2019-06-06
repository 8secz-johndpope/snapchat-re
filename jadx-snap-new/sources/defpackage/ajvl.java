package defpackage;

/* renamed from: ajvl */
public final class ajvl<T> implements ajdv<T>, ajej {
    private ajdv<? super T> a;
    private ajej b;
    private boolean c;

    public ajvl(ajdv<? super T> ajdv) {
        this.a = ajdv;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            if (this.b == null) {
                Throwable nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.a.a(ajfq.INSTANCE);
                    try {
                        this.a.a(nullPointerException);
                        return;
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajvo.a(new ajeo(nullPointerException, th));
                        return;
                    }
                } catch (Throwable th2) {
                    ajep.a(th2);
                    ajvo.a(new ajeo(nullPointerException, th2));
                    return;
                }
            }
            try {
                this.a.a();
            } catch (Throwable th3) {
                ajep.a(th3);
                ajvo.a(th3);
            }
        }
    }

    public final void a(ajej ajej) {
        if (ajfp.a(this.b, ajej)) {
            this.b = ajej;
            try {
                this.a.a((ajej) this);
            } catch (Throwable th) {
                ajep.a(th);
                ajvo.a(new ajeo(th, th));
            }
        }
    }

    public final void a(T t) {
        if (!this.c) {
            Throwable nullPointerException;
            if (this.b == null) {
                this.c = true;
                nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.a.a(ajfq.INSTANCE);
                    try {
                        this.a.a(nullPointerException);
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajvo.a(new ajeo(nullPointerException, th));
                    }
                } catch (Throwable th2) {
                    ajep.a(th2);
                    ajvo.a(new ajeo(nullPointerException, th2));
                }
            } else if (t == null) {
                nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.b.dispose();
                    a(nullPointerException);
                } catch (Throwable th22) {
                    ajep.a(th22);
                    a(new ajeo(nullPointerException, th22));
                }
            } else {
                try {
                    this.a.a((Object) t);
                } catch (Throwable th222) {
                    ajep.a(th222);
                    a(new ajeo(nullPointerException, th222));
                }
            }
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            ajvo.a(th);
            return;
        }
        this.c = true;
        if (this.b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.a.a(ajfq.INSTANCE);
                try {
                    this.a.a(new ajeo(th, nullPointerException));
                    return;
                } catch (Throwable th2) {
                    ajep.a(th2);
                    ajvo.a(new ajeo(th, nullPointerException, th2));
                    return;
                }
            } catch (Throwable th22) {
                ajep.a(th22);
                ajvo.a(new ajeo(th, nullPointerException, th22));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.a.a(th);
        } catch (Throwable th3) {
            ajep.a(th3);
            ajvo.a(new ajeo(th, th3));
        }
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }
}
