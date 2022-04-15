package gestion_notes;

import java.util.Collections;

import gestion_notes.Etudiant;

public class Main {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant(1,"Hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(3,"Youssef");
		e1.changeNote(15);
		e2.changeNote(12);
		e3.changeNote(16);
		listEtudiants mesEtudiants=new listEtudiants();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		Collections.sort(mesEtudiants);
		System.out.println(mesEtudiants);
	}
	

}