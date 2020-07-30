
public class shuixianhua {
/*打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i= 100 ; i<=999;i++){
            if(isNarcissus(i)){
            	System.out.println(i);
                sum++;
            }
        }
		 System.out.println("水仙花数总数："+sum);
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
