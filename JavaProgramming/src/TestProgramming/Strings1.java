package TestProgramming;

import java.util.*;

public class Strings1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings1 newstring=new Strings1() ;	
		//newstring.javastringtest1();
String[] strAr= {"kapil","Nikhil","Manas","ShyamJi"};
/*for(int i=0;i<strAr.length;i++) {
	System.out.println(strAr[i]);
	
}
System.out.println("=============================================");
for (String str:strAr) {
System.out.println(str);
}*/
Boolean x =false;
String kr="kapil";
int in=0;
for(int j=0;j<strAr.length;j++) {
if(kr.equals(strAr[j])) {
	in=j;
	x=true;
	break;
}	
}
if(x) {
System.out.println(kr+"== String found at index == "+in);
}else {
	System.out.println("String Search NOT worked as expected");
}
	
}

public void javastringtest1() {
	
}
}

