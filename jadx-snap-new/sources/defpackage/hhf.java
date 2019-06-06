package defpackage;

import android.content.Context;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: hhf */
public final class hhf implements abov {
    private final hhe a;

    public hhf(hhe hhe) {
        this.a = hhe;
    }

    public final File a(Context context, File file) {
        CharSink asCharSink = Files.asCharSink(file, Charset.defaultCharset(), FileWriteMode.APPEND);
        try {
            hhe hhe = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hhe.a());
            for (hjx hjx : new ArrayList(hhe.a)) {
                stringBuilder.append(hhe.a(hjx.a.af().toString()));
            }
            asCharSink.write((CharSequence) ajdj.b(stringBuilder.toString()).b());
        } catch (IOException unused) {
        }
        return file;
    }

    public final String a() {
        return "discover_feed_ranking_debug.html";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 10;
    }
}
