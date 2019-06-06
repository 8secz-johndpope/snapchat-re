package defpackage;

import java.io.Serializable;

/* renamed from: ajxm */
// Key val pair
public final class ajxm<A, B> implements Serializable {
	public final A a; // key
	public final B b; // val

	public ajxm(A a, B b) {
		this.a = a;
		this.b = b;
	}

	/* JADX WARNING: Missing block: B:6:0x001a, code skipped:
	   if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
	*/
	public final boolean equals(java.lang.Object r3) {
		/*
		  r2 = this;
		  if (r2 == r3) goto L_0x001f;
		  L_0x0002:
		  r0 = r3 instanceof defpackage.ajxm;
		  if (r0 == 0) goto L_0x001d;
		  L_0x0006:
		  r3 = (defpackage.ajxm) r3;
		  r0 = r2.a;
		  r1 = r3.a;
		  r0 = defpackage.akcr.a(r0, r1);
		  if (r0 == 0) goto L_0x001d;
		  L_0x0012:
		  r0 = r2.b;
		  r3 = r3.b;
		  r3 = defpackage.akcr.a(r0, r3);
		  if (r3 == 0) goto L_0x001d;
		  L_0x001c:
		  goto L_0x001f;
		  L_0x001d:
		  r3 = 0;
		  return r3;
		  L_0x001f:
		  r3 = 1;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxm.equals(java.lang.Object):boolean");
	}

	public final int hashCode() {
		Object obj = this.a;
		int i = 0;
		int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
		Object obj2 = this.b;
		if (obj2 != null) {
			i = obj2.hashCode();
		}
		return hashCode + i;
	}

	public final String toString() {
		StringBuilder stringBuilder = new StringBuilder("(");
		stringBuilder.append(this.a);
		stringBuilder.append(ppy.d);
		stringBuilder.append(this.b);
		stringBuilder.append(')');
		return stringBuilder.toString();
	}
}
