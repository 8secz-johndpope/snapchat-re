package androidx.work;

import android.net.Network;
import android.net.Uri;
import defpackage.po;
import defpackage.py;
import defpackage.so;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public UUID a;
    public po b;
    public Executor c;
    so d;
    public py e;
    private Set<String> f;
    private a g;
    private int h;

    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, po poVar, Collection<String> collection, a aVar, int i, Executor executor, so soVar, py pyVar) {
        this.a = uuid;
        this.b = poVar;
        this.f = new HashSet(collection);
        this.g = aVar;
        this.h = i;
        this.c = executor;
        this.d = soVar;
        this.e = pyVar;
    }
}
