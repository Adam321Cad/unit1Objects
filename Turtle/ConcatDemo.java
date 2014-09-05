public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = "quick brown fox";
      String animal2 = "lazy dog";
      String article = "the";
      String action = "jumps over";
      String space = " ";
      //String message = article+" "+animal2+" "+action+" "+ animal1;
      /* Your work goes here */
      String message = article.concat(" "+animal1);
      message = message.concat(space);
      message = message.concat(action);
      message = message.concat(space);
      message = message.concat(animal2);

      System.out.println(message);
   }
}