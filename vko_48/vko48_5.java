public class vko48_5 {
    public static int min2(int x,int y) {
        if (x==y|x<y){
            return x;
        }
        else{

            return y;
        }
    }
    public static int min3(int x,int y, int z){
    	int k=min2(x,min2(y,z));
    	return k;
    }
    public static void main (String[]args){
    	System.out.println("Anna 3 lukua.Etsin niistä pienimmän.");
    	int x=OmaIO.lueInt();
    	int y=OmaIO.lueInt();
    	int z=OmaIO.lueInt();
    	int m=min3(x,y,z);
    	System.out.print(m);
    }
}