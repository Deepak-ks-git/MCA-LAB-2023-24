class StringMain{

public static void main(String args[]){

String value="hello world";
System.out.println("string length ="+value.length());
System.out.println("concatination ="+value.concat("hellooo"));
System.out.println("Indexed ="+value.indexOf('w'));
System.out.println("character at position 5"+value.charAt(5));
System.out.println("compare "+value.compareTo("hello"));
System.out.println("contain sequence 'orld'"+value.contains("orld"));
System.out.println("Endswith d"+value.endsWith("d"));
System.out.println("replace world"+value.replace("hello","  goodbye"));
System.out.println("convert to lower"+value.toLowerCase());
System.out.println("convert to higher"+value.toUpperCase());





	}

}
