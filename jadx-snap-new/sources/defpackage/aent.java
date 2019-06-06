package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: aent */
public final class aent {
    public static adzo a(aenr aenr) {
        int i;
        adzo adzo = new adzo();
        if (aenr.a != null) {
            adzo.a = aenr.a;
        }
        if (aenr.b != null) {
            adzo.b = aenr.b.longValue();
        }
        if (aenr.c != null) {
            adzo.c = aenr.c;
        }
        if (!(aenr.d == null || aenr.d.isEmpty())) {
            if (adzo.d == null) {
                adzo.d = new HashMap();
            }
            adzo.d.putAll(aenr.d);
        }
        if (aenr.e != null) {
            adzo.e = aenr.e;
        }
        if (aenr.f != null) {
            aenj aenj = aenr.f;
            adzk adzk = new adzk();
            if (aenj.a != null) {
                adzk.a = aexz.a(aenj.a);
            }
            if (aenj.b != null) {
                adzk.b = aexz.a(aenj.b);
            }
            if (aenj.c != null) {
                adzk.c = aeon.a(aenj.c);
            }
            adzo.f = adzk;
        }
        if (aenr.g != null) {
            adzo.g = aeng.a(aenr.g);
        }
        if (aenr.h != null) {
            adzo.h = aenr.h;
        }
        if (aenr.i != null) {
            adzo.i = aenr.i;
        }
        if (aenr.j != null) {
            adzo.j = aenr.j.intValue();
        }
        if (aenr.k != null) {
            adzo.k = new String[aenr.k.size()];
            for (i = 0; i < aenr.k.size(); i++) {
                adzo.k[i] = (String) aenr.k.get(i);
            }
        }
        if (aenr.l != null) {
            adzo.l = new adzm[aenr.l.size()];
            for (i = 0; i < aenr.l.size(); i++) {
                adzm[] adzmArr = adzo.l;
                aenn aenn = (aenn) aenr.l.get(i);
                adzm adzm = new adzm();
                if (aenn.a != null) {
                    adzm.a = aenn.a.longValue();
                }
                if (aenn.b != null) {
                    adzm.b = aenn.b;
                }
                if (aenn.c != null) {
                    adzm.c = aenn.c;
                }
                if (aenn.d != null) {
                    aenl aenl = aenn.d;
                    adzl adzl = new adzl();
                    if (aenl.a != null) {
                        adzl.a = aenl.a.floatValue();
                    }
                    if (aenl.b != null) {
                        adzl.b = aenl.b.floatValue();
                    }
                    if (aenl.c != null) {
                        adzl.c = aenl.c.floatValue();
                    }
                    if (aenl.d != null) {
                        adzl.d = aenl.d.floatValue();
                    }
                    if (aenl.e != null) {
                        adzl.e = aenl.e.floatValue();
                    }
                    if (aenl.f != null) {
                        adzl.f = aenl.f.intValue();
                    }
                    adzm.d = adzl;
                }
                if (aenn.e != null) {
                    aenh aenh = aenn.e;
                    adzj adzj = new adzj();
                    if (aenh.a != null) {
                        adzj.a = aenh.a.intValue();
                    }
                    if (aenh.b != null) {
                        adzj.b = aenh.b;
                    }
                    if (aenh.c != null) {
                        adzj.c = aenh.c;
                    }
                    if (aenh.d != null) {
                        adzj.d = aenh.d;
                    }
                    if (aenh.e != null) {
                        adzj.e = aenh.e;
                    }
                    if (aenh.f != null) {
                        adzj.f = aenh.f.floatValue();
                    }
                    if (aenh.g != null) {
                        afdm afdm = aenh.g;
                        aeah aeah = new aeah();
                        if (afdm.a != null) {
                            aeah.a = afdm.a;
                        }
                        if (afdm.b != null) {
                            aeah.b = aeon.a(afdm.b);
                        }
                        if (afdm.c != null) {
                            aeah.c = afdm.c.floatValue();
                        }
                        adzj.g = aeah;
                    }
                    if (aenh.h != null) {
                        adzj.h = aenh.h.booleanValue();
                    }
                    if (aenh.i != null) {
                        adzj.i = aenh.i;
                    }
                    if (aenh.j != null) {
                        adzj.j = aenh.j.intValue();
                    }
                    if (aenh.k != null) {
                        adzj.k = aenh.k;
                    }
                    if (aenh.l != null) {
                        adzj.l = aenh.l;
                    }
                    if (aenh.m != null) {
                        adzj.m = aenh.m;
                    }
                    if (aenh.n != null) {
                        adzj.n = aenh.n;
                    }
                    if (aenh.o != null) {
                        adzj.o = aenh.o;
                    }
                    if (aenh.p != null) {
                        adzj.p = aenh.p;
                    }
                    adzm.e = adzj;
                }
                if (aenn.f != null) {
                    aerf aerf = aenn.f;
                    adzx adzx = new adzx();
                    if (aerf.a != null) {
                        adzx.a = aerf.a.a(akrc.a).a;
                    }
                    if (aerf.b != null) {
                        adzx.b = aerf.b.a(akrc.a).a;
                    }
                    adzm.f = adzx;
                }
                if (aenn.g != null) {
                    ahyt ahyt = aenn.g;
                    aebb aebb = new aebb();
                    if (ahyt.a != null) {
                        aebb.a = ahyt.a;
                    }
                    if (ahyt.b != null) {
                        aebb.b = ahyt.b.booleanValue();
                    }
                    if (ahyt.c != null) {
                        aebb.c = ahyt.c.booleanValue();
                    }
                    if (ahyt.d != null) {
                        aiay aiay = ahyt.d;
                        aebk aebk = new aebk();
                        if (aiay.a != null) {
                            aebk.a = aiay.a;
                        }
                        if (aiay.b != null) {
                            aebk.b = aiay.b;
                        }
                        if (aiay.c != null) {
                            aebk.c = aiay.c.intValue();
                        }
                        if (aiay.d != null) {
                            aebk.d = aiay.d.intValue();
                        }
                        aebb.d = aebk;
                    }
                    adzm.g = aebb;
                }
                adzmArr[i] = adzm;
            }
        }
        if (aenr.m != null) {
            adzo.m = aenr.m.booleanValue();
        }
        if (aenr.n != null) {
            adzo.n = aenr.n.a(akrc.a).a;
        }
        if (aenr.o != null) {
            adzo.o = aenr.o.longValue();
        }
        if (aenr.p != null) {
            adzo.p = aenr.p.booleanValue();
        }
        if (aenr.q != null) {
            aezp aezp = aenr.q;
            aeab aeab = new aeab();
            if (aezp.a != null) {
                afcp afcp = aezp.a;
                aeag aeag = new aeag();
                if (afcp.a != null) {
                    aeag.a = afcp.a;
                }
                if (afcp.b != null) {
                    aeag.b = afcp.b;
                }
                if (afcp.c != null) {
                    aeag.c = afcp.c;
                }
                if (afcp.d != null) {
                    aeag.d = afcp.d;
                }
                aeab.a = aeag;
            }
            if (aezp.b != null) {
                aeab.b = aezp.b;
            }
            if (aezp.c != null) {
                aeab.c = aezp.c;
            }
            if (aezp.d != null) {
                aeab.d = aezp.d;
            }
            if (aezp.e != null) {
                aeab.e = aezp.e;
            }
            if (aezp.f != null) {
                aeab.f = aezp.f;
            }
            if (aezp.g != null) {
                aeab.g = aezp.g;
            }
            if (aezp.h != null) {
                aeab.h = aezp.h;
            }
            if (aezp.i != null) {
                aeab.i = aezp.i.intValue();
            }
            if (aezp.j != null) {
                aeab.j = aezp.j;
            }
            if (aezp.k != null) {
                aeab.k = aezp.k.intValue();
            }
            adzo.q = aeab;
        }
        if (aenr.r != null) {
            adzo.r = aenr.r;
        }
        if (aenr.s != null) {
            adzo.s = aenr.s;
        }
        if (aenr.t != null) {
            aeju aeju = aenr.t;
            adzh adzh = new adzh();
            if (aeju.a != null) {
                adzh.a = aeju.a.longValue();
            }
            if (aeju.b != null) {
                adzh.b = aeju.b.floatValue();
            }
            if (aeju.c != null) {
                adzh.c = aeju.c.floatValue();
            }
            if (aeju.d != null) {
                adzh.d = aeju.d.floatValue();
            }
            if (aeju.e != null) {
                adzh.e = aeju.e.floatValue();
            }
            if (aeju.f != null) {
                adzh.f = aeju.f;
            }
            if (aeju.g != null) {
                adzh.g = aeju.g;
            }
            adzo.t = adzh;
        }
        if (aenr.u != null) {
            adzo.u = aenr.u.booleanValue();
        }
        if (aenr.v != null) {
            adzo.v = aepv.a(aenr.v);
        }
        if (aenr.w != null) {
            adzo.w = new String[aenr.w.size()];
            for (i = 0; i < aenr.w.size(); i++) {
                adzo.w[i] = (String) aenr.w.get(i);
            }
        }
        if (aenr.x != null) {
            adzo.x = aenr.x;
        }
        if (aenr.y != null) {
            adzo.y = aenr.y.booleanValue();
        }
        if (aenr.z != null) {
            adzo.z = aenr.z;
        }
        if (aenr.A != null) {
            adzo.A = aenr.A;
        }
        if (aenr.B != null) {
            adzo.B = aenr.B;
        }
        if (aenr.C != null) {
            adzo.C = aenr.C.booleanValue();
        }
        if (aenr.D != null) {
            adzo.D = aenr.D;
        }
        if (aenr.E != null) {
            aenp aenp = aenr.E;
            adzn adzn = new adzn();
            if (aenp.a != null) {
                adzn.a = aenp.a;
            }
            if (aenp.b != null) {
                adzn.b = aenp.b;
            }
            if (aenp.c != null) {
                adzn.c = aenp.c.longValue();
            }
            if (aenp.d != null) {
                adzn.d = aenp.d.longValue();
            }
            if (aenp.e != null) {
                adzn.e = aenp.e.longValue();
            }
            adzo.E = adzn;
        }
        if (aenr.F != null) {
            adzo.F = afeb.a(aenr.F);
        }
        if (aenr.G != null) {
            adzo.G = aenr.G;
        }
        if (aenr.H != null) {
            adzo.H = aenr.H.doubleValue();
        }
        if (aenr.I != null) {
            adzo.I = aenr.I.booleanValue();
        }
        if (aenr.J != null) {
            adzo.J = new adzr[aenr.J.size()];
            for (i = 0; i < aenr.J.size(); i++) {
                adzo.J[i] = aeps.a((aepq) aenr.J.get(i));
            }
        }
        if (aenr.K != null) {
            adzo.K = aenr.K.longValue();
        }
        if (aenr.L != null) {
            adzo.L = aenr.L.booleanValue();
        }
        if (aenr.M != null) {
            adzo.M = new String[aenr.M.size()];
            for (i = 0; i < aenr.M.size(); i++) {
                adzo.M[i] = (String) aenr.M.get(i);
            }
        }
        if (aenr.N != null) {
            adzo.N = new String[aenr.N.size()];
            for (i = 0; i < aenr.N.size(); i++) {
                adzo.N[i] = (String) aenr.N.get(i);
            }
        }
        if (aenr.O != null) {
            adzo.O = aenr.O.intValue();
        }
        if (aenr.P != null) {
            aepz aepz = aenr.P;
            adzt adzt = new adzt();
            if (aepz.a != null) {
                adzt.a = aepz.a;
            }
            if (aepz.b != null) {
                adzt.b = aepz.b;
            }
            adzo.P = adzt;
        }
        if (aenr.Q != null) {
            adzo.Q = aenr.Q.booleanValue();
        }
        if (aenr.R != null) {
            afds afds = aenr.R;
            aeai aeai = new aeai();
            if (afds.a != null) {
                aeai.a = afds.a;
            }
            if (afds.b != null) {
                aeai.b = afds.b;
            }
            if (afds.c != null) {
                aeai.c = afds.c.booleanValue();
            }
            if (afds.d != null) {
                aeai.d = afds.d;
            }
            if (afds.e != null) {
                aeai.e = afds.e;
            }
            if (afds.f != null) {
                aeai.f = afds.f;
            }
            if (afds.g != null) {
                aeai.g = afds.g;
            }
            if (afds.h != null) {
                aeai.h = afds.h;
            }
            if (afds.i != null) {
                aeai.i = afds.i;
            }
            if (afds.j != null) {
                aeai.j = afds.j;
            }
            if (afds.k != null) {
                aeai.k = afds.k;
            }
            adzo.R = aeai;
        }
        if (aenr.S != null) {
            adzo.S = aenr.S;
        }
        if (aenr.T != null) {
            adzo.T = aicf.a(aenr.T);
        }
        if (aenr.U != null) {
            adzo.U = new String[aenr.U.size()];
            for (i = 0; i < aenr.U.size(); i++) {
                adzo.U[i] = (String) aenr.U.get(i);
            }
        }
        if (aenr.V != null) {
            adzo.V = aenr.V.booleanValue();
        }
        if (aenr.W != null) {
            adzo.W = ahzd.a(aenr.W);
        }
        if (aenr.X != null) {
            adzo.X = afan.a(aenr.X);
        }
        if (aenr.Y != null) {
            ahyg ahyg = aenr.Y;
            aeax aeax = new aeax();
            if (ahyg.a != null) {
                aeax.a = ahyg.a;
            }
            adzo.Y = aeax;
        }
        if (aenr.Z != null) {
            adzo.Z = aenr.Z.booleanValue();
        }
        if (aenr.aa != null) {
            adzo.aa = aenr.aa;
        }
        if (aenr.ab != null) {
            adzo.ab = new String[aenr.ab.size()];
            for (i = 0; i < aenr.ab.size(); i++) {
                adzo.ab[i] = (String) aenr.ab.get(i);
            }
        }
        if (aenr.ac != null) {
            aezr aezr = aenr.ac;
            aeac aeac = new aeac();
            if (aezr.a != null) {
                aeac.a = aezr.a;
            }
            if (aezr.b != null) {
                aeac.b = aezr.b;
            }
            if (aezr.c != null) {
                aeac.c = aezr.c;
            }
            if (aezr.d != null) {
                aeac.d = aezr.d;
            }
            if (aezr.e != null) {
                afcn afcn = aezr.e;
                aeaf aeaf = new aeaf();
                if (afcn.a != null) {
                    aeaf.a = afcn.a;
                }
                if (afcn.b != null) {
                    aeaf.b = afcn.b;
                }
                aeac.e = aeaf;
            }
            adzo.ac = aeac;
        }
        if (aenr.ad != null) {
            adzo.ad = aenr.ad.booleanValue();
        }
        if (aenr.ae != null) {
            adzo.ae = new String[aenr.ae.size()];
            for (int i2 = 0; i2 < aenr.ae.size(); i2++) {
                adzo.ae[i2] = (String) aenr.ae.get(i2);
            }
        }
        if (aenr.af != null) {
            adzo.af = aenr.af.booleanValue();
        }
        if (aenr.ag != null) {
            ahyr ahyr = aenr.ag;
            aeba aeba = new aeba();
            if (ahyr.a != null) {
                aeba.a = ahyr.a;
            }
            if (ahyr.b != null) {
                aeba.b = ahyr.b.floatValue();
            }
            adzo.ag = aeba;
        }
        if (aenr.ah != null) {
            ahxz ahxz = aenr.ah;
            aeau aeau = new aeau();
            if (ahxz.a != null) {
                aehv aehv = ahxz.a;
                adzf adzf = new adzf();
                if (aehv.a != null) {
                    adzf.a = aehv.a;
                }
                if (aehv.b != null) {
                    adzf.b = aehv.b;
                }
                if (aehv.c != null) {
                    adzf.c = aehv.c;
                }
                if (aehv.d != null) {
                    adzf.d = aehv.d;
                }
                if (aehv.e != null) {
                    adzf.e = aehv.e.floatValue();
                }
                if (aehv.f != null) {
                    adzf.f = aehv.f;
                }
                if (aehv.g != null) {
                    adzf.g = aehv.g;
                }
                aeau.a = adzf;
            }
            if (ahxz.b != null) {
                aevo aevo = ahxz.b;
                adzz adzz = new adzz();
                if (aevo.a != null) {
                    adzz.a = aevo.a;
                }
                if (aevo.b != null) {
                    adzz.b = aevo.b;
                }
                if (aevo.c != null) {
                    adzz.c = aevo.c.intValue();
                }
                if (aevo.d != null) {
                    adzz.d = aevo.d.intValue();
                }
                if (aevo.e != null) {
                    adzz.e = aevo.e.intValue();
                }
                if (aevo.f != null) {
                    adzz.f = aevo.f.intValue();
                }
                if (aevo.g != null) {
                    adzz.g = aevo.g;
                }
                if (aevo.h != null) {
                    adzz.h = aevo.h.booleanValue();
                }
                if (aevo.i != null) {
                    adzz.i = aevo.i;
                }
                aeau.b = adzz;
            }
            if (ahxz.c != null) {
                aeau.c = ahxz.c.booleanValue();
            }
            adzo.ah = aeau;
        }
        if (aenr.ai != null) {
            ahyc ahyc = aenr.ai;
            aeav aeav = new aeav();
            if (ahyc.a != null) {
                aeav.a = ahyc.a;
            }
            if (ahyc.b != null) {
                aiaj aiaj = ahyc.b;
                aebi aebi = new aebi();
                if (aiaj.a != null) {
                    aebi.a = aiaj.a;
                }
                if (aiaj.b != null) {
                    aebi.b = aiaj.b.intValue();
                }
                aeav.b = aebi;
            }
            if (ahyc.c != null) {
                aicl aicl = ahyc.c;
                aebu aebu = new aebu();
                if (aicl.a != null) {
                    aebu.a = aicl.a;
                }
                if (aicl.b != null) {
                    aebu.b = aicl.b.booleanValue();
                }
                aeav.c = aebu;
            }
            if (ahyc.d != null) {
                aeav.d = ahyc.d;
            }
            if (ahyc.e != null) {
                ahxx ahxx = ahyc.e;
                aeat aeat = new aeat();
                if (ahxx.a != null) {
                    aeat.a = ahxx.a;
                }
                if (ahxx.b != null) {
                    aeat.b = ahxx.b;
                }
                if (ahxx.c != null) {
                    aeat.c = ahxx.c;
                }
                if (ahxx.d != null) {
                    aeat.d = ahxx.d;
                }
                aeav.e = aeat;
            }
            if (ahyc.f != null) {
                ahkn ahkn = ahyc.f;
                aeam aeam = new aeam();
                if (ahkn.a != null) {
                    aeam.a = ahkn.a;
                }
                if (ahkn.b != null) {
                    aeam.b = ahkn.b.booleanValue();
                }
                if (ahkn.c != null) {
                    aeam.c = ahkn.c;
                }
                if (ahkn.d != null) {
                    aeam.d = ahkn.d;
                }
                if (ahkn.e != null) {
                    aeam.e = ahkn.e;
                }
                if (ahkn.f != null) {
                    aeam.f = ahkn.f.longValue();
                }
                if (ahkn.g != null) {
                    aeam.g = ahkn.g;
                }
                if (ahkn.h != null) {
                    aeam.h = ahkn.h;
                }
                if (ahkn.i != null) {
                    aeam.i = ahkn.i;
                }
                if (ahkn.j != null) {
                    aeam.j = ahkn.j;
                }
                if (ahkn.k != null) {
                    aeam.k = ahkn.k;
                }
                aeav.f = aeam;
            }
            if (ahyc.g != null) {
                aeav.g = ahyc.g;
            }
            adzo.ai = aeav;
        }
        if (aenr.aj != null) {
            ahyz ahyz = aenr.aj;
            aebc aebc = new aebc();
            if (ahyz.a != null) {
                aibe aibe = ahyz.a;
                aebm aebm = new aebm();
                if (aibe.a != null) {
                    aebm.a = aibe.a.booleanValue();
                }
                aebc.a = aebm;
            }
            adzo.aj = aebc;
        }
        if (aenr.ak != null) {
            aibc aibc = aenr.ak;
            aebl aebl = new aebl();
            if (aibc.a != null) {
                aebl.a = aibc.a;
            }
            adzo.ak = aebl;
        }
        if (aenr.al != null) {
            aibw aibw = aenr.al;
            aebr aebr = new aebr();
            if (aibw.a != null) {
                aebr.a = aibw.a;
            }
            if (aibw.b != null) {
                aebr.b = aibw.b.intValue();
            }
            adzo.al = aebr;
        }
        if (aenr.am != null) {
            adzo.am = aenr.am;
        }
        if (aenr.an != null) {
            ahye ahye = aenr.an;
            aeaw aeaw = new aeaw();
            if (ahye.a != null) {
                aeaw.a = ahye.a;
            }
            if (ahye.b != null) {
                aeaw.b = ahye.b.booleanValue();
            }
            adzo.an = aeaw;
        }
        if (aenr.ao != null) {
            aiao aiao = aenr.ao;
            aebj aebj = new aebj();
            if (aiao.a != null) {
                aebj.a = aiao.a;
            }
            if (aiao.b != null) {
                aebj.b = aiao.b;
            }
            adzo.ao = aebj;
        }
        if (aenr.ap != null) {
            ahyl ahyl = aenr.ap;
            aeaz aeaz = new aeaz();
            if (ahyl.a != null) {
                aeaz.a = ahyl.a;
            }
            if (ahyl.b != null) {
                aeaz.b = ahyl.b;
            }
            if (ahyl.c != null) {
                aeaz.c = ahzk.a(ahyl.c);
            }
            if (ahyl.d != null) {
                ahyi ahyi = ahyl.d;
                aeay aeay = new aeay();
                if (ahyi.a != null) {
                    aeay.a = aibo.a(ahyi.a);
                }
                if (ahyi.b != null) {
                    aeay.b = aibt.a(ahyi.b);
                }
                if (ahyi.c != null) {
                    aeay.c = ahyi.c.doubleValue();
                }
                aeaz.d = aeay;
            }
            if (ahyl.e != null) {
                aeaz.e = ahyl.e.booleanValue();
            }
            if (ahyl.f != null) {
                aeaz.f = ahyl.f;
            }
            if (ahyl.g != null) {
                aeaz.g = ahyl.g.booleanValue();
            }
            adzo.ap = aeaz;
        }
        if (aenr.aq != null) {
            adzo.aq = aenr.aq.longValue();
        }
        if (aenr.ar != null) {
            adzo.ar = aenr.ar;
        }
        return adzo;
    }

    public static aenr a(adzo adzo) {
        ArrayList arrayList;
        adzo adzo2 = adzo;
        aenr aenr = new aenr();
        if (!adzo2.a.isEmpty()) {
            aenr.a = adzo2.a;
        }
        aenr.b = Long.valueOf(adzo2.b);
        if (!adzo2.c.isEmpty()) {
            aenr.c = adzo2.c;
        }
        if (!(adzo2.d == null || adzo2.d.isEmpty())) {
            aenr.d = adzo2.d;
        }
        if (!adzo2.e.isEmpty()) {
            aenr.e = adzo2.e;
        }
        if (!(adzo2.f == null || MessageNano.messageNanoEquals(adzo2.f, new adzk()))) {
            adzk adzk = adzo2.f;
            aenj aenj = new aenj();
            if (!(adzk.a == null || MessageNano.messageNanoEquals(adzk.a, new aeaa()))) {
                aenj.a = aexz.a(adzk.a);
            }
            if (!(adzk.b == null || MessageNano.messageNanoEquals(adzk.b, new aeaa()))) {
                aenj.b = aexz.a(adzk.b);
            }
            if (!(adzk.c == null || MessageNano.messageNanoEquals(adzk.c, new adzp()))) {
                aenj.c = aeon.a(adzk.c);
            }
            aenr.f = aenj;
        }
        if (!(adzo2.g == null || MessageNano.messageNanoEquals(adzo2.g, new adzi()))) {
            aenr.g = aeng.a(adzo2.g);
        }
        if (!adzo2.h.isEmpty()) {
            aenr.h = adzo2.h;
        }
        if (!adzo2.i.isEmpty()) {
            aenr.i = adzo2.i;
        }
        aenr.j = Integer.valueOf(adzo2.j);
        if (adzo2.k.length > 0) {
            arrayList = new ArrayList();
            for (Object add : adzo2.k) {
                arrayList.add(add);
            }
            aenr.k = arrayList;
        }
        if (adzo2.l.length > 0) {
            arrayList = new ArrayList();
            for (adzm adzm : adzo2.l) {
                aenn aenn = new aenn();
                aenn.a = Long.valueOf(adzm.a);
                if (!adzm.b.isEmpty()) {
                    aenn.b = adzm.b;
                }
                if (!adzm.c.isEmpty()) {
                    aenn.c = adzm.c;
                }
                if (!(adzm.d == null || MessageNano.messageNanoEquals(adzm.d, new adzl()))) {
                    adzl adzl = adzm.d;
                    aenl aenl = new aenl();
                    aenl.a = Float.valueOf(adzl.a);
                    aenl.b = Float.valueOf(adzl.b);
                    aenl.c = Float.valueOf(adzl.c);
                    aenl.d = Float.valueOf(adzl.d);
                    aenl.e = Float.valueOf(adzl.e);
                    aenl.f = Integer.valueOf(adzl.f);
                    aenn.d = aenl;
                }
                if (!(adzm.e == null || MessageNano.messageNanoEquals(adzm.e, new adzj()))) {
                    adzj adzj = adzm.e;
                    aenh aenh = new aenh();
                    aenh.a = Integer.valueOf(adzj.a);
                    if (!adzj.b.isEmpty()) {
                        aenh.b = adzj.b;
                    }
                    if (!adzj.c.isEmpty()) {
                        aenh.c = adzj.c;
                    }
                    if (!adzj.d.isEmpty()) {
                        aenh.d = adzj.d;
                    }
                    if (!adzj.e.isEmpty()) {
                        aenh.e = adzj.e;
                    }
                    aenh.f = Float.valueOf(adzj.f);
                    if (!(adzj.g == null || MessageNano.messageNanoEquals(adzj.g, new aeah()))) {
                        aeah aeah = adzj.g;
                        afdm afdm = new afdm();
                        if (!aeah.a.isEmpty()) {
                            afdm.a = aeah.a;
                        }
                        if (!(aeah.b == null || MessageNano.messageNanoEquals(aeah.b, new adzp()))) {
                            afdm.b = aeon.a(aeah.b);
                        }
                        afdm.c = Float.valueOf(aeah.c);
                        aenh.g = afdm;
                    }
                    aenh.h = Boolean.valueOf(adzj.h);
                    if (!adzj.i.isEmpty()) {
                        aenh.i = adzj.i;
                    }
                    aenh.j = Integer.valueOf(adzj.j);
                    if (!adzj.k.isEmpty()) {
                        aenh.k = adzj.k;
                    }
                    if (!adzj.l.isEmpty()) {
                        aenh.l = adzj.l;
                    }
                    if (!adzj.m.isEmpty()) {
                        aenh.m = adzj.m;
                    }
                    if (!adzj.n.isEmpty()) {
                        aenh.n = adzj.n;
                    }
                    if (!adzj.o.isEmpty()) {
                        aenh.o = adzj.o;
                    }
                    if (!adzj.p.isEmpty()) {
                        aenh.p = adzj.p;
                    }
                    aenn.e = aenh;
                }
                if (!(adzm.f == null || MessageNano.messageNanoEquals(adzm.f, new adzx()))) {
                    adzx adzx = adzm.f;
                    aerf aerf = new aerf();
                    if (adzx.a > 0) {
                        aerf.a = new akrm(adzx.a, akrc.a);
                    }
                    if (adzx.b > 0) {
                        aerf.b = new akrm(adzx.b, akrc.a);
                    }
                    aenn.f = aerf;
                }
                if (!(adzm.g == null || MessageNano.messageNanoEquals(adzm.g, new aebb()))) {
                    aebb aebb = adzm.g;
                    ahyt ahyt = new ahyt();
                    if (!aebb.a.isEmpty()) {
                        ahyt.a = aebb.a;
                    }
                    ahyt.b = Boolean.valueOf(aebb.b);
                    ahyt.c = Boolean.valueOf(aebb.c);
                    if (!(aebb.d == null || MessageNano.messageNanoEquals(aebb.d, new aebk()))) {
                        aebk aebk = aebb.d;
                        aiay aiay = new aiay();
                        if (!aebk.a.isEmpty()) {
                            aiay.a = aebk.a;
                        }
                        if (!aebk.b.isEmpty()) {
                            aiay.b = aebk.b;
                        }
                        aiay.c = Integer.valueOf(aebk.c);
                        aiay.d = Integer.valueOf(aebk.d);
                        ahyt.d = aiay;
                    }
                    aenn.g = ahyt;
                }
                arrayList.add(aenn);
            }
            if (!arrayList.isEmpty()) {
                aenr.l = arrayList;
            }
        }
        aenr.m = Boolean.valueOf(adzo2.m);
        if (adzo2.n > 0) {
            aenr.n = new akrm(adzo2.n, akrc.a);
        }
        aenr.o = Long.valueOf(adzo2.o);
        aenr.p = Boolean.valueOf(adzo2.p);
        if (!(adzo2.q == null || MessageNano.messageNanoEquals(adzo2.q, new aeab()))) {
            aeab aeab = adzo2.q;
            aezp aezp = new aezp();
            if (!(aeab.a == null || MessageNano.messageNanoEquals(aeab.a, new aeag()))) {
                aeag aeag = aeab.a;
                afcp afcp = new afcp();
                if (!aeag.a.isEmpty()) {
                    afcp.a = aeag.a;
                }
                if (!aeag.b.isEmpty()) {
                    afcp.b = aeag.b;
                }
                if (!aeag.c.isEmpty()) {
                    afcp.c = aeag.c;
                }
                if (!aeag.d.isEmpty()) {
                    afcp.d = aeag.d;
                }
                aezp.a = afcp;
            }
            if (!aeab.b.isEmpty()) {
                aezp.b = aeab.b;
            }
            if (!aeab.c.isEmpty()) {
                aezp.c = aeab.c;
            }
            if (!aeab.d.isEmpty()) {
                aezp.d = aeab.d;
            }
            if (!aeab.e.isEmpty()) {
                aezp.e = aeab.e;
            }
            if (!aeab.f.isEmpty()) {
                aezp.f = aeab.f;
            }
            if (!aeab.g.isEmpty()) {
                aezp.g = aeab.g;
            }
            if (!aeab.h.isEmpty()) {
                aezp.h = aeab.h;
            }
            aezp.i = Integer.valueOf(aeab.i);
            if (!aeab.j.isEmpty()) {
                aezp.j = aeab.j;
            }
            aezp.k = Integer.valueOf(aeab.k);
            aenr.q = aezp;
        }
        if (!adzo2.r.isEmpty()) {
            aenr.r = adzo2.r;
        }
        if (!adzo2.s.isEmpty()) {
            aenr.s = adzo2.s;
        }
        if (!(adzo2.t == null || MessageNano.messageNanoEquals(adzo2.t, new adzh()))) {
            adzh adzh = adzo2.t;
            aeju aeju = new aeju();
            aeju.a = Long.valueOf(adzh.a);
            aeju.b = Float.valueOf(adzh.b);
            aeju.c = Float.valueOf(adzh.c);
            aeju.d = Float.valueOf(adzh.d);
            aeju.e = Float.valueOf(adzh.e);
            if (!adzh.f.isEmpty()) {
                aeju.f = adzh.f;
            }
            if (!adzh.g.isEmpty()) {
                aeju.g = adzh.g;
            }
            aenr.t = aeju;
        }
        aenr.u = Boolean.valueOf(adzo2.u);
        if (!(adzo2.v == null || MessageNano.messageNanoEquals(adzo2.v, new adzs()))) {
            aenr.v = aepv.a(adzo2.v);
        }
        if (adzo2.w.length > 0) {
            arrayList = new ArrayList();
            for (Object add2 : adzo2.w) {
                arrayList.add(add2);
            }
            aenr.w = arrayList;
        }
        if (!adzo2.x.isEmpty()) {
            aenr.x = adzo2.x;
        }
        aenr.y = Boolean.valueOf(adzo2.y);
        if (!adzo2.z.isEmpty()) {
            aenr.z = adzo2.z;
        }
        if (!adzo2.A.isEmpty()) {
            aenr.A = adzo2.A;
        }
        if (!adzo2.B.isEmpty()) {
            aenr.B = adzo2.B;
        }
        aenr.C = Boolean.valueOf(adzo2.C);
        if (!adzo2.D.isEmpty()) {
            aenr.D = adzo2.D;
        }
        if (!(adzo2.E == null || MessageNano.messageNanoEquals(adzo2.E, new adzn()))) {
            adzn adzn = adzo2.E;
            aenp aenp = new aenp();
            if (!adzn.a.isEmpty()) {
                aenp.a = adzn.a;
            }
            if (!adzn.b.isEmpty()) {
                aenp.b = adzn.b;
            }
            aenp.c = Long.valueOf(adzn.c);
            aenp.d = Long.valueOf(adzn.d);
            aenp.e = Long.valueOf(adzn.e);
            aenr.E = aenp;
        }
        if (!(adzo2.F == null || MessageNano.messageNanoEquals(adzo2.F, new aeaj()))) {
            aenr.F = afeb.a(adzo2.F);
        }
        if (!adzo2.G.isEmpty()) {
            aenr.G = adzo2.G;
        }
        aenr.H = Double.valueOf(adzo2.H);
        aenr.I = Boolean.valueOf(adzo2.I);
        if (adzo2.J.length > 0) {
            arrayList = new ArrayList();
            for (adzr a : adzo2.J) {
                arrayList.add(aeps.a(a));
            }
            if (!arrayList.isEmpty()) {
                aenr.J = arrayList;
            }
        }
        aenr.K = Long.valueOf(adzo2.K);
        aenr.L = Boolean.valueOf(adzo2.L);
        if (adzo2.M.length > 0) {
            arrayList = new ArrayList();
            for (Object add22 : adzo2.M) {
                arrayList.add(add22);
            }
            aenr.M = arrayList;
        }
        if (adzo2.N.length > 0) {
            arrayList = new ArrayList();
            for (Object add222 : adzo2.N) {
                arrayList.add(add222);
            }
            aenr.N = arrayList;
        }
        aenr.O = Integer.valueOf(adzo2.O);
        if (!(adzo2.P == null || MessageNano.messageNanoEquals(adzo2.P, new adzt()))) {
            adzt adzt = adzo2.P;
            aepz aepz = new aepz();
            if (!adzt.a.isEmpty()) {
                aepz.a = adzt.a;
            }
            if (!adzt.b.isEmpty()) {
                aepz.b = adzt.b;
            }
            aenr.P = aepz;
        }
        aenr.Q = Boolean.valueOf(adzo2.Q);
        if (!(adzo2.R == null || MessageNano.messageNanoEquals(adzo2.R, new aeai()))) {
            aeai aeai = adzo2.R;
            afds afds = new afds();
            if (!aeai.a.isEmpty()) {
                afds.a = aeai.a;
            }
            if (!aeai.b.isEmpty()) {
                afds.b = aeai.b;
            }
            afds.c = Boolean.valueOf(aeai.c);
            if (!aeai.d.isEmpty()) {
                afds.d = aeai.d;
            }
            if (!aeai.e.isEmpty()) {
                afds.e = aeai.e;
            }
            if (!aeai.f.isEmpty()) {
                afds.f = aeai.f;
            }
            if (!aeai.g.isEmpty()) {
                afds.g = aeai.g;
            }
            if (!aeai.h.isEmpty()) {
                afds.h = aeai.h;
            }
            if (!aeai.i.isEmpty()) {
                afds.i = aeai.i;
            }
            if (!aeai.j.isEmpty()) {
                afds.j = aeai.j;
            }
            if (!aeai.k.isEmpty()) {
                afds.k = aeai.k;
            }
            aenr.R = afds;
        }
        if (!adzo2.S.isEmpty()) {
            aenr.S = adzo2.S;
        }
        if (!(adzo2.T == null || MessageNano.messageNanoEquals(adzo2.T, new aebt()))) {
            aenr.T = aicf.a(adzo2.T);
        }
        if (adzo2.U.length > 0) {
            arrayList = new ArrayList();
            for (Object add2222 : adzo2.U) {
                arrayList.add(add2222);
            }
            aenr.U = arrayList;
        }
        aenr.V = Boolean.valueOf(adzo2.V);
        if (!(adzo2.W == null || MessageNano.messageNanoEquals(adzo2.W, new aebd()))) {
            aenr.W = ahzd.a(adzo2.W);
        }
        if (!(adzo2.X == null || MessageNano.messageNanoEquals(adzo2.X, new aead()))) {
            aenr.X = afan.a(adzo2.X);
        }
        if (!(adzo2.Y == null || MessageNano.messageNanoEquals(adzo2.Y, new aeax()))) {
            aeax aeax = adzo2.Y;
            ahyg ahyg = new ahyg();
            if (!aeax.a.isEmpty()) {
                ahyg.a = aeax.a;
            }
            aenr.Y = ahyg;
        }
        aenr.Z = Boolean.valueOf(adzo2.Z);
        if (!adzo2.aa.isEmpty()) {
            aenr.aa = adzo2.aa;
        }
        if (adzo2.ab.length > 0) {
            arrayList = new ArrayList();
            for (Object add22222 : adzo2.ab) {
                arrayList.add(add22222);
            }
            aenr.ab = arrayList;
        }
        if (!(adzo2.ac == null || MessageNano.messageNanoEquals(adzo2.ac, new aeac()))) {
            aeac aeac = adzo2.ac;
            aezr aezr = new aezr();
            if (!aeac.a.isEmpty()) {
                aezr.a = aeac.a;
            }
            if (!aeac.b.isEmpty()) {
                aezr.b = aeac.b;
            }
            if (!aeac.c.isEmpty()) {
                aezr.c = aeac.c;
            }
            if (!aeac.d.isEmpty()) {
                aezr.d = aeac.d;
            }
            if (!(aeac.e == null || MessageNano.messageNanoEquals(aeac.e, new aeaf()))) {
                aeaf aeaf = aeac.e;
                afcn afcn = new afcn();
                if (!aeaf.a.isEmpty()) {
                    afcn.a = aeaf.a;
                }
                if (!aeaf.b.isEmpty()) {
                    afcn.b = aeaf.b;
                }
                aezr.e = afcn;
            }
            aenr.ac = aezr;
        }
        aenr.ad = Boolean.valueOf(adzo2.ad);
        if (adzo2.ae.length > 0) {
            arrayList = new ArrayList();
            for (Object add222222 : adzo2.ae) {
                arrayList.add(add222222);
            }
            aenr.ae = arrayList;
        }
        aenr.af = Boolean.valueOf(adzo2.af);
        if (!(adzo2.ag == null || MessageNano.messageNanoEquals(adzo2.ag, new aeba()))) {
            aeba aeba = adzo2.ag;
            ahyr ahyr = new ahyr();
            if (!aeba.a.isEmpty()) {
                ahyr.a = aeba.a;
            }
            ahyr.b = Float.valueOf(aeba.b);
            aenr.ag = ahyr;
        }
        if (!(adzo2.ah == null || MessageNano.messageNanoEquals(adzo2.ah, new aeau()))) {
            aeau aeau = adzo2.ah;
            ahxz ahxz = new ahxz();
            if (!(aeau.a == null || MessageNano.messageNanoEquals(aeau.a, new adzf()))) {
                adzf adzf = aeau.a;
                aehv aehv = new aehv();
                if (!adzf.a.isEmpty()) {
                    aehv.a = adzf.a;
                }
                if (!adzf.b.isEmpty()) {
                    aehv.b = adzf.b;
                }
                if (!adzf.c.isEmpty()) {
                    aehv.c = adzf.c;
                }
                if (!adzf.d.isEmpty()) {
                    aehv.d = adzf.d;
                }
                aehv.e = Float.valueOf(adzf.e);
                if (!adzf.f.isEmpty()) {
                    aehv.f = adzf.f;
                }
                if (!adzf.g.isEmpty()) {
                    aehv.g = adzf.g;
                }
                ahxz.a = aehv;
            }
            if (!(aeau.b == null || MessageNano.messageNanoEquals(aeau.b, new adzz()))) {
                adzz adzz = aeau.b;
                aevo aevo = new aevo();
                if (!adzz.a.isEmpty()) {
                    aevo.a = adzz.a;
                }
                if (!adzz.b.isEmpty()) {
                    aevo.b = adzz.b;
                }
                aevo.c = Integer.valueOf(adzz.c);
                aevo.d = Integer.valueOf(adzz.d);
                aevo.e = Integer.valueOf(adzz.e);
                aevo.f = Integer.valueOf(adzz.f);
                if (!adzz.g.isEmpty()) {
                    aevo.g = adzz.g;
                }
                aevo.h = Boolean.valueOf(adzz.h);
                if (!adzz.i.isEmpty()) {
                    aevo.i = adzz.i;
                }
                ahxz.b = aevo;
            }
            ahxz.c = Boolean.valueOf(aeau.c);
            aenr.ah = ahxz;
        }
        if (!(adzo2.ai == null || MessageNano.messageNanoEquals(adzo2.ai, new aeav()))) {
            aeav aeav = adzo2.ai;
            ahyc ahyc = new ahyc();
            if (!aeav.a.isEmpty()) {
                ahyc.a = aeav.a;
            }
            if (!(aeav.b == null || MessageNano.messageNanoEquals(aeav.b, new aebi()))) {
                aebi aebi = aeav.b;
                aiaj aiaj = new aiaj();
                if (!aebi.a.isEmpty()) {
                    aiaj.a = aebi.a;
                }
                aiaj.b = Integer.valueOf(aebi.b);
                ahyc.b = aiaj;
            }
            if (!(aeav.c == null || MessageNano.messageNanoEquals(aeav.c, new aebu()))) {
                aebu aebu = aeav.c;
                aicl aicl = new aicl();
                if (!aebu.a.isEmpty()) {
                    aicl.a = aebu.a;
                }
                aicl.b = Boolean.valueOf(aebu.b);
                ahyc.c = aicl;
            }
            if (!aeav.d.isEmpty()) {
                ahyc.d = aeav.d;
            }
            if (!(aeav.e == null || MessageNano.messageNanoEquals(aeav.e, new aeat()))) {
                aeat aeat = aeav.e;
                ahxx ahxx = new ahxx();
                if (!aeat.a.isEmpty()) {
                    ahxx.a = aeat.a;
                }
                if (!aeat.b.isEmpty()) {
                    ahxx.b = aeat.b;
                }
                if (!aeat.c.isEmpty()) {
                    ahxx.c = aeat.c;
                }
                if (!aeat.d.isEmpty()) {
                    ahxx.d = aeat.d;
                }
                ahyc.e = ahxx;
            }
            if (!(aeav.f == null || MessageNano.messageNanoEquals(aeav.f, new aeam()))) {
                aeam aeam = aeav.f;
                ahkn ahkn = new ahkn();
                if (!aeam.a.isEmpty()) {
                    ahkn.a = aeam.a;
                }
                ahkn.b = Boolean.valueOf(aeam.b);
                if (!aeam.c.isEmpty()) {
                    ahkn.c = aeam.c;
                }
                if (!aeam.d.isEmpty()) {
                    ahkn.d = aeam.d;
                }
                if (!aeam.e.isEmpty()) {
                    ahkn.e = aeam.e;
                }
                ahkn.f = Long.valueOf(aeam.f);
                if (!aeam.g.isEmpty()) {
                    ahkn.g = aeam.g;
                }
                if (!aeam.h.isEmpty()) {
                    ahkn.h = aeam.h;
                }
                if (!aeam.i.isEmpty()) {
                    ahkn.i = aeam.i;
                }
                if (!aeam.j.isEmpty()) {
                    ahkn.j = aeam.j;
                }
                if (!aeam.k.isEmpty()) {
                    ahkn.k = aeam.k;
                }
                ahyc.f = ahkn;
            }
            if (!aeav.g.isEmpty()) {
                ahyc.g = aeav.g;
            }
            aenr.ai = ahyc;
        }
        if (!(adzo2.aj == null || MessageNano.messageNanoEquals(adzo2.aj, new aebc()))) {
            aebc aebc = adzo2.aj;
            ahyz ahyz = new ahyz();
            if (!(aebc.a == null || MessageNano.messageNanoEquals(aebc.a, new aebm()))) {
                aebm aebm = aebc.a;
                aibe aibe = new aibe();
                aibe.a = Boolean.valueOf(aebm.a);
                ahyz.a = aibe;
            }
            aenr.aj = ahyz;
        }
        if (!(adzo2.ak == null || MessageNano.messageNanoEquals(adzo2.ak, new aebl()))) {
            aebl aebl = adzo2.ak;
            aibc aibc = new aibc();
            if (!aebl.a.isEmpty()) {
                aibc.a = aebl.a;
            }
            aenr.ak = aibc;
        }
        if (!(adzo2.al == null || MessageNano.messageNanoEquals(adzo2.al, new aebr()))) {
            aebr aebr = adzo2.al;
            aibw aibw = new aibw();
            if (!aebr.a.isEmpty()) {
                aibw.a = aebr.a;
            }
            aibw.b = Integer.valueOf(aebr.b);
            aenr.al = aibw;
        }
        if (!adzo2.am.isEmpty()) {
            aenr.am = adzo2.am;
        }
        if (!(adzo2.an == null || MessageNano.messageNanoEquals(adzo2.an, new aeaw()))) {
            aeaw aeaw = adzo2.an;
            ahye ahye = new ahye();
            if (!aeaw.a.isEmpty()) {
                ahye.a = aeaw.a;
            }
            ahye.b = Boolean.valueOf(aeaw.b);
            aenr.an = ahye;
        }
        if (!(adzo2.ao == null || MessageNano.messageNanoEquals(adzo2.ao, new aebj()))) {
            aebj aebj = adzo2.ao;
            aiao aiao = new aiao();
            if (!aebj.a.isEmpty()) {
                aiao.a = aebj.a;
            }
            if (!aebj.b.isEmpty()) {
                aiao.b = aebj.b;
            }
            aenr.ao = aiao;
        }
        if (!(adzo2.ap == null || MessageNano.messageNanoEquals(adzo2.ap, new aeaz()))) {
            aeaz aeaz = adzo2.ap;
            ahyl ahyl = new ahyl();
            if (!aeaz.a.isEmpty()) {
                ahyl.a = aeaz.a;
            }
            if (!aeaz.b.isEmpty()) {
                ahyl.b = aeaz.b;
            }
            if (!(aeaz.c == null || MessageNano.messageNanoEquals(aeaz.c, new aebe()))) {
                ahyl.c = ahzk.a(aeaz.c);
            }
            if (!(aeaz.d == null || MessageNano.messageNanoEquals(aeaz.d, new aeay()))) {
                aeay aeay = aeaz.d;
                ahyi ahyi = new ahyi();
                if (!(aeay.a == null || MessageNano.messageNanoEquals(aeay.a, new aebn()))) {
                    ahyi.a = aibo.a(aeay.a);
                }
                if (!(aeay.b == null || MessageNano.messageNanoEquals(aeay.b, new aebp()))) {
                    ahyi.b = aibt.a(aeay.b);
                }
                ahyi.c = Double.valueOf(aeay.c);
                ahyl.d = ahyi;
            }
            ahyl.e = Boolean.valueOf(aeaz.e);
            if (!aeaz.f.isEmpty()) {
                ahyl.f = aeaz.f;
            }
            ahyl.g = Boolean.valueOf(aeaz.g);
            aenr.ap = ahyl;
        }
        aenr.aq = Long.valueOf(adzo2.aq);
        aenr.ar = adzo2.ar;
        return aenr;
    }
}
