package desafios;

import java.util.Scanner;

/*
Número Reverso:
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos). A saída deverá ser o reverso de um número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.
Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e continuar a programação até a resposta final.

*/

public class NumeroReverso {

/*
    public static void numeroReverso(){

        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Informe um valor inteiro e positivo (este número deverá conter 4 dígitos):");
            int numeroInformado = teclado.nextInt();
            String numeroInformadoString = String.valueOf(numeroInformado); //recebe um valor em inteiro e transforma em uma String

            if(numeroInformado >= 1000 && numeroInformado <= 9999){

                StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
                System.out.println(stringBuilder.reverse());
                break;
            }else if(numeroInformadoString.length() <4){
                System.out.println("O número informado deverá conter 4 dígitos!");
            }

        }while (true);

    }
*/


    public static void numeroReverso(){

        Scanner teclado= new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo");
        int numero= teclado.nextInt();

        if(numero >= 1000 && numero <= 9999){
            System.out.println((numero/1000)+((numero%10)*1000)+(((numero%100)-(numero%10))*10)+(((numero%1000)-(numero%100))/10));
        }else{
            System.out.println("Número informado inválido");
            numeroReverso();
        }

    }

}
