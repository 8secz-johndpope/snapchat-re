package defpackage;

import android.database.Cursor;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import com.google.common.collect.Sets;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.gl.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: gou */
// ScreenshotDetector implements LoaderManager.LoaderCallbacks<Cursor>
public final class gou implements a<Cursor> {
	final LinkedList<gox> a = new LinkedList(); // screenshotWatchmanSessions
		final Set<Long> b; // timeTakenConfirmed (time confirmed screenshots were taken)
	final iib c; // screenshotParameterProvider
	final ihh d; // clock
	private final zfw e;
		private final Set<String> f; // filePaths
	private final ajei g; // listCompositeDisposable

	/* renamed from: gou$a */
	static final class a<T, R> implements ajfc<T, R> {
		private /* synthetic */ gou a;

		a(gou gou) {
			this.a = gou;
		}

		public final /* synthetic */ Object apply(Object obj) {
			got got = (got) obj;
			akcr.b(got, "imageMetadata");
			gou gou = this.a;
			abmr.b(); // Enforce only called from main thread
			HashMap hashMap = new HashMap(); // map between timeTaken and filePath (for screenshots)
			defpackage.iib.a c = gou.c.c(); // screenshot parameters
			int i = c.g;
			int i2 = c.h;
			// Check that both dimensions are nonzero
			if (!(got.b == 0 || got.c == 0)) {
				int i3 = 1;
				boolean z = false;
				Object obj2 = (i == 0 || i2 == 0 || (i == got.b && i2 == got.c)) ? 1 : null;
				long a = gou.d.a() - got.a; // time since image taken
				// `/sdcard`
				Object file = Environment.getExternalStorageDirectory().toString();
				akcr.a(file, "Environment.getExternalS…ageDirectory().toString()");
				// `/sdcard/Snapchat`
				File file2 = new File(file, "Snapchat");
				file2.mkdirs();
				file = file2.getAbsolutePath();
				String str = got.d; // filePath
				akcr.a(file, "directory");
				boolean b = akgb.b(str, file, false); // filePath.startsWith("/sdcard/Snapchat")
				str = gmz.a(gmz.a(), "WhatsApp"); // `/sdcard/WhatsApp`
				String a2 = gmz.a(); // `/sdcard`
				Object obj3 = Environment.DIRECTORY_PICTURES; // `/sdcard/Pictures`
				akcr.a(obj3, "DIRECTORY_PICTURES");
				a2 = gmz.a(gmz.a(a2, obj3), "Messenger"); // `/sdcard/Pictures/Messenger`
				// Substring test

				if (akgb.b(got.d, str, false) // filePath.startsWith("/sdcard/WhatsApp")
				    || akgb.b(got.d, a2, false)) /* filePath.startsWith("/sdcard/Pictures/Messenger") */ {
					z = true;
				}
				if (!(obj2 == null || a > TelemetryConstants.FLUSH_DELAY_MS || b || z)) {
					// key = timeTaken, val = filePath
					hashMap.put(Long.valueOf(got.a), got.d);
				}
				synchronized (gou.a) {
					Set linkedHashSet = new LinkedHashSet(); // timeTakenConfirmed (only for confirmed screenshots)
					Set linkedHashSet2 = new LinkedHashSet(); // sessionTags (for sessions with tags != "UNDEFINED_SESSION")
					if (!gou.a.isEmpty()) { // screenshotDetector.sessions.isEmpty()
						// iterate backwards over gou.a (screenshot sessions)
						Iterator descendingIterator = gou.a.descendingIterator();
						while (descendingIterator.hasNext()) {
							gox gox = (gox) descendingIterator.next();
							// if (session.tag != "UNDEFINED_SESSION")
							if ((akcr.a(gox.d, (Object) "UNDEFINED_SESSION") ^ i3) != 0) {
								// only visit sessions with unique tag names
								if (linkedHashSet2.contains(gox.d)) {
										break;
								}
								linkedHashSet2.add(gox.d);
							}
							// iterate over (timeTaken, filePath)
							// since this is in an inner loop, it iterates over (sessions, timeTaken, filePath)
							for (Entry entry : hashMap.entrySet()) {
								Iterator it;
								Object key = entry.getKey(); // timeTaken
								akcr.a(key, "entry.key");
								long longValue = ((Number) key).longValue(); // timeTaken
								// timeTaken > startTime + 1000
								// check if timeTaken is more than a second after startTime
								if (longValue > gox.a + 1000) {
									it = descendingIterator;
									// timeTaken < endTime && !screenshotDetector.timeTakenConfirmed.contains(timeTaken)
									if (longValue < Math.max(gox.b + 2000, gox.b) && !gou.b.contains(Long.valueOf(longValue))) {
										linkedHashSet.add(Long.valueOf(longValue));
										// session.emitStuff(new Pair(timeTaken, filePath))
										gox.a(new ajxm(entry.getKey(), entry.getValue()));
									}
								} else {
									it = descendingIterator;
								}
								descendingIterator = it;
								i3 = 1;
							}
						}
						gou.b.addAll(linkedHashSet); // screenshotDetector.timeTakenConfirmed.addAll(timeTakenConfirmed)
					}
				}
			}
			return ajxw.a; // Unit type
		}
	}

	public gou(iib iib, ihh ihh, zgb zgb) {
		akcr.b(iib, "screenshotParameterProvider");
		akcr.b(ihh, "clock");
		akcr.b(zgb, "schedulersProvider");
		this.c = iib;
		this.d = ihh;
		Object newConcurrentHashSet = Sets.newConcurrentHashSet();
		akcr.a(newConcurrentHashSet, "Sets.newConcurrentHashSet<Long>()");
		this.b = newConcurrentHashSet;
		this.e = zgb.a(gow.a.callsite("Screenshot"));
		this.f = new LinkedHashSet();
		this.g = new ajei(); // ListCompositeDisposable
	}

	// Return a CursorLoader cast to Loader of the pictures directory
	// getPicturesCursorLoader
	public final hb<Cursor> a() {
		return new gz(AppContext.get(),
			      Media.EXTERNAL_CONTENT_URI, // content://media/external/images/media
			      gov.a, // columns to return
			      "datetaken DESC LIMIT 5"); // rows to return (SQL WHERE clause)
	}

	// addSession
	public final void a(gox gox) {
		akcr.b(gox, "screenshotSession");
		synchronized (this.a) {
			this.a.add(gox);
		}
	}

	// onLoaderReset
	public final void a(hb<Cursor> hbVar) {
		// dispose the listCompositeDisposable on loader reset
		akcr.b(hbVar, "loader");
		this.g.a(); // listCompositeDisposable.dispose()
	}

	// onLoadFinished
	public final /* synthetic */ void a(hb hbVar, Object obj) {
		Cursor cursor = (Cursor) obj;
		akcr.b(hbVar, "loader");
		List arrayList = new ArrayList(); // List<got (ImageMetadata)>
		if (cursor != null) {
			// iterate over image metadata in cursor and add to this.filePaths and arrayList
			if (cursor.moveToFirst()) {
				do {
					String string = cursor.getString(3); // 3rd column
					if (!(string == null || this.f.contains(string))) {
						arrayList.add(new got(cursor.getLong(0), cursor.getInt(1), cursor.getInt(2), string));
						this.f.add(string);
					}
				} while (cursor.moveToNext());
			}
			if (!arrayList.isEmpty()) {
				this.g.a( // this.listCompositeDisposable.add(
					ajdp.b((Iterable) arrayList) // Observable.fromIterable(arrayList)
					.a((ajdw) this.e.h()) // .observeOn((Scheduler) this.e.h())
					.p(new a(this)) // .concatMapIterable(new a(this))
					.l()); // .subscribe())
			}
		}
	}
}
