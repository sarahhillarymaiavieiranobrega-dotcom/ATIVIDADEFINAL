/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.escola1;

/**
 *
 * @author sarah62076366
 */
public class Escola1 {

    public static void main(String[] args) {
   Estudante estudante01 = new Estudante("Arthur","Áryan","branco","matutino",2009,"Ceilandia");
   Estudante estudante02 = new Estudante("Lara", "Alves", "preta", "matutino", 2012, "Ceilandia");
   Estudante estudante03 = new Estudante("Ana", "Cecilia", "parda", "matutino", 2009, "Samambaia");
   Estudante estudante04 = new Estudante("Daniel", "Dias", "branco", "matutino", 2009, "Ceilandia");
   
   System.out.println("Nome:" + estudante01.nome);
   System.out.println("Sobrenome:" + estudante01.sobrenome);
   System.out.println("cor:" + estudante01.cor);
   System.out.println("turno:" + estudante01.turno);
   System.out.println("anoNascimento:" + estudante01.anoNascimento);
   estudante01.calcular();
   System.out.println("idade:" + estudante01.idade);
   System.out.println("endereco:" + estudante01.endereco);
   
   
   System.out.println("Nome:" + estudante02.nome);
   System.out.println("Sobrenome:" + estudante02.sobrenome);
   System.out.println("cor:" + estudante02.cor);
   System.out.println("turno:" + estudante02.turno);
   System.out.println("anoNascimento:" + estudante02.anoNascimento);
   estudante02.calcular();
   System.out.println("idade:" + estudante02.idade);
   System.out.println("endereco:" + estudante02.endereco);        
      
   
   System.out.println("Nome:" + estudante03.nome);
   System.out.println("Sobrenome:" + estudante03.sobrenome);
   System.out.println("cor:" + estudante03.cor);
   System.out.println("turno:" + estudante03.turno);
   System.out.println("anoNascimento:" + estudante03.anoNascimento);
   estudante03.calcular();
   System.out.println("idade:" + estudante03.idade);
   System.out.println("endereco:" + estudante03.endereco);
   
   
   System.out.println("Nome:" + estudante04.nome);
   System.out.println("Sobrenome:" + estudante04.sobrenome);
   System.out.println("cor:" + estudante04.cor);
   System.out.println("turno:" + estudante04.turno);
   System.out.println("anoNascimento:" + estudante04.anoNascimento);
   estudante04.calcular();
   System.out.println("idade:" + estudante04.idade);
   System.out.println("endereco:" + estudante04.endereco); 
        
    }
}
       
  
        
   
       