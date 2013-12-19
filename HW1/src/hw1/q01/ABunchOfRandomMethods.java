package hw1.q01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ABunchOfRandomMethods
{
	/**
	 * Add two numbers
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int add(int a, int b)
	{
                return a+b;
	}
	/**
	 * Concatenate two strings. For example, given the strings
	 * "hello" and "world" return "helloworld".
	 * @param s1
	 * @param s2
	 * @return s1+s2
	 */
	public String add(String s1, String s2)
	{
		return s1.concat(s2);
	}
	/**
	 * Find the mean of a bunch of numbers.
	 * @param numbers A list of numbers.
	 * @return The mean of the numbers
	 */
	public double calculateAverage(int[] numbers)
	{
            if(numbers.length<1){
                return 0;
            }
            else{
                double sum=0;
                for(int i=0;i<numbers.length;i++)
                {
                    sum+=numbers[i];                 
                }
                return sum/numbers.length;
            }
	}

	/**
	 * Find the mean of a bunch of numbers. Cast the result to an integer.
	 * Don't round, truncate.
	 * @param numbers A list of numbers.
	 * @return The mean of the numbers
	 */
	public int calculateAverageAsInt(int[] numbers)
	{
		return (int)calculateAverage(numbers);
	}

	/**
	 * Find the mean of a bunch of numbers.
	 * @param numbers A list of numbers.
	 * @return The mean of the numbers
	 */
	public double calculateAverage(ArrayList<Integer> numbers)
	{
		Integer sum=0;
                if(!numbers.isEmpty()){
                    for(Integer number:numbers)
                    {
                        sum+=number;
                    }                    
                    return sum.doubleValue()/numbers.size();
                }
                return sum;
	}

	/**
	 * Find the mean of a bunch of numbers. Cast the result to an integer.
	 * Don't round, truncate.
	 * @param numbers A list of numbers.
	 * @return The mean of the numbers
	 */
	public int calculateAverageAsInt(ArrayList<Integer> numbers)
	{
		return (int)calculateAverage(numbers);     
	}

	/**
	 * You can legally drink when you're 21
	 * @param age
	 * @return age >= 21
	 */
	public boolean canLegallyDrink(int age)
	{
		return (age>=21);
	}

	/**
	 * People in the military are allowed to kill certain people. However,
	 * last i heard, they only allowed men in combat.
	 * @param age An age. You must be 18 to serve.
	 * @param gender "male" or "female"
	 * @return age >= 18 and gender = "male"
	 */
	public boolean canLegallyKill(int age, String gender)
	{
            return age>=18 && "male".equals(gender);
            
	}

	/**
	 * Convert a floating point number to an integer. Truncate, do not round.
	 * @param floatingPointNumber
	 * @return The number cast to an int
	 */
	public int convertToInt(double floatingPointNumber)
	{
		return (int)floatingPointNumber;
	}

	/**
	 * Convert a string representation of a number to a number.
	 * Example: input="5", output=5.
	 * Don't worry about bad inputs, inputs will always be a valid int.
	 * In class and lab 1 we used the Integer class to do this.
	 * @param aString
	 * @return The numeric version of the string
	 */
	public int convertToInt(String aString)
	{
		return Integer.parseInt(aString);
                
	}

	/**
	 * Given any type of string, convert it to lowercase using the built-in
	 * string methods.
	 * @param aString A string in any kind of case
	 * @return The string in all lower case.
	 */
	public String convertToLowerCase(String aString)
	{
		return aString.toLowerCase();
	}

	/**
	 * Given a number, return the number in a string.
	 * Example: input=5, output="5"
	 * There are two ways to do this. Either create an Integer or
	 * concatenate the number with an empty string.
	 * @param aNumber
	 * @return
	 */
	public String convertToString(int aNumber)
	{
            String s=String.valueOf(aNumber);
            return s;
	}

	/**
	 * Divide two numbers, return the correct answer. Not the java integer
	 * division answer, the real answer.
	 * @param number A number being divided
	 * @param divisor A number you're dividing number by
	 * @return number / divisor
	 */
	public float divide(int number, int divisor)
	{
            return (float)number/(float)divisor;
	}

	/**
	 * Divide two numbers, return the answer cast to an int.
	 * @param number A number being divided
	 * @param divisor A number you're dividing number by
	 * @return number / divisor
	 */
	public int divideAsInt(int number, int divisor)
	{
            return (int)number/(int)divisor;
	}

	/**
	 * Give a puppy some food. His weight will go up by the weight of the food.
	 * @param puppy A puppy
	 * @param weightOfFood How much the food you give the puppy weighs
	 */
	public void feed(Puppy puppy, int weightOfFood)
	{
            puppy.weight+=weightOfFood;
	}

	/**
	 * Fill every entry in the matrix with the given value.
	 * @param matrix A 2 dimensional array of integers
	 * @param value A value to put in every cell
	 */
	public void fill(int[][] matrix, int value)
	{
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=value;
                }
            }
	}

	/**
	 * Get a specified character from a string. There's probably a built-in
	 * string method to get this. Good thing you have intellisense.
	 * @param aString A string
	 * @param index Index of the character to get (starts at 0)
	 * @return The character at position index
	 */
	public char getCharacter(String aString, int index)
	{
            return aString.charAt(index);
	}

	/**
	 * Get a specified character from a string. Convert it to a String.
	 * You can do this with the Character class or by appending it to a string.
	 * @param aString A string
	 * @param index Index of the character to get (starts at 0)
	 * @return The character at position index
	 */
	public String getCharacterAsString(String aString, int index)
	{
            char a = getCharacter(aString, index);
            String news="";
            return  news + a;
	}

	/**
	 * Each letter grade (A, A-, B+, etc.) is worth a certain number of points.
	 * http://onestop.umn.edu/grades_and_transcripts/grades/grade_basis.html
	 * @param letterGrade A letter grade from "A" to "F" with + and -
	 * @return The number of grade points (out of 4) it's worth
	 */
	public float getGradePoints(String letterGrade)
	{
            
            switch(letterGrade){
                case "A":
                case "a":
                    return 4;
                case "A-":
                case "a-":
                    return (float)3.667;
                case "B+":
                case "b+":
                    return (float)3.333;
                case "B":
                case "b":
                    return 3;
                case "B-":
                case "b-":
                    return (float)2.667;
                case "C+":
                case "c+":
                    return (float)2.333;
                case "C":
                case "c":
                    return 2;
                case "C-":
                case "c-":
                    return (float)1.667;
                case "D+":
                case "d+":
                    return (float)1.333;
                case "D":
                case "d":
                    return 1;
                case "F":
                case "f":
                    return 0;
            }
            return 0;
        }

	/**
	 * You have fallen down a well and are about to be eaten by a grue.
	 * Fetch Lassie, which is, unsurprisingly, a Puppy named "Lassie".
	 * @return A Puppy with the name "Lassie"
	 */
	public Puppy getLassie()
	{
            Puppy dog=new Puppy();
            dog.name="Lassie";
            return dog;
	}

	/**
	 * Return the number of elements in the array.
	 * @param numbers An array of numbers
	 * @return The length of the array
	 */
	public int getLength(float[] numbers)
	{
            return numbers.length;
	}

	/**
	 * Return the number of elements in the list.
	 * @param numbers A list of Booleans
	 * @return The size of the list
	 */
	public int getLength(LinkedList<Boolean> numbers)
	{
            return numbers.size();
	}

	/**
	 * Return the number of characters in a string.
	 * @param aString A string
	 * @return The length of the string
	 */
	public int getLength(String aString)
	{
            return aString.length();
	}

	/**
	 * Given a two-dimensional matrix, return the length of the first dimension.
	 * Hint: It's the array length
	 * @param matrix A two dimensional matrix
	 * @return Length of the first dimension
	 */
	public int getLengthOfFirstDimension(int[][] matrix)
	{
            return matrix.length;
	}

	/**
	 * Given a two-dimensional matrix, return the length of the second dimension.
	 * Hint: It's the length of array[0]
	 * @param matrix A two dimensional matrix
	 * @return Length of the second dimension
	 */
	public int getLengthOfSecondDimension(int[][] matrix)
	{
            return matrix[0].length;
	}

	/**
	 * Given a bunch of grades, one per student, return how many students are
	 * failing as a percentage
	 * @param finalGrades A list of grades
	 * @return The percentage of grades < 60
	 */
	public double getPercentFailing(ArrayList<Double> finalGrades)
	{
            int count=0;
            for(int i=0;i<finalGrades.size();i++)
            {
                if(finalGrades.get(i)<60){
                    count++;
                }
            }
            return 100*count/finalGrades.size();
        }

	/**
	 * Give them a puppy
	 * @param name Name of the puppy
	 * @param weight Weight of the puppy
	 * @return A puppy with the specified name and weight
	 */
	public Puppy getPuppy(String name, int weight)
	{
            Puppy pp=new Puppy();
            pp.name=name;
            pp.weight=weight;
            return pp;
	}

	/**
	 * You asked for too many puppies. Time to get rid of them. You found a
	 * restaurant that will buy them by the pound. Determine how much all
	 * your puppies weigh.
	 * @param bulkGoods A list of puppies
	 * @return The combined weight of the puppies
	 */
	public int getTotalWeight(LinkedList<Puppy> bulkGoods)
	{
            int total=0;
            for(int i=0;i<bulkGoods.size();i++){
                total+=bulkGoods.get(i).weight;
            }
            return total;
	}

	/**
	 * You have downloaded many files and want to know which ones are movies.
	 * Movies are any files that end with ".mp4", ".mov" or ".avi".
	 * String might have a built-in method to determine whether it ends with
	 * a given string.
	 * @param fileName The name of a file.
	 * @return True if the file name ends with .mp4, .mov or .avi
	 */
	public boolean isAMovie(String fileName)
	{
            return fileName.endsWith(".mp4")||fileName.endsWith(".mov")||fileName.endsWith(".avi");
	}

	/**
	 * Return true if the person's name is Bob (case does not matter).
	 * @param name A name
	 * @return Whether the name is Bob
	 */
	public boolean isBob(String name)
	{
            return name.equals("Bob")||name.equals("bob");
	}

	/**
	 * Is the student passing labs, homework and exams?
	 * @param labGrade The student's lab grade
	 * @param homeworkGrade The student's homework grade
	 * @param examGrade The student's exam grade
	 * @return lab >= 60 and homework >= 60 and exam >= 60
	 */
	public boolean isPassingEverything(int labGrade, int homeworkGrade, int examGrade)
	{
            return labGrade>=60 && homeworkGrade>=60 && examGrade>=60;
	}

	/**
	 * Is the student passing labs, homework or exams?
	 * @param labGrade The student's lab grade
	 * @param homeworkGrade The student's homework grade
	 * @param examGrade The student's exam grade
	 * @return lab >= 60 or homework >= 60 or exam >= 60
	 */
	public boolean isPassingSomething(int labGrade, int homeworkGrade, int examGrade)
	{
            return labGrade>=60 || homeworkGrade>=60 || examGrade>=60;
	}

	/**
	 * Calculate an exponent without using java's built-in Math.pow() method.
	 * Example: raiseToPower(2, 3) = 2^3 = 2*2*2 = 8.
	 * Note that ^ does not mean ^ in java because java is stupid.
	 * @param base The number to raise
	 * @param exponent The number to to raise the base to
	 * @return base ^ exponent
	 */
	public int raiseToPower(int base, int exponent)
	{
            int total=1;
            while(exponent!=0){
                total=total*base;
                exponent--;
                
            }
            return total;
	}

	/**
	 * The remainder of a division.
	 * Example: 17 / 5 = 3 remainder 2
	 * @param number The number being divided
	 * @param divisor The number doing the dividing
	 * @return number % divisor
	 */
	public int remainder(int number, int divisor)
	{
            return number%divisor;
	}

	/**
	 * People under 18 make $5,000/year. 19-22 makes $14,000.
	 * 23-30 makes $60,000. 31-45 makes $90,000. 46+ makes $110,00
	 * @param age Age of a person
	 * @return Predicted income of the person
	 */
	public int predictIncome(int age)
	{
            if(age<=18){
               return 5000; 
            }
            else if(age>=19 && age<=22){
                return 14000;
            }
            else if(age>=23 && age<=30){
                return 60000;
            }
            else if(age>=31 && age<=45){
                return 90000;
            }
            else{
                return 110000;
            }
	}

	/**
	 * Return "Hello " plus the name of the person plus ", how are you?"
	 * @param name Name of a person
	 * @return "Hello " + name + ", how are you?"
	 */
	public String sayHelloTo(String name)
	{
            return "Hello "+ name +", how are you?";
	}

	/**
	 * Trim the line (remove white space at front and back). After that,
	 * if the first character is #, it's a comment and we want to skip it.
	 * Also, skip any lines that have nothing on them (size=0).
	 * Java's String class might have methods for all of these things.
	 * @param line
	 * @return Whether the line should be skipped
	 */
	public boolean shouldSkipLine(String line)
	{
            return (line.replaceAll(" ", "").startsWith("#")||line.isEmpty()); 
	}
}
