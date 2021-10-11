package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o número de formas: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Forma #" + i + " dados: ");
			System.out.print("Retangulo ou circulo (c/r)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color cor = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Largura: ");
				double widht = sc.nextDouble();
				
				System.out.print("Altura: ");
				double heigth = sc.nextDouble();
				
				list.add(new Rectangle(cor,widht, heigth));
			}
			else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(cor,radius));
			}
		}

		
		System.out.println();
		System.out.println("Formas Areas: ");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
	}

}
