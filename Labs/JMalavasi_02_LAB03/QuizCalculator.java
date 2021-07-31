/*
* QuizCalculator - Lab 3
* @author Jeff Malavasi
* @version 2021.2.11
*
*/

public class QuizCalculator
{
   private String name; // the name of the student
   private double numQuizzes; // the number of quizzes
   private double totalScore; // the number of quizzes
         
   /*
      Default Constructor - QuizCalculator
   */
   public QuizCalculator(String name)
   {
      this.name = name;
      numQuizzes = 0;
      totalScore = 0;
   }
   
   /**
   * addScore - records the grade of a quiz
   * @param newScore, the score to record.
   *
   */ 
   public void addScore(double newScore)
   {
      this.totalScore += newScore;
      this.numQuizzes++;
   }
   
   /**
   * getAverage - returns the quiz average for a student
   * @return average, the average score.
   *
   */ 
   public double getAverage()
   {
      Calculator getAverage = new Calculator();
      getAverage.add(this.totalScore);
      getAverage.divide(this.numQuizzes);
      double average = getAverage.getAccumulator();
      return average;
   }
   
   /**
   * toString - outputs the student and quiz average to the stream as a string
   * @return value of quiz average for a student.
   *
   */ 
   public String toString()
   {
      String output = name + " quiz average: " + String.format("%6.2f",getAverage()); 
      return output;
   }      
}