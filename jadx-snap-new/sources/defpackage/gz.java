package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import defpackage.hb.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: gz */
/**
 * A loader that queries the {@link ContentResolver} and returns a {@link Cursor}.
 * This class implements the {@link Loader} protocol in a standard way for
 * querying cursors, building on {@link AsyncTaskLoader} to perform the cursor
 * query on a background thread so that it does not block the application's UI.
 *
 * <p>A CursorLoader must be built with the full information for the query to
 * perform, either through the
 * {@link #CursorLoader(Context, Uri, String[], String, String[], String)} or
 * creating an empty instance with {@link #CursorLoader(Context)} and filling
 * in the desired paramters with {@link #setUri(Uri)}, {@link #setSelection(String)},
 * {@link #setSelectionArgs(String[])}, {@link #setSortOrder(String)},
 * and {@link #setProjection(String[])}.
 */
// CursorLoader
public final class gz extends gx<Cursor> {
	private a l = new a(); // mObserver
	private Uri m; // uri
	private String[] n; // mProjection
	private String o; // mSelection
	private String[] p; // mSelectionArgs
	private String q; // mSortOrder
	private Cursor r; // mCursor
	private ij s; // mCancellationSignal

	/**
	 * Creates a fully-specified CursorLoader.  See
	 * {@link ContentResolver#query(Uri, String[], String, String[], String)
	 * ContentResolver.query()} for documentation on the meaning of the
	 * parameters.  These will be passed as-is to that call.
	 */
	// CursorLoader
	public gz(Context context, Uri uri, String[] strArr, String str) {
		super(context);
		this.m = uri; // uri
		this.n = strArr; // projection
		this.o = null; // selection
		this.p = null; // selection args
		this.q = str; // sort order
	}

	private void a(Cursor cursor) {
		if (this.i) {
			if (cursor != null) {
				cursor.close();
			}
			return;
		}
		Cursor cursor2 = this.r;
		this.r = cursor;
		if (this.g) {
			super.b(cursor);
		}
		if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
			cursor2.close();
		}
	}

	private Cursor o() {
		synchronized (this) {
			if ((this.b != null ? 1 : null) == null) {
				this.s = new ij();
			} else {
				throw new il();
			}
		}
		Cursor a;
		try {
			a = gy.a(this.f.getContentResolver(), this.m, this.n, null, null, this.q, this.s);
			if (a != null) {
				a.getCount();
				a.registerContentObserver(this.l);
			}
			synchronized (this) {
				this.s = null;
			}
			return a;
		} catch (RuntimeException e) {
			a.close();
			throw e;
		} catch (Throwable th) {
			synchronized (this) {
				this.s = null;
			}
		}
	}

	public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
		super.a(str, fileDescriptor, printWriter, strArr);
		printWriter.print(str);
		printWriter.print("mUri=");
		printWriter.println(this.m);
		printWriter.print(str);
		printWriter.print("mProjection=");
		printWriter.println(Arrays.toString(this.n));
		printWriter.print(str);
		printWriter.print("mSelection=");
		printWriter.println(null);
		printWriter.print(str);
		printWriter.print("mSelectionArgs=");
		printWriter.println(Arrays.toString(null));
		printWriter.print(str);
		printWriter.print("mSortOrder=");
		printWriter.println(this.q);
		printWriter.print(str);
		printWriter.print("mCursor=");
		printWriter.println(this.r);
		printWriter.print(str);
		printWriter.print("mContentChanged=");
		printWriter.println(this.j);
	}

	public final /* synthetic */ void b(Object obj) {
		a((Cursor) obj);
	}

	public final /* synthetic */ Object d() {
		return o();
	}

	public final void e() {
		super.e();
		synchronized (this) {
			if (this.s != null) {
				ij ijVar = this.s;
				synchronized (ijVar) {
					if (ijVar.a) {
					} else {
						ijVar.a = true;
						ijVar.c = true;
						Object obj = ijVar.b;
						if (obj != null) {
							try {
								if (VERSION.SDK_INT >= 16) {
									((CancellationSignal) obj).cancel();
								}
							} catch (Throwable th) {
								synchronized (ijVar) {
									ijVar.c = false;
									ijVar.notifyAll();
								}
							}
						}
						synchronized (ijVar) {
							ijVar.c = false;
							ijVar.notifyAll();
						}
					}
				}
			}
		}
		return;
	}

	/* Access modifiers changed, original: protected|final */
	public final void f() {
		Cursor cursor = this.r;
		if (cursor != null) {
			a(cursor);
		}
		boolean z = this.j;
		this.j = false;
		this.k |= z;
		if (z || this.r == null) {
			k();
		}
	}

	/* Access modifiers changed, original: protected|final */
	public final void g() {
		j();
	}

	/* Access modifiers changed, original: protected|final */
	public final void h() {
		super.h();
		j();
		Cursor cursor = this.r;
		if (!(cursor == null || cursor.isClosed())) {
			this.r.close();
		}
		this.r = null;
	}
}
