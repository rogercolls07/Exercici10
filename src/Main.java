//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner llegir = new Scanner(System.in);

    int a [] = new int[5];

    for (int i = 0 ; i < a.length ; i++){
        System.out.println("Introdueix cinc nombre enters, d'un en un: ");
        a[i] = llegir.nextInt();
    }

    int b [] = new int[5];

    for (int i = 0 ; i < b.length ; i++){
        System.out.println("Introdueix cinc nombre enters, d'un en un: ");
        b[i] = llegir.nextInt();
    }



}
