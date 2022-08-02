public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		//string
		System.out.print("ENTER A NAME= ");
		String name=scanner.nextLine();
		
		//integer
		System.out.print("ENTER A REG.NO= ");
		long regNo=scanner.nextLong();
		
		//character
		System.out.print("GRADE= ");
		char grade=scanner.next().charAt(0);
		
		//floating point
		System.out.print("precentage= ");
		float point=scanner.nextFloat();
				
				
		System.out.println("your name is= "+name);
		System.out.println("your grade= "+grade);
		System.out.println("your precentage= "+precentage);
		
	}
