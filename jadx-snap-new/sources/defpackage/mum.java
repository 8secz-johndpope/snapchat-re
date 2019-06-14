package defpackage;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.mwp.a;
import defpackage.mwp.a.b;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: mum */
// SignatureVerifier
public final class mum implements mwp {
	private final ajxe a = ajxh.a(a.a);

	/* renamed from: mum$a */
	static final class a extends akcs implements akbk<Signature> {
		public static final a a = new a();

		a() {
			super(0);
		}

		private static Signature a() {
			try {
				PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(BaseEncoding.base64().decode("MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAEiO5dYDou0zswtwDH5NmT3lGMzI2LUIr8ORJWfmE4uo9mliKJLYgptdiJF6Qj0i+8GYKwC9EpglzCCelXFVkAZV6A0Iv4Gf78n9dkMmgK1ldfMWoqLrvowumoQukKX3Zw")));
				Signature instance = Signature.getInstance("SHA384withECDSA");
				instance.initVerify(generatePublic);
				return instance;
			} catch (Exception e) {
				throw new RuntimeException("Can't instantiate signature", e);
			}
		}

		public final /* synthetic */ Object invoke() {
			return a.a();
		}
	}

	static {
		new aken[1][0] = new akdc(akde.a(mum.class), "signature", "getSignature()Ljava/security/Signature;");
	}

	private final Signature a() {
		return (Signature) this.a.b();
	}

	/* JADX WARNING: No exception handlers in catch block: Catch:{  } */
	private final boolean a(byte[] r3, java.lang.String r4) {
		/*
		  r2 = this;
		  r0 = r2.a();
		  r1 = "signature";
		  defpackage.akcr.a(r0, r1);
		  monitor-enter(r0);
		  r1 = r2.a();	 Catch:{  }
		  r1.update(r3);	 Catch:{  }
		  r3 = r2.a();	 Catch:{  }
		  r1 = com.google.common.io.BaseEncoding.base64();	 Catch:{  }
		  r4 = (java.lang.CharSequence) r4;	 Catch:{  }
		  r4 = r1.decode(r4);	 Catch:{  }
		  r3 = r3.verify(r4);	 Catch:{  }
		  monitor-exit(r0);	 Catch:{ SignatureException -> 0x0027 }
		  return r3;
		  L_0x0025:
		  r3 = move-exception;
		  goto L_0x0034;
		  L_0x0027:
		  r3 = move-exception;
		  r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0025 }
		  r1 = "Wrong state of Signature object";
		  r3 = (java.lang.Throwable) r3;	 Catch:{ all -> 0x0025 }
		  r4.<init>(r1, r3);	 Catch:{ all -> 0x0025 }
		  r4 = (java.lang.Throwable) r4;	 Catch:{ all -> 0x0025 }
		  throw r4;	 Catch:{ all -> 0x0025 }
		  L_0x0034:
		  monitor-exit(r0);
		  throw r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.mum.a(byte[], java.lang.String):boolean");
	}

	// verifySignature
	public final a a(String str, String str2) {
		akcr.b(str, "expected");
		akcr.b(str2, "actual");
		try {
			akcr.b(str2, UnlockablesModel.DATA);
			akcr.b(str, "dataSignature");
			Object obj = Charsets.UTF_8;
			akcr.a(obj, "Charsets.UTF_8");
			byte[] bytes = str2.getBytes(obj);
			akcr.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
			return a(bytes, str) ? b.a : new a.a(new RuntimeException("Signature is not valid"));
		} catch (Exception e) {
			return new a.a(new RuntimeException("Failed to verify lens signature", e));
		}
	}
}
