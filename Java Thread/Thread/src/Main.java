
public class Main {
	
	// CounterThread2�� ������Ų��. 
	public int count = 0; 
	
	public static void main(String[] args) {
//		int numberOne = 0; 
//		numberOne = 10; 
//		numberOne = 20; 
//		
//		// ����� : 0 
//		System.out.println(numberOne);
		
		// �� ���� ���� 
//		Thread counter1 = new CounterThread("1��");
//		Thread counter2 = new CounterThread("2��");
//		Thread counter3 = new CounterThread("3��");
//		
//		// Thread���� start()��� ���� �ִ�. �׷��� ���������� �׳� run�̶�� method�� ��������ش�.
//		counter1.start();
//		counter2.start();
//		counter3.start();
		
		// �� �� ���� 
		Main main = new Main();
		Thread counter1 = new Thread(new CounterThread2(main));
		Thread counter2 = new Thread(new CounterThread2(main));
		Thread counter3 = new Thread(new CounterThread2(main));
		counter1.start();
		counter2.start();
		counter3.start();
	}

}