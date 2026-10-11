import java.util.Scanner;

public class L7E2 {
    public static void main(String[] args) {
      
      
      int[][] matriz = new int[5][5];
      int cont0 = 0;
      int cont1 = 0;
      int cont2 = 0;
      
      Scanner leia = new Scanner(System.in);
      
      for (int x = 0; x < matriz.length; x++) {
          for( int y = 0; y < matriz[x].length; y++) {
             System.out.println("Classifique a postagem " + (x+1) + " da coluna " + (y+1) + " como: " + "\n0: Conteúdo Seguro" + "\n1: Conteúdo Suspeito (requer revisão)" + "\n2: Conteúdo Nocivo (deve ser removido imediatamente)");
             matriz[x][y] = leia.nextInt();
             while (matriz[x][y] != 0 && matriz[x][y] != 1 && matriz[x][y] != 2) {
                 System.out.println("Classificação inválida.");
                 matriz[x][y] = leia.nextInt();
             }
             
             if (matriz[x][y] == 0) {
                 cont0++;
             }
             
              if (matriz[x][y] == 1) {
                 cont1++;
             }
             
              if (matriz[x][y] == 2) {
                 cont2++;
             }
          }
      }
      
      System.out.println("Quantidade de postagens SEGURAS: " + cont0);
      System.out.println("Quantidade de postagens SUSPEITAS: " + cont1);
      System.out.println("Quantidade de postagens NOCIVAS: " + cont2);
      System.out.println("MATRIZ ATUAL:");
      for (int x = 0; x < matriz.length; x++) {
          for( int y = 0; y < matriz[x].length; y++) {
              System.out.print(matriz[x][y] + " ");
    }
              System.out.println();
}

        for (int x = 0; x < matriz.length; x++) {
          for( int y = 0; y < matriz[x].length; y++) {
             if (matriz[x][y] == 2) {
                 matriz[x][y] = -1;
             }
          }
        }
          
          
          //Aqui eu não entendi se era pra mostrar o -1 no resultado ou não.
          //Eu interpretei como exclusão do conteúdo e, portanto, optei por não exibir.
          //Se eu interpretei errado, a única alteração necessária seria a remoção do if e manter o mesmo Sysout.
          System.out.println("MATRIZ COM AS ALTERAÇÕES:");
          for (int x = 0; x < matriz.length; x++) {
          for( int y = 0; y < matriz[x].length; y++) {
              if(matriz[x][y] != -1) {
                  System.out.print(matriz[x][y] + " ");
              }
          }
          System.out.println();
          }
  
     leia.close();
    }
}

        


