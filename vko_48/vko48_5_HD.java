public class vko48_5_HD {
    public static int min2(int x,int y) {
        if (x<y){
            return x;
        }
        else{

            return y;
        }
    }
    public static int min3(int a,int s, int d){
    	int k=min2(a,min2(s,d));
    	return k;
    }
    public static int min4(int q,int w, int e,int r){
    	int k=min2(q,min3(w,e,r));
    	return k;
    }
    public static void main (String[]args){
    	System.out.println("Anna luku");
    	int q=OmaIO.lueInt();
    	System.out.println("Anna toinen luku");
    	int w=OmaIO.lueInt();
    	System.out.println("Anna kolmas luku");
    	int e=OmaIO.lueInt();
    	System.out.println("Anna neljäs luku");
    	int r=OmaIO.lueInt();
    	int m=min4(q,w,e,r);
    	System.out.print("pienin luku on:");
    	System.out.print(m);
    }
}