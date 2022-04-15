package gestion_notes;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	Etudiant(int ID,String Nom){
		this.id=ID;
		this.nom=Nom;
		this.note=10;
	}
	 public String toString() {
		return nom+":"+note; 
	 }
	 public boolean equals(Object obj) {
		 if (obj instanceof Etudiant) {
				Etudiant a=(Etudiant)obj ;
				return this.id==a.id;
				}
		 return false;
		 
	 }
	@Override
	public int compareTo(Etudiant o) {
		if(this.note==o.note) {
			return 0;
		}
		if(this.note>o.note) {
			return 1;
		}
		return -1;
	}
	public void changeNote(int note) {
		this.note=note;
	}
	public double getNote() {
		return this.note;
	}
}


