package defpackage;

/* renamed from: ink */
public enum ink {
    PLATFORM(iot.values()),
    PLAYBACK(iov.values()),
    ADS(inm.values()),
    CAMERA(inq.values()),
    DISCOVER_FEED(inz.values()),
    FRIENDS_FEED(ioc.values()),
    SEND_TO(ioz.values()),
    SNAP_PREVIEW(ipc.values()),
    GEOFILTER(iod.values()),
    UNLOCKABLES(ipg.values()),
    SEND_MESSAGE(ioy.values()),
    FIDELIUS(ioa.values()),
    STORIES(ipd.values()),
    STORY_PLAYBACK(ipe.values()),
    STORY_NOTIFICATION(ine.values()),
    IDENTITY_SETTINGS(iog.values()),
    LOAD_MESSAGE(ioj.values()),
    TOOLS(ipf.values()),
    BOLT(inp.values()),
    MEMORIES(iom.values()),
    LENS(ioi.values()),
    BLIZZARD(ino.values()),
    IN_APP_REPORT(ioh.values()),
    ADDLIVE(inl.values()),
    CRASH(inw.values()),
    MEDIA(iol.values()),
    SECURITY(iox.values()),
    DDML(inx.values()),
    CONTENT_MANAGER(inu.values()),
    SETTINGS(ipa.values()),
    NETWORK_MANAGER(ioo.values()),
    LOGIN_SIGNUP(iok.values()),
    GHOST_TO_FEED(ioe.values()),
    CIRCUMSTANCE_ENGINE(inr.values()),
    SNAP_DB_THREAD(ipb.values()),
    COMMERCE(ins.values()),
    DF_ERRORS(iny.values()),
    NOTIFICATIONS(iop.values()),
    CONTENT_RESOLVER(inv.values()),
    RECEIVE_MESSAGE(iow.values()),
    OPERA(ior.values()),
    NATIVE_CLIENT(ion.values()),
    BITMOJI(inn.values()),
    CONTENT_DELIVERY(int.values()),
    IDENTITY(ind.values()),
    FRIENDING(iob.values()),
    BATTERY(inb.values()),
    WEB(iph.values()),
    GRAPHENE(iof.values()),
    UPLOAD(inf.values()),
    BENCHMARKS(inc.values());
    
    private final ily[] metrics;

    private ink(ily... ilyArr) {
        this.metrics = ilyArr;
    }

    public final ily[] a() {
        return this.metrics;
    }
}
