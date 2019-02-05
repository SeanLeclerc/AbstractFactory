
public class AbstractFactoryPattern {
   public static void main(String[] args) {

      //prend forme factory
      AbstractFactory shapeFactory = ProducteurFactory.getFactory("FORME");

      //prend un objet de la forme Cercle
      Forme forme1 = shapeFactory.getForme("CERCLE");

      //appele methode dessine de la forme Cerrcle
      forme1.dessine();

      //prend un objet de la forme Rectangle
      Forme forme2 = shapeFactory.getForme("RECTANGLE");

      //appele methode dessine de la forme Rectangle
      forme2.dessine();
      
      //prend un objet de la forme Carre
      Forme forme3 = shapeFactory.getForme("CARRE");

      //appele methode dessine de la forme Carre
      forme3.dessine();

      //prend couleur factory
      AbstractFactory couleurFactory = ProducteurFactory.getFactory("COULEUR");

      //prend un objet de Couleur Rouge
      Couleur couleur1 = couleurFactory.getCouleur("ROUGE");

      //appele methode remplit de Rouge
      couleur1.remplit();

      //prend un objet de Coueur Vert
      Couleur couleur2 = couleurFactory.getCouleur("VERT");

      //appele methode remplit de Vert
      couleur2.remplit();

      //prend un objet de la couleur Bleu
      Couleur couleur3 = couleurFactory.getCouleur("BLEU");

      //appele la methode de Couleur Bleu
      couleur3.remplit();
   }
}
