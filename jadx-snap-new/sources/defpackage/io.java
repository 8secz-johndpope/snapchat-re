package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: io */
// FontRequest
public final class io {
	final String a; // providerAuthority
	final String b; // providerPackage
	final String c; // query
	final List<List<byte[]>> d; // certificates
	final String e;
	private final int f = 0;

	// FontRequest(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates)
	public io(String str, String str2, String str3, List<List<byte[]>> list) {
		this.a = (String) jg.a(str);
		this.b = (String) jg.a(str2);
		this.c = (String) jg.a(str3);
		this.d = (List) jg.a(list);
		StringBuilder stringBuilder = new StringBuilder(this.a);
		str2 = "-";
		stringBuilder.append(str2);
		stringBuilder.append(this.b);
		stringBuilder.append(str2);
		stringBuilder.append(this.c);
		this.e = stringBuilder.toString();
	}

	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder2 = new StringBuilder("FontRequest {mProviderAuthority: ");
		stringBuilder2.append(this.a);
		stringBuilder2.append(", mProviderPackage: ");
		stringBuilder2.append(this.b);
		stringBuilder2.append(", mQuery: ");
		stringBuilder2.append(this.c);
		stringBuilder2.append(", mCertificates:");
		stringBuilder.append(stringBuilder2.toString());
		for (int i = 0; i < this.d.size(); i++) {
			stringBuilder.append(" [");
			List list = (List) this.d.get(i);
			for (int i2 = 0; i2 < list.size(); i2++) {
				stringBuilder.append(" \"");
				stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
				stringBuilder.append("\"");
			}
			stringBuilder.append(" ]");
		}
		stringBuilder.append("}");
		stringBuilder.append("mCertificatesArray: 0");
		return stringBuilder.toString();
	}
}
