//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner llegir = new Scanner(System.in);

    int a [] = new int[5];
    System.out.println("Array a");
    System.out.println("Introdueix cinc nombres enters");
    for (int i = 0 ; i < a.length ; i++){
        System.out.println("Introdueix un nombre: ");
        a[i] = llegir.nextInt();
    }

    System.out.println("Array b");
    System.out.println("Introdueix cinc nombres enters");
    int b [] = new int[5];

    for (int i = 0 ; i < b.length ; i++){
        System.out.println("Introdueix cinc nombre enters, d'un en un: ");
        b[i] = llegir.nextInt();
    }
    System.out.println("Array a: ");
    System.out.println("");
    for (int j = 0 ; j < a.length ; j++ ){
        System.out.println(a[j]);
    }
    System.out.println("");
    System.out.println("Array b:");
    for (int j = 0 ; j < a.length ; j++ ){
        System.out.println(a[j]);
    }

    System.out.println("");
    System.out.println("Resultat: ");
    System.out.println("");
    for (int j = 0 ; j < a.length ; j++ ){
        System.out.println(a[j]);
    }

}
