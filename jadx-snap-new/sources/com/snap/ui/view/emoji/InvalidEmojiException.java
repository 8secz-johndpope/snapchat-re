package com.snap.ui.view.emoji;

import defpackage.akco;

public final class InvalidEmojiException extends Throwable {
    private final Throwable cause;
    private final String message;

    public InvalidEmojiException() {
        this(null, null, 3, null);
    }

    public InvalidEmojiException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    public /* synthetic */ InvalidEmojiException(String str, Throwable th, int i, akco akco) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        this(str, th);
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final String getMessage() {
        return this.message;
    }
}
