package defpackage;

/* renamed from: zgb */
// SchedulesProvider
public class zgb {
	public zgb() {
		zgd.a();
	}

	public static zfw a(idd idd) {
		akcr.b(idd, "callsite");
		return new zfw(idd);
	}

	public static zfw a(ide ide, String str) {
		akcr.b(ide, "feature");
		akcr.b(str, "tag");
		return zgb.a(ide.callsite(str));
	}
}
