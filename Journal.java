package jeuOie;

/*
 * Elle poss�de deux m�thodes :

	- ajouterMessage: qui concat�ne le texte transmis en param�tre 
	� son attribut message,

	- afficherMessage: qui affiche le message dans la console et r�initialise
	l�attribut message avec la cha�ne vide.
	
 */
public class Journal {
	
	private String message ="" ;
	
	public void ajouterMessage(String message) {
		//concat�ner un message
		this.message = ( this.message + message ) ;
	}
	
	public void afficherMessage() {
		//Afficher le message dans la console
		System.out.println(this.message);
		//Reinitialiser 'message' en chaine vide
		this.message = "" ;
	}

}
