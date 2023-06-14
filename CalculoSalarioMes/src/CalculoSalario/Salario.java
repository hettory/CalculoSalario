package CalculoSalario;

import java.util.Scanner;

public class Salario {


private static Scanner scan;

public static void main(String[] args) {
	  scan = new Scanner(System.in);
	  
	  System.out.println("Entre com o valor/hora:");
	  double valorHora = scan.nextDouble();
	  
	  System.out.println("Entre com as horas trabalhadas:");
	  double qtdHoras= scan.nextDouble();
	  
	  double salarioBruto = valorHora * qtdHoras;
	  
	  int percentualIR = 0;
	  if(salarioBruto <= 900){
		  percentualIR = 0;
	  }else if (salarioBruto > 900 && salarioBruto <= 1500) {
		  percentualIR = 5;
	  }else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		  percentualIR = 10;
	  }else if(salarioBruto > 2500) {
		  percentualIR = 20;
		  
		  
	  }
	  double ir = (salarioBruto / 100)* percentualIR;
	  double inss = (salarioBruto / 100) *9;
	  double fgts = (salarioBruto / 100)* 11;
	  double totalDesconto = ir + inss;
	  double salarioLiquido = totalDesconto - salarioBruto;
	  
	  System.out.println("salarioBruto:("+valorHora+"*"+qtdHoras+"):"+salarioBruto);
	  System.out.println("(-)ir("+ percentualIR +"%):"+ir);
	  System.out.println("(-)inss(10%):"+inss);
	  System.out.println("(-)fgts(11%):"+fgts);
	  System.out.println("total de Desconto:"+totalDesconto);
	  System.out.println("salario Liquido:"+ salarioLiquido);
	}

}
