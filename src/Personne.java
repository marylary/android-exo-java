abstract public class Personne {

		
		private String nom;
		private String prenoms;
		private String genre;
		public double taille;
		public double poids;
		protected int age;


		public Personne(String nom, String prenoms, String genre, double taille, double poids, int age) {
			
			this.nom = nom;
			this.prenoms = prenoms;
			this.genre = genre;
			this.taille = taille;
			this.poids = poids;
			this.age = age;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenoms() {
			return prenoms;
		}


		public void setPrenoms(String prenoms) {
			this.prenoms = prenoms;
		}


		public String getGenre() {
			return genre;
		}


		public void setGenre(String genre) {
			this.genre = genre;
		}


		public double getTaille() {
			return taille;
		}


		public void setTaille(double taille) {
			this.taille = taille;
		}


		public double getPoids() {
			return poids;
		}


		public void setPoids(double poids) {
			this.poids = poids;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}
	


		abstract public void communiquer();
        

        public static void main(String[] args){

        Etudiant etu = new Etudiant("DJIBRIL", "Raîd", "M", 1.80, 60, 20,"aa001", "AL", "android studio", "L3", 2021-2022 );

          
            System.out.println("NOM :" + etu.getNom());
             System.out.println("PRENOMS :" + etu.getPrenoms());
              System.out.println("GENRE :" + etu.getGenre());
               System.out.println("TAILLE :" + etu.getTaille());
                System.out.println("POIDS :" + etu.getPoids());
                 System.out.println("AGE :" + etu.getAge());
                 System.out.println("ID :" + etu.getId());
                  System.out.println("FILIERE :" + etu.getFiliere());
                   System.out.println("MATIERE :" + etu.getMatiere());
                    System.out.println("CYCLE :" + etu.getCycle());
                     System.out.println("ANNEE :" + etu.getAnnee());


                     
        }
		
        
	}
