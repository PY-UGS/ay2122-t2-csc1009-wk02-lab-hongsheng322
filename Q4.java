import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.close();
        Q4 zodiac = new Q4();
        System.out.print(zodiac.getZodiac(year));
    }

    String getZodiac(int year)
    {
        int id = year % 12;
        
        switch(id) {
            case 1:
                return "rooster";
            case 2:
                return "dog";
            case 3:
                return "pig";
            case 4:
                return "rat";
            case 5:
                return "ox";
            case 6:
                return "tiger";
            case 7:
                return "rabbit";
            case 8:
                return "dragon";
            case 9:
                return "snake";
            case 10:
                return "horse";
            case 11:
                return "sheep";
            case 12:
                return "monkey";
            default:
                return "error";
        }
    }
}
