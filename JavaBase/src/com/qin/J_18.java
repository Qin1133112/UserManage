package com.qin;

public class J_18 {

	public static void main(String[] args) {
		char i,j,k;
		for(i='x';i<='z';i++){//i代表a的对手
			for(k='x';k<='z';k++){//k代表b的对手
				if(i!=k){
					for(j='x';j<='z';j++){//j代表c的对手
						if( k!=j && j!=i ){
							if(i!='x' && (j!='x') && (j!='z')){
								
								System.out.println("a ==> "+i+",b ==> "+k+",c ==> "+j);
							}
						}
					}
				}
			}
		}
	}

}
