import java.util.Scanner;

public class Main
{

private static String nome;
private static String curso;
private static Long matricula;

public static void main(String[] args) {
long tempoInicial = System.currentTimeMillis();
Scanner ficha = new Scanner(System.in);


System.out.println("Informe seu nome: ");
nome = ficha.nextLine();

System.out.println("Informe o seu curso: ");
curso = ficha.nextLine();

System.out.println("Informe sua matricula: ");
matricula = ficha.nextLong();

long tempoFinal = System.currentTimeMillis();