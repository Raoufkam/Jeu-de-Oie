package jeuOie;

/*
 * Elle possède deux méthodes :

	- ajouterMessage: qui concatène le texte transmis en paramètre 
	à son attribut message,

	- afficherMessage: qui affiche le message dans la console et réinitialise
	l’attribut message avec la chaîne vide.
	
 */
public class Journal {
	
	private String message ="" ;
	
	public void ajouterMessage(String message) {
		//concatèner un message
		this.message = ( this.message + message ) ;
	}
	
	public void afficherMessage() {
		//Afficher le message dans la console
		System.out.println(this.message);
		//Reinitialiser 'message' en chaine vide
		this.message = "" ;
	}

}
