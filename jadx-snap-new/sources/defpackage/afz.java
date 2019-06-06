package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afz */
public final class afz {
    private final List<ImageHeaderParser> a = new ArrayList();

    public final synchronized List<ImageHeaderParser> a() {
        return this.a;
    }

    public final synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }
}
