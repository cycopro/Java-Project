import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Metoda1();
        Metoda2();
	}
	public static void Metoda1() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a: ");
        int a = scanner.nextInt();
        System.out.println("podaj b: ");
        int b = scanner.nextInt();
        int i = 0;
        while (true){
            if (a==b){
                System.out.println("nwd "+ a);
                System.out.println("liczba iteracji " + i);
                break;
            }
            if (a>b){
                a -= b;
            }
            if (b>a){
                b -= a;
            }
            i++;
        }
	}
    public static void Metoda2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a: ");
        int a = scanner.nextInt();
        System.out.println("podaj b: ");
        int b = scanner.nextInt();
        int i = 0;
        while(true){
            if(b==0){
                System.out.println("nwd "+ a);
                System.out.println("liczba iteracji " + i);
            }else{
                int r = a % b;
                a = b;
                b = r;
            }
            i++;
        }   
    }

}
