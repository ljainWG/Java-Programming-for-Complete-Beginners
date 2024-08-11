public class MultiplicationTable {
	
	void printTable() {
		printTable(2);
	}
	
	void printTable(int num) {
		int i = 0;
		while(i++<10) {
			System.out.printf("%d * %d = %d",num,i,num*i).println();
		}
	}
	
}