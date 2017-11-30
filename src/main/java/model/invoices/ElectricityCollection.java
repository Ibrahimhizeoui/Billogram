package model.invoices;

import java.sql.Timestamp;

public class ElectricityCollection {

	private int kommunkod;
	private boolean naringsidkare;
	private boolean avflyttad;
	private Timestamp avflyttad_datum;
	private boolean frankopplad;
	private Timestamp frankopplad_datum;
	private String anladr;
	private String natom;
	private String arsforb;
	private String anlid;
	private String kravmall;
	private String plombkod;
	private boolean slutfaktura;
	private String objtyp;
	private int faktforb;
	private int faktfrek;
	
	public ElectricityCollection() {}

	public int getKommunkod() {
		return kommunkod;
	}

	public void setKommunkod(int kommunkod) {
		this.kommunkod = kommunkod;
	}

	public boolean isNaringsidkare() {
		return naringsidkare;
	}

	public void setNaringsidkare(boolean naringsidkare) {
		this.naringsidkare = naringsidkare;
	}

	public boolean isAvflyttad() {
		return avflyttad;
	}

	public void setAvflyttad(boolean avflyttad) {
		this.avflyttad = avflyttad;
	}

	public Timestamp getAvflyttad_datum() {
		return avflyttad_datum;
	}

	public void setAvflyttad_datum(Timestamp avflyttad_datum) {
		this.avflyttad_datum = avflyttad_datum;
	}

	public boolean isFrankopplad() {
		return frankopplad;
	}

	public void setFrankopplad(boolean frankopplad) {
		this.frankopplad = frankopplad;
	}

	public Timestamp getFrankopplad_datum() {
		return frankopplad_datum;
	}

	public void setFrankopplad_datum(Timestamp frankopplad_datum) {
		this.frankopplad_datum = frankopplad_datum;
	}

	public String getAnladr() {
		return anladr;
	}

	public void setAnladr(String anladr) {
		this.anladr = anladr;
	}

	public String getNatom() {
		return natom;
	}

	public void setNatom(String natom) {
		this.natom = natom;
	}

	public String getArsforb() {
		return arsforb;
	}

	public void setArsforb(String arsforb) {
		this.arsforb = arsforb;
	}

	public String getAnlid() {
		return anlid;
	}

	public void setAnlid(String anlid) {
		this.anlid = anlid;
	}

	public String getKravmall() {
		return kravmall;
	}

	public void setKravmall(String kravmall) {
		this.kravmall = kravmall;
	}

	public String getPlombkod() {
		return plombkod;
	}

	public void setPlombkod(String plombkod) {
		this.plombkod = plombkod;
	}

	public boolean isSlutfaktura() {
		return slutfaktura;
	}

	public void setSlutfaktura(boolean slutfaktura) {
		this.slutfaktura = slutfaktura;
	}

	public String getObjtyp() {
		return objtyp;
	}

	public void setObjtyp(String objtyp) {
		this.objtyp = objtyp;
	}

	public int getFaktforb() {
		return faktforb;
	}

	public void setFaktforb(int faktforb) {
		this.faktforb = faktforb;
	}

	public int getFaktfrek() {
		return faktfrek;
	}

	public void setFaktfrek(int faktfrek) {
		this.faktfrek = faktfrek;
	}
	
}
