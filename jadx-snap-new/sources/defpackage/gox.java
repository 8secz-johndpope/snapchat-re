package defpackage;

/* renamed from: gox */
// ScreenshotSession
public abstract class gox {
	final long a; // startTime
	long b; // endTime
	gou c; // screenshotDetector
	final String d; // tag (can be "UNDEFINED_SESSION")
	private ihh e; // clock
	private zfw f; // schedulers

	/* renamed from: gox$a */
	static final class a implements Runnable {
		private /* synthetic */ gox a; // screenshotSession

		a(gox gox) {
			this.a = gox;
		}

		/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
		    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0046 in {8, 9, 14, 16, 19} preds:[]
		    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
		    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
		    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
		    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
		    at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
		    at java.util.ArrayList.forEach(ArrayList.java:1257)
		    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
		    at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
		    at java.util.ArrayList.forEach(ArrayList.java:1257)
		    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
		    at jadx.core.ProcessClass.process(ProcessClass.java:32)
		    at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
		    at jadx.api.JavaClass.decompile(JavaClass.java:62)
		    at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
		*/
		// Remove all screenshot watchman sessions that ended after we did
		public final void run() {
			/* Manual decompile below */
			gox screenshotSession = this.a;
			gou screenshotDetector = screenshotSession.c;
			long ourEndTime = screenshotSession.b;
			LinkedList<gox> screenshotWatchmanSessions = screenshotDetector.a;
			synchronized (screenshotWatchmanSessions) {
				Iterator it = screenshotWatchmanSessions.iterator();
				while (it.hasNext()) {
					gox screenshotSession = it.next();
					long endTime = screenshotSession.b;
					if (endTime == Long.MAX_VALUE || endTime > ourEndTime) {
						continue;
					}
					it.remove();
				}
			}
			/*
			  r10 = this; // this
			  r0 = r10.a; // gox screenshotSession
			  r0 = r0.c; // gou screenshotDetector
			  r1 = r10.a; // gox screenshotSession
			  r1 = r1.b; // endTime
			  r3 = r0.a; // gou screenshotDetector screenshotWatchmanSessions
			  monitor-enter(r3); // synchronized (screenshotWatchmanSessions) {
			  r0 = r0.a;	 Catch:{ all -> 0x0043 } // screenshotWatchmanSessions
			  r0 = r0.iterator();	 Catch:{ all -> 0x0043 } // it = screenshotWatchmanSessions.iterator()
			  r4 = "screenshotWatchmanSessions.iterator()";	 Catch:{ all -> 0x0043 }
			  akcr.a(r0, r4);	 Catch:{ all -> 0x0043 } // non-null assertion
			  :cond_0
			  :goto_0
			  r4 = r0.hasNext();	 Catch:{ all -> 0x0043 } // screenshotSessionsIterator.hasNext()
			  if (r4 == 0) goto cond_2;	 Catch:{ all -> 0x0043 } // if (!screenshotSessionsIterator.hasNext()) goto :cond_2
			  r4 = r0.next();	 Catch:{ all -> 0x0043 } // screenshotSession = it.next()
			  r5 = "screenshotSessionsIterator.next()";	 Catch:{ all -> 0x0043 }
			  akcr.a(r4, r5);	 Catch:{ all -> 0x0043 } // assert screenshotSession != null
			  r4 = (defpackage.gox) r4;	 Catch:{ all -> 0x0043 } // screenshotSession = (gox) screenshotSession
			  r5 = r4.b;	 Catch:{ all -> 0x0043 } // endTime
			  r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x0043 } // Long.MAX_VALUE
			  r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ all -> 0x0043 } // Long.compare(endTime, Long.MAX_VALUE)
			  if (r9 == 0) goto L_0x0034;	 Catch:{ all -> 0x0043 } // if (endTime == Long.MAX_VALUE) goto :cond_1
			  r5 = 1;	 Catch:{ all -> 0x0043 }
			  goto :goto_1;	 Catch:{ all -> 0x0043 }
			  :cond_1
			  r5 = 0;	 Catch:{ all -> 0x0043 }
			  :goto_1
			  if (r5 == 0) goto :cond_0;	 Catch:{ all -> 0x0043 }
			  r4 = r4.b;	 Catch:{ all -> 0x0043 } // screenshotSession.endTime
			  r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));	 Catch:{ all -> 0x0043 } // Long.compare(endTime, this.endTime)
			  if (r6 > 0) goto :cond_0;	 Catch:{ all -> 0x0043 } // if (endTime > this.endTime) goto :cond_0
			  r0.remove();	 Catch:{ all -> 0x0043 } // screenshotSessionsIterator.remove()
			  goto :goto_0;
			  :cond_2
			  monitor-exit(r3); // }
			  return;
			  r0 = move-exception;
			  monitor-exit(r3); // }
			  throw r0;
			  return;
			*/
			throw new UnsupportedOperationException("Method not decompiled: defpackage.gox$a.run():void");
		}
	}

	public /* synthetic */ gox(ihh ihh, zfw zfw, gou gou) {
		this(ihh, // clock
		     zfw, // schedulers
		     gou, // screenshotDetector
		     "UNDEFINED_SESSION"); // tag
	}

	public gox(ihh ihh, zfw zfw, gou gou, String str) {
		akcr.b(ihh, "clock");
		akcr.b(zfw, "schedulers");
		akcr.b(gou, "screenshotDetector");
		akcr.b(str, "tag");
		this.e = ihh; // clock
		this.f = zfw; // schedulers
		this.c = gou; // screenshotDetector
		this.d = str; // tag
		this.a = this.e.a(); // startTime
		this.b = Long.MAX_VALUE; // endTime
	}

	// endSession
	public final void a() {
		// if endTime uninitialized
		if (this.b == Long.MAX_VALUE) {
			this.b = this.e.a();
			// Schedule Runnable subclass to run in 10s
			// Subclass removes all screenshot watchman sessions that end after this one
			zfw.r().postDelayed(new a(this), 10000); // Schedulers.getSnapSharedHandler().postDelayed(new a(this), 10000)
		}
	}

	// emitStuff
	public abstract void a(ajxm<Long, String> ajxm);
}
