		
	import java.util.Scanner;
		public class IpMahasiswa {

			public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			IpMahasiswa ipmhs = new IpMahasiswa();
			
				
				float ip;
				int jmlMhs=0, mhsLulus=0, mhsTdkLulus=0;
				
				System.out.print("Masukan Nilai IP : ");
				
				ip=input.nextFloat();
				
				while(ip!=-999){
					if(ipmhs.isWrithinRange(ip,0,4)==1){
						jmlMhs++;
						if(ip >= 2.7 && ip <= 4.0){
								mhsLulus++;
						} else{
								mhsTdkLulus++;
						}
					}
				
				System.out.print("Masukan Nilai IP : ");
				
				ip=input.nextFloat();
					
				System.out.println("Jumlah Mahasiswa : "+jmlMhs);
				System.out.println("Jumlah Mahasiswa Yang Lulus : "+mhsLulus);
				System.out.println("Jumlah Mahasiswa Yang Tidak Lulus : "+mhsTdkLulus);
				System.out.println("");
				
				}
			}
			
			 int isWrithinRange(float x, int min, int max){
					if(x>=min && x<=max){
						return 1;
						
					} else {
						return 0;
					}
			}
		}