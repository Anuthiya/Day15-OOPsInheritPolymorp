package trainingday15OOPsINHERIPOLYMOR;

public class UseCube {
	public static void main(String args[]) {
		String[] a=args[0].split(",");
		int val1=Integer.parseInt(a[0]);
		int val2=Integer.parseInt(a[1]);
		int val3=Integer.parseInt(a[2]);
		
		String[] b=args[1].split(",");
		int val4=Integer.parseInt(b[0]);
		int val5=Integer.parseInt(b[1]);
		int val6=Integer.parseInt(b[2]);
		
		String[] c=args[2].split(",");
		int val7=Integer.parseInt(c[0]);
		int val8=Integer.parseInt(c[1]);
		int val9=Integer.parseInt(c[2]);
		
		CubeThree ct=new CubeThree();
		ct.cubeOperation(val7, val8, val9);
	}

}

class CubeOne {
	public void cubeOperation(int val1,int val2,int val3) {
		int val=val1*val2*val3;
		System.out.println(val);
	}
}

class CubeTwo extends CubeOne {
	public void cubeOperation(int val4,int val5, int val6) {
		int val=val4*val5*val6;
		System.out.println(val);
		
	}
}

class CubeThree extends CubeTwo {
	public void cubeOperation(int val7,int val8,int val9) {
		int val=val7*val8*val9;
		System.out.println(val);
	}
}
