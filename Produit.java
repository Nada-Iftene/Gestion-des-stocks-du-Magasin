
public class Produit {
	private int id;
	private int code;
	private String nom;
	private String fournisseur;
	private float prix;
	
	Produit(int id,int code,String nom,String fournisseur,float prix){
		this.id=id;
		this.code = code;
		this.nom = nom;
		this.fournisseur = fournisseur;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	

}
