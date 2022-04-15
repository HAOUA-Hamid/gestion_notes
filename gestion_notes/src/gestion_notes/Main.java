package gestion_notes;

import java.util.Collections;

import gestion_notes.Etudiant;

public class Main {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant(1,"Hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"Youssef");
		Etudiant e4=new Etudiant(2,"simo");
		Etudiant e5=new Etudiant(3,"souhail");
		Etudiant e6=new Etudiant(4,"ayoub");
		e1.changeNote(15);
		e2.changeNote(12);
		e3.changeNote(16);
		e4.changeNote(0);
		e5.changeNote(3);
		e6.changeNote(10);
		listEtudiants mesEtudiants=new listEtudiants();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		mesEtudiants.add(e4);
		mesEtudiants.add(e5);
		mesEtudiants.add(e6);
		Collections.sort(mesEtudiants);
		System.out.println(mesEtudiants);
		System.out.println(mesEtudiants.filtrer(e->e.getNote()<13));
		System.out.println("les etudiants qui ont le rattrapage :"+mesEtudiants.filtrer(e->e.getNote()<11));
	}
	

}