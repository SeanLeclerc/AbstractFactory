
public class ProducteurFactory {
   public static AbstractFactory getFactory(String choix){
   
      if(choix.equalsIgnoreCase("FORME")){
         return new FormeFactory();
         
      }else if(choix.equalsIgnoreCase("COULEUR")){
         return new CouleurFactory();
      }
      
      return null;
   }
}

