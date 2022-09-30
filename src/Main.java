import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String first_word="Hi";
        switch (first_word)
        {
            case "Hello":
                System.out.println("Hello!");
            case "Hey":
                System.out.println("Hey?");
            case "Hi":
                System.out.println("Hi!");

        }
        Scanner scan = new Scanner(System.in);
        String question ="";
        Integer weigh =0,years=0,height=0,body_state=0;
        if (!false || 10>9 || 9<10 && 5!=6 || 5 == 5)
        {
            System.out.println("Do you like fried chicken?");
        }else
        {
            System.out.println("Hi!");
        }
        question = scan.nextLine();
        if (question.equals("Y") || question.equals("yes") || question.equals("yup"))
        {
            System.out.println("how much do you weigh?");
            weigh = scan.nextInt();
            if (weigh<=70)
                {
                    System.out.println("cool you have no problem");
                } else if (weigh <= 90)
                    {
                        System.out.println("think twice about your diet");
                    }
                        else if (weigh>= 90)
                            {
                                System.out.println("you have some problems with your health");
                            }

        }else
            {
                System.out.println("why?it is so delicious");
            }
        System.out.println("how old are you?");
        years = scan.nextInt();
        if (years <= 6)
            {
                System.out.println("I think you like going to kindergarten");
            } else if (years >= 7 && years <=17)
                {
                    System.out.println("don't forget to do your homework");
                } else if (years >= 18 && years <= 22)
                    {
                        System.out.println("you are most likely studying at an institute");
                    } else if (years>=23 && years <= 60)
                        {
                            System.out.println("you probably work at some kind of job, if you are certainly not homeless, I hope not");
                        }else
                            {
                                System.out.println("you should be retired now and resting");
                            }
        System.out.println("type your weigh");
        weigh = scan.nextInt();
        System.out.println("type your heigh t");
        height = scan.nextInt();
        body_state = (height/weigh)*6;
        if (body_state <= 18)
        {
            System.out.println("If the body mass index (BMI) is less than 18.5, the weight is insufficient. The risk of health disorders such as amenorrhea in women (absence of menstruation), fragility of bones, lack of nutrients for the healthy functioning of all body systems increases.");
        }
        if (body_state > 18 && body_state <= 25)
        {
            System.out.println("Ideal BMI for people under the age of 25 - 22 - 23. If the BMI is approaching the indicator of 25, start monitoring the volume of the waist and remember about physical activity.");
        }
        if (body_state > 25 && body_state <= 30)
        {
            System.out.println("you are overweight, which is a high risk factor for cardiovascular diseases, diabetes, sexual dysfunction and other diseases. Try to lose weight, start eating right and do sports.");
        }
        if (body_state > 30)
        {
            System.out.println(" the body mass index (BMI) is more than 30, you are very overweight (obese). You need to lose weight to a lower BMI to live a healthy life. A high body mass index is associated with an increased risk of death from all causes, including diabetes, cardiovascular disease, hypertension, and arthritis.");
        }








    }

}