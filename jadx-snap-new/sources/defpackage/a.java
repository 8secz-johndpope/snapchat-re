package defpackage;

import java.util.Random;

/* renamed from: a */
public final class a {
	public static final a a = new a();
	private static final ajxe b = ajxh.a(a.a);

	/* renamed from: a$a */
	static final class a extends akcs implements akbk<Random> {
		public static final a a = new a();

		a() {
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new Random(System.currentTimeMillis());
		}
	}

	static {
		new aken[1][0] = new akdc(akde.a(a.class), "random", "getRandom()Ljava/util/Random;");
	}

	private a() {
	}

	public static double a(double d) {
		double nextDouble = ((Random) b.b()).nextDouble() - 0.5d;
		return 0.0d - ((d * Math.signum(nextDouble)) * Math.log(1.0d - (Math.abs(nextDouble) * 2.0d)));
	}
}
