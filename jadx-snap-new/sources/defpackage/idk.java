package defpackage;

/* renamed from: idk */
// PageFactory
public final class idk {
	private final ide a;
	private final String b;
	private final idl c;

	public idk(ide ide, String str, idl idl) {
		akcr.b(ide, "feature");
		akcr.b(str, "type");
		this.a = ide;
		this.b = str;
		this.c = idl;
	}

	public final idl a(String... strArr) {
		akcr.b(strArr, "subTypes");
		ide ide = this.a;
		akdf akdf = new akdf(2);
		akdf.b(this.b);
		akdf.a((Object) strArr);
		return new idj(ide, ajym.b((Object[]) (String[]) akdf.a(new String[akdf.a.size()])), this.c);
	}

	/* JADX WARNING: Missing block: B:8:0x0024, code skipped:
	   if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
	*/
	public final boolean equals(java.lang.Object r3) {
		/*
		  r2 = this;
		  if (r2 == r3) goto L_0x0029;
		  L_0x0002:
		  r0 = r3 instanceof defpackage.idk;
		  if (r0 == 0) goto L_0x0027;
		  L_0x0006:
		  r3 = (defpackage.idk) r3;
		  r0 = r2.a;
		  r1 = r3.a;
		  r0 = defpackage.akcr.a(r0, r1);
		  if (r0 == 0) goto L_0x0027;
		  L_0x0012:
		  r0 = r2.b;
		  r1 = r3.b;
		  r0 = defpackage.akcr.a(r0, r1);
		  if (r0 == 0) goto L_0x0027;
		  L_0x001c:
		  r0 = r2.c;
		  r3 = r3.c;
		  r3 = defpackage.akcr.a(r0, r3);
		  if (r3 == 0) goto L_0x0027;
		  L_0x0026:
		  goto L_0x0029;
		  L_0x0027:
		  r3 = 0;
		  return r3;
		  L_0x0029:
		  r3 = 1;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.idk.equals(java.lang.Object):boolean");
	}

	public final int hashCode() {
		ide ide = this.a;
		int i = 0;
		int hashCode = (ide != null ? ide.hashCode() : 0) * 31;
		String str = this.b;
		hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
		idl idl = this.c;
		if (idl != null) {
			i = idl.hashCode();
		}
		return hashCode + i;
	}

	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder("TypedUiPageFactory(feature=");
		stringBuilder.append(this.a);
		stringBuilder.append(", type=");
		stringBuilder.append(this.b);
		stringBuilder.append(", parent=");
		stringBuilder.append(this.c);
		stringBuilder.append(")");
		return stringBuilder.toString();
	}
}
