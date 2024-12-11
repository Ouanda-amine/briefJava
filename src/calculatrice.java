import java.util.InputMismatchException;
import java.util.Scanner;

public class calculatrice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isValid = true;

        int choix=0;

        do {
            System.out.println("entrez 1 pour l' addition");
            System.out.println("entrez 2 pour la soustraction");
            System.out.println("entrez 3 pour la multipilation");
            System.out.println("entrez 4 pour la devision");
            System.out.println("entrez 5 pour la puissance");
            System.out.println("entrez 6 pour la racine carre");
            System.out.println("entrez 7 pour la factorielle ");
            System.out.println("entrez 8 pour Quitter \n");


            while (isValid){
                try {
                    if(isValid==true);

                    choix = scan.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("type invalide ");
                    scan.nextLine();


                }
            }
                if(choix ==8 ){
                    System.out.println("au revoir");
                    break;
                }




                if (choix == 6) {
                    System.out.println("entrez le nombre");
                    int n = scan.nextInt();
                    System.out.println("le resultat  est :  " + RacineCarre(n));


                } else if (choix == 7) {
                    System.out.println("entrez le nombre");
                    int e = scan.nextInt();
                    System.out.println("le resultat est :  " + calculatrice.factorielle(e));

                } else if (choix > 8) {
                    System.out.println("choix  invalide");
                } else {
                    System.out.println("entrez les deux nombres");
                    int a = scan.nextInt();
                    int b = scan.nextInt();

                    switch (choix) {
                        case 1:
                            System.out.println("la somme est  \n " + calculatrice.addition(a, b));
                            break;
                        case 2:
                            System.out.println("le resultat est \n " + calculatrice.soustraction(a, b));
                            break;
                        case 3:
                            System.out.println("le resultat est \n " + calculatrice.multipilation(a, b));
                            break;
                        case 4:
                            System.out.println("le resultat est \n  " + calculatrice.devision(a, b));
                            break;
                        case 5:
                            System.out.println("la puissance est \n  " + calculatrice.puissance(a, b));
                            break;
                        default:
                            System.out.println("choix indisponible");
                    }

                }


        }    while (choix != 0 ) ;
        scan.close();

    }
    public static int addition(int a , int b){
        int somme ;
        somme = a + b ;
        return somme;
    }

    public static int soustraction(int a , int b){
        int result ;
        result = a - b ;
        return result;
    }
    public static double multipilation(double a , double b){
        double result = a * b;

        return result;
    }
    public static int devision(int a , int b){
        int result ;
        result = a / b ;
        return result;
    }
    public static double puissance(double a , double b){
        double lapuissance = Math.pow(a, b);

        return lapuissance;
    }
    public static double RacineCarre(double a ){
        double racine = Math.sqrt(a);

        return racine;
    }
    public static double factorielle (int a){
        if (a <= 1){
            return 1;
        }
        return a * factorielle(a - 1);
    }
}
