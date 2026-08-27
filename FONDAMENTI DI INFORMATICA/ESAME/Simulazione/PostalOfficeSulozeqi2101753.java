import java.util.Random;
public class PostalOfficeSulozeqi2101753{
	public static void main(String[] args){

		if(args.length!=1){
			System.out.println("Usage: java PostalOfficeSulozeqi2101753 n");
			System.exit(1);
		}

		int n=0;
		try{
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("deve essere un numero intero!!");
			System.exit(1);
		}

		Sportello[] office = new Sportello[5];
		for(int i=0;i<office.length;i++){
			office[i] = new Sportello();
		}
		Random r = new Random(123);


		for(int i=1; i<=n;i++){
			int newClient = 1 + r.nextInt(15);
			int next = minSizeQueue(office);
			office[next].enqueue(newClient);
			System.out.println("Nuovo cliente con pratica " + newClient + " minuti inserito in coda allo sportello "+ next);
			System.out.println("Situazione code dopo " + i + " minuti");
			for(int j=0;j<office.length;j++){
				try{
					office[j].dequeue();
				}
				catch(EmptyQueueException e){
					//intentionally left blank
				}
			}
			for(int j=0;j<office.length;j++){
				System.out.println("Sportello " + j + ": " + office[j].toString());
			}

		}
	}


	public static int minSizeQueue(Sportello[] p){
		int minPos = 0;
		for(int i=1;i<p.length;i++){
			if(p[i].getSize() < p[minPos].getSize()){
				minPos=i;
			}
		}
		return minPos;
	}
}