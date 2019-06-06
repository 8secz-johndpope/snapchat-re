package defpackage;

import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import java.util.Locale;

/* renamed from: afnb */
public enum afnb {
    ADL(r2),
    ADS(r3),
    APP(r4),
    BM(r5),
    BRO(r6),
    CCAM(r7),
    COG(r8),
    CREATE(r8),
    DELI("DELI"),
    DF("DF"),
    EDU("EDU"),
    ENGDEFAULT("ENGDEFAULT"),
    HYD("HYD"),
    IDT("IDT"),
    IMPALA("IMPALA"),
    IT("IT"),
    LOOK("LOOK"),
    MAPS("MAPS"),
    MC("MC"),
    MEM("MEM"),
    MES("MES"),
    PAC("PAC"),
    PERF("PERF"),
    PROEXP("PROEXP"),
    PX("PX"),
    SCT("SCT"),
    SEARCH(AlphabeticScrollbar.a),
    SEC("SEC"),
    SPECENG("SPECENG"),
    START("START"),
    TOOLS("TOOLS"),
    VIP("VIP"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afnb(String str) {
        this.value = str;
    }

    public static afnb a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afnb.valueOf(str.toUpperCase(Locale.US));
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
