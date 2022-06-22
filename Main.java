import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe :");
int liczba = scanner.nextInt();
if(liczba > 0 ) System.out.println("Podana liczba jest dodatnia.");
if(liczba <0) System.out.println("Podana liczba jest ujemna.");
if(liczba ==0) System.out.println("Podana liczba jest równa 0.");

    
  }
}