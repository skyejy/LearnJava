
public class sushu {
/*�ж�101-200֮���ж��ٸ����������������������*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrimeNumber(1,72);
	}

private static void getPrimeNumber(int a, int b) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=a;i<=b;i++) {
		if(isPrimeNumber(i)){
            sum += 1;
            System.out.print(i+" ");
        }
	}
	System.out.println();
	System.out.println("��������������"+sum);
}

private static boolean isPrimeNumber(int i) {
	// TODO Auto-generated method stub
	boolean flag = true;
	if(i==1)
	{	flag=false;
		return flag; }
    for(int j=2;j <i;j++){
        if(i%j == 0){
            flag = false;
            break;
        }
    }
    return flag;
}

}
