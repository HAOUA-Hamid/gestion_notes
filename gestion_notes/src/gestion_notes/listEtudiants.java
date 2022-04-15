package gestion_notes;

import java.util.ArrayList;
import java.util.List;
import gestion_notes.Etudiant;

public class listEtudiants extends ArrayList<Etudiant> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Etudiant> h;
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
	    	super.set(modCount, e);
	    	return false;
	    }super.add(e);
		return true;
	}
	public List<Etudiant> filtrer(condition c){
		h = null;
		for(int i=0;i<size();i++) {
			if(c.estVrai(this.get(i))) {
				h.add(this.get(i));
			}
		}
		return h;
		
	}

		
}
