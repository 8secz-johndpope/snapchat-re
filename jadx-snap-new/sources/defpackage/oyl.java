package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: oyl */
public final class oyl implements ygh {
    private final oiy a;
    private final oyj b;
    private final oyg c;
    private final aipn<ygo<ygk>> d;

    public oyl(oiy oiy, oyj oyj, oyg oyg, aipn<ygo<ygk>> aipn) {
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
        return this.c.b();
    }

    public final boolean d() {
        return false;
    }

    public final String e() {
        return "thumbnails";
    }

    public final Set<ygk> f() {
        Object newHashSet = Sets.newHashSet(oyc.THUMBNAIL, oyc.THUMBNAIL_PACKAGE);
        akcr.a(newHashSet, "Sets.newHashSet(\n       …leType.THUMBNAIL_PACKAGE)");
        return (Set) newHashSet;
    }

    public final boolean g() {
        return false;
    }

    public final ygo<ygk> h() {
        return (ygo) this.d.get();
    }
}
