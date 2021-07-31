public class TestQuizCalculator
{  
   public static void main(String[] args)
   {
      // Declare Students
      QuizCalculator stu1 = new QuizCalculator("Jeff Malavasi");
      QuizCalculator stu2 = new QuizCalculator("John Smith");
      
      //record quizzes for stu1
      stu1.addScore(95);
      stu1.addScore(90);
      stu1.addScore(92);
      
      //record quizzes for stu2
      stu2.addScore(25);
      stu2.addScore(100);
      stu2.addScore(75);
      
      //print quiz averages
      System.out.println(stu1.toString());
      System.out.println(stu2.toString());
   }
}