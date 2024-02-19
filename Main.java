import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Q1");
        /*Write a Java program that accept three numbers from the user and print the largest number .

         */
        Scanner input=new Scanner(System.in);
        //------------------------------------------------------------------
        int [] nums=new int[3];
        for(int n=0;n<=2;n++){//fill array
            System.out.println("Enter 1");
            nums[n]=input.nextInt();
        }
        int larg=nums[0];
        for(int n=0;n<=2;n++){//find large number
            if(larg<nums[n]){
                larg=nums[n];
            }
           // nums[n]=input.nextInt();
        }
        System.out.println("the largest number is "+larg);

//--------------------------------------------------------------------

        /*Write a Java program that accept a String and a number from the user,then print the character in the given index .
         */

        System.out.println("-------------------Q2------------------");
        System.out.println("Enter String");
        String str=input.next();
        System.out.println("Enter index");
        //input.nextInt(); put here to fix it error when appears
        int index=input.nextInt();
        System.out.println("the character in the given index is "+str.charAt(index));


//-----------------------------------------------------------------
/* Write a program to enter the numbers till the user wants
 and at the end it should display the sum entered .
 */
        System.out.println("-------------------Q3------------------");

        int sum=0;boolean exit=false;
        do{

            System.out.println("Enter the numbers,Exit -1");
            int reader=input.nextInt();
            sum+=reader;//aready exit -1 calculated here
            if(reader==-1){exit=true;}
        }while(!exit);
        System.out.println("The total within exit number is "+sum);// then print it with exit number

//-------------------------------------------

        /*Write a Java program to find positive and
        negative numbers of a given array:

  -  Original Array:
      [10, -21 , 30, 31, -25]
     -  Expected Output:
     10  is a positive number
     -21 is a negative number
*/
        System.out.println("-------------------Q4------------------");

        int[] orignal={10, -21 , 30, 31, -25};
for(int type:orignal){
    if(type>0){System.out.println(type+" is a positive number");}
    else if (type<0){System.out.println(type+" is a negative number");}
        else {System.out.println(type+" is a zero number");}
}//end for each loop

/*Write a Java program to find a shortest word of a given array:
- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
    - Expected Output:
     JAVA
*/
        System.out.println("-------------------Q5------------------");

String[] strword={"Tuwaiq","Bootcamp" ,"Student","JAVA"};
int shortword=strword[0].length();//assume is a small length
        //int i=0;
        String shortString=strword[0];//save assuming short word
    for( int i=0;i<strword.length;i++){// here check assuming word and its length with array
        if(strword[i].length()<shortword){
            shortword=strword[i].length();
        shortString=strword[i];}
    }
          System.out.println("Short Length is "+shortString);

    }
    }
