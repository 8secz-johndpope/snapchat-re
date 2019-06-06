package defpackage;

/* renamed from: aad */
final class aad extends RuntimeException {
    aad(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
