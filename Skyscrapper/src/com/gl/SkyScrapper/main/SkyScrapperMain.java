package com.gl.SkyScrapper.main;

import java.util.Scanner;

import com.gl.SkyScrapper.service.SkyScrapper;

public class SkyScrapperMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int totalFloors = sc.nextInt();
		int[] arr = new int[totalFloors];
		for (int j = 0; j < arr.length; j++) {
			System.out.println("enter the floor size given on day :" + (j + 1));
			arr[j] = sc.nextInt();
		}
		System.out.println("The order of construction is as follows");
		System.out.println("");
		SkyScrapper sky = new SkyScrapper();
		sky.toBuild(arr);
		sc.close();

	}
}