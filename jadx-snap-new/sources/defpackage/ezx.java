package defpackage;

/* renamed from: ezx */
public enum ezx {
    NONE(r2),
    Cognac(r3),
    Pluto(r4),
    Starfox(r5),
    Zephyr(r6),
    PingPong(r7),
    ZooLander(r8),
    GrandCanyon("Grand Canyon"),
    KoolAid("Kool-Aid");
    
    public final String name;

    private ezx(String str) {
        this.name = str;
    }

    public final String a() {
        return this.name;
    }
}
