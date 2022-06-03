

public class project3_loop {
	public static void main(String[] args){
		for(int i=0; i<2050; i++) {
			if(i%4==0 || i%100!=0 && i%400==0 ) {
				System.out.println(i + " É ano Bissexto!");
			}else {
				System.out.println(i +" Não é Bissexto!");
			}
			
		}
	}


}
