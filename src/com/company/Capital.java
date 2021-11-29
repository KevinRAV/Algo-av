package com.company;

public class Capital {
    public static void main(String[] args) {
        calcul_cap();
    }
    public static void calcul_cap(){
        System.out.println("Somme départ : " );
        double sum_start = Main.scanner.nextDouble();
        System.out.println("Nombre d'année de placement : ");
        int nbPlacment = Main.scanner.nextInt();
        System.out.println("Taux : ");
        double taux = Main.scanner.nextDouble();

        int NbMois = nbPlacment*12 ;
        double TauxMensuel = (taux/100)/12 ;
        double total = sum_start * (1+TauxMensuel * NbMois);
        System.out.println(total);
        //Capital x (1 + taux d’intérêt x nombres d’années de placement )
    }
    /*
    somme de depart
    taux d'interet
    nb de placement
    >valeur finale
    Capital x (1 + taux d’intérêt x nombres d’années de placement )
    1 000 x 5% x 5 = 250
    1 000 x (1 + 5%)^5 = 1 276,28 euros soit 276,28
    Capital x taux d’intérêt  x (nombre de quinzaines / 24)
    1 000 x 0,75%x 6 / 24 = 1,88
     */
}
