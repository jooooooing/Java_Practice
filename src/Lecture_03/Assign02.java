package Lecture_03;

public class Assign02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		    	String str = "I go to school";
		        String up = str.toUpperCase();
		        System.out.println(str.toUpperCase()+"\n");
		        int count = 0;
		        for (int i = 65; i < 91; i++){
		            if (str.indexOf(i) != -1){
		                count ++;
		                System.out.println((char)i + " - " + count);    		   
		    }
		}

	}

}
