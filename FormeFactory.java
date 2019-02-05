
public class FormeFactory extends AbstractFactory {
	
   public Forme getForme(String FormeType){
   
      if(FormeType == null){
         return null;
      }		
      
      if(FormeType.equalsIgnoreCase("CERCLE")){
         return new Cercle();
         
      }else if(FormeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      }else if(FormeType.equalsIgnoreCase("CARRE")){
         return new Carre();
      }
      
      return null;
   }
   
   Couleur getCouleur(String couleur) {
      return null;
   }
}