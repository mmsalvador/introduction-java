package stdy.msalvador.secondweek;

public class MyVariables {
     public static void main(String[] arg){
          //*Os tipos primitivos em java são: int,byte,short,long,float,double,boolean e char (não considerados objetvos, valores brutos apenas) */
          byte idade = 23;
          short ano = 2024;
          int cep = 1800001;
          long cpf = 11122233344L; //*terminar com L */
          float pi = 3.14F; //*Terminar com F */
          double salarioMinimo = 1300.00;
          String meuNome = "Matheus";

          //*casting */
          short numeroCurto = 1;
          int numeroInteiro = numeroCurto;
          short numeroCurto2 = (short) numeroInteiro;

          //*Constantes */
          final float TESTE_1 = 99.9F;

          //*Operadores para manipulação de variveis: (+)(-)(*)(/)(%) */ */
          //*O operador de soma em texto é utilizado para Concatenação de texto */
          meuNome = "Math"+"eus";
          //*Concatenação é possivel fazer entre caracteres e valores numeros em strings, a partir do momento é que o compilador detecta a string ele transforma os seguintes valores numeros em string, a ordem de grandeza se aplica */
          
          //*Operadores unários(incre/decremento): (+)(-)(++)(--)(! - Negação) */

          // Operador Ténario, é a simplicação de if com '?' e ':' onde:/
          int a = 5, b = 5;
          String resultado = "";

          if (a==b)
               resultado = "Verdadeiro";
          else
               resultado = "Falso";
          System.out.println(resultado);

          resultado = a==b ? "1" : "0";

          System.out.println(resultado);

          //*Operadores Relacionais: (igual ==)(diferente !=)(maior >)(maior ou igual >=)(menor <)(menor ou igual <=) */
          //*Operadores Lógicos: (E &&)(OU) */
     }
}
