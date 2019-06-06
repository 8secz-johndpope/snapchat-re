package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.Set;

/* renamed from: fts */
public interface fts {
    ajdx<AssetFileDescriptor> a(Uri uri, CancellationSignal cancellationSignal, rzg rzg);

    ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2);

    ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx);

    Set<gdy> b(Uri uri);
}
