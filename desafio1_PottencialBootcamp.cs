// See https://aka.ms/new-console-template for more information
using System;

class DIO {
        
static void Main(string[] args){

        int numero = int.Parse(Console.ReadLine());
        int produto = 1, soma = 0;
        while (numero > 0){
             int digito = numero % 10;  //para encontrar o último dígito
// TODO: Crie as outras condições necessárias para a resolução do desafio:
             produto = produto * digito;
             soma = soma + digito;
             numero = numero /10    ;
           }

           Console.WriteLine(produto-soma);
        }
    }