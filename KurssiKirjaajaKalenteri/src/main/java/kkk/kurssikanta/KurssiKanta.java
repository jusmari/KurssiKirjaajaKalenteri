package kkk.kurssikanta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mopo
 */
public class KurssiKanta {

    private final List<Kurssi> kurssiLista;
    private final List<Kurssi> keskenOlevat;
    
    public List getValmiitKurssit() {
        return kurssiLista;
    }

    /**
     * luonnin yhteydessä luetaan tallennetut kurssit tiedostosta ja täytetään
     * listat
     *
     */
    public KurssiKanta() {
        this.kurssiLista = new ArrayList<>();
        this.keskenOlevat = new ArrayList<>();
        lataaKurssit();
    }

    private void lataaKurssit() {
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("penis menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan kakka",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        kurssiLista.add(new ValmisKurssi("Ohjelmistotekniikan menetelmät",5));
        
    }
    
    /**
     * 
     * @param index 
     */
    public void poistaKurssi(int index) {
        kurssiLista.remove(index);
    }

    /**
     * muokkaa listaa poistamalla vanhan ja lisäämällä uuden, jottei
     * duplikaatteja olisi.
     */
    private void muokkaaKurssia(int i, Kurssi kurssi) {
        kurssiLista.remove(i);
        kurssiLista.add(kurssi);
    }

}