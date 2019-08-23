package remcal.com;
/**
 * 
 * @company Foundation of Art and Technology
 * @author Remcal
 * @description：
 * 1.随机生成不重复数字（重点内容，必须掌握）;
 * 2.循环语句要考虑程序最优,性能最高；
 * 2.用户选择是机选还是手选；
 * 3.准备相关变量N个；
 * 4.接收用户选号（6红1蓝）；
 * 5.系统生成号码（6红1蓝）；
 * 6.验证系统号码和用户选择号码；
 * 7.验证是否中奖；
 * 8.把号码排序；
 * Aug 14, 2019
 */
public class DoubleBall {

	public static void main(String[] args) {
		//定义相关的变量
		int[] userRedBall = new int[6];//用户选择的红球号码
		int[] sysRedBall = new int[6];//系统生成的红球号码
		int userBlueBall = 0; //用户选择的蓝球
		int sysBlueBall = 0; //系统生成的蓝球
		int redCount = 0;//记录用户选择正确的红球数
		int blueCount = 0;//记录用户选择正确的蓝球数
		int[] redBall = new int[33];//用于存储1-33的红球号码
		//需要随机生成6个在1-33之间不重复的数（算法）
			for(int i=0;i<redBall.length;i++){
				redBall[i] = i+1;
			}
		//游戏开始,系统提示
			System.out.println("游戏开始");
		//用户选择是机选还是手选号码
			
			
	}

}
