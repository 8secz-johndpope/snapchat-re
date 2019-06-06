package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Writer;

public abstract class CharSink {
    protected CharSink() {
    }

    public abstract Writer openStream();

    public void write(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Closer create = Closer.create();
        try {
            Writer writer = (Writer) create.register(openStream());
            writer.append(charSequence);
            writer.flush();
            create.close();
        } catch (Throwable th) {
            create.close();
        }
    }
}
