import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Planetas mercurio = new Planetas("Mercurio", 2439, 1407, 3, 452, 3.7, 57910000, 88, false);
        Planetas venus = new Planetas("Venus", 6052, 5832, 45, 737, 8.9, 108200000, 225, false);
        Planetas tierra = new Planetas("Tierra", 6371, 24, 6, 288, 9.8, 149600000, 365, false);
        Planetas marte = new Planetas("Marte", 3389, 24.6, 6, 210, 3.7, 227900000, 687, false);
        Planetas jupiter = new Planetas("Júpiter", 69911, 9.9, 1898, 165, 24.8, 778300000, 4332, true);
        Planetas saturno = new Planetas("Saturno", 58232, 10.7, 568, 134, 10.4, 1427000000, 10759, true);
        Planetas urano = new Planetas("Urano", 25362, -17.2, 86.8, 76, 8.9, 2871000000L, 30688, true);
        Planetas neptuno = new Planetas("Neptuno", 24622, 16.1, 102, 72, 11.2, 4497000000L, 60200, true);

        ArrayList <Planetas> listaplanetas = new ArrayList<>();
        listaplanetas.add(mercurio);
        listaplanetas.add(venus);
        listaplanetas.add(tierra);
        listaplanetas.add(marte);
        listaplanetas.add(jupiter);
        listaplanetas.add(saturno);
        listaplanetas.add(urano);
        listaplanetas.add(neptuno);

        // Tierra
        Satelites luna = new Satelites("Luna", 1737, 27.3, 7.3, -20, 1.6, 384400, 27, tierra);

        // Marte
        Satelites lunaDeimos = new Satelites("Deimos", 6, 1.3, 1.5, -40, 0.003, 23459, 1.3, marte);
        Satelites lunaFobos = new Satelites("Fobos", 22, 0.3, 1.07, -20, 0.008, 9377, 0.3, marte);

        // Júpiter
        Satelites io = new Satelites("Io", 1821, 1.8, 8.9, -143, 1.8, 421800, 1.8, jupiter);
        Satelites europa = new Satelites("Europa", 1561, 3.5, 4.8, -140, 1.3, 671100, 3.5, jupiter);
        Satelites ganimedes = new Satelites("Ganímedes", 2634, 7.2, 14.8, -163, 1.4, 1070400, 7.2, jupiter);
        Satelites calisto = new Satelites("Calisto", 2400, 16.7, 11.8, -143, 1.2, 1882700, 16.7, jupiter);
        Satelites amaltea = new Satelites("Amaltea", 167, 0.5, 0, -120, 0.025, 181400, 0.5, jupiter);

        //Saturno
        Satelites mimas = new Satelites("Mimas", 198, 0.9, 0.4, -183, 0.063, 185539, 0.9, saturno);
        Satelites encelado = new Satelites("Encélado", 252, 1.4, 1.1, -201, 0.113, 238042, 1.4, saturno);
        Satelites tetis = new Satelites("Tetis", 536, 1.9, 6.2, -187, 0.145, 294619, 1.9, saturno);
        Satelites dione = new Satelites("Dione", 562, 2.7, 11, -183, 0.232, 377396, 2.7, saturno);
        Satelites rea = new Satelites("Rea", 764, 4.5, 59.8, -174, 0.264, 527108, 4.5, saturno);

        //Urano
        Satelites ariel = new Satelites("Ariel", 578, 2.5, 13.5, -195, 0.27, 191020, 2.5, urano);
        Satelites umbriel = new Satelites("Umbriel", 585, 4.1, 12.2, -203, 0.23, 266300, 4.1, urano);
        Satelites titania = new Satelites("Titania", 788, 8.7, 39.3, -187, 0.38, 435910, 8.7, urano);
        Satelites oberon = new Satelites("Oberon", 761, 13.5, 30.1, -193, 0.346, 583520, 13.5, urano);
        Satelites miranda = new Satelites("Miranda", 236, 1.4, 0.66, -187, 0.079, 129390, 1.4, urano);

        // Lunas de Neptuno
        Satelites nereida = new Satelites("Nereida", 170, 360.13f, 3.1f, -220, 0.06f, 5513810, 360.13f, neptuno);
        Satelites triton = new Satelites("Tritón", 2706, -5.88f, 2.14e22f, -235, 0.78f, 354759, -5.88f, neptuno);
        Satelites naiad = new Satelites("Náyade", 33, 0.29f, 1.9e17f, -220, 0.006f, 48227, 0.29f, neptuno);
        Satelites thalassa = new Satelites("Talasa", 41, 0.31f, 3.5e17f, -220, 0.006f, 50074, 0.31f, neptuno);
        Satelites despina = new Satelites("Despina", 75, 0.33f, 2.2e18f, -220, 0.006f, 52526, 0.33f, neptuno);

        ArrayList<Satelites> satelitesMarte = new ArrayList<>();
        satelitesMarte.add(lunaDeimos);
        satelitesMarte.add(lunaFobos);

        ArrayList<Satelites> satelitesJupiter = new ArrayList<>();
        satelitesJupiter.add(io);
        satelitesJupiter.add(europa);
        satelitesJupiter.add(ganimedes);
        satelitesJupiter.add(calisto);
        satelitesJupiter.add(amaltea);

        ArrayList<Satelites> satelitesSaturno = new ArrayList<>();
        satelitesSaturno.add(mimas);
        satelitesSaturno.add(encelado);
        satelitesSaturno.add(tetis);
        satelitesSaturno.add(dione);
        satelitesSaturno.add(rea);

        ArrayList<Satelites> satelitesUrano = new ArrayList<>();
        satelitesUrano.add(ariel);
        satelitesUrano.add(umbriel);
        satelitesUrano.add(titania);
        satelitesUrano.add(oberon);
        satelitesUrano.add(miranda);

        ArrayList<Satelites> satelitesNeptuno = new ArrayList<>();
        satelitesNeptuno.add(nereida);
        satelitesNeptuno.add(triton);
        satelitesNeptuno.add(naiad);
        satelitesNeptuno.add(thalassa);
        satelitesNeptuno.add(despina);
    }
}
