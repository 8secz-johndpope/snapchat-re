package defpackage;

import defpackage.ajdw.c;

/* renamed from: ajpv */
public final class ajpv<T> extends ajnp<T, T> {
	private ajdw b;
	private boolean c = false;
	private int d;

	/* renamed from: ajpv$a */
	static final class a<T> extends ajgh<T> implements ajdv<T>, Runnable {
		private ajdv<? super T> a;
		private c b;
		private boolean c;
		private int d;
		private ajgf<T> e;
		private ajej f;
		private Throwable g;
		private volatile boolean h;
		private volatile boolean i;
		private int j;
		private boolean k;

		a(ajdv<? super T> ajdv, c cVar, boolean z, int i) {
			this.a = ajdv;
			this.b = cVar;
			this.c = z;
			this.d = i;
		}

		private boolean a(boolean z, boolean z2, ajdv<? super T> ajdv) {
			if (this.i) {
				this.e.clear();
				return true;
			}
			if (z) {
				Throwable th = this.g;
				if (this.c) {
					if (z2) {
						this.i = true;
						if (th != null) {
							ajdv.a(th);
						} else {
							ajdv.a();
						}
						this.b.dispose();
						return true;
					}
				} else if (th != null) {
					this.i = true;
					this.e.clear();
					ajdv.a(th);
					this.b.dispose();
					return true;
				} else if (z2) {
					this.i = true;
					ajdv.a();
					this.b.dispose();
					return true;
				}
			}
			return false;
		}

		private void b() {
			if (getAndIncrement() == 0) {
				this.b.a((Runnable) this);
			}
		}

		public final int a(int i) {
			if ((i & 2) == 0) {
				return 0;
			}
			this.k = true;
			return 2;
		}

		public final void a() {
			if (!this.h) {
				this.h = true;
				b();
			}
		}

		public final void a(ajej ajej) {
			if (ajfp.a(this.f, ajej)) {
				this.f = ajej;
				if (ajej instanceof ajga) {
					ajga ajga = (ajga) ajej;
					int a = ajga.a(7);
					if (a == 1) {
						this.j = a;
						this.e = ajga;
						this.h = true;
						this.a.a((ajej) this);
						b();
						return;
					} else if (a == 2) {
						this.j = a;
						this.e = ajga;
						this.a.a((ajej) this);
						return;
					}
				}
				this.e = new ajtb(this.d);
				this.a.a((ajej) this);
			}
		}

		public final void a(T t) {
			if (!this.h) {
				if (this.j != 2) {
					this.e.offer(t);
				}
				b();
			}
		}

		public final void a(Throwable th) {
			if (this.h) {
				ajvo.a(th);
				return;
			}
			this.g = th;
			this.h = true;
			b();
		}

		public final void clear() {
			this.e.clear();
		}

		public final void dispose() {
			if (!this.i) {
				this.i = true;
				this.f.dispose();
				this.b.dispose();
				if (getAndIncrement() == 0) {
					this.e.clear();
				}
			}
		}

		public final boolean isDisposed() {
			return this.i;
		}

		public final boolean isEmpty() {
			return this.e.isEmpty();
		}

		public final T poll() {
			return this.e.poll();
		}

		/* JADX WARNING: Missing block: B:34:0x006d, code skipped:
		   r3 = addAndGet(-r3);
		*/
		/* JADX WARNING: Missing block: B:35:0x0072, code skipped:
		   if (r3 != 0) goto L_0x004a;
		*/
		public final void run() {
			/*
			  r7 = this;
			  r0 = r7.k;
			  r1 = 1;
			  if (r0 == 0) goto L_0x0045;
			  L_0x0005:
			  r0 = 1;
			  L_0x0006:
			  r2 = r7.i;
			  if (r2 != 0) goto L_0x0044;
			  L_0x000a:
			  r2 = r7.h;
			  r3 = r7.g;
			  r4 = r7.c;
			  if (r4 != 0) goto L_0x0023;
			  L_0x0012:
			  if (r2 == 0) goto L_0x0023;
			  L_0x0014:
			  if (r3 == 0) goto L_0x0023;
			  L_0x0016:
			  r7.i = r1;
			  r0 = r7.a;
			  r0.a(r3);
			  L_0x001d:
			  r0 = r7.b;
			  r0.dispose();
			  return;
			  L_0x0023:
			  r3 = r7.a;
			  r4 = 0;
			  r3.a(r4);
			  if (r2 == 0) goto L_0x003d;
			  L_0x002b:
			  r7.i = r1;
			  r0 = r7.g;
			  if (r0 == 0) goto L_0x0037;
			  L_0x0031:
			  r1 = r7.a;
			  r1.a(r0);
			  goto L_0x001d;
			  L_0x0037:
			  r0 = r7.a;
			  r0.a();
			  goto L_0x001d;
			  L_0x003d:
			  r0 = -r0;
			  r0 = r7.addAndGet(r0);
			  if (r0 != 0) goto L_0x0006;
			  L_0x0044:
			  return;
			  L_0x0045:
			  r0 = r7.e;
			  r2 = r7.a;
			  r3 = 1;
			  L_0x004a:
			  r4 = r7.h;
			  r5 = r0.isEmpty();
			  r4 = r7.a(r4, r5, r2);
			  if (r4 != 0) goto L_0x0087;
			  L_0x0056:
			  r4 = r7.h;
			  r5 = r0.poll();	 Catch:{ Throwable -> 0x0075 }
			  if (r5 != 0) goto L_0x0060;
			  L_0x005e:
			  r6 = 1;
			  goto L_0x0061;
			  L_0x0060:
			  r6 = 0;
			  L_0x0061:
			  r4 = r7.a(r4, r6, r2);
			  if (r4 != 0) goto L_0x0087;
			  L_0x0067:
			  if (r6 != 0) goto L_0x006d;
			  L_0x0069:
			  r2.a(r5);
			  goto L_0x0056;
			  L_0x006d:
			  r3 = -r3;
			  r3 = r7.addAndGet(r3);
			  if (r3 != 0) goto L_0x004a;
			  L_0x0074:
			  goto L_0x0087;
			  L_0x0075:
			  r3 = move-exception;
			  defpackage.ajep.a(r3);
			  r7.i = r1;
			  r1 = r7.f;
			  r1.dispose();
			  r0.clear();
			  r2.a(r3);
			  goto L_0x001d;
			  L_0x0087:
			  return;
			*/
			throw new UnsupportedOperationException("Method not decompiled: defpackage.ajpv$a.run():void");
		}
	}

	public ajpv(ajdt<T> ajdt, ajdw ajdw, int i) {
		super(ajdt);
		this.b = ajdw;
		this.d = i;
	}

	public final void a_(ajdv<? super T> ajdv) {
		ajdw ajdw = this.b;
		if (ajdw instanceof ajtq) {
			this.a.a(ajdv);
			return;
		}
		this.a.a(new a(ajdv, ajdw.b(), false, this.d));
	}
}
