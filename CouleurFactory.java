
public class CouleurFactory extends AbstractFactory {
	
   @Override
   public Forme getForme(String formeType){
      return null;
   }
   
   @Override
   Couleur getCouleur(String couleur) {
   
      if(couleur == null){
         return null;
      }		
      
      if(couleur.equalsIgnoreCase("ROUGE")){
         return new Rouge();
         
      }else if(couleur.equalsIgnoreCase("VERT")){
         return new Vert();
         
      }else if(couleur.equalsIgnoreCase("BLEU")){
         return new Bleu();
      }
      
      return null;
   }
}
