package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: oyk */
public final class oyk implements ygh {
    private final oiy a;
    private final oyj b;
    private final oyg c;
    private final aipn<ygo<ygk>> d;

    public oyk(oiy oiy, oyj oyj, oyg oyg, aipn<ygo<ygk>> aipn) {
        akcr.b(oiy, "memoriesFeature");
        akcr.b(oyj, "storageType");
        akcr.b(oyg, Event.CONFIGURATION);
        akcr.b(aipn, "fileManagerListener");
        this.a = oiy;
        this.b = oyj;
        this.c = oyg;
        this.d = aipn;
    }

    public final ide a() {
        return this.a;
    }

    public final ygj b() {
        return this.b;
    }

    public final long c() {
        return this.c.a();
    }

    public final boolean d() {
        return false;
    }

    public final String e() {
        return "files";
    }

    public final Set<ygk> f() {
        Object newHashSet = Sets.newHashSet(oyc.MEDIA, oyc.HD_MEDIA, oyc.OVERLAY, oyc.OVERLAY_METADATA);
        akcr.a(newHashSet, "Sets.newHashSet(\n       …ileType.OVERLAY_METADATA)");
        return (Set) newHashSet;
    }

    public final boolean g() {
        return false;
    }

    public final ygo<ygk> h() {
        return (ygo) this.d.get();
    }
}
