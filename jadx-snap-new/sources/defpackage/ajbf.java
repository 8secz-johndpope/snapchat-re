package defpackage;

import defpackage.ajbe.b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ajbf */
public final class ajbf {
    public static final ajbg a = ajbf.a(ajbg.class.getClassLoader());
    private static final Logger b = Logger.getLogger(ajbf.class.getName());

    private ajbf() {
    }

    private static ajbg a(ClassLoader classLoader) {
        try {
            return (ajbg) ajay.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), ajbg.class);
        } catch (ClassNotFoundException e) {
            b.log(Level.FINE, "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", e);
            try {
                return (ajbg) ajay.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), ajbg.class);
            } catch (ClassNotFoundException e2) {
                b.log(Level.FINE, "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", e2);
                return new b();
            }
        }
    }
}
