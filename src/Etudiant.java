public class Etudiant extends Personne implements Decision {
	
	private String id;
	public String filiere;
	public String matiere;
	public String cycle;
	public int annee;
	

	public Etudiant(String nom, String prenoms, String genre, double taille, double poids, int age, String id, String filiere, String matiere, String cycle, int annee) {
		super(nom, prenoms, genre, taille, poids, age);
        this.id = id;
         this.filiere = filiere;
          this.matiere = matiere;
           this.cycle = cycle;
            this.annee = annee;
		
	}

	
    
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}

		public String getFiliere() {
			return filiere;
		}


		public void setFiliere(String filiere) {
			this.filiere = filiere;
		}


		public String getMatiere() {
			return matiere;
		}


		public void setMatiere(String matiere) {
			this.matiere = matiere;
		}


		public String getCycle() {
			return cycle;
		}


		public void setCycle(String cycle) {
			this.cycle = cycle;
		}


		public double getAnnee() {
			return annee;
		}


		public void setAnnee(int annee) {
			this.annee = annee;
		}


      public void composer(){
          System.out.println("Je compose dans plusieurs matiere!!!");
      }
      

       public void etudier(){
          System.out.println("J'etudie en android studio!!!");
      }

	  public void bien(){
		  System.out.println("Mon bien le plus precieux");
	  }

	  public void passable(){
		  System.out.println("passable passable");
	  }

	  public void communiquer(){
		  System.out.println("commmuniquert des resultats");
	  }

}
