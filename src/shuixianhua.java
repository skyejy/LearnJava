
public class shuixianhua {
/*��ӡ�����еġ�ˮ�ɻ���������ν��ˮ�ɻ�������ָһ����λ�������λ���������͵��ڸ����������磺153��һ����ˮ�ɻ���������Ϊ153=1�����η���5�����η���3�����η���*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i= 100 ; i<=999;i++){
            if(isNarcissus(i)){
            	System.out.println(i);
                sum++;
            }
        }
		 System.out.println("ˮ�ɻ���������"+sum);
	}

private static boolean isNarcissus(int a) {
	// TODO Auto-generated method stub
	int g;
	int s;
	int b;
	g=a%10;
	s=(a/10)%10;
	b=a/100;
	if(Math.pow(g,3) + Math.pow(s,3) + Math.pow(b,3) ==a){
        return true;
    }
    return false;
	

}

}
