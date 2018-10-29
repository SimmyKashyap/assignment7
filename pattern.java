class pattern{
	public static void main(String[] args){
		
		for(int i=0;i<3;i++){
			char c='a';
			for(int j=0;j<3;j++){
				if(j<=i){
					System.out.print(c);
					c++;
				}
			}
			System.out.println();
		}
	}
}