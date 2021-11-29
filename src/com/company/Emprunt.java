package com.company;

public class Emprunt {
//    public static int calcul_Emprunt(int m, float C, int n, float t){
//        // Montant de votre prêt
//        //Durée de votre prêt
//        //Taux d'intérêt avant négociation
//        return (int) Math.floor((C * (t / 12) )/ (1 - (1 + (t / 12))- Math.pow(12 * n)));
//       // num * CalculatePower(num, pow - 1);
//
//    }
    public static void main(String[] args) {
        //System.out.println(calcul_Emprunt(3, 27.500f, 2, 30));
//        int v= 85;
//        int tot = v *24;
//        System.out.println(tot);
        scan();
    }
    public static void scan(){
        System.out.println("Capital : " );
        double capital = Main.scanner.nextDouble();
        System.out.println("Duree : ");
        int duree = Main.scanner.nextInt();
        System.out.println("Taux : ");
        double taux = Main.scanner.nextDouble();

        int NbMois = duree*12 ;
        double TauxMensuel = (taux/100)/12 ;
        double calcul1 = capital*TauxMensuel ;
        double calcul2 = Math.pow((1+TauxMensuel),NbMois);
        double calcul3 = calcul2-1;
        double Mensualite = calcul1*(calcul2/calcul3);
        System.out.println(" mensualité : " + Mensualite);
    }
}
