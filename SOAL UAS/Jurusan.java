import java.io.*;
import java.util.Scanner;

public class Jurusan {
		static Scanner input = new Scanner(System.in);
        //static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) {
                try {
							String Nama;
							int Nem1;
							int Nem2;
							int Nem3;
							
							System.out.println("Masukkan Nama Anda :");
							Nama = input.nextLine();
		
							System.out.println("Masukkan NEM Matematika :");
							Nem1 = input.nextInt();
							
							System.out.println("Masukkan NEM Bahasa Indonesia :");
							Nem2 = input.nextInt();
							
							System.out.println("Masukkan NEM Bahasa Inggris :");
							Nem3 = input.nextInt();
							
							int rata = ((Nem1+Nem2+Nem3)/3);
							int total = (Nem1+Nem2+Nem3);
				
                        System.out.println("Program Hitung (1-3) " + "\n\t1.) Hitung rata-rata" + "\n\t2.) Hitung Jumlah total" + "\n\t3.) Sarankan Jurusan Kuliah");
                        System.out.print("Masukkan Pilihan Anda  : ");
                        int choose = input.nextInt();
                        if(choose==1){
                                System.out.println("Hai "+Nama+", Nilai Rata-rata NEM anda adalah "+rata);
                        } else if(choose==2){
                                System.out.println("Hai "+Nama+", Jumlah total nilai NEM anda adalah "+total);
                        } else if(choose==3){
                                if(Nem1>=Nem2 && Nem1>=Nem3){
									System.out.println("Hai "+Nama+", Jurusan yang tepat untuk anda adalah Matematika, Komputer, dan Akutansi");
								}
								else if(Nem2>=Nem1 && Nem2>=Nem3){
									System.out.println("Hai "+Nama+", Jurusan yang tepat untuk anda adalah Sastra Bahasa Indonesia");
								}
								else if(Nem3>=Nem1 && Nem3>=Nem2){
									System.out.println("Hai "+Nama+", Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris");
								}
								else if(Nem1 + Nem2 > Nem3){
									System.out.println("Hai  "+Nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akutansi, Sastra Bahasa Indonesia");
								}
								
								else if(Nem1 > Nem2 && Nem3 > Nem2){
									System.out.println("Hai  "+Nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akutansi, Sastra Bahasa Inggris");
								}
								
								else if(Nem2 > Nem1 && Nem2 > Nem1){
									System.out.println("Hai  "+Nama +"Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris dan Sastra Bahasa Indonesia");
								}
								
								else if(Nem1 == Nem3 && Nem1 == Nem2 && Nem2 == Nem3){
									System.out.println("Hai  "+Nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akuntansi, Sastra Indonesia, dan Sastra Inggris");
								}
                        } else {
                                throw new Exception("pilihan anda tidak ada !");
                        }
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
}