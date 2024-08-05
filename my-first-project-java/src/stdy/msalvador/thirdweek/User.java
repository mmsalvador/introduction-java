package stdy.msalvador.thirdweek;

import java.io.IOException;
import java.util.Scanner;

public class User {

    public static void main (String[] arg) throws IOException{

        /*Metodos devem ser nomeados como verbo e seguir o padrão camelCase(assim como as variáveis) */
        /*Em java não existem métodos globais, todos os métodos devem SEMPRE ser definidos dentro de uma classe */
        /*Métodos Publicos X Privados: os métodos "public" podem ser visto outras classes, já as "private" não podem ser vistos por outras classes */
        /*Métodos com muitos parâmetros podem passar pela abstração para se tornarem objetos(Classes) */
    
        MyTV minhaTv = new MyTV();
        Scanner ler = new Scanner(System.in);
        char resposta;
        int respostamenu;
        /*Situação */
        minhaTv.mostrarStatus();
        /*Interação Usuario */
        System.out.println("\nDeseja interagir (S/N) ? \n");
        resposta = (char)System.in.read();

        if ((resposta == 'S') || (resposta == 's')) {
            minhaTv.ligar();
            while (minhaTv.onOff == true){
                System.out.println("\nEscolha o quer fazer: \n");
                System.out.println("1.Desligar \n2.Aumentar Canal \n3.Aumentar Volume \n4.Diminuir Canal \n5.Diminuir Volume \n");
                
                respostamenu = ler.nextInt();

                switch (respostamenu) {
                    case 1:
                        minhaTv.desligar();
                        break;
                    case 2:
                        minhaTv.aumentarCanal();
                        minhaTv.mostrarStatus();
                        break;
                    case 3:
                        minhaTv.aumentarVolume();
                        minhaTv.mostrarStatus();
                        break;
                    case 4:
                        minhaTv.diminuirCanal();
                        minhaTv.mostrarStatus();
                        break;
                    case 5:
                        minhaTv.diminuirVolume();
                        minhaTv.mostrarStatus();
                        break;
                    default:
                        System.out.println("\n Comando Inválido \n");
                        break;
                }
            }
        }
        System.out.println("\n Fim.");
    }
}
