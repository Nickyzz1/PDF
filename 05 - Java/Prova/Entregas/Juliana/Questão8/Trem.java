import java.lang.annotation.Target;

public abstract class Trem<T> {

   private Vagao<TrainContent> primeiro = null;
   private Vagao<TrainContent> ultimo = null;
   private int size = 0;

   
   void add(TrainContent value){
      
      TrainContent<> novoVagao = new TrainContent<>();
      
      this.size ++;
      
      if(primeiro == null){
         primeiro = novoVagao;
         ultimo = primeiro;
         return;
         
      }
      
      novoVagao.setPrevious(ultimo);
      ultimo.setNext(novoVagao);
      ultimo = novoVagao;
      
   }
   
   public int count(TrainContent value){
      return size;      
   }
}


