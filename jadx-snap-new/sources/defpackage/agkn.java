package defpackage;

import java.util.Locale;

/* renamed from: agkn */
public enum agkn {
    AL(r2),
    AK(r3),
    AZ(r4),
    AR(r5),
    CA(r6),
    CO(r7),
    CT(r8),
    DE(r8),
    FL("FL"),
    GA("GA"),
    HI("HI"),
    ID("ID"),
    IL("IL"),
    IN("IN"),
    IA("IA"),
    KS("KS"),
    KY("KY"),
    LA("LA"),
    ME("ME"),
    MD("MD"),
    MA("MA"),
    MI("MI"),
    MN("MN"),
    MS("MS"),
    MO("MO"),
    MT("MT"),
    NE("NE"),
    NV("NV"),
    NH("NH"),
    NJ("NJ"),
    NM("NM"),
    NY("NY"),
    NC("NC"),
    ND("ND"),
    OH("OH"),
    OK("OK"),
    OR("OR"),
    PA("PA"),
    PR("PR"),
    RI("RI"),
    SC("SC"),
    SD("SD"),
    TN("TN"),
    TX("TX"),
    UT("UT"),
    VT("VT"),
    VA("VA"),
    WA("WA"),
    WV("WV"),
    WI("WI"),
    WY("WY"),
    DC("DC"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private agkn(String str) {
        this.value = str;
    }

    public static agkn a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agkn.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
