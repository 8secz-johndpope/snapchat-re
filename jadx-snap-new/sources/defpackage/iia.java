package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: iia */
// Image dimensions
public final class iia {
	@SerializedName("width")
	protected int a;
	@SerializedName("height")
	protected int b;

	public iia(int i, int i2) {
		this.a = i;
		this.b = i2;
	}

	public final int a() {
		return this.a;
	}

	public final void a(int i) {
		this.a = i;
	}

	public final int b() {
		return this.b;
	}

	public final void b(int i) {
		this.b = i;
	}

	public final boolean c() {
		double d = (double) this.a;
		double d2 = (double) this.b;
		Double.isNaN(d);
		Double.isNaN(d2);
		return d / d2 < 0.5625d;
	}

	public final boolean equals(Object obj) {
		if (!(obj instanceof iia)) {
			return false;
		}
		iia iia = (iia) obj;
		return this.a == iia.a && this.b == iia.b && getClass().equals(iia.getClass());
	}

	public final int hashCode() {
		int i = this.a;
		return ((i + 41) * 41) + i;
	}

	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder("W x H = [");
		stringBuilder.append(this.a);
		stringBuilder.append(" x ");
		stringBuilder.append(this.b);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
