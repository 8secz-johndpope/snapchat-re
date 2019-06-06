package com.snap.composer.exceptions;

import com.brightcove.player.media.ErrorFields;
import defpackage.akcr;

public class ComposerException extends RuntimeException {
    public ComposerException(String str) {
        akcr.b(str, ErrorFields.MESSAGE);
        super(str);
    }
}
