package defpackage;

/* renamed from: ajuz */
public final class ajuz {
    public static <T, U> void a(ajge<T> ajge, ajdv<? super U> ajdv, boolean z, ajej ajej, ajuv<T, U> ajuv) {
        int i = 1;
        while (!ajuz.a(ajuv.c(), ajge.isEmpty(), ajdv, false, ajge, ajej, ajuv)) {
            while (true) {
                boolean c = ajuv.c();
                Object poll = ajge.poll();
                boolean z2 = poll == null;
                if (!ajuz.a(c, z2, ajdv, false, ajge, ajej, ajuv)) {
                    if (z2) {
                        i = ajuv.a(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    ajuv.a(ajdv, poll);
                } else {
                    return;
                }
            }
        }
    }

    public static <T, U> void a(ajge<T> ajge, akux<? super U> akux, boolean z, ajej ajej, ajuy<T, U> ajuy) {
        int i = 1;
        while (true) {
            boolean d = ajuy.d();
            Object poll = ajge.poll();
            boolean z2 = poll == null;
            if (ajuz.a(d, z2, akux, false, ajge, ajuy)) {
                if (ajej != null) {
                    ajej.dispose();
                }
                return;
            } else if (z2) {
                i = ajuy.a(-i);
                if (i == 0) {
                    return;
                }
            } else {
                long f = ajuy.f();
                if (f == 0) {
                    ajge.clear();
                    if (ajej != null) {
                        ajej.dispose();
                    }
                    akux.a(new ajeq("Could not emit value due to lack of requests."));
                    return;
                } else if (ajuy.a(akux, poll) && f != Long.MAX_VALUE) {
                    ajuy.g();
                }
            }
        }
    }

    private static <T, U> boolean a(boolean z, boolean z2, ajdv<?> ajdv, boolean z3, ajgf<?> ajgf, ajej ajej, ajuv<T, U> ajuv) {
        if (ajuv.b()) {
            ajgf.clear();
            ajej.dispose();
            return true;
        }
        if (z) {
            Throwable f;
            if (!z3) {
                f = ajuv.f();
                if (f != null) {
                    ajgf.clear();
                    if (ajej != null) {
                        ajej.dispose();
                    }
                    ajdv.a(f);
                    return true;
                } else if (z2) {
                    if (ajej != null) {
                        ajej.dispose();
                    }
                    ajdv.a();
                    return true;
                }
            } else if (z2) {
                if (ajej != null) {
                    ajej.dispose();
                }
                f = ajuv.f();
                if (f != null) {
                    ajdv.a(f);
                } else {
                    ajdv.a();
                }
                return true;
            }
        }
        return false;
    }

    private static <T, U> boolean a(boolean z, boolean z2, akux<?> akux, boolean z3, ajgf<?> ajgf, ajuy<T, U> ajuy) {
        if (ajuy.c()) {
            ajgf.clear();
            return true;
        }
        if (z) {
            if (z3) {
                if (z2) {
                    akux.a();
                    return true;
                }
            } else if (z2) {
                akux.a();
                return true;
            }
        }
        return false;
    }
}
