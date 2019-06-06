package defpackage;

/* renamed from: got */
// ImageMetadata
public final class got {
	final long a; // timeTaken
	final int b; // width
	final int c; // height
	final String d; // filePath

	public got(long j, int i, int i2, String str) {
		akcr.b(str, "filePath");
		this.a = j; // timeTaken
		this.b = i; // width
		this.c = i2; // height
		this.d = str; // filePath
	}

	public final boolean equals(Object obj) {
		if (this != obj) {
			if (obj instanceof got) {
				got got = (got) obj;
				if ((this.a == got.a ? 1 : null) != null) {
					if ((this.b == got.b ? 1 : null) != null) {
						if ((this.c == got.c ? 1 : null) == null || !akcr.a(this.d, got.d)) {
							return false;
						}
					}
				}
			}
			return false;
		}
		return true;
	}

	public final int hashCode() {
		long j = this.a;
		int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
		String str = this.d;
		return i + (str != null ? str.hashCode() : 0);
	}

	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder("ImageMetadata(timeTaken=");
		stringBuilder.append(this.a);
		stringBuilder.append(", width=");
		stringBuilder.append(this.b);
		stringBuilder.append(", height=");
		stringBuilder.append(this.c);
		stringBuilder.append(", filePath=");
		stringBuilder.append(this.d);
		stringBuilder.append(")");
		return stringBuilder.toString();
	}
}
